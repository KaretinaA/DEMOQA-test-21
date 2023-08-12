package comdemoqa.tests;

//import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TextBoxTest {
    @BeforeAll
    static void BeforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Anna");
        $("#userEmail").setValue("Anna@mail.ru");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Syberia");
        $("#submit").click();
       $("#output").$("#name").shouldHave(text("Anna"));





    }
}
