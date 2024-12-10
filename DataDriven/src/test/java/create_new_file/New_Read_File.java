package create_new_file;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class New_Read_File {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/testdata/testfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Data_Driven");
		
		int totalrows=sheet.getLastRowNum();
		int totalcell=sheet.getRow(1).getLastCellNum();
		
		XSSFCell required=sheet.getRow(3).getCell(2);
		System.out.println(required);
//		for(int r=0; r<=totalrows;r++)
//		{
//			XSSFRow currentrow=sheet.getRow(r);
//			for(int c=0;c<totalcell;c++)
//			{
//				System.out.print(currentrow.getCell(c)+"\t");
//			}
//			System.out.println();
//		}
		workbook.close();
		file.close();
		
	}

}
