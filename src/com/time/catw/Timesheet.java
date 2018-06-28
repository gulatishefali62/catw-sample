package com.time.catw;

import java.util.concurrent.TimeUnit;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Timesheet {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:/Chromedriver_new/chromedriver.exe"); WebDriver driver = new
		 * ChromeDriver();
		 */

		System.setProperty("webdriver.ie.driver", "C:\\IE_driver_Latest\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");

		/*
		 * DesiredCapabilities IEcaps = DesiredCapabilities.internetExplorer();
		 * 
		 * IEcaps .setCapability(InternetExplorerDriver.
		 * INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		 * 
		 * WebDriver driver = new InternetExplorerDriver(IEcaps );
		 */
		WebDriver driver = new InternetExplorerDriver();

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.get("https://pj1.sapnet.entsvcs.net/hps-ic");

		Thread.sleep(3000);
		try {
			Runtime.getRuntime().exec("C:/SeleniumJAR/basicauth.exe");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(10000);

		driver.findElement(By.id("sap-user")).sendKeys("60032691");
		driver.findElement(By.id("sap-password")).sendKeys("June@2018");
		driver.findElement(By.className("urBtnCntTxt")).click();
		// driver.findElement(By.xpath("//input[@id='sap-user']")).sendKeys("60032691");
		// driver.findElement(By.xpath("sap-password")).sendKeys("March@2018");
		// driver.findElement(By.xpath(""))
		// driver.findElement(By.className("urTxtStd")).click();
		// driver.findElement(By.id("time_entry")).click();
		// driver.findElement(By.xpath("//div[@id='myTreetime-child']/div[@id='myTreetime_entry']")).click();
		// driver.findElement(By.id("callprivacy")).click();
		// @FindBy(xpath = "//div[@class='cell
		// large-4']/button[@class='ssmButtonSelect b4']")

		// Thread.sleep(10000);

		// driver.findElement(By.xpath("//a[@id='time_entry']")).click();
		// driver.findElement(By.xpath("//div[@id='myTreetime']/div/div[2]/div")).click();

		// driver.findElement(By.xpath("//*[acenstor::span[div[@id='myTreetime_entry']")).click();
		/*
		 * List<WebElement> elems = driver.findElements(By.xpath(
		 * "//*[@id='myTreetime_entry']/table/tbody/tr")); for (WebElement
		 * rowElem : elems) { List<WebElement> cells
		 * =rowElem.findElements(By.xpath(
		 * "//*[@id='myTreetime_entry-cnt-start']"));
		 * 
		 * if(cells.get(0).getText().equalsIgnoreCase("Time Entry")) {
		 * 
		 * System.out.println(cells.get(0).getText());// cells.get(0).click();
		 * 
		 * } }
		 */
		/*
		 * WebElement timeEntry =
		 * driver.findElement(By.id("time_entry")).click(); Actions builder =
		 * new Actions(driver); // Move cursor to the Main Menu Element
		 * builder.moveToElement(timeEntry).Perform(); // Giving 5 Secs for
		 * submenu to be displayed Thread.sleep(5000L); // Clicking on the
		 * Hidden SubMenu driver.findElement(By.Id("sbEle")).click();
		 */
        
	}

}
