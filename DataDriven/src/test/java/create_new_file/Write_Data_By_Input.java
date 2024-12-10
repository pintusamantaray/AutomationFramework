package create_new_file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data_By_Input {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"/testdata/random.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		
		XSSFSheet sheet= workbook.createSheet("random_data");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int noOfRows = sc.nextInt();
		
		System.out.println("Enter number of cells");
		int noOfCells= sc.nextInt();
		
		System.out.println("Enter the data you want to add");
		for (int r=0; r<=noOfRows; r++)
		{
			XSSFRow currentRow=sheet.createRow(r);
			for (int c=0;c<noOfCells; c++)
			{
				XSSFCell cell=currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		//Below loop is used to read the data and print it in the console
		for (int r=0; r<=noOfRows; r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0; c<noOfCells; c++)
			{
				System.out.print(currentrow.getCell(c).toString() + "\t");
			}
			System.out.println();
		}
		
		workbook.write(file);
		workbook.close();
		sc.close();
		file.close();
		

	}

}
