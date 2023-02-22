package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import utils.BrowserManager;

public class HomePage {
    private WebDriver driver;
    public HomePage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//a[@title=\"MEN\"]")
    WebElement MenCat;
    public WebElement MenCat(){
        return MenCat;
    }

    @FindBy(xpath="//a[@title=\"WOMEN\"]")
    WebElement WomenCat;
    public WebElement WomenCat(){
        return WomenCat;
    }

    @FindBy(xpath ="//a[@href=\"/s/30-to-50-percent-off-4957-62151\"]")
    WebElement B_Superdry;
    public WebElement B_Superdry(){
        return B_Superdry;
    }
    @FindBy(xpath="//a[@href=\"/superdry-sports-recharge-body-spray-200ml/p/410270322_orange\"]")
    WebElement Product_Superdry;
    public WebElement Product_Superdry(){
        return Product_Superdry;
    }

    @FindBy(xpath="//a[@href=\"/s/whp-30-to-60-percent-off-4957-48681\"]")
    WebElement B_Levis;
    public WebElement B_Levis(){
        return B_Levis;
    }

    @FindBy(xpath="//a[@href=\"/levis-203140-uv-protected-full-rim-oval-sunglasses/p/460884997_black\"]")
    WebElement Product_Levis;
    public WebElement Product_Levis(){
        return Product_Levis;
    }

    @FindBy(xpath="//a[@title=\"KIDS\"]")
    WebElement Kids;
    public WebElement Kids(){
        return Kids;
    }

    @FindBy(xpath="//input[@name=\"searchVal\"]")
    WebElement searchbox;
    public WebElement searchbox(){
        return searchbox;
    }
    //div[@class="length"]
    @FindBy(xpath="//div[@class=\"length\"]")
    WebElement FoundElements;
    public WebElement FoundElements(){
        return FoundElements;
    }


}