package comdemoqa.tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxTestPages;

import static utils.JavaFaker.*;

public class TextBoxTest extends TestBase {
    TextBoxTestPages textBoxTestPages = new TextBoxTestPages();

    @Test
    void fillFormTest() {

        textBoxTestPages.openPage()
                .deleteFooter()
                .setUserName(firstNameValue)
                .setUserEmail(emailValue)
                .setCurrentAddress(addressValue)
                .setPermanentAddress(addressValue)
                .setSubmitButton();

        textBoxTestPages.checkResult(firstNameValue);
    }
}
