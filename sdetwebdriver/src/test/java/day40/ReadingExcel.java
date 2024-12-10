package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/testdata/Text.new.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int totalRows= sheet.getLastRowNum();
		int totalCells = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Number Of Rows"+totalRows);
		System.out.println("Number of cells"+ totalCells);
		
		for (int r=0;r<totalRows;r++)
		{
			XSSFRow currentRow =sheet.getRow(r);
			
			for(int c=0; c<totalCells;c++)
			{
				XSSFCell cell = currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		
		
		

	}

}
