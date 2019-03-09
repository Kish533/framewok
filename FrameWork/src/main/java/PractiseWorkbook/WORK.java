package PractiseWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WORK{
	
	public static void main(String[] args) throws IOException {
		FileInputStream fw = new FileInputStream("L:\\names.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fw);
		XSSFSheet sht = wb.getSheet("names");
		XSSFRow row = sht.getRow(4);
		XSSFCell cel = row.getCell(3);
		String value = cel.getStringCellValue();
		System.out.println(value);
		  } 
	}
	
	
	
	


