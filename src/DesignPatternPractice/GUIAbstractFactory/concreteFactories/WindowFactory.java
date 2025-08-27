package DesignPatternPractice.GUIAbstractFactory.concreteFactories;

import DesignPatternPractice.GUIAbstractFactory.abstractFactory.GUIFactory;
import DesignPatternPractice.GUIAbstractFactory.abstractProducts.Button;
import DesignPatternPractice.GUIAbstractFactory.abstractProducts.Checkbox;
import DesignPatternPractice.GUIAbstractFactory.abstractProducts.TextField;
import DesignPatternPractice.GUIAbstractFactory.concreteProducts.*;

public class WindowFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowTextField();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowCheckbox();
    }
}
