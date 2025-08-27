package DesignPatternPractice.FlyWeight.treeGame;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType treeType = TreeTypeFlyWeight.getTreeType(name, color, texture);
        trees.add(new Tree(x, y, treeType));
    }

    public void draw() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }

    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(1, 2, "Oak", "Green", "Rough");
        forest.plantTree(3, 4, "Oak", "Green", "Rough");
        forest.plantTree(5, 6, "Pine", "Dark Green", "Smooth");
        forest.draw();
    }
}
