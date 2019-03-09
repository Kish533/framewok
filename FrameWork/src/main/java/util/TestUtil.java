package util;

import java.io.FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;



import Parent.ParentClass;

public class TestUtil extends ParentClass {
	
	public static long page_load_timeout = 10;
	public static long implicitly_wait = 10;
	
	public static long implicitly_wait_2 = 5;
	  
	
	/*public void explici_wait() {
		WebDriverWait exp_wait = new WebDriverWait(dri, 10);
		exp_wait.until(ExpectedConditions.elementToBeClickable(By.name(null)));
		
	}*/
	
	
	public static String TESTDATA_SHEET_PATH = "C:\\Users\\kishore\\git\\framewok\\FrameWork\\Repository\\Book.xlsx";

	static Workbook book;
	static Sheet sheet;
	static JavascriptExecutor js;

	
	 public  void switchtoframe() {
		 dri.switchTo().frame("mainpanel");
		 
	 }
	 
	 public static Object[][] Excel_Data(String sheetName) {
			FileInputStream file = null;
			try {
				file = new FileInputStream(TESTDATA_SHEET_PATH);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				book = WorkbookFactory.create(file);
			} catch (InvalidFormatException  e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			sheet = book.getSheet(sheetName);
			Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			// System.out.println(sheet.getLastRowNum() + "--------" +
			// sheet.getRow(0).getLastCellNum());
			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
					data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
					// System.out.println(data[i][k]);
				}
			}
			return data;
		}
	 
	 ////////// broken links /////////////
	 public static void BrokenLinks_verify(String linkUrl)
		{
	        try 
	        {
	           URL url = new URL(linkUrl);
	           
	           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
	           
	           httpURLConnect.setConnectTimeout(3000);
	           
	           httpURLConnect.connect();
	           
	           if(httpURLConnect.getResponseCode()==200)
	           {
	               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
	            }
	          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
	           {
	               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
	            }
	        } catch (Exception e) {
	           
	        }
		}
	 
	 ///////// prct blink ///////////

public static void prac(String checkurl) {
	try{
		URL ur = new URL(checkurl);
		HttpURLConnection conn = (HttpURLConnection)ur.openConnection();
		conn.setConnectTimeout(3000);
		conn.connect();
		if(conn.getResponseCode()==200) {
			System.out.println(checkurl+"___"+ conn.getResponseMessage());
		}
		else if(conn.getResponseCode()!=200) {
		System.out.println(checkurl+"___"+ conn.getResponseMessage()+"   "+"response code !=200");	
			
		}
}catch(Exception e) {
		
		
	}
	
	
}
	 
}



