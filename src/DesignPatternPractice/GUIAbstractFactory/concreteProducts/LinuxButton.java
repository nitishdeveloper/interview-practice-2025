package DesignPatternPractice.GUIAbstractFactory.concreteProducts;

import DesignPatternPractice.GUIAbstractFactory.abstractProducts.Button;

public class LinuxButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Linux button clicked");
    }

    @Override
    public void onRender() {
        System.out.println("Linux button render");
    }
}
