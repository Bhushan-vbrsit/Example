package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EMS_login_page {
	WebDriver driver;
	WebDriverWait wait;
	public EMS_login_page(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//button[text()='Company Login']")WebElement click_on_ems_btn;
@FindBy(name="companyName")WebElement enter_service_name;
@FindBy(xpath="//button[text()='Submit']")WebElement click_on_submit_button;
@FindBy(name="username")WebElement enter_username;
@FindBy(name="password")WebElement enter_password;
@FindBy(xpath="//button[text()='Sign in']")WebElement click_on_sign;
@FindBy(id="otp")WebElement enter_otp;
@FindBy(xpath="//a[text()='Forgot password?']")WebElement click_forgot_pwd;
@FindBy(name="email")WebElement enter_mail;
@FindBy(xpath="//button[@class='btn btn-primary']")WebElement click_send_otp;
@FindBy(name="otp")WebElement enter_otp_inforgot_password;
@FindBy(xpath="//button[text()='Submit']")WebElement click_on_submit_btn;
@FindBy(name="password")WebElement enter_new_password;
@FindBy(name="confirmPassword")WebElement enter_confirm_password;
@FindBy(xpath="//button[@class='btn btn-primary']") WebElement click_update_password;
public void click_on_emslogin_btn() {
	driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
	click_on_ems_btn.click();
}
public void click_on_enter_servicename(String servicename) {
	enter_service_name.sendKeys(servicename);
}
public void click_on_submit_button() {
	 click_on_submit_button.click();
}
public void enter_username(String username) {
	enter_username.sendKeys(username);
}
public void enter_password(String password) {
	enter_password.sendKeys(password);
}
public void click_on_signin() {
	click_on_sign.click();
}
public void enter_otp(String otp) {
	enter_otp.sendKeys(otp);
}
public void click_on_forgot_password() {
	click_forgot_pwd.click();
}
public void enter_email(String email) {
	enter_mail.sendKeys(email);
}
public void click_send_otp_btn() {
	click_send_otp.click();
}
public void enter_otp_forgot_password(String otp) {
	enter_otp_inforgot_password.sendKeys(otp);
}
public void click_on_submit_button_in_forgot() {
	click_on_submit_btn.click();
}
public void enter_new_password(String password) {
	enter_new_password.sendKeys(password);
}
public void confirm_password(String confirmpassword) {
	enter_confirm_password.sendKeys(confirmpassword);
}
public void click_update_password_btn() {
	click_update_password.click();
}
}
