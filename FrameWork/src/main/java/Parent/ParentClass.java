package Parent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.TestUtil;

public class ParentClass {
	
	
	public static WebDriver dri;
	public static Properties pro;

	
	public ParentClass() {
		try {
			
		
		pro = new Properties();
		FileInputStream fi = new FileInputStream("L:\\FrameWork\\Repository\\selenium.properties");
		pro.load(fi);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			
			e.printStackTrace();
		}
		
		}
	
	public static void first() {
		
		String browsername = pro.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			dri = new ChromeDriver();
		}
		else if(browsername.equals("ff")) {
			dri = new FirefoxDriver();
		}
		dri.get(pro.getProperty("url"));
		dri.manage().window().maximize();
		dri.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		dri.manage().timeouts().implicitlyWait(TestUtil.implicitly_wait, TimeUnit.SECONDS);
		
		
	}
	
public static void Amazon() {
		
		String browsername = pro.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			dri = new ChromeDriver();
		}
		else if(browsername.equals("ff")) {
			dri = new FirefoxDriver();
		}
		dri.get(pro.getProperty("url3"));
		dri.manage().window().maximize();
		dri.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		dri.manage().timeouts().implicitlyWait(TestUtil.implicitly_wait, TimeUnit.SECONDS);
		
		
	}
	

}
