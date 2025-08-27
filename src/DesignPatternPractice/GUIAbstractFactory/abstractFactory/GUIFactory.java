package DesignPatternPractice.GUIAbstractFactory.abstractFactory;

import DesignPatternPractice.GUIAbstractFactory.abstractProducts.Button;
import DesignPatternPractice.GUIAbstractFactory.abstractProducts.Checkbox;
import DesignPatternPractice.GUIAbstractFactory.abstractProducts.TextField;

public interface GUIFactory {
    Button createButton();
    TextField createTextField();
    Checkbox createCheckbox();
}
