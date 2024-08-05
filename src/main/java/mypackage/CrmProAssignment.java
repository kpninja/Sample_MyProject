package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class CrmProAssignment {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
driver=new ChromeDriver();
driver.get("https://classic.freecrm.com/");

driver.findElement( By.name("username")).sendKeys("RajSingh");
driver.findElement(By.name("password")).sendKeys("Raj123");
driver.findElement(By.xpath("//input[@type='submit']")).submit();
driver.switchTo().frame("mainpanel");
Actions act = new Actions(driver);
act.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).perform();


driver.findElement(By.xpath("//a[@title='New Contact']")).click();
WebElement title=driver.findElement(By.name("title"));
Select select = new Select(title);
select.selectByValue("Mrs.");
driver.findElement( By.name("first_name")).sendKeys("Rani");
driver.findElement( By.id("surname")).sendKeys("Gupta");
//driver.findElement(By.name("image_file")).sendKeys("");

WebElement status= driver.findElement(By.name("status"));
Select sel=new Select(status);
sel.selectByValue("New");

driver.findElement(By.id("mobile")).sendKeys("9886773450");

driver.findElement(By.cssSelector("#contactForm > table > tbody > tr:nth-child(1) > td > input:nth-child(2)")).click();
	}

}
