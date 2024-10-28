package com.qa.pages;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Private_Limited_Registration_Pages {
	WebDriverWait wait;
 WebDriver driver;
    public Private_Limited_Registration_Pages(WebDriver driver) {
    	this.driver=driver;
    	this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    	PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//span[text()='Employer']")
    WebElement click_on_employer;
    @FindBy(xpath="//a[text()='Registration']")
    WebElement click_on_Registration;
    @FindBy(name="companyType")
    WebElement select_company_type;
    @FindBy(name="companyName")
    WebElement enter_cname;
    @FindBy(name="shortName")
    WebElement enter_service_name;
    @FindBy(name="emailId")
    WebElement enter_email;
    @FindBy(name="password") 
    WebElement enter_pwd;
    @FindBy(name="mobileNo") 
    WebElement enter_mobile;
    @FindBy(name="alternateNo") 
    WebElement enter_alter;
    @FindBy(name="companyAddress") 
    WebElement enter_com_address;
    @FindBy(name="cinNo")
    WebElement enter_cin;
    @FindBy(name="gstNo") 
    WebElement enter_gst;
    @FindBy(name="panNo") 
    WebElement enter_pan;
    @FindBy(name="name") 
    WebElement enter_name;
    @FindBy(name="personalMailId") 
    WebElement enter_pmail;
    @FindBy(name="personalMobileNo") 
    WebElement enter_pmobile;
    @FindBy(name="address") 
    WebElement enter_add;
    @FindBy(xpath="//button[@type='submit']")
    WebElement click_on_submit;
    @FindBy(xpath="//a[text()='Home']")WebElement click_on_home;
    @FindBy(xpath="//input[@placeholder='Enter Password']/following-sibling::i")WebElement click_eye_icon;
    public void click_employer_btn() {
 	   click_on_employer.click();
    }
    public void click_registration_btn() {
 	   click_on_Registration.click();
    }
    public void select_company_type(){
 	   select_company_type.click();
    }
    public void enter_company_name(String cname) {
 	   enter_cname.sendKeys(cname);
    }
    public void enter_service_name(String sname) {
 	   enter_service_name.sendKeys(sname);
    }
    public void enter_email(String email) {
 	   enter_email.sendKeys(email);
 	 
 	  
    }
    public void enter_password(String pwd) {
 	   enter_pwd.sendKeys(pwd);
 	   
    }
    public void enter_mobile_number(String mnumber) {
 	   enter_mobile.sendKeys(mnumber);
 	   
    }
    public void enter_alternative_number(String Anumber) {
 	   enter_alter.sendKeys(Anumber);  
 	  
    }
     public void enter_company_adderess(String caddress) {
     	enter_com_address.sendKeys(caddress);
     	
     }
     public void enter_cin_number(String cin) {
     	enter_cin.sendKeys(cin);
     }
     public void enter_gst_number(String gst) {
     	enter_gst.sendKeys(gst);
     }
     public void enter_pan_number(String pan) {
     	enter_pan.sendKeys(pan);
     	
     	
     }
     public void enter_name(String name) {
     	enter_name.sendKeys(name);
     }
     public void enter_personal_email(String pmail) {
     	enter_pmail.sendKeys(pmail);


     	
     }
     public void personal_mobile_number(String pnumber) {
     	enter_pmobile.sendKeys(pnumber);
     
     }
     public void address(String adress) {
     	enter_add.sendKeys(adress);
     	JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("window.scrollTo(0,1500)");
		  
     }
     public void click_on_submit_btn() throws InterruptedException  {
    	 Thread.sleep(5000);
    	 click_on_submit.click();
    	 Thread.sleep(5000);
     //wait.until(ExpectedConditions.visibilityOf(click_on_submit)).click();
     }
     public void click_on_home_btn() {
    	 click_on_home.click();
     }
     public void click_on_eye_icon() throws InterruptedException {
    	 
    	 click_eye_icon.click();
    	 
     }
     public void Enter_the_company_data(String cname,String sname,String email,String pwd,String mnumber,String Anumber,String caddress,String cin,String gst,String pan,String name,String pmail,String pnumber,String adress) {
    	 enter_company_name(cname);
    	 enter_service_name(sname);
    	 enter_email(email);
    	 enter_password(pwd);
    	 enter_mobile_number(mnumber);
    	 enter_alternative_number(Anumber);
    	 enter_company_adderess(caddress);
    	 enter_cin_number(cin);
    	 enter_gst_number(gst);
    	 enter_pan_number(pan);
    	 enter_name(name);
    	 enter_personal_email(pmail);
    	 personal_mobile_number(pnumber);
    	 address(adress);
   	 
    	 }
}
