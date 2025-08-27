package DesignPatternPractice.FlyWeight.treeGame;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFlyWeight {
    private static final Map<String, TreeType> stringTreeTypeMap = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        final String key = name + color + texture;
        return stringTreeTypeMap.computeIfAbsent(key, k -> new TreeType(name, color, texture));
    }

}
