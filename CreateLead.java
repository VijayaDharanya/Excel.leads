package week7.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends CommonSteps {

	@Test(dataProvider="Create")
	public void createLead(String cmpname, String fname, String lname, String phnum) {

		/*driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();*/
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmpname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phnum);
		driver.findElement(By.name("submitButton")).click();
	}
	@DataProvider(name="Create")
	public String[][] fetchData() throws IOException {
		  
		   String[][] readData = DyamicExcel.dyamicExcel();
		   return readData;
	}
	
	/*@DataProvider
	public String[][] testdata() {
		// 2D array to store the test data
		String[][] data = new String[2][6];
		data[0][0] = "DemoSalesManager";
		data[0][1] = "crmsfa";
		data[0][2] = "TestLeaf";
		data[0][3] = "Hari";
		data[0][4] = "R";
		data[0][5] = "99";

		data[1][0] = "Democsr";
		data[1][1] = "crmsfa";
		data[1][2] = "Qeagle";
		data[1][3] = "Babu";
		data[1][4] = "M";
		data[1][5] = "97";
		return data;*/
	}

