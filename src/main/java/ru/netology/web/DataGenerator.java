package ru.netology.web;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class DataGenerator {
    private static Faker faker = new Faker(new Locale("ru"));
    private static final List<String> cities = Arrays.asList(
            "Москва", "Санкт-Петербург", "Новосибирск", "Екатеринбург", "Нижний Новгород"
    );

    public static String generateCity() {
        return cities.get(faker.random().nextInt(cities.size()));
    }

    public static String generateName() {
        return faker.name().fullName();
    }

    public static String generatePhone() {
        return faker.phoneNumber().phoneNumber();
    }
}