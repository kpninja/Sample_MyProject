package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPage {

  static WebDriver driver;
  public static void main(String[] args)  {
    driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/account");
		//driver.findElement(By.name("search")).sendKeys("macbook");
		driver.findElement( By.id("input-email")).sendKeys("Roopa85@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Roopa@123");
		driver.findElement(By.cssSelector("input.btn-primary")).submit();
		//sendKeys("4")
		driver.findElement(By.name("search")).sendKeys("macbook");
		
		driver.findElement(By.cssSelector("div button .fa-search")).click();
	//	driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a")).click();
//WebElement device=driver.findElement(By.xpath("(//h4/a)[1]"));
		driver.findElement(By.xpath("(//h4/a)[1]")).click();
		driver.findElement(By.id("input-quantity")).clear();
	driver.findElement(By.id("input-quantity")).sendKeys("2");
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
	String text=driver.findElement(By.xpath("//body/div[@id='product-product']/div[1]")).getText();
		System.out.println(text);
	//	driver.findElement(By.cssSelector("div button .fa-search")).click();
//		driver.findElement(By.name("search")).clear();
//	    driver.findElement(By.name("search")).sendKeys("MacBook Pro");
//		//driver.findElement(By.cssSelector("div button .fa-search")).click();
//	    driver.findElement(By.xpath("(//h4/a)[3]")).click();
//    driver.findElement(By.id("input-quantity")).clear();
//	    driver.findElement(By.id("input-quantity")).sendKeys("2");
//		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		
//		driver.findElement(By.name("search")).clear();
//		driver.findElement(By.name("search")).sendKeys("MacBook Air");
//	driver.findElement(By.cssSelector("div button .fa-search")).click();
//		
//		 driver.findElement(By.xpath("//a[contains(text(),'MacBook Air')]")).click();
//		 driver.findElement(By.id("input-quantity")).clear();
//	    driver.findElement(By.id("input-quantity")).sendKeys("2");
//		driver.findElement(By.xpath("//button[@id='button-cart']")).click();

		
		
	}

}