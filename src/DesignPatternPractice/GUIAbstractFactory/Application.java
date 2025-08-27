package DesignPatternPractice.GUIAbstractFactory;

import DesignPatternPractice.GUIAbstractFactory.abstractFactory.GUIFactory;
import DesignPatternPractice.GUIAbstractFactory.abstractProducts.Button;
import DesignPatternPractice.GUIAbstractFactory.abstractProducts.Checkbox;
import DesignPatternPractice.GUIAbstractFactory.abstractProducts.TextField;

public class Application {
    GUIFactory guiFactory;
    Button button;
    Checkbox checkbox;
    TextField textField;

    public Application(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }

    public void createUI(){
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
        textField = guiFactory.createTextField();
    }

    public void renderUI(String renderType){
        button.onRender();
        checkbox.toggle();
        textField.setTextField(renderType);
    }

    public void simulateUserInteraction(){
        button.onClick();
        checkbox.isChecked();
        System.out.println("Text field content :: "+textField.getTextField());
    }
}
