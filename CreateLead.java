package week2.day1assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.findElementById("username").sendKeys("demosalesmanager");
driver.findElementByName("PASSWORD").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("Leads").click();
driver.findElementByLinkText("Create Lead").click();
driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
driver.findElementById("createLeadForm_firstName").sendKeys("Velammal");
driver.findElementById("createLeadForm_lastName").sendKeys("Arasu");
WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
Select dropdown = new Select(Source);
dropdown.selectByVisibleText("Employee");
WebElement MarketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
Select dropdown1 = new Select(MarketingCampaign);
dropdown1.selectByValue("9001");
WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
Select dropdown2 = new Select(Industry);
List<WebElement> Options = dropdown2.getOptions();
int size = Options.size();
dropdown2.selectByIndex(size -2);
WebElement Ownership = driver.findElementById("createLeadForm_ownershipEnumId");
Select dropdown3 = new Select(Ownership);
dropdown3.selectByIndex(5);
WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");
Select dropdown4 = new Select(Country);
dropdown4.selectByVisibleText("India");
driver.findElementByName("submitButton").click();
System.out.println(driver.getTitle());
}
}

