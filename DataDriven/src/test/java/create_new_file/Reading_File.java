package create_new_file;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_File {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/testdata/testfile.xlsx");
		
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Data_Driven");
		
		int totalrows = sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();
		
//		System.out.println("Total num of rows"+ totalrows);
//		System.out.println("Total num of cells"+ totalcells);
		
		for (int r=0;r<=totalrows;r++)
		{
			XSSFRow currentRow= sheet.getRow(r);
			
			for(int c=0;c<totalcells;c++)
			{
//				currentRow.getCell(c).toString();
				System.out.print(currentRow.getCell(c).toString() + "\t");

			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
