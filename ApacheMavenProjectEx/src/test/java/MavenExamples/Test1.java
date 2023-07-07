package MavenExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test(groups="smokeTest")
public class Test1 {
	public void m1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		//driver.manage().window().maximize();
	
	}
}
