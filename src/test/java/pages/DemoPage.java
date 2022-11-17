package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoPage {
    public DemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//*[@class='btn btn-light '])[11]")
    public WebElement alertWE;


    @FindBy (xpath = "//*[@id=\"timerAlertButton\"]")
    public WebElement clickMe;

    @FindBy (xpath = "//*[@id=\"enableAfter\"]")
    public WebElement enable;

    @FindBy (xpath = "//*[@id=\"visibleAfter\"]")
    public WebElement visible;


}