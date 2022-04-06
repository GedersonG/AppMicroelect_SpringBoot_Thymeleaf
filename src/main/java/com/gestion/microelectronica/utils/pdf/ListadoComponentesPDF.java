package com.gestion.microelectronica.utils.pdf;

import java.awt.Color;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.gestion.microelectronica.entities.ComponenteEntity;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

@Component("componentes/comp-listar")
public class ListadoComponentesPDF extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		// Traemos el listado de Objetos paginados del Controller
		Page<ComponenteEntity> listadoComponentes = (Page<ComponenteEntity>) model.get("objetoPaginado");

		// ----------------------------------------
		// =========== CONFIG DOCUMENT ===========

		// Seteamos el tamaño de pagina a horizontal
		document.setPageSize(PageSize.LETTER.rotate());
		// Le damos margenes..(izq,der,arriba,abajo)
		document.setMargins(8, 8, 40, 20);

		// Abrimos el Documento UNA VEZ SETEADO LA HOJA
		document.open();

		// ----------------------------------------
		// =========== CONFIG TITULO ===========

		// Colocamos un titulo con una unica columna
		PdfPTable titulo = new PdfPTable(1);

		// Agregamos una celda que contendra el titulo
		PdfPCell celdaTitulo = null;

		// Configuramos la fuente del Titulo
		Font fuenteTitulo = FontFactory.getFont("Helvetica", 18);

		// Config Celda del titulo
		celdaTitulo = new PdfPCell(new Phrase("LISTADO DE COMPONENTES", fuenteTitulo));
		celdaTitulo.setPadding(20);

		celdaTitulo.setHorizontalAlignment(Element.ALIGN_CENTER);
		celdaTitulo.setVerticalAlignment(Element.ALIGN_CENTER);
		celdaTitulo.setBorderWidth(0);
		celdaTitulo.setBackgroundColor(new Color(153, 194, 255));

		// Agregamos la celda a la tabla titulo
		titulo.addCell(celdaTitulo);
		// Espacio despues de la celda
		titulo.setSpacingAfter(30);

		// Agregamos el Titulo al documento
		document.add(titulo);

		// ----------------------------------------
		// ----------------------------------------
		// =========== CONFIG CAMPOS ===========

		PdfPTable campos = new PdfPTable(9);

		PdfPCell celdaCampoId = null;
		PdfPCell celdaCampoCod = null;
		PdfPCell celdaCampoImagen = null;
		PdfPCell celdaCampoCategoria = null;
		PdfPCell celdaCampoDescripcion = null;
		PdfPCell celdaCampoFabricante = null;
		PdfPCell celdaCampoStock = null;
		PdfPCell celdaCampoPrecio = null;

		// --------------- CAMPO ID -----------------
		// Config cada Celda
		celdaCampoId = new PdfPCell(new Phrase("ID"));
		celdaCampoId.setHorizontalAlignment(Element.ALIGN_CENTER);
		celdaCampoId.setVerticalAlignment(Element.ALIGN_CENTER);
		celdaCampoId.setBorderWidth(1);
		celdaCampoId.setBackgroundColor(new Color(204, 224, 255));

		// Agregamos cada una de las celdas de los campos
		campos.addCell(celdaCampoId);

		// Agregamos los campos al documento
		document.add(campos);

		// --------------- CAMPO CODIGO -----------------
		// Config cada Celda
		celdaCampoCod = new PdfPCell(new Phrase("CÓDIGO"));
		celdaCampoCod.setHorizontalAlignment(Element.ALIGN_CENTER);
		celdaCampoCod.setVerticalAlignment(Element.ALIGN_CENTER);
		celdaCampoCod.setBorderWidth(1);
		celdaCampoCod.setBackgroundColor(new Color(204, 224, 255));

		// Agregamos cada una de las celdas de los campos
		campos.addCell(celdaCampoCod);

		// Agregamos los campos al documento
		document.add(campos);

		// ----------------------------------------

		// =========== CONFIG REGISTROS ==========

		// Creamos una Tabla para almacenar los objetos
		// Le pasamos el nro de columnas que queremos mostrar sin la col de los btns
		PdfPTable tablaComponentes = new PdfPTable(9);

		// Seteamos cada campo en cada columna de la tabla
		listadoComponentes.forEach(comp -> {
			tablaComponentes.addCell(String.valueOf(comp.getId()));
			tablaComponentes.addCell(comp.getCodigo());
			tablaComponentes.addCell(comp.getImagen());
			tablaComponentes.addCell(comp.getNroPieza());
			tablaComponentes.addCell(comp.getCategoria());
			tablaComponentes.addCell(comp.getDescripcion());
			tablaComponentes.addCell(comp.getFabricante());
			tablaComponentes.addCell(String.valueOf(comp.getStock()));
			tablaComponentes.addCell(String.valueOf(comp.getPrecio()));

		}

		);

		// Agregamos la tabla creada al documento pdf
		document.add(tablaComponentes);

	}

}
