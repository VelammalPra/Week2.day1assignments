package week2.day1assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acmelogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
driver.findElementById("password").sendKeys("leaf@12");
driver.findElementByXPath("//button[@type='submit']").click();
System.out.println(driver.getTitle());
driver.findElementByLinkText("Log Out").click();
driver.close();


	}

}
