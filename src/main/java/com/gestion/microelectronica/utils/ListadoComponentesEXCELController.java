package com.gestion.microelectronica.utils;

import java.awt.Color;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.gestion.microelectronica.entities.ComponenteEntity;
import com.lowagie.text.Element;

@Component("componentes/comp-listar.xlsx")
public class ListadoComponentesEXCELController extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// Traemos el listado de Objetos paginados del Controller
		Page<ComponenteEntity> listadoComponentes = (Page<ComponenteEntity>) model.get("objetoPaginado");

		// Configuramos el doc con su nombre para descargar o ver

		// Para descargar
		response.setHeader("Content-Disposition", "attachment; filename=\"listado-componentes.xlsx\" ");

		// Para Visualizar en una pestaña Nueva
		// response.setHeader("Content-Disposition", "inline;
		// filename=\"listado-componentes.xlsx\" ");

		// ---------------------------------------------
		// ----------------------------------------------
		// =========== CONFIG HOJA DE CALCULO ===========

		Sheet sheet = workbook.createSheet("Listado Componentes");

		// ----------------------------------------
		// ----------------------------------------
		// =========== CONFIG CAMPOS ===========

		
		Row header = sheet.createRow(0);

		
		
		String camposValor[] = { "ID", "CÓDIGO", "NRO PIEZA", "CATEGORÍA", "DESCRIPCIÓN", "FABRICANTE",
				"STOCK", "PRECIO", "GANANCIAS" };

		int alignCenter = Element.ALIGN_CENTER;
		Color colorCampos = new Color(204, 224, 255);

		// GENERAMOS LOS ENCABEZADOS
		for (int i = 0; i < camposValor.length; i++) {

			// generamos la celda
			Cell celda = header.createCell(i);

			// generamos el contenido
			celda.setCellValue(camposValor[i]);

		}
		

		// ----------------------------------------
		// ----------------------------------------
		// =========== CONFIG REGISTROS ===========

		
		//Para no transformar la lista en un array usamos el foreach
		//con su variable de control
		//Iniciamos en 1, la fila 0 tenemos los encabezados
		int inicioFila = 1;
		
		//GENERAMOS LOS REGISTROS
		for(ComponenteEntity comp : listadoComponentes) {
		
			//Creamos la fila y le damos configs
			header = sheet.createRow(inicioFila);
			sheet.setHorizontallyCenter(true);
			sheet.setColumnWidth(alignCenter, inicioFila);
			
			//Creamos las celdas y agregamos los valores 
			header.createCell(0).setCellValue(comp.getId());
			header.createCell(1).setCellValue(comp.getCodigo());
			header.createCell(2).setCellValue(comp.getNroPieza());
			header.createCell(3).setCellValue(comp.getCategoria());
			header.createCell(4).setCellValue(comp.getDescripcion());
			header.createCell(5).setCellValue(comp.getFabricante());
			header.createCell(6).setCellValue(comp.getStock());
			header.createCell(7).setCellValue(comp.getPrecio());
			header.createCell(8).setCellValue(comp.getPrecio()*comp.getStock());
			
			
			//Aumentamos fila a fila
			inicioFila+=1;
			
			
		}

		
	}

}
