package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\myhome\\Documents\\drivers\\chromedriver.exe");
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new EdgeDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println("The title is: " +title);
		//driver.close();
		
		// driver=new EdgeDriver();
		// driver.get("https://www.google.com/");
		//String title=driver.getTitle();
	//	System.out.println(driver.getTitle());
		
		if(title.equals("amazon"))
		{
			System.out.println("Launched right browser");
		}
		else
		{
			System.out.println("Launched incorrect browser");
	     }
		//driver.close();
		
	}
}
