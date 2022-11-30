package ru.learnqa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainClassTest {

    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber() {
        int getNumber = this.mainClass.getLocalNumber();
        int expectedNumber = 14;

        assertEquals(getNumber, expectedNumber, "Полученное число " + getNumber + " не равно " + expectedNumber);
    }

    @Test
    public void testGetClassNumber() {
        int boundaryVal = 45;
        int classNumber = this.mainClass.getClassNumber();

        assertTrue(classNumber > boundaryVal, "Число " + classNumber + " меньше числа " + boundaryVal);
    }
}
