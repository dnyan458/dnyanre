package TestNGpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelTest 
{
  @Test
  public void f() throws IOException 
  {
	 FileInputStream Srcfile = new FileInputStream("D:\\TestData.xlsx");
	 XSSFWorkbook  WorkBook = new XSSFWorkbook(Srcfile);
	 XSSFSheet Sheet = WorkBook.getSheetAt(0);
	 System.out.println(Sheet.getRow(0).getCell(0).getStringCellValue());
	 System.out.println(Sheet.getRow(1).getCell(0).getStringCellValue());
	 System.out.println(Sheet.getRow(0).getCell(2).getStringCellValue());
	 System.out.println(Sheet.getRow(1).getCell(2));



  }
}
