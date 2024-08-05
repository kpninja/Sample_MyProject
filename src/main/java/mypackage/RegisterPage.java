package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
 
 
 //List<WebElement> elementList = driver.findElements(By.xpath("//a[@class='list-group-item']"));
 List<WebElement> elementList = driver.findElements(By.cssSelector(".list-group>a"));

 System.out.println(elementList.size());
 
 for(WebElement e:elementList) {
	 String textLinks = e.getText();
	 System.out.println(textLinks);
 }
 driver.findElement(By.xpath("//a[@class='list-group-item'][2]")).click();
 driver.findElement(By.id("input-firstname")).sendKeys("RajShekar");
 driver.findElement(By.id("input-lastname")).sendKeys("Shettar");
 driver.findElement(By.id("input-email")).sendKeys("Rajshettar100@gmail.com");
 driver.findElement(By.id("input-telephone")).sendKeys("586-662-8920");
 driver.findElement(By.id("input-password")).sendKeys("Hello@423");
 driver.findElement(By.id("input-confirm")).sendKeys("Hello@423");
 driver.findElement(By.xpath("//label[normalize-space()='Yes']")).submit();
 Thread.sleep(3000);
 driver.findElement(By.name("agree")).click();
 driver.findElement(By.xpath("//input[@value='Continue']")).click();

	}

}
