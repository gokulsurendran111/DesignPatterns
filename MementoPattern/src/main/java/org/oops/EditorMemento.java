package org.oops;

public class EditorMemento {
    private String shapeType;
    private int x;
    private int y;
    private String color;
    private int size;


    public EditorMemento(String shapeType, int x, int y, String color, int size) {
        this.shapeType = shapeType;
        this.x = x;
        this.y = y;
        this.color = color;
        this.size = size;
    }

    public String getShapeType() {
        return shapeType;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }
    public int getSize() {
        return size;
    }


}
