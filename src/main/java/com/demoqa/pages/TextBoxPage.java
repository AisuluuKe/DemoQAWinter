package com.demoqa.pages;

import com.demoqa.entities.TextBoxEntity;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage  extends BasePage{
//    public TextBoxPage(){                 УДАЛЯЕМ потому что он будет extends с BasePage
//        PageFactory.initElements(DriverManager.getDriver(), TextBoxPage.class);
//    }
    @FindBy(id= "userName")     //FindBy не работает без конструктора PageFactory.initElements
    public WebElement fullNameInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    public TextBoxPage fillUpTextBoxForm(String fullName, String  email, String currentAddress, String permanentAddress) {
        webElementActions.sendKeys(fullNameInput, fullName)
                .sendKeys(emailInput, email)
                .sendKeys(currentAddressInput, currentAddress)
                .sendKeys(permanentAddressInput, permanentAddress)
                .jsClick(submitBtn);
        return this;
    }
        @Step("Fill up textBox Form")
        public TextBoxPage fillUpTextBoxForm(TextBoxEntity textBoxEntity){  // ТУТ ИСПОЛЬЗУЕМ МЕТОД CHAINING ОДИН РАЗ ВЫЗВАЛИ ОБЪЕКТ
        webElementActions.sendKeys(fullNameInput, textBoxEntity.getFullName()) // ОБЪЕКТ КОТОРЫЙ ВЫЗВАЛИ ОДИН РАЗ
                .jsSendKeys(emailInput, textBoxEntity.getEmail())
                .jsSendKeys(currentAddressInput, textBoxEntity.getCurrentAddress())  // И ДАЛЕЕ ВЫЗЫВАЕМ ЕГО МЕТОДЫ
                .jsSendKeys(permanentAddressInput, textBoxEntity.getPermanentAddress())
                .click(submitBtn);
        return this;
    }

}
