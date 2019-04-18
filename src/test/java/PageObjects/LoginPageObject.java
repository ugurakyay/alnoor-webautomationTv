package PageObjects;

import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LoginPageObject extends PageObject {
    @Override
    public void navigateTo() { browser.get(ConfigReader.getInstance().getHost());
    }

    @Override
    public boolean isPresent() {
        return false;
    }
    public void login(String userName, String password) throws InterruptedException {

        if (browser.findElement(By.cssSelector("body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div > button")).isDisplayed()){
            browser.findElement(By.cssSelector("body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div > button")).click();

        }

        else {

        }
            browser.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/div/ul/li[1]/a")).click();
            browser.findElement(By.xpath("//*[@id=\"beNav\"]/div[3]/ul/li[4]/a")).click();
            browser.findElement(By.xpath("//*[@id=\"LoginTests-eq\"]/div[3]/div/form/div[2]/input")).sendKeys(userName);
            WebElement tabUserName = browser.findElement(By.xpath("//*[@id=\"LoginTests-eq\"]/div[3]/div/form/div[2]/input"));
            tabUserName.sendKeys(Keys.TAB);
            browser.findElement(By.id("password")).sendKeys(password);
            WebElement tabPassword = browser.findElement(By.id("password"));
            tabPassword.sendKeys(Keys.TAB);
            Thread.sleep(5000);
            browser.findElement(By.xpath("//*[@id=\"LoginTests-eq\"]/div[3]/div/form/button")).click();
    }

    public void logout(){
        browser.findElement(By.xpath("//*[@id=\"beNav\"]/div[3]/ul/li[4]/a")).click();
        browser.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/aside/div/div/div/div[2]/ul/li[4]/a")).click();
    }
}
