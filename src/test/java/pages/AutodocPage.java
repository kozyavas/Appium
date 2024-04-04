package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class AutodocPage {
    public AutodocPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(id = "de.autodoc.gmbh:id/ibClose")
    public WebElement checkinCloseX;

    @FindBy(id = "de.autodoc.gmbh:id/sSeason")
    public WebElement season;

    @FindBy(id = "de.autodoc.gmbh:id/sWidth")
    public WebElement width;

    @FindBy(id = "de.autodoc.gmbh:id/sHeight")
    public WebElement height;

    @FindBy(id = "de.autodoc.gmbh:id/sDiameter")
    public WebElement diameter;

    @FindBy(id = "de.autodoc.gmbh:id/btnSearchTyres")
    public WebElement searchTyres;

    @FindBy(id = "de.autodoc.gmbh:id/ivIcon")
    public WebElement filterButton;

    @FindBy(xpath = "(//*[@resource-id=\"de.autodoc.gmbh:id/ivBrandIcon\"])[2]")
    public WebElement firstBrandButton;

    @FindBy(xpath = "(//*[@resource-id=\"de.autodoc.gmbh:id/swipeContent\"])[1]")
    public WebElement tyreListFirstItem;

    @FindBy(id = "de.autodoc.gmbh:id/tbAddToCart")
    public WebElement addButton;

    @FindBy(xpath = "//*[@text='Added to basket']")
    public WebElement addedToBasketText;

    @FindBy(xpath = "(//*[@class='android.widget.CheckedTextView'])[2]")
    public WebElement carMakeText;

    @FindBy(xpath = "(//*[@class='android.widget.CheckedTextView'])[3]")
    public WebElement modelText;

    @FindBy(xpath = "(//*[@class='android.widget.CheckedTextView'])[4]")
    public WebElement modificationText;









}
