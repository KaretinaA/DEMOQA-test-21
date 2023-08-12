package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPages {
    CalendarComponent calendar = new CalendarComponent();
    StateCityComponents stateCity = new StateCityComponents();

     SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lasstName"),
             userEmailInput = $("#userEmail"),
             genterWrapperInput = $("#genterWrapper"),
             userNumberInput = $("#userNumber"),
             birthDateInput = $("#dateOfBirthInput"),
             subjectsInput = $("#subjectsInput"),
             hobbiesWrapperInput = $("#hobbiesWrapper"),
             uploadPictureInput = $("#uploadPicture"),
             currentAddressInput = $("#currentAddress"),
             state = $("#state"),
             sity = $("#sity"),
             submitButton = $("#submit");


    public RegistrationPages openPage(){
        open("/automation-practice-form");

        return this;
    }
    public RegistrationPages deletedFooter() {
        footerComponent.deletedFooter();
        return this;
    }
    public RegistrationPages setFirstName(String value) {
        SelenideElement selenideElement = firstNameInput.setValue(value);
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
    public RegistrationPages setGenterWrapper(String value) {
        genterWrapperInput.$(byText(value)).click();
        return this;
    }
    public RegistrationPages setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }
    public RegistrationPages setBirthDate(String day, String month, String year) {
        birthDateInput.click();
        calendar.setDate (day, month, year);
        return this;
    }

    public RegistrationPages setSubjects(String value) {
        subjectsInput.setValue(value);
        return this;
    }
    public RegistrationPages setHobbiesWrapper(String value) {
        hobbiesWrapperInput.setValue(value);
        return this;
    }
    public RegistrationPages setUploadPicture(String value) {
        uploadPicture.uploadFromClasspath(value);
        return this;
    }
    public RegistrationPages setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }
    public RegistrationPages selectState(String value) {
        state.$(byText(value)).click();
        return this;
    }
    public RegistrationPages selectSity(String value) {
        sity.$(byText(value)).click();
        return this;
    }

    public RegistrationPages setSubmitButton() {
        submitButton.click();
        return this;
    }

    public RegistrationPages checkResult(String value) {
        $("#example-modal-sizes-title-lg").shouldHave(text(value));
        return this;
    }
    public RegistrationPages checkResult(String value) {
        checkResult.shouldHave(text(value));
        return this;
    }
    }