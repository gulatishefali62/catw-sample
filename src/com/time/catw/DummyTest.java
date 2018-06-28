package com.time.catw;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DummyTest {

	WebElement element;
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.ie.driver", "C:\\IE_driver_Latest\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.get("https://pj1.sapnet.entsvcs.net/hps-ic");

		Thread.sleep(3000);
		try {
			Runtime.getRuntime().exec("C:/SeleniumJAR/basicauth.exe");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(5000);

		driver.findElement(By.id("sap-user")).sendKeys("60032691");
		driver.findElement(By.id("sap-password")).sendKeys("June@2018");
		driver.findElement(By.className("urBtnCntTxt")).click();
		WebElement frame1=driver.findElement(By.xpath("//frame[@name='list']"));
		driver.switchTo().frame(frame1);
        System.out.println("1");
        WebElement frame=driver.findElement(By.xpath("//table/tbody/tr/td/a[@id='time_entry']"));
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", frame);
        driver.switchTo().defaultContent();
        WebElement frame2=driver.findElement(By.xpath("//frame[@name='right']"));
		driver.switchTo().frame(frame2);
        System.out.println("2");
        WebElement frames=driver.findElement(By.xpath("//*[@id='callprivacy']"));
        JavascriptExecutor executors=(JavascriptExecutor)driver;
        executors.executeScript("arguments[0].click();", frames);
        System.out.println("Clicking on continue successfull");
		
		Thread.sleep(3000);
		
		
	}

}

