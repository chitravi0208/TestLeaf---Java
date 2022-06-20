package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement usernameElement = driver.findElement(By.id("username"));
		usernameElement.sendKeys("Demosalesmanager");
		
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa");
		
		WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
		loginbutton.click();
		
		WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaElement.click();
		
		WebElement leadsElement = driver.findElement(By.linkText("Leads"));
		leadsElement.click();
		
		WebElement createleadElement = driver.findElement(By.linkText("Create Lead"));
		createleadElement.click();
		
		WebElement companynameElement = driver.findElement(By.id("createLeadForm_companyName"));
		companynameElement.sendKeys("Acc");
		
		WebElement firstnameElement = driver.findElement(By.id("createLeadForm_firstName"));
		firstnameElement.sendKeys("Chitra");
		
		WebElement lastnameElement = driver.findElement(By.id("createLeadForm_lastName"));
		lastnameElement.sendKeys("R");
		
		WebElement firstnamelocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstnamelocalElement.sendKeys("Chitu");
		
		WebElement departmentElement = driver.findElement(By.id("createLeadForm_departmentName"));
		departmentElement.sendKeys("Testing");
		
		WebElement descriptionElement = driver.findElement(By.id("createLeadForm_description"));
		descriptionElement.sendKeys("automation test");
		
		WebElement emailElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailElement.sendKeys("abcd@gmail.com");
		
		WebElement stateprovinceDropDownElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd5 = new Select(stateprovinceDropDownElement);
		dd5.selectByVisibleText("New York");
		
		WebElement submitElement = driver.findElement(By.className("smallSubmit"));
		submitElement.click();
		
		WebElement editbuttonElement = driver.findElement(By.linkText("Edit"));
		editbuttonElement.click();
		
		WebElement updatedescriptionElement = driver.findElement(By.id("updateLeadForm_description"));
		updatedescriptionElement.clear();
		
		WebElement updateimportantnoteElement = driver.findElement(By.id("updateLeadForm_importantNote"));
		updateimportantnoteElement.sendKeys("we are performing automated testing using selenium");
		
		WebElement updatebuttonElement = driver.findElement(By.className("smallSubmit"));
		updatebuttonElement.click();
		
		String title = driver.getTitle();
		System.out.println("Page title is " + title);
	}

}
