package data_driven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create_an_excel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"/testdata/apmosys.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Practice");
		XSSFRow row1 =sheet.createRow(0);
			row1.createCell(0).setCellValue("Sl.No.");
			row1.createCell(1).setCellValue("Name");
			row1.createCell(2).setCellValue("Age");
		XSSFRow row2 = sheet.createRow(1);
			row2.createCell(0).setCellValue("1");
			row2.createCell(1).setCellValue("Rajendra");
			row2.createCell(2).setCellValue("33");
		XSSFRow row3 = sheet.createRow(2);
			row3.createCell(0).setCellValue("2");
			row3.createCell(1).setCellValue("Jewel");
			row3.createCell(2).setCellValue("30");
		XSSFRow row4 = sheet.createRow(3);
			row4.createCell(0).setCellValue("3");
			row4.createCell(1).setCellValue("Pintu");
			row4.createCell(2).setCellValue("28");
		
			workbook.write(file);
			workbook.close();
			file.close();
			
			System.out.println("Required file has been Created");
			

	}

}
