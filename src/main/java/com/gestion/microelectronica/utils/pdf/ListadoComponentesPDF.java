package com.gestion.microelectronica.utils.pdf;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.gestion.microelectronica.entities.ComponenteEntity;
import com.lowagie.text.Document;
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

		//----------------------------------------
		// =========== CONFIG DOCUMENT ===========
		
	
		// Seteamos el tamaño de pagina a horizontal
		document.setPageSize(PageSize.LETTER.rotate());
		
		// Abrimos el Documento UNA VEZ SETEADO LA HOJA
		document.open();


		//----------------------------------------
		//=========== CONFIG TITULO ===========
		
		// Colocamos un titulo con una unica columna
		PdfPTable titulo = new PdfPTable(1);

		// Agregamos una celda que contendra el titulo
		PdfPCell celdaTitulo = null;

		celdaTitulo = new PdfPCell(new Phrase("LISTADO DE COMPONENTES"));
		celdaTitulo.setPadding(2);
		//celdaTitulo.setBackgroundColor();

		// Agregamos la celda a la tabla titulo
		titulo.addCell(celdaTitulo);
		
		//Agregamos el Titulo al documento
		document.add(titulo);

		//----------------------------------------
		//=========== CONFIG CAMPOS ==========
		
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
