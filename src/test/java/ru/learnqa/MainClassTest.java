package ru.learnqa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainClassTest {

    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber() {
        int getNumber = this.mainClass.getLocalNumber();
        int expectedNumber = 14;

        assertEquals(getNumber, expectedNumber, "Полученное число " + getNumber + " не равно " + expectedNumber);
    }
}
