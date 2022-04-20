package Suzi;
import org.openqa.selenium.*;
public class locators {

    $(By.xpath("//*[contains(text(),'Войти')]")).click();
    $("#login").setValue("14720094743");
    $("#password").setValue("1111ewQ!");
}
