package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{

    private final By TITLE = By.cssSelector(".title");
    private final By CART_LINK = By.cssSelector(".shopping_cart_link");

    private final String ADD_TO_CART_PATTERN = "//div[text() = '%s']/ancestor::div[@class = 'inventory_item']//button";

    public ProductsPage(WebDriver driver){
        super(driver);
    }

    public String getTitle(){
        return driver.findElement(TITLE).getText();
    }

    @Step("Добавление товара с именем {product} в корзину")
    public void clickAddButton(String product){
        By addToCart = By.xpath(String.format("//div[text() = '%s']/ancestor::div[@class = 'inventory_item']//button", product));
        driver.findElement(addToCart).click();
    }

    public void clickShoppingCart(){
        driver.findElement(CART_LINK).click();
    }
}
