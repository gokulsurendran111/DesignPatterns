package org.oops;

import java.util.Stack;

public class CareTaker {

    private Stack<EditorMemento> history = new Stack<>();

    public void undo(GraphicEditor graphicEditor) {
        if (history.size()>0) {
            history.pop();
            graphicEditor.restore(history.peek());
        }
    }

    public void save(GraphicEditor graphicEditor) {
        history.push(graphicEditor.save());
    }
}
