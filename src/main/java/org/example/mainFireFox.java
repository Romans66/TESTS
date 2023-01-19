package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class mainFireFox {
  public static void FF(String[] args) {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    driver.get("https://www.komus.ru/");
    WebElement input = driver.findElement(new By.ByXPath("//input[@id='search']"));
    input.click();
    input.sendKeys("Бумага");

}}
