package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Main {

  public static void main(String[] args) {
    PropertyCap property = new PropertyCap();
    property.Inc();
    // Вызов метода Inc - инициализация хрома с настрйоками
    property.Driver();
    // Вызов метода Driver - автотест



    /*WebElement input = driver.findElement(new By.ByXPath("//input[@id='search']"));
    input.click();
    input.sendKeys("Бумага");
    WebElement search = driver.findElement(new By.ByXPath("//button[contains(@class,'js-search-button')]"));
    search.click();
    WebElement paper = driver.findElement(new By.ByXPath("//img[@class='categories__img'][1]"));
    paper.click();
    WebElement Filter = driver.findElement(new By.ByXPath("//span[text()='А4']"));
    String FilterPar = Filter.getAttribute("textContent");
    System.out.println(FilterPar);
    // driver.quit();*/
  }
}
