package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

public class FirstTest {
    @BeforeAll
    static void  BeforeAll() {
        System.out.println("        BeforeAll");
        Configuration.browser = "chrome";
            }
    @AfterAll
    static void  AfterAll() {
        System.out.println("        AfterAll");
    }
    @BeforeEach
  void  BeforeEach() {
        //   open("https://google.com");
        System.out.println("    BeforeEach");
    }
    @AfterEach
    void  AfterEach() {
        //   open("https://google.com");
        System.out.println("    AfterEach");
    }
    @Test
    void firsTest() {

        System.out.println("        firsTest");
        Assertions.assertTrue(3 > 2);

    }
    @Test
    void secondTest() {
        System.out.println("        secondTest");
        Assertions.assertTrue(3 > 2);
    }
    @Test
    void thirdTest() {
        System.out.println("        thirdTest");
        Assertions.assertTrue(3 > 2);

    }
}
