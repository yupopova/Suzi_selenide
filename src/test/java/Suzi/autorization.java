package Suzi;
import static Suzi.accounts.*;

import com.codeborne.selenide.*;
import com.codeborne.selenide.ex.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import org.junit.Test;
import org.junit.jupiter.api.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import java.io.*;

public class autorization {

    @AfterAll
    public static void end() throws IOException {
        String command = "powershell.exe  taskkill /im chromedriver.exe /f";
        Process  powerShellProcess = Runtime.getRuntime().exec(command);
        powerShellProcess.getOutputStream().close(); }

    @Test
    public void test1 () throws InterruptedException {
        Configuration.holdBrowserOpen=true;
        open(url_dev);
        $(By.xpath("//*[contains(text(),'Войти')]")).click();
        $("#login").setValue("14720094743");
        $("#password").setValue("1111ewQ!");

        $(By.xpath("//*[contains(text(),'Войти')]")).click();

        try {
            assertTrue("Test passed!", $(By.xpath("//*[@class='title-h2 ml-lg-32 ml-sm-16 ml-md-16']")).should(exist).isDisplayed());
        }
        catch  (ElementNotFound e) {
            assertTrue("Test failed!", false);
        }

        // $(By.xpath("//*[@class='title-h2 ml-lg-32 ml-sm-16 ml-md-16']")).shouldHave(text("Поступление в среднее специальное учебное заведение"));

        // Thread.sleep(2000);
        // $(By.xpath(".//*[@class=\"menu-user-name\"]")).click();
        // Thread.sleep(1000);
        // $(By.xpath(".//*[contains(text(), \"Выйти\")]")).click();

    }
}



