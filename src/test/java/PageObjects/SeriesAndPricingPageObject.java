package PageObjects;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeriesAndPricingPageObject extends PageObject {

    public void navigateTo() { }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void pricingButton(){
        browser.findElement(By.xpath("//*[@id=\"beNav\"]/div[3]/ul/li[3]/a")).click();
        String Subscriptions = browser.findElement(By.xpath("//*[@id=\"LoginTests-eq\"]/div[2]")).getText();
        System.out.println(Subscriptions);
    }

    public void seriesButton(){
        browser.findElement(By.xpath("//*[@id=\"beNav\"]/div[3]/ul/li[2]/a")).click();
        browser.findElement(By.xpath("//*[@id=\"new-all\"]/div/div[2]")).click();
    }

    public void seriesDetailButton() throws InterruptedException {
        Actions action = new Actions(browser);
        WebElement element = browser.findElement(By.xpath("//*[@id=\"season_1\"]/div[1]/div/div[1]"));
        action.moveToElement(element).click(element).build().perform();
        Thread.sleep(3000);
    }
}
