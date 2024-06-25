package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.pages.alerts.enums.SideBarMenuEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.demoqa.pages.alerts.enums.SideBarMenuEnum.ADMIN;

public class SideBarMenu {

    @FindBy(className = "oxd-topbar-menu")
    public WebElement topBarBody;
    public SideBarMenu chooseSideBarMenu(SideBarMenuEnum sideBarMenuName){
        topBarBody.findElement(By.id("kjhk"));
        WebElement element = DriverManager.getDriver().findElement(By.xpath("//ul[@class='oxd-main-menu']/li/a/span[text()= '"+ sideBarMenuName.getMenu() + "']"));
        element.click();
        return this;
    }
    public String someTxt(String topBarMenuName, String... value){
        return "sadfas";
    }

    public static void main(String[] args) {
     SideBarMenu sideBarMenu = new SideBarMenu();

     sideBarMenu.chooseSideBarMenu(ADMIN);

     sideBarMenu.someTxt("Ais");
     sideBarMenu.someTxt("Ais", "SomeValue");
    }
}
