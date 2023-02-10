package ru.clevertec.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private final StringUtils stringUtils;

    public StringUtilsTest() {
        stringUtils = new StringUtils();
    }

    @Test
    void isPositiveNumberTrue() {
        //given
        String number = "1";
        //when
        boolean condition = stringUtils.isPositiveNumber(number);
        //then
        assertTrue(condition);
    }

    @Test
    void isPositiveNumberFalse() {
        //given
        String number = "-1";
        //when
        boolean condition = stringUtils.isPositiveNumber(number);
        //then
        assertFalse(condition);
    }
}