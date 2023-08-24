package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPages {
    CalendarComponent calendar = new CalendarComponent();
    FooterComponent footerComponent = new FooterComponent();

    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapperInput = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            birthDateInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesWrapperInput = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            stateInputSelector = $("#state"),
            cityInputSelector = $("#city"),
            submitButton = $("#submit"),
            tableHeading = $("#example-modal-sizes-title-lg"),
            tableBody = $(".table-responsive");


    public RegistrationPages openPage() {
        open("/automation-practice-form");

        return this;
    }

    public RegistrationPages deleteFooter() {
        footerComponent.deleteFooter();
        return this;
    }

    public RegistrationPages setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPages setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPages setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationPages setGenderWrapper(String value) {
        genderWrapperInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPages setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public RegistrationPages setBirthDate(String day, String month, String year) {
        birthDateInput.click();
        calendar.setDate(day, month, year);
        return this;
    }

    public RegistrationPages setSubjects(String value) {
        subjectsInput.setValue(value);
        subjectsInput.pressEnter();
        return this;
    }

    public RegistrationPages setHobbiesWrapper(String value) {
        hobbiesWrapperInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPages uploadPicture(String value) {
        uploadPicture.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPages setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public RegistrationPages selectState(String value) {
        stateInputSelector.click();
        stateInputSelector.$(byText(value)).click();
        return this;
    }

    public RegistrationPages selectCity(String value) {
        cityInputSelector.click();
        cityInputSelector.$(byText(value)).click();
        return this;

    }

    public RegistrationPages setSubmitButton() {
        submitButton.click();
        return this;
    }

    public RegistrationPages checkTableBody(String value) {
        tableBody.shouldHave(text(value));
        return this;
    }
}