package DesignPatternPractice.FlyWeight.characterFlyweight;

public class TextEditor {
    public static void main(String[] args) {
        CharacterFlyWeight arialRed = CharacterFactory.getFlyweight("Arial", 12, "Red");
        CharacterFlyWeight timesBlue = CharacterFactory.getFlyweight("Times New Roman", 14, "Blue");
        CharacterFlyWeight arialRedAgain = CharacterFactory.getFlyweight("Arial", 12, "Red");

        arialRed.display(1);
        timesBlue.display(2);
        arialRedAgain.display(3);
    }
}
