package com;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;

import static org.junit.Assert.*;

public class FileUpload {
	protected static WebDriver driver;
	@BeforeClass
	public static void setUp() {
		
		System.setProperty("webdriver.ie.driver", "E:\\Jonathan\\Browser Servers\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
	     DesiredCapabilities capab = DesiredCapabilities.internetExplorer();
	     capab.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	    driver = new InternetExplorerDriver(capab);
	    // driver.get("http://www.flipkart.com/");
	    
		
		//driver = new ChromeDriver();
		driver.get("http://blueimp.github.com/jQuery-File-Upload/");
	}
	@Test
	public void testFileUpload() throws
	InterruptedException {
		try {
			//Click on Add Files button
			driver.findElement(By.cssSelector("form#fileupload div.row div.col-lg-7 span.btn span")).click();
			//Call the OpenDialogHandler, specify the
			//path of the file to be uploaded
			Runtime.getRuntime().exec(new String[]
					{"E:\\Jonathan\\Auto\\OpenDialogHandler.exe","\" C:\\Users\\Jonathan\\Desktop\\IMG_1956.jpg\""});
			
			Thread.sleep(6000);
			//Wait until file is uploaded
			/*boolean result = (new WebDriverWait
					(driver, 30)).until(new
							ExpectedCondition<Boolean>() {

						public Boolean apply(WebDriver d) {
							return d.findElement(By.xpath
									("//table[@role='presentation']"))
									.findElements(By.tagName
											("tr")).size() > 0;
						}});
			assertTrue(result);
*/		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@After
	public void tearDown() {
		driver.close();
	}
}
