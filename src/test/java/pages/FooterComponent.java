package pages;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class FooterComponent {


    public void deleteFooter() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
    }
}
