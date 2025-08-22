package org.lld;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Scroll createScroll() {
        return null;
    }
}

class MacButton implements Button {

    @Override
    public void click() {
        System.out.println("Clicking mac button");
    }
}

class MacScroll implements Scroll {

    @Override
    public void scroll() {
        System.out.println("Scrolling mac scroll");
    }
}
