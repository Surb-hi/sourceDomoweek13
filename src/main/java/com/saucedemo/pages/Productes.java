package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Productes extends Utility {
    By productNo=By.className("inventory_item");

    public List<WebElement> product(){
        return driver.findElements(productNo);
    }

    public int products(){
        return product().size();
    }
}
