package andr.pr2;

public class TestAuthor {
    public static void main(String[] args) {

        Author author = new Author(
                "Ivan Ivanov",
                "ivan@mail.ru",
                'M'
        );

        System.out.println(author);

        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());

        author.setEmail("ivan.new@mail.ru");

        System.out.println("Новый email: " + author.getEmail());
        System.out.println(author);
    }
}
