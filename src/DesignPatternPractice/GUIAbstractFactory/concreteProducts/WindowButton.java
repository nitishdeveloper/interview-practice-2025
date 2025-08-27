package DesignPatternPractice.GUIAbstractFactory.concreteProducts;

import DesignPatternPractice.GUIAbstractFactory.abstractProducts.Button;

public class WindowButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Window button clicked");
    }

    @Override
    public void onRender() {
        System.out.println("Window button render");
    }
}
