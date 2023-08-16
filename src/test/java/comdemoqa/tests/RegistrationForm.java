package comdemoqa.tests;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

import org.junit.jupiter.api.Test;
import pages.RegistrationPages;

public class RegistrationForm extends TestBase {
    RegistrationPages registrationPages = new RegistrationPages();


    @Test
    void fillFormTest() {
       registrationPages.openPage()
      .setFirstName("Anna")
      .setLastName("Karetina")
      .setUserEmail("Anna@mail.ru")
      .setGenterWrapper("Female")
      .setUserNumber("8925150417")
      .setBirthDate("12","April", "1992")
      .setSubjects("Chemistry")
      .setHobbiesWrapper("Sports")
      .UploadPicture("IMG_7098.JPG")
      .setCurrentAddress("Moscow")
      .selectState("NCR")
      .selectSity("Noida")
      .setSubmitButton();

      registrationPages.checkResult("Thanks for submitting the form")
              .checkResult("Anna Karetina")
              .checkResult("Anna@mail.ru")
              .checkResult("Female")
              .checkResult("8925150417")
              .checkResult("12 April,1992")
              .checkResult("Chemistry")
              .checkResult("Sports")
              .checkResult("IMG_7098.JPG")
              .checkResult("Moscow")
              .checkResult("NCR Noida");



       // $x("//td[contains(text(), 'Student Name')]/../td[2]").shouldHave(text("Anna Karetina"));
        //$x("//td[contains(text(), 'Student Email')]/../td[2]").shouldHave(text("Anna@mail.ru"));
       // $x("//td[contains(text(), 'Gender')]/../td[2]").shouldHave(text("Female"));
        //$x("//td[contains(text(), 'Mobile')]/../td[2]").shouldHave(text("8925150417"));
        //$x("//td[contains(text(), 'Date of Birth')]/../td[2]").shouldHave(text(""));
        //$x("//td[contains(text(), 'Subjects')]/../td[2]").shouldHave(text("Chemistry"));
       // $x("//td[contains(text(), 'Hobbies')]/../td[2]").shouldHave(text("Sports"));
        //$x("//td[contains(text(), 'Picture')]/../td[2]").shouldHave(text("IMG_7098.JPG"));
        //$x("//td[contains(text(), 'Address')]/../td[2]").shouldHave(text("Moscow"));
        //$x("//td[contains(text(), 'State and City')]/../td[2]").shouldHave(text("NCR Noida"));


    }
}
