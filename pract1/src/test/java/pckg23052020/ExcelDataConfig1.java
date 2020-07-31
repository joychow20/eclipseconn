package pckg23052020;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig1 {
	XSSFWorkbook wb;
	
	XSSFSheet sheet;
	public  ExcelDataConfig1(String excelPath){
		try {
			File src=new File(excelPath);
			FileInputStream fis=new FileInputStream(src);
wb=new 	XSSFWorkbook(fis);
			

		
		} 
		
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public String getData(int sheetNumber,int row,int col){
		sheet=wb.getSheetAt(sheetNumber);
	String exceldata=	sheet.getRow(row).getCell(col).getStringCellValue();
		
		return exceldata;
		}
	
	
	public void createcellonfail(int sheetNumber,int row,String exceldata) throws IOException {
		FileOutputStream fout = new FileOutputStream(exceldata);
		sheet=wb.getSheetAt(sheetNumber);
		sheet.getRow(row).createCell(2).setCellValue("Fail");
		wb.write(fout);
			
			}
		 
	
	
	public int getrowcount(int sheetIndex){
		
	int row=	wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		return row;
		
	}
	
	
	public int getcolcount(int sheetIndex){
		
		int col=	wb.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
			
			return col;
			
		}
	
	
public int getsheetnumber(int sheetIndex){
		
		int col=	wb.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
			
			return col;
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[]args){
//		ExcelDataConfig edc=new ExcelDataConfig("C:/Users/hp/Desktop/new1.xls");
//		System.out.println(edc.getData(0, 0, 0));
//		
//	}
	
	
	

}
