package com.gestion.microelectronica.utils;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import javax.imageio.ImageIO;
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

@Component("componentes/comp-listar.pdf")
public class ListadoComponentesPDFController extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		// Traemos el listado de Objetos paginados del Controller
		Page<ComponenteEntity> listadoComponentes = (Page<ComponenteEntity>) model.get("objetoPaginado");

		// ----------------------------------------

		// =========== CONFIG DOCUMENT ===========
		
		//Configuramos el doc con su nombre para descargar o ver
		
		//Para descargar
		//response.setHeader("Content-Disposition", "attachment; filename=\"listado-componentes.pdf\" ");
		
		//Para Visualizar en una pestaña Nueva
		response.setHeader("Content-Disposition", "inline; filename=\"listado-componentes.pdf\" ");
		

		// Seteamos el tamaño de pagina a horizontal
		document.setPageSize(PageSize.LETTER.rotate());
		// Le damos margenes..(izq,der,arriba,abajo)
		document.setMargins(-80, -80, 10, 10);
		// titulo
		document.addTitle("Listado Componentes");
		// Autor
		document.addAuthor("Andrés Weitzel");
		// fecha y hora
		document.addCreationDate();

		// Abrimos el Documento UNA VEZ SETEADO LA HOJA
		document.open();

		// ----------------------------------------
		// ----------------------------------------
		// =========== CONFIG LOG ===========

		// Colocamos un titulo con una unica columna
		PdfPTable log = new PdfPTable(1);

		// Agregamos una celda que contendra el titulo
		PdfPCell celdaLogFecha = null;
		PdfPCell celdaLogHora = null;

		LocalDate fecha = LocalDate.now();

		String fechaFormato = String.valueOf(fecha.format(DateTimeFormatter.ofPattern("dd-MMM-yy")));

		// Hora sin segundos ni milisegundos
		LocalTime hora = LocalTime.now().withSecond(0).withNano(0);

		String horaFormato = String.valueOf(hora.format(DateTimeFormatter.ISO_LOCAL_TIME));

		// Agregamos fecha y hora
		celdaLogFecha = new PdfPCell(new Phrase("Fecha: " + fechaFormato));
		celdaLogHora = new PdfPCell(new Phrase("Hora: " + horaFormato));

		

		celdaLogFecha.setHorizontalAlignment(Element.ALIGN_RIGHT);
		celdaLogFecha.setVerticalAlignment(Element.ALIGN_RIGHT);
		celdaLogHora.setHorizontalAlignment(Element.ALIGN_RIGHT);
		celdaLogHora.setVerticalAlignment(Element.ALIGN_RIGHT);

		celdaLogFecha.setBorder(0);
		celdaLogFecha.setPadding(3);
		celdaLogHora.setBorder(0);

		// Agregamos la celda a la tabla titulo
		log.addCell(celdaLogFecha);
		log.addCell(celdaLogHora);

		// Espacio antes de la tabla
		log.setSpacingBefore(5);
		// Espacio Despues de la tabla
		log.setSpacingAfter(7);
				
		

		// Agregamos el Log al documento
		document.add(log);

		// ----------------------------------------
		// ----------------------------------------
		// =========== CONFIG PAGINADO ===========

		PdfPTable paginado = new PdfPTable(1);

		PdfPCell celdaPaginado = null;
		PdfPCell celdaElementos = null;

		// Mostramos el paginado al cliente, comenzamos de Uno
		celdaPaginado = new PdfPCell(new Phrase(String.valueOf(
				"Página : " + (listadoComponentes.getNumber() + 1) + " de " + listadoComponentes.getTotalPages())));

		celdaPaginado.setPadding(3);

		celdaPaginado.setHorizontalAlignment(Element.ALIGN_RIGHT);
		celdaPaginado.setVerticalAlignment(Element.ALIGN_RIGHT);
		celdaPaginado.setBorder(0);
		
		paginado.addCell(celdaPaginado);
		
		// Mostramos los elementos al cliente
		celdaElementos = new PdfPCell(new Phrase(String.valueOf(
				"Elementos : " + listadoComponentes.getNumberOfElements() + " de " + listadoComponentes.getTotalElements())));

		celdaElementos.setHorizontalAlignment(Element.ALIGN_RIGHT);
		celdaElementos.setVerticalAlignment(Element.ALIGN_RIGHT);
		celdaElementos.setBorder(0);
		
		
		// Espacio Despues de la tabla
		paginado.setSpacingAfter(7);
			
		
		paginado.addCell(celdaElementos);

	
		document.add(paginado);

		// ----------------------------------------
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
		titulo.setSpacingAfter(20);

		// Agregamos el Titulo al documento
		document.add(titulo);

		// ----------------------------------------
		// ----------------------------------------
		// =========== CONFIG CAMPOS ===========

		PdfPTable campos = new PdfPTable(8);

		
		int alignCenter = Element.ALIGN_CENTER;
		Color colorCampos = new Color(204, 224, 255);
		
		
		String camposValor[] = { "CÓDIGO",
				"NRO. PIEZA","CATEGORÍA","DESCRIP."
				,"FABRICANTE","STOCK","PRECIO", "GANANCIAS" };

		//Generamos los encabezados
		for (int i = 0; i < camposValor.length; i++) {
			
			PdfPCell celda = new PdfPCell(new Phrase(camposValor[i]));
			celda.setHorizontalAlignment(alignCenter);
			celda.setVerticalAlignment(alignCenter);
			celda.setBorderWidth(1);
			celda.setBackgroundColor(colorCampos);
			
			campos.addCell(celda);
			
			document.add(campos);
		}
		
		
		// ----------------------------------------
		// =========== CONFIG REGISTROS ==========

		// Creamos una Tabla para almacenar los objetos
		// Le pasamos el nro de columnas que queremos mostrar sin la col de los btns
		PdfPTable tablaComponentes = new PdfPTable(8);

		tablaComponentes.setHorizontalAlignment(alignCenter);

		
		PdfPCell celdaCod = null;
		PdfPCell celdaNroPieza = null;
		PdfPCell celdaCategoria = null;
		PdfPCell celdaDescripcion = null;
		PdfPCell celdaFabricante = null;
		PdfPCell celdaStock = null;
		PdfPCell celdaPrecio = null;
		PdfPCell celdaGanancia = null;

		Color colorRegistros = new Color(232, 240, 253);

		for (ComponenteEntity comp : listadoComponentes) {

	
			// ---Celda CÓDIGO---
			celdaCod = new PdfPCell(new Phrase(comp.getCodigo()));
			celdaCod.setBackgroundColor(colorRegistros);
			celdaCod.setHorizontalAlignment(alignCenter);
			celdaCod.setVerticalAlignment(alignCenter);
			tablaComponentes.addCell(celdaCod);

			// ---Celda NRO_PIEZA---
			celdaNroPieza = new PdfPCell(new Phrase(comp.getNroPieza()));
			celdaNroPieza.setBackgroundColor(colorRegistros);
			celdaNroPieza.setHorizontalAlignment(alignCenter);
			celdaNroPieza.setVerticalAlignment(alignCenter);
			tablaComponentes.addCell(celdaNroPieza);
			// ---Celda CATEGORIA---
			celdaCategoria = new PdfPCell(new Phrase(comp.getCategoria()));
			celdaCategoria.setBackgroundColor(colorRegistros);
			celdaCategoria.setHorizontalAlignment(alignCenter);
			celdaCategoria.setVerticalAlignment(alignCenter);
			tablaComponentes.addCell(celdaCategoria);
			// ---Celda DESCRIPCION---
			celdaDescripcion = new PdfPCell(new Phrase(comp.getDescripcion()));
			celdaDescripcion.setBackgroundColor(colorRegistros);
			
			celdaDescripcion.setHorizontalAlignment(alignCenter);
			celdaDescripcion.setVerticalAlignment(alignCenter);
			tablaComponentes.addCell(celdaDescripcion);
			// ---Celda FABRICANTE---
			celdaFabricante = new PdfPCell(new Phrase(comp.getFabricante()));
			celdaFabricante.setBackgroundColor(colorRegistros);
			celdaFabricante.setHorizontalAlignment(alignCenter);
			celdaFabricante.setVerticalAlignment(alignCenter);
			tablaComponentes.addCell(celdaFabricante);
			// ---Celda STOCK---
			celdaStock = new PdfPCell(new Phrase(String.valueOf(comp.getStock())));
			celdaStock.setBackgroundColor(colorRegistros);
			celdaStock.setHorizontalAlignment(alignCenter);
			celdaStock.setVerticalAlignment(alignCenter);
			tablaComponentes.addCell(celdaStock);
			// ---Celda PRECIO---
			celdaPrecio = new PdfPCell(new Phrase(String.valueOf(comp.getPrecio())));
			celdaPrecio.setBackgroundColor(colorRegistros);
			celdaPrecio.setHorizontalAlignment(alignCenter);
			celdaPrecio.setVerticalAlignment(alignCenter);
			tablaComponentes.addCell(celdaPrecio);
			// --Celda GANANCIA---
			celdaGanancia = new PdfPCell((new Phrase(String.valueOf(comp.getStock()*comp.getPrecio()))));
			celdaGanancia.setBackgroundColor(colorRegistros);
			celdaGanancia.setHorizontalAlignment(alignCenter);
			celdaGanancia.setVerticalAlignment(alignCenter);
			tablaComponentes.addCell(celdaGanancia);
		}

		// Agregamos la tabla creada al documento pdf
		document.add(tablaComponentes);

		// ----------------------------------------
		// ----------------------------------------
		// =========== CONFIG SUPPORT ===========

		PdfPTable soporte = new PdfPTable(1);

		PdfPCell celdaSoporte = null;

		celdaSoporte = new PdfPCell(new Phrase("Soporte Técnico: andres96energy@hotmail.com"));

		celdaSoporte.setPadding(10);

		celdaSoporte.setHorizontalAlignment(Element.ALIGN_RIGHT);
		celdaSoporte.setVerticalAlignment(Element.ALIGN_RIGHT);

		celdaSoporte.setBorder(0);

		soporte.addCell(celdaSoporte);

		soporte.setSpacingBefore(20);

		document.add(soporte);

	}

}
