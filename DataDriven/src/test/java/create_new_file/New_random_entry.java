package create_new_file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class New_random_entry {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"/newtestdata/myrandom.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("sheet1");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of Rows");
		int noOfrow=sc.nextInt();
		System.out.println("Enter no of cells");
		int noOfcells=sc.nextInt();
		
		System.out.println("Enter data into the table"); //we need to run for loop to get the data into the table
		for(int r=0;r<=noOfrow;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			for(int c=0;c<noOfcells;c++)
			{
				XSSFCell newcell=currentrow.createCell(c);
				newcell.setCellValue(sc.next());
			}
		}
		for (int r=0;r<=noOfrow;r++)
		{
			XSSFRow newrow=sheet.getRow(r);
			for (int c=0; c<noOfcells;c++)
			{
				System.out.print(newrow.getCell(c).toString()+"\t");
			}
			System.out.println();
		}
		workbook.write(file);
		workbook.close();
		file.close();
		sc.close();

	}

}
