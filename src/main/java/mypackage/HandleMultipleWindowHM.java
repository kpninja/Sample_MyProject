package mypackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindowHM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent

		//window handler apis
		//any browser: window/tab
		//advertisements
		String parentWindowId = driver.getWindowHandle();
		driver.switchTo().window(parentWindowId);
		
		Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
	Set<String> handels=driver.getWindowHandles();
	Iterator<String> it= handels.iterator();
	String parentWindowId1 = it.next();
	System.out.println("parent window id is: " + parentWindowId1);
	String child1WindowId = it.next();
	System.out.println("child1 window id is: " + child1WindowId);
	System.out.println("parent window title : " + driver.getCurrentUrl());
	
	driver.switchTo().window(child1WindowId);
	System.out.println("child1 window title : " + driver.getCurrentUrl());
	driver.close();
	 System.out.println("********************");
	 
	driver.switchTo().window(parentWindowId);
System.out.println("parent window title : " + driver.getCurrentUrl());
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
	Set<String> handel2=driver.getWindowHandles();
	Iterator<String> it2= handel2.iterator();
	it2.next();
	String child2WindowId = it2.next();
		System.out.println("child2 window id is: " + child2WindowId);
	
	driver.switchTo().window(child2WindowId);
 System.out.println("child2 window title : " + driver.getCurrentUrl());
	driver.close();
	 System.out.println("********************");

	driver.switchTo().window(parentWindowId);
 System.out.println("parent window title : " + driver.getCurrentUrl());
	 driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
   Set<String> handel3=driver.getWindowHandles();
	Iterator<String> it3= handel3.iterator();
      it3.next();
	 String child3WindowId = it3.next();
	 System.out.println("child3 window id is: " + child3WindowId);
	
	driver.switchTo().window(child3WindowId);
   System.out.println("chil3 window title : " + driver.getCurrentUrl());
	driver.close();
	 System.out.println("********************");
	 
	driver.switchTo().window(parentWindowId);
	System.out.println("parent window title : " + driver.getCurrentUrl());
	
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		Set<String> handel4=driver.getWindowHandles();
		Iterator<String> it4= handel4.iterator();
		it4.next();
		String child4WindowId = it4.next();
			System.out.println("child4 window id is: " + child4WindowId);
	
		driver.switchTo().window(child4WindowId);
	 System.out.println("child4 window title : " + driver.getCurrentUrl());
		driver.close();
		 System.out.println("********************");
	
		// driver.switchTo().window(parentWindowId);
		 Thread.sleep(2000);
		 driver.quit();
//	driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
//	driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
//	driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
//	driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
//	
	
	}

}
