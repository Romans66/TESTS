package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PropertyCap {
  private  ChromeDriver driver;

  PropertyCap() {};

  PropertyCap(ChromeDriver driver) {
    this.driver = driver;
  }

  void Inc() {
    // TODO Auto-generated method stub
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    options.addArguments("start-maximized");
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    options.merge(capabilities);
    driver = new ChromeDriver(options);
  }
  public void Driver(){
    driver.get("https://www.komus.ru");
    WebElement input = driver.findElement(new By.ByXPath("//input[@id='search']"));
    input.click();
    input.sendKeys("Бумага");
    WebElement search = driver.findElement(new By.ByXPath("//button[contains(@class,'js-search-button')]"));
    search.click();
    WebElement paper = driver.findElement(new By.ByXPath("//img[@class='categories__img'][1]"));
    paper.click();
    WebElement Filter = driver.findElement(new By.ByXPath("//span[text()='А4']"));
    String FilterPar = Filter.getAttribute("textContent");
    System.out.println(FilterPar);
    // driver.quit();
}}
