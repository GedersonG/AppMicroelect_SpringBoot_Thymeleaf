package com.gestion.microelectronica.utils.excel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.gestion.microelectronica.entities.ComponenteEntity;

@Component("componentes/comp-listar.xlsx")
public class ListadoComponentesEXCEL extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// Traemos el listado de Objetos paginados del Controller
		//Page<ComponenteEntity> listadoComponentes = (Page<ComponenteEntity>) model.get("objetoPaginado");

		// Configuramos el doc con su nombre para descargar o ver

		//Para descargar
		response.setHeader("Content-Disposition", "attachment; filename=\"listado-componentes.xlsx\" ");
		
		//Para Visualizar en una pestaña Nueva
		//response.setHeader("Content-Disposition", "inline; filename=\"listado-componentes.xlsx\" ");
		
		
		

		Sheet h = workbook.createSheet("as");
		
		
		workbook.close();
		/*
		 //https://www.youtube.com/watch?v=D5-AABf0vaY
		ByteArrayOutputStream stream = new ByteArrayOutputStream();

		Sheet sheet = workbook.createSheet("Persons");

		sheet.setColumnWidth(0, 6000);
		sheet.setColumnWidth(1, 4000);

		Row header = sheet.createRow(0);

		String columns[] = { "Name", "Passw" };

		for (int i = 0; i < columns.length; i++) {
			// Creamos celda por celda
			Cell cell = header.createCell(i);

			// Agregamos el valor en la celda
			cell.setCellValue(columns[i]);
		}

		int initRow = 1;

		for (ComponenteEntity comp : listadoComponentes) {

			header = sheet.createRow(initRow);

			header.createCell(0).setCellValue(comp.getId());
		}

		try {
			workbook.write(stream);

			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			workbook.close();
		}
*/
	}

}
