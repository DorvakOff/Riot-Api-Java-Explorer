package com.dorvak.raje.utils;

import java.util.List;
import java.util.Map;

public class AssertUtils {

    public static void assertNotEmpty(List<?> list) {
        if (list == null || list.isEmpty()) {
            throw new AssertionError("List is empty");
        }
    }

    public static void assertNotEmpty(Object[] array) {
        if (array == null || array.length == 0) {
            throw new AssertionError("Array is empty");
        }
    }

    public static void assertNotEmpty(Map<?, ?> map) {
        if (map == null || map.isEmpty()) {
            throw new AssertionError("Map is empty");
        }
    }
}
