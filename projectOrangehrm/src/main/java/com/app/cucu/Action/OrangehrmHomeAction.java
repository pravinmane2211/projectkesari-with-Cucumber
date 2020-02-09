package com.app.cucu.Action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.app.cucu.Locators.OrangehrmHomeLocators;
import com.webutility.webutility;

public class OrangehrmHomeAction {
	OrangehrmHomeLocators orangehrmHomeLocators = null;
	WebDriver driver = null;

	public OrangehrmHomeAction() {
		orangehrmHomeLocators = new OrangehrmHomeLocators();
		driver = webutility.getDriver();
		PageFactory.initElements(driver, orangehrmHomeLocators);
	}

	public void Orangelogin(String username, String password) {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		// Actions actions = new Actions(driver);
		// actions.moveToElement(orangehrmHomeLocators.SendTousername).sendKeys(username).build().perform();
		// actions.moveToElement(orangehrmHomeLocators.SendTopassword).sendKeys(password).build().perform();
	}

	public void orangclickevent() {
		// Actions actions = new Actions(driver);
		// actions.moveToElement(orangehrmHomeLocators.clickbutton).click().build().perform();
		driver.findElement(By.id("btnLogin")).click();
	}

	public void Orangelogout() throws FindFailed, InterruptedException {
		   driver.findElement(By.xpath("//a[@id='welcome']")).click();
		  Screen screen = new Screen();
			Pattern logoutbutton= new Pattern("C:\\Users\\DELL\\Desktop\\Sikuli\\Logout.PNG");
			Thread.sleep(2000);
			screen.click(logoutbutton);
	}
	   
	
			
		
		//Select select = new Select(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
		//select.selectByVisibleText("text");
		
		// Actions actions = new Actions(driver);
		// actions.moveToElement(orangehrmHomeLocators.logoutbutton).click().build().perform();


	public void Takescrenshot(WebDriver driver, String destination) throws IOException {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
       String DestFile= System.getProperty("user_dir")+"\\selenium image\\"+".jpg";
		FileUtils.copyFile(SrcFile,new File( DestFile));

		
	}

}