package data_driven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class User_Input {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"/testdata/user1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook ();
		XSSFSheet sheet = workbook.createSheet("userinput");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of rows:");
		int totalrows=sc.nextInt();
		System.out.println("Enter the no of cells:");
		int totalcells=sc.nextInt();
		
		System.out.println("Enter the data:");
		
		for (int r=0;r<=totalrows;r++)
		{
			XSSFRow newrows=sheet.createRow(r);
			for (int c=0;c<totalcells;c++)
			{
				XSSFCell newcells=newrows.createCell(c);
				newcells.setCellValue(sc.next());
			}
		}
		System.out.println("File has been created");
		
		for (int r=0;r<=totalrows;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0;c<totalcells;c++)
			{
				System.out.print(currentrow.getCell(c)+"\t");
			}
			System.out.println();
		}
		workbook.write(file);
		workbook.close();
		file.close();

	}

}
