package com.GreenJon902.TrashMC.Logger;

import java.util.Map;
import java.util.stream.Collectors;

public class Levels {
    public final static int DEBUG = 10;
    public final static int INFO = 20;
    public final static int WARNING = 30;
    public final static int ERROR = 50;
    public final static int CRITICAL = 100;

    private static final Map<String, Integer> stringsOfLevelNamesToLevelNo = Map.of(
            "debug", DEBUG,
            "info", INFO,
            "warning", WARNING,
            "error", ERROR,
            "critical", CRITICAL
    );

    private static final Map<Integer, String> levelNoToStringsOfLevelNames = stringsOfLevelNamesToLevelNo.entrySet()
            .stream()
            .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));


    public static String name(int levelNo) {
        return levelNoToStringsOfLevelNames.get(levelNo);
    }

    public static int number(String levelName) {
        return stringsOfLevelNamesToLevelNo.get(levelName.toLowerCase());
    }
}
