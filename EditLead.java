package week7.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends CommonSteps {
	
	@Test(dataProvider = "Edit")
	public void editLead(String phnum,String cmpname) throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phnum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cmpname);
		driver.findElement(By.name("submitButton")).click();
	}
	@DataProvider(name="Edit")
	public String[][] testdata() throws IOException {
		String[][] readData=DyamicExcel.dyamicExcel();
				return readData;
	}
	/*@DataProvider
	public String[][] testdata() {
		// 2D array to store the test data
		String[][] data = new String[2][4];
		data[0][0] = "DemoSalesManager";
		data[0][1] = "crmsfa";
		data[0][2] = "99";
		data[0][3] = "Tcs";
		

		data[1][0] = "Democsr";
		data[1][1] = "crmsfa";
		data[1][2] = "97";
		data[1][3] = "Cts"; 
		
		return data;*/

	
}
