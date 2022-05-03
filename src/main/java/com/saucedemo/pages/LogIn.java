package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LogIn extends Utility {
By usernamelink=By.xpath("//input[@id='user-name']");
By passwordLink=By.id("password");
By loginlink=By.id("login-button");
By productlink=By.xpath("//span[contains(text(),'Products')]");

public void username(String textUsername){
    sendTextToElement(usernamelink,textUsername);
}
public void password(String textPassword){
    sendTextToElement(passwordLink,textPassword);
}
public void clickOnLogin(){
    clickOnElement(loginlink);
}
public String product(){
    return getTextFromElement(productlink);
}
}
