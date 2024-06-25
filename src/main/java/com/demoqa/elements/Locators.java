package com.demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Locators {
    @Test(description = "Find By ID")
        void findByIDTest(){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/text-box"); //("https://demoqa.com/text-box") поменяли на links

//        WebElement fullNameInput = driver.findElement(By.tagName("input"));
//        fullNameInput.sendKeys("Aisuluu");
//
//        String textBoxText = driver.findElement(By.tagName("h1")).getText();
//        System.out.println(textBoxText);

//        WebElement homeLink = driver.findElement(By.partialLinkText("Bad"));
//        homeLink.click(); // когда ищем link то в 19 строчку меняем на https://demoqa.com/links

        WebElement homeLink = driver.findElement(By.xpath("(//textarea[@class='form-control'])[1]"));
        homeLink.sendKeys("Wall Street 123");

        String permanentAddressTxt = driver.findElement(By.xpath("//label[text()='Permanent Address']")).getText();
        System.out.println(permanentAddressTxt);  // вывел текст на консоль через getText


    }
    }

