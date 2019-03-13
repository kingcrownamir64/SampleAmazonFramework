import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {


    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(className = "nav-input")
    private WebElement searchButton;

    @FindBy(id = "nav-cart")
    private WebElement cartButton;


    @FindBy(id="nav-your-amazon")
    private WebElement YourAmazonButton;

    @FindBy(id="icp-touch-link-language")
    private WebElement LanguageBar;



    public void searchBoxHome(String text) {
        this.searchBox.sendKeys(text);
    }

    public void SearchButtonHome() {
        this.searchBox.click();
    }

    public void setCartButton() {
        this.cartButton.click();
    }

    public void setYourAmazonButton() {
       this.YourAmazonButton.click();
    }

    public void setLanguageBar() {
        this.LanguageBar.click();
    }

}