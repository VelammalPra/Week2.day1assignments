package week2.day1assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	//private static WebElement Province;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Create Account").click();
		driver.findElementByXPath("//input[@id='accountName']").sendKeys("Velammal");
		driver.findElementByName("description").sendKeys("Selenium Automation Tester");
	driver.findElementByXPath("//input[@id='groupNameLocal']").sendKeys("Tester");
	driver.findElementByXPath("//input[@id='officeSiteName']").sendKeys("Testleaf");
	driver.findElementByXPath("(//input[@class='inputBox'])[5]").sendKeys("50000");
	WebElement Industry = driver.findElementByName("industryEnumId");
	Select dropdown = new Select(Industry);
	dropdown.selectByVisibleText("Computer Software");
	WebElement Ownership = driver.findElementByName("ownershipEnumId");
	Select dropdown1 = new Select(Ownership);
	dropdown1.selectByVisibleText("S-Corporation");
	WebElement Source = driver.findElementById("dataSourceId");
	Select dropdown2 = new Select(Source);
	dropdown2.selectByValue("LEAD_EMPLOYEE");
	WebElement marketingCampaignId = driver.findElementById("marketingCampaignId");
	Select dropdown3 = new Select(marketingCampaignId);
	dropdown3.selectByIndex(6);
	WebElement State = driver.findElementById("generalStateProvinceGeoId");
	Select dropdownState = new Select(State);
	dropdownState.selectByValue("TX");
	driver.findElementByXPath("//input[@class='smallSubmit']").click();
	}
}