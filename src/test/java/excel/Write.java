package excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;




public class Write {
	
@Test
	public void book () throws Exception {
		HSSFWorkbook workbook =  new HSSFWorkbook();
		HSSFSheet sheet =  workbook.createSheet("first sheet");
		for(int i=0; i<2;i++)
		{
			Row row = sheet.createRow(i);
			Cell c  =  row.createCell(0);
		    if(i==0)
		    	c.setCellValue("1234890");
		    else
		    	c.setCellValue("4567890");
		    
		    Cell c1 = row.createCell(1);
		    if(i==1)
		    c1.setCellValue("asdfghjk");
		    else
		    	c1.setCellValue("ghjkasdf");
		}
		FileOutputStream wrt = new FileOutputStream(new File("C:/Users/Public/testdata.xls"));
		workbook.write(wrt);
		wrt.close();
		
}}


