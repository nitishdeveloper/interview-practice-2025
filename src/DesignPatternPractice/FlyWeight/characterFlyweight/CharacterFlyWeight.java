package DesignPatternPractice.FlyWeight.characterFlyweight;

public class CharacterFlyWeight implements TextCharacter {
    private final String fontFamily;
    private final String fontColor;
    private final int fontSize;

    public CharacterFlyWeight(String fontFamily, String fontColor, int fontSize) {
        this.fontFamily = fontFamily;
        this.fontColor = fontColor;
        this.fontSize = fontSize;
    }

    @Override
    public void display(int position) {
        System.out.printf(
                "Char at %d: [Font: %s, Size: %d, Color: %s]%n",
                position, fontFamily, fontSize, fontColor
        );
    }
}
