package utils;

import com.github.javafaker.Faker;

import java.util.Locale;

import static utils.GetRandom.*;

public class JavaFaker {
    static Faker fakerEn = new Faker(new Locale("en"));

    public static String firstNameValue = getRandomFirstName(),
            lastNameValue = getRandomLastName(),
            emailValue = getRandomEmail(),
            genderValue = getRandomGender(),
            phoneNumber = getRandomPhoneNumber(),
            monthValue = getRandomMonth(),
            yearValue = getRandomYear(),
            dayValue = getRandomDay(),
            subjectsValue = getRandomSubjects(),
            hobbiesValue = getRandomHobbies(),
            fileNameValue = "IMG_7098.jpg",
            addressValue = getRandomAddress(),
            stateValue = getRandomState(),
            cityValue = getRandomCity(stateValue);
}

