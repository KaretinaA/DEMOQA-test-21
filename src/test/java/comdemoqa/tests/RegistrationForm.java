package comdemoqa.tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPages;

public class RegistrationForm extends TestBase {
    RegistrationPages registrationPages = new RegistrationPages();


    @Test
    void fillFormTest() {
        registrationPages.openPage()
                .deleteFooter()
                .setFirstName("Anna")
                .setLastName("Karetina")
                .setUserEmail("Anna@mail.ru")
                .setGenderWrapper("Female")
                .setUserNumber("8925150417")
                .setBirthDate("12", "April", "1992")
                .setSubjects("Chemistry")
                .setHobbiesWrapper("Sports")
                .uploadPicture("IMG_7098.JPG")
                .setCurrentAddress("Moscow")
                .selectState("NCR")
                .selectCity("Gurgaon")
                .setSubmitButton();

        registrationPages.checkTableHeading("Thanks for submitting the form")
                .checkTableBody("Anna Karetina")
                .checkTableBody("Anna@mail.ru")
                .checkTableBody("Female")
                .checkTableBody("8925150417")
                .checkTableBody("12 April,1992")
                .checkTableBody("Chemistry")
                .checkTableBody("Sports")
                .checkTableBody("IMG_7098.JPG")
                .checkTableBody("Moscow")
                .checkTableBody("NCR Gurgaon");


    }
}
