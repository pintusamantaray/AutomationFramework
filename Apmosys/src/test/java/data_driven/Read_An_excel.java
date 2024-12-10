package data_driven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_An_excel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/testdata/apmosys.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Practice");
		int totalrow=sheet.getLastRowNum();
		int totalcell=sheet.getRow(0).getLastCellNum();
		System.out.println("Total rows: "+totalrow);
		System.out.println("Total Cells: "+ totalcell);
		System.out.println(sheet.getRow(3).getCell(1)); ///To find the exact data form the sheet
		for (int r=0; r<=totalrow;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0;c<totalcell;c++)
			{
				System.out.print(currentrow.getCell(c).toString()+"\t");
				
			}
			System.out.println();
		}
		workbook.close();
		file.close();

	}

}
