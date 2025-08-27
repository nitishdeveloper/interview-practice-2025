package DesignPatternPractice.Prototype;

public class CircleShape implements Shape {
    private String type;
    private String color;

    public CircleShape() {
        this.type = "Circle Shape";
    }

    @Override
    public Shape clone() {
        SquareShape cloned = new SquareShape();
        cloned.setType(this.type);
        cloned.setColor(this.color);
        return cloned;
    }

    @Override
    public void drawShape() {
        System.out.println("Type: " + this.type + " color: " + this.color);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }
}