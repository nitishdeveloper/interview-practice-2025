package DesignPatternPractice.FlyWeight.characterFlyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<String, CharacterFlyWeight> characterFlyWeightMap = new HashMap<>();

    public static CharacterFlyWeight getFlyweight(String fontFamily, int fontSize, String color) {
        final String key = fontFamily + fontSize + color;
        if (!characterFlyWeightMap.containsKey(key)) {
            characterFlyWeightMap.put(key, new CharacterFlyWeight(fontFamily, color, fontSize));
        }
        return characterFlyWeightMap.get(key);
    }
}
