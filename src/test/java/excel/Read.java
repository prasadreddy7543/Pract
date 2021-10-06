package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;

public class Read {
@Test
public void bok () throws Exception, Exception {
	HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream("C:/Users/Public/testdata.xls"));
	HSSFSheet sheet = workbook.getSheet("first sheet");
	int rowcount = sheet.getLastRowNum();
	for(int i=0;i<=rowcount;i++)
	{
		Row row = sheet.getRow(i);
		System.out.println(row.getCell(0)+""+row.getCell(1)+""+row.getCell(2));
	}
}

}
