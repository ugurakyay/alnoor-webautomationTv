package PageObjects;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlayerPageObject extends PageObject {

    public void navigateTo() {

    }

    public boolean isPresent() {
        return false;
    }

    public void PlayerInteract() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(browser, 20);
        WebElement playerIframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#playerArea > iframe")));
        browser.switchTo().frame(playerIframe);
        browser.findElement(By.cssSelector("#player > div.vp-controls-wrapper > div.vp-controls > button > div.play-icon")).click();
        Thread.sleep(3000);
        WebElement elem = browser.findElement(By.cssSelector("#player > div.vp-controls-wrapper > div.vp-controls.invisible.hidden > div.play-bar.rounded-box > div.vp-progress > div.thumb-preview.invisible.hidden"));

        int width = elem.getSize().getWidth();

        Actions act = new Actions(browser);
        act.moveToElement(elem).moveByOffset((width/2)-2, 0).click().perform();
    }
}
