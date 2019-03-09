package Amazon_test;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmazonPages.Amazon_HomePage;
import AmazonPages.Amazon_LoginPage;
import Parent.ParentClass;
import util.TestUtil;

public class EncDec extends ParentClass {
	
	 /* public static Amazon_LoginPage ama_log;
	    public static Amazon_HomePage ama_hme;
	
	
	public EncDec() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	
	@BeforeMethod
	public void initi() {
		Amazon();
		ama_log = new Amazon_LoginPage();
		ama_hme = ama_log.start(pro.getProperty("username_1"), pro.getProperty("Password_2"));
		dri.manage().timeouts().implicitlyWait(TestUtil.implicitly_wait_2, TimeUnit.SECONDS);
	}
	@Test
	public void depper() {
	
	

}*/
	public static void main(String[] args) {
		String password = "monkey";
		
		/*byte[] message = password.getBytes(StandardCharsets.UTF_8);
		String encoded = Base64.getEncoder().encodeToString(message);
		System.out.println(encoded);
		
		
		byte[] decoded = Base64.getDecoder().decode(encoded);
		System.out.println(new String(decoded, StandardCharsets.UTF_8));*/
		
		byte[] msg = password.getBytes(StandardCharsets.UTF_16);
		String encoded = Base64.getEncoder().encodeToString(msg);
		System.out.println(encoded);
		 
		byte[] dec = Base64.getDecoder().decode(encoded);
		System.out.println(dec);
		
		}
	}
	
