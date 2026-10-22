package andr.praktika21.pr12;

import java.util.Stack;

public class MyStringBuilder {

    private StringBuilder builder;
    private Stack<Command> history;

    public MyStringBuilder() {
        builder = new StringBuilder();
        history = new Stack<>();
    }

    private void saveState() {
        history.push(new UndoCommand(builder.toString()));
    }

    public void append(String text) {
        saveState();
        builder.append(text);
    }

    public void insert(int index, String text) {
        saveState();
        builder.insert(index, text);
    }

    public void delete(int start, int end) {
        saveState();
        builder.delete(start, end);
    }

    public void replace(int start, int end, String text) {
        saveState();
        builder.replace(start, end, text);
    }

    public void undo() {
        if (!history.empty()) {
            Command command = history.pop();
            command.undo();
        }
    }

    @Override
    public String toString() {
        return builder.toString();
    }

    private class UndoCommand implements Command {

        private String previousText;

        public UndoCommand(String previousText) {
            this.previousText = previousText;
        }

        @Override
        public void undo() {
            builder.setLength(0);
            builder.append(previousText);
        }
    }
}