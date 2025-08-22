package org.lld;

public class Main {
    public static void main(String[] args) {
        Button button = new WindowsFactory().createButton();
        Scroll scroll = new WindowsFactory().createScroll();

        button.click();
        scroll.scroll();
    }
}