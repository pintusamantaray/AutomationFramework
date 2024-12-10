package data_driven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utilities {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;

	public static int getrowcount(String xlfile,String xlsheet) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		int rowcount= ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
		
	}
	
	
	public static int getcellcount(String xlfile, String xlsheet, int rownum) throws IOException
	{
		fi= new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row= ws.getRow(rownum);
		int cellcount= row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
		
	}
	public static String getcelldata(String xlfile, String xlsheet, int rownum, int colnum) throws IOException
	{
		fi= new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row= ws.getRow(rownum);
		cell=row.getCell(colnum);
		
		String data;
		try
			{
			data=cell.toString();
			if (data.matches("\\d+\\.0")) {
	            // If it ends with ".0", truncate the decimal
	            data = data.substring(0, data.indexOf("."));
			}
			}
		catch (Exception e)
		{
			data="";
		}
		
		wb.close();
		fi.close();
		return data;		
	}
	public static void setcelldata(String xlfile,String xlsheet,int rownum, int colnum,String data) throws IOException
	{
		fi= new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row= ws.getRow(rownum);
		
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		fo=new FileOutputStream (xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
	}
}