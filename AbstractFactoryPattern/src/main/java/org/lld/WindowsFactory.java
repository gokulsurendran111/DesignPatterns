package org.lld;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Scroll createScroll() {
        return new WindowsScroll();
    }
}

class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("Clicking windows button");
    }
}

class WindowsScroll implements Scroll{
    @Override
    public void scroll() {
        System.out.println("Scrolling windows scroll");
    }
}
