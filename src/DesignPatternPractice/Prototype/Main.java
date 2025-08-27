package DesignPatternPractice.Prototype;

public class Main {
    public static void main(String[] args) {
        Shape squareShape = new SquareShape();
        squareShape.setColor("RED");
        Shape circleShape = new CircleShape();
        circleShape.setColor("BLUE");

        Shape squareShapeCloned = squareShape.clone();
        squareShapeCloned.drawShape();
        Shape circleShapeShapeCloned = circleShape.clone();
        circleShapeShapeCloned.drawShape();
    }
}
