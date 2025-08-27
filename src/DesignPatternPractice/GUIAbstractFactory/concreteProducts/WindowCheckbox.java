package DesignPatternPractice.GUIAbstractFactory.concreteProducts;

import DesignPatternPractice.GUIAbstractFactory.abstractProducts.Checkbox;

public class WindowCheckbox implements Checkbox {
    private boolean checked;

    @Override
    public void isChecked() {
        checked = !checked;
        System.out.println("Window checkbox isChecked :: "+checked);
    }

    @Override
    public void toggle() {
        System.out.println("Window checkbox toggle");
    }
}
