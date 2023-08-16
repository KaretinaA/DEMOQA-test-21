package comdemoqa.tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxTestPages;

public class TextBoxTest extends TestBase {
        TextBoxTestPages textBoxTestPages = new TextBoxTestPages();

        @Test
        void fillFormTest() {

            textBoxTestPages.openPage()
                    .deleteFooter()
                    .setUserName("Anna")
                    .setUserEmail("Anna@mail.ru")
                    .setCurrentAddress("Moscow")
                    .setPermanentAddress("Syberia")
                    .setSubmitButton();

            textBoxTestPages.checkResult("Anna");
            // $("#output").$("#name").shouldHave(text("Anna"));


        }
    }
