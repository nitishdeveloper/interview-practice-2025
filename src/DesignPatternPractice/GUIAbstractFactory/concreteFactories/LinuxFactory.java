package DesignPatternPractice.GUIAbstractFactory.concreteFactories;

import DesignPatternPractice.GUIAbstractFactory.abstractFactory.GUIFactory;
import DesignPatternPractice.GUIAbstractFactory.abstractProducts.Button;
import DesignPatternPractice.GUIAbstractFactory.abstractProducts.Checkbox;
import DesignPatternPractice.GUIAbstractFactory.abstractProducts.TextField;
import DesignPatternPractice.GUIAbstractFactory.concreteProducts.LinuxButton;
import DesignPatternPractice.GUIAbstractFactory.concreteProducts.LinuxCheckbox;
import DesignPatternPractice.GUIAbstractFactory.concreteProducts.LinuxTextField;

public class LinuxFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextField createTextField() {
        return new LinuxTextField();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
