package DesignPatternPractice.GUIAbstractFactory.concreteProducts;

import DesignPatternPractice.GUIAbstractFactory.abstractProducts.Checkbox;

public class LinuxCheckbox implements Checkbox {
    private boolean checked;

    @Override
    public void isChecked() {
        checked = !checked;
        System.out.println("Linux checkbox isChecked :: "+checked);
    }

    @Override
    public void toggle() {
        System.out.println("Linux checkbox toggle");
    }
}
