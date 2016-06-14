package userlevelthree;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class EDPTest {
	WebDriver driver = new FirefoxDriver();
	
@ BeforeClass
	public void beforeTest() {
	driver.get("https://global.qntest.com/EDPSite/");
}


@DataProvider(name = "logIn")
public Object[][] test1(){
 return new Object[][]{{"vk_Thili", "1qaz2wsx"}};
 }
 
@Test(dataProvider= "test1")
public void logIn(String logIn, String password){
 WebElement login = driver.findElement(By.id("loginname")); 
 login.sendKeys(logIn);
 
 WebElement pwd = driver.findElement(By.id("password")); 
 pwd.sendKeys(password);
 
 WebElement submit1 = driver.findElement(By.id("Button1"));
 submit1.click();
}

/*@Test

public void login(){
	WebElement login = driver.findElement(By.id("loginname"));
	login.sendKeys ("VK_Thili");
	
	
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys ("1qaz2wsx");
	
	WebElement submitbtn = driver.findElement(By.id("Button1"));
	submitbtn.click();
}*/


@Test

public void vip(){
	WebElement vip = driver.findElement(By.id("TextBox1"));
	vip.sendKeys ("970163");
	
	WebElement submitbtn2 = driver.findElement(By.id("btnsubmit"));
	submitbtn2.click();
}

@Test

public void searchengine(){
	WebElement searchengine = driver.findElement(By.id("txtTCO"));
	searchengine.sendKeys ("AA002298");
	
	WebElement submitbtn3 = driver.findElement(By.id("btnsearch"));
	submitbtn3.click();
}

@Test

public void myTest(){
	WebElement irid=(WebElement)driver.findElement(By.id("lbTCO"));
	String name = irid.getText();
	Assert.assertEquals("AA002298",name);
}

@Test

public void comname(){
	WebElement irid=(WebElement)driver.findElement(By.id("lbCo"));
	String name = irid.getText();
	Assert.assertEquals("RYTHM INTERNATIONAL Ltd",name);
    }

@Test
public void viewReport(){
 WebElement menubar = driver.findElement(By.id("Menu1-menuItem001"));
 menubar.click();
 
 WebElement subMenu = driver.findElement(By.id("Menu1-menuItem001-subMenu-menuItem001"));
 subMenu.click();
 
 WebElement byIRreport = driver.findElement(By.id("Menu1-menuItem001-subMenu-menuItem001-subMenu-menuItem000"));
 byIRreport.click();
 }

}




