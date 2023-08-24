package comdemoqa.tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPages;
import static utils.JavaFaker.*;

public class RegistrationForm extends TestBase {
    RegistrationPages registrationPages = new RegistrationPages();


    @Test
    void fillFormTest() {
        registrationPages.openPage()
                .deleteFooter()
                .setFirstName(firstNameValue)
                .setLastName(lastNameValue)
                .setUserEmail(emailValue)
                .setGenderWrapper(genderValue)
                .setUserNumber(phoneNumber)
                .setBirthDate(monthValue, yearValue, dayValue)
                .setSubjects(subjectsValue)
                .setHobbiesWrapper(hobbiesValue)
                .uploadPicture(fileNameValue)
                .setCurrentAddress(addressValue)
                .selectState(stateValue)
                .selectCity(cityValue)
                .setSubmitButton();

        registrationPages.checkTableHeading("Thanks for submitting the form");


        registrationPages.
                 checkTableBody(firstNameValue + " " + lastNameValue)
                .checkTableBody( emailValue)
                .checkTableBody(genderValue)
                .checkTableBody( phoneNumber)
                .checkTableBody(dayValue + " " + monthValue + "," + yearValue)
                .checkTableBody( subjectsValue)
                .checkTableBody( hobbiesValue)
                .checkTableBody(fileNameValue)
                .checkTableBody(addressValue)
                .checkTableBody( stateValue + " " + cityValue);

    }
}
