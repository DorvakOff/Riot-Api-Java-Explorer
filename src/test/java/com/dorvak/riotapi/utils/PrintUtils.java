package com.dorvak.riotapi.utils;

import com.dorvak.riotapi.http.Endpoint;

public class PrintUtils {

    public static void separator() {
        System.out.println("=========================================");
    }

    public static void separator(String title) {
        System.out.println("=========================================");
        System.out.println(title);
        System.out.println("=========================================");
    }

    public static void print(Object o) {
        System.out.println(o);
    }

    public static void print(Endpoint endpoint) {
        System.out.println(endpoint.getFullUrl("{version}", "{locale}").replace("%7B", "{").replace("%7D", "}"));
    }
}
