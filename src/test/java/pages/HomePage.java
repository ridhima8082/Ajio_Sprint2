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
    //img[@src="https://assets.ajio.com/medias/sys_master/root/20220427/j4s7/62684207aeb26921af44fc76/levis_pink_204331_full-rim_oversized_sunglasses.jpg"]
    //img[@src=\"https://assets.ajio.com/medias/sys_master/root/20220611/LRou/62a39aecf997dd03e27184d5/levis_pink_brand_print_crew-neck_t-shirt.jpg\"]"
    @FindBy(xpath="//img[@src=\"https://assets.ajio.com/medias/sys_master/root/20220704/75u0/62c2fdb2aeb26921af5eef35/levis_blue_710_mid-wash_super_skinny_fit_jeans.jpg\"]")
    WebElement Product_Levis;
    //div[@class="469203848001"]
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

    @FindBy(xpath="//div[@class=\"header2\"]")
    WebElement Outcome;
    public WebElement Outcome(){
        return Outcome;
    }
    @FindBy(xpath="//button[@class=\"rilrtl-button\"]")
    WebElement SearchButton;
    public WebElement SearchButton(){
        return SearchButton;
    }


}