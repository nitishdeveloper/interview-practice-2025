package DesignPatternPractice.Prototype;

public interface Shape {
    Shape clone();
    void setColor(String color);
    void drawShape();
}
