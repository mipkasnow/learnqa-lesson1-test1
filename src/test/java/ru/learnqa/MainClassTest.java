package ru.learnqa;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

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

    @Test
    public void testGetClassString2(){
        String classString = this.mainClass.getClassString();
        String hello1 = "Hello";
        String hello2 = "hello";
        boolean isContains = classString.contains(hello1) || classString.contains(hello2);

        assertTrue(isContains, "Строка \"" + classString + "\" не содержит в себе подстроку \"" + hello1 + "\" или \"" + hello2  + "\"");
    }

    @Test
    public void testGetClassString3(){
        String classString = this.mainClass.getClassString();
        boolean isPattern = Pattern.compile("[Hh]ello, world").matcher(classString).matches();
        // это используем, если нам важно проверить, что есть подстрока Hello или hello, и сама фраза Hello, World

        boolean isPattern2 = Pattern.compile("[\\s\\S]*[Hh]ello[\\s\\S]*").matcher(classString).matches();
        // это используем, если нам важно проверить, что есть подстрока Hello или hello, а остальные символы не важны

        assertTrue(isPattern2, "Строка \"" + classString + "\" не содержит в себе подстроку \"Hello\" или \"hello\"");
    }
}
