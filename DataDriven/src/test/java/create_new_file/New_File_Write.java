package create_new_file;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class New_File_Write {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"/newtestdata/testfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Written_data");
		XSSFRow row1= sheet.createRow(0);
			row1.createCell(0).setCellValue("Name");
			row1.createCell(1).setCellValue("Age");
		XSSFRow row2= sheet.createRow(1);
			row2.createCell(0).setCellValue("pintu");
			row2.createCell(1).setCellValue("33");
			
		int totalrow=sheet.getLastRowNum();
		
		int totalcell=sheet.getRow(1).getLastCellNum();
		
		for (int r=0;r<=totalrow;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0; c<totalcell;c++)
			{
				System.out.print(currentrow.getCell(c).toString()+"\t");
			}
			System.out.println();
		}
			
		workbook.write(file);
		workbook.close();
		file.close();
		

	}

}
