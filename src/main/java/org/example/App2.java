package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class App2
{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.kupibilet.ru");
        driver.findElement(By.xpath("//input[@value=\"Москва\"]")).click();
        driver.findElement(By.cssSelector("css=.eqXbNo")).sendKeys("Вена");
        driver.findElement(By.xpath("//Input[@placeholder=\"Куда\"]")).click();
        driver.findElement(By.xpath("//Input[@placeholder=\"Куда\"]")).sendKeys("Грац");
        driver.findElement(By.xpath("//input[@placeholder=\"Дата вылета\"]")).click();
        driver.findElement(By.xpath("//div[@aria-label=\"Tue Jan 04 2022\"]")).click();
        driver.findElement(By.xpath("//input[@placeholder=\"Обратно\"]]")).click();
        driver.findElement(By.xpath("//div[@aria-label=\"Thu Jan 27 2022\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"styled__StyledLabel-sc-1nzdj3t-0 llmMcc\"]")).click();
        driver.findElement(By.xpath("//span[@class=\"styled__StyledCheckbox-wgrbkn-2 hUcdcR\"]")).click();
        driver.findElement(By.xpath("//button[@data-test=\"search-ticket-button\"]")).click();
        
    }

}