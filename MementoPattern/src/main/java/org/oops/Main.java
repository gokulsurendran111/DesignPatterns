package org.oops;

public class Main {
    public static void main(String[] args) {
        String[] shapes = {"square", "circle", "triangle"};
        int[] xPositions = {1,2,3};
        int[] yPositions = {4,5,6};
        String[] colors = {"Green", "blue", "orange"};
        int[] size = {2,4,8};

        GraphicEditor graphicEditor = new GraphicEditor();
        CareTaker careTaker = new CareTaker();

        for (int i=0; i<3; i++) {
            graphicEditor.setShape(shapes[i], xPositions[i],yPositions[i], colors[i],size[i]);
            careTaker.save(graphicEditor);
        }

        careTaker.undo(graphicEditor);
        System.out.println(graphicEditor.getShape());
    }
}