package create_new_file;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Creating_Excel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"/testdata/testfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data_Driven");
		
		XSSFRow row1 = sheet.createRow(0);
			row1.createCell(0).setCellValue("Name");
			row1.createCell(1).setCellValue("Dept");
			row1.createCell(2).setCellValue("EmpID");
		XSSFRow row2 = sheet.createRow(1);
			row2.createCell(0).setCellValue("Rajendra");
			row2.createCell(1).setCellValue("Automation");
			row2.createCell(2).setCellValue("A22190");
		XSSFRow row3 =sheet.createRow(2);
			row3.createCell(0).setCellValue("Debi");
			row3.createCell(1).setCellValue("Prd Support");
			row3.createCell(2).setCellValue("A22175");
		XSSFRow row4 = sheet.createRow(3);
			row4.createCell(0).setCellValue("Aditya");
			row4.createCell(1).setCellValue("RMG");
			row4.createCell(2).setCellValue("A22070");
			
			
		workbook.write(file);
		file.close();
		
		System.out.println("File has been created successfully");

	}

}
