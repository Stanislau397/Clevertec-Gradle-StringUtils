package ru.clevertec.util;

public class StringUtils {

    public boolean isPositiveNumber(String number) {
        return org.apache.commons.lang3.StringUtils.isNumeric(number);
    }
}
