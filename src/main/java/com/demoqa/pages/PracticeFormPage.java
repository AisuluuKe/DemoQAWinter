package com.demoqa.pages;


import com.demoqa.drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class PracticeFormPage extends BasePage{

    @FindBy(className = "react-datepicker__input-container")
    public WebElement datePickerBtn;

    public PracticeFormPage selectDateMonthYear(String dateMonthYear) {

        String[] dateMonthYearParts = dateMonthYear.split(" "); //разделения текста
        String date = dateMonthYearParts[0];
        String month = dateMonthYearParts[1];
        String year = dateMonthYearParts[2];

        webElementActions.click(datePickerBtn);

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        WebElement monthDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__month-select")));

        WebElement yearDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__year-select")));

        dropdownHelper.selectByVisibleText(monthDropDown, month)
                .selectByVisibleText(yearDropDown, year);
////div[contains(@class,'react-datepicker_day') and not (contains(@class,'react-datepicker_day--outside-month')) and text()='5']
        WebElement day = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(
                        "//div[contains(@class,'react-datepicker_day') and not (contains(@class,'react-datepicker_day--outside-month')) and text()='" + date + "']"
                )));
        webElementActions.click(day);

        return this;
    }
}











