package comdemoqa;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class RegistrationForm {  @BeforeAll
static void BeforeAll() {
    Configuration.baseUrl = "https://demoqa.com";
    Configuration.browserSize = "1920x1080";
    Configuration.pageLoadStrategy = "eager";
}
    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Anna");
        $("#lastName").setValue("Karetina");
        $("#userEmail").setValue("Anna@mail.ru");
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue("8925150417");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").$(byText("April")).click();
        $(".react-datepicker__year-select").$(byText("1992")).click();
        $(".react-datepicker__day--012").click();
        $("#subjectsInput").setValue("Chemistry").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("IMG_7098.JPG");
        $("#currentAddress").setValue("Moscow");
        $("#stateCity-wrapper #state").click();
        $("#state").$(byText("NCR")).click();
        $("#stateCity-wrapper #city").click();
        $("#city").$(byText("Noida")).click();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));

      // $("#example-modal-sizes-title-lg #table-responsive").$(byText("studentName")).shouldHave(text("Anna Karetina"));
      // $(".table-responsive").$(byText("studentName")).shouldHave(text("Anna Karetina"));
        $x("//td[contains(text(), 'Student Name')]/../td[2]").shouldHave(text("Anna Karetina"));
        $x("//td[contains(text(), 'Student Email')]/../td[2]").shouldHave(text("Anna@mail.ru"));
        $x("//td[contains(text(), 'Gender')]/../td[2]").shouldHave(text("Female"));
        $x("//td[contains(text(), 'Mobile')]/../td[2]").shouldHave(text("8925150417"));
        $x("//td[contains(text(), 'Date of Birth')]/../td[2]").shouldHave(text("12 April,1992"));
        $x("//td[contains(text(), 'Subjects')]/../td[2]").shouldHave(text("Chemistry"));
        $x("//td[contains(text(), 'Hobbies')]/../td[2]").shouldHave(text("Sports"));
       // $x("//td[contains(text(), 'Picture')]/../td[2]").shouldHave(text("Sports"));
        $x("//td[contains(text(), 'Address')]/../td[2]").shouldHave(text("Moscow"));
        $x("//td[contains(text(), 'State and City')]/../td[2]").shouldHave(text("NCR Noida"));


    }
}
