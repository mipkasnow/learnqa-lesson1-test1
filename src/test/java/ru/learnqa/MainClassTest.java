package ru.learnqa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testGetClassString(){
        String classString = this.mainClass.getClassString();
        String hello = "Hello";

        boolean containsNormalCase = classString.contains(hello);
        boolean containsLowerCase = classString.contains(hello.toLowerCase());

        if (containsNormalCase){
            assertTrue(containsNormalCase);
        }
        else if(containsLowerCase){
            assertTrue(containsLowerCase);
        }
        else {
            fail("Строка \"" + classString + "\" не содержит в себе подстроку \"" + hello + "\"");
        }
    }
}
