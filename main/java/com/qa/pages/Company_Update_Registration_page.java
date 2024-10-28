package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Company_Update_Registration_page {
	WebDriver driver;
	public Company_Update_Registration_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
 @FindBy(xpath="//a[text()='Summary']")WebElement click_on_summary;
 @FindBy(id="pagination-next-page")WebElement click_on_nextbtn;
 @FindBy(xpath="//div[text()='Sattava']/../../following-sibling::div[4]/child::div/child::button[@title=\"Edit\"]")WebElement click_edit_btn;
 @FindBy(name="mobileNo")WebElement enter_phone_number;
 @FindBy(name="companyAddress")WebElement enter_company_address;
 @FindBy(xpath="//button[text()='Update Company']")WebElement click_on_submit;
 @FindBy(xpath="//input[@placeholder='Search by Company Name, Authorized Name ']")WebElement enter_comapny;
 @FindBy(xpath="//div[text()='Evy']/../../following-sibling::div[4]/child::div/child::button[2]")WebElement click_on_delete;
 @FindBy(xpath="//button[text()='Delete']")WebElement click_on_delete_btn;
 @FindBy(xpath="//i[@class='bi bi-person-circle']")WebElement click_ems_admin;
 @FindBy(xpath="//a[text()='Logout']")WebElement click_logout_btn;
 public void click_on_summary_button() throws InterruptedException {
	 click_on_summary.click();
	 Thread.sleep(2000);
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollTo(0,2000)");
	 Thread.sleep(2000);
	 click_on_nextbtn.click();
 }
 public void click_on_edit_button() throws InterruptedException {
	
	 click_edit_btn.click();
 }
 public void enter_phone_number(String phonenumber,String address) throws InterruptedException {
	
	Thread.sleep(1000);
	 enter_phone_number.clear();
	 Thread.sleep(1000);
	 enter_phone_number.sendKeys(phonenumber);
	 Thread.sleep(1000);
	 enter_company_address.clear();
	 Thread.sleep(1000);
	 enter_company_address.sendKeys(address);
	 Thread.sleep(2000);
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollTo(0,2000)");
	 Thread.sleep(2000);
 }
  public void click_on_update_button() throws InterruptedException {
	  Thread.sleep(3000);
	  click_on_submit.click();
	  Thread.sleep(3000);
  }
  public void search_company(String com) {
	  enter_comapny.sendKeys(com);
  }
  public void click_on_delete_icon() {
	  click_on_delete.click();
  }
  public void click_on_delete_btn() throws InterruptedException  {
	  click_on_delete_btn.click();
	  Thread.sleep(7000);
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollTo(0,-3000)");
  }
  public void click_on_logout_button() throws InterruptedException {
	  
	  click_ems_admin.click(); 
	  click_logout_btn.click();
	  
  }
}
