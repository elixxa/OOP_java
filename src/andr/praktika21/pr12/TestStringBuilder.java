package andr.praktika21.pr12;

public class TestStringBuilder {

    public static void main(String[] args) {

        MyStringBuilder text = new MyStringBuilder();

        text.append("Привет");
        System.out.println(text);

        text.append(" мир");
        System.out.println(text);

        text.undo();
        System.out.println("После undo: " + text);

        text.append(" Java");
        System.out.println(text);

        text.undo();
        System.out.println("После undo: " + text);
    }
}