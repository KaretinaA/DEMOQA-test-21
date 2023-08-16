package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTestPages {
    FooterComponent footerComponent = new FooterComponent();
    SelenideElement
            userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submitButton = $("#submit"),
            checkResult = $("#output");


    public TextBoxTestPages openPage() {
        open("/text-box");
        return this;
    }
    public TextBoxTestPages deleteFooter() {
        footerComponent.deleteFooter();
        return this;
    }

    public TextBoxTestPages setUserName(String value) {
        userNameInput.setValue(value);
        return this;
    }

    public TextBoxTestPages setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public TextBoxTestPages setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public TextBoxTestPages setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);
        return this;
    }

    public TextBoxTestPages setSubmitButton() {
        submitButton.click();
        return this;
    }

    public TextBoxTestPages checkResult(String value) {
        checkResult.shouldHave(text(value));
        return this;
    }
}