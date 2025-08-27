package DesignPatternPractice.GUIAbstractFactory.concreteProducts;

import DesignPatternPractice.GUIAbstractFactory.abstractProducts.TextField;

public class WindowTextField implements TextField {
    private String textField;

    @Override
    public void setTextField(String textField) {
        this.textField = textField;
        System.out.println("Window Text Field set: "+textField);
    }

    @Override
    public String getTextField() {
        return textField;
    }
}
