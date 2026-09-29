package andr.pr4.shop;

public class Shop {

    private Product[] products;

    private Product[] cart = new Product[10];
    private int cartCount = 0;

    public Shop() {
        products = new Product[] {
                new Product("Телефон", 50000, Category.ELECTRONICS),
                new Product("Ноутбук", 90000, Category.ELECTRONICS),
                new Product("Футболка", 1500, Category.CLOTHES),
                new Product("Джинсы", 3000, Category.CLOTHES),
                new Product("Хлеб", 80, Category.FOOD),
                new Product("Молоко", 120, Category.FOOD)
        };
    }

    public boolean login(String login, String password) {
        return login.equals("admin") && password.equals("1234");
    }

    public void showCategories() {
        System.out.println("Каталоги:");

        for (Category category : Category.values()) {
            System.out.println(category);
        }
    }

    public void showProducts(Category category) {
        System.out.println("Товары категории " + category + ":");

        for (int i = 0; i < products.length; i++) {
            if (products[i].getCategory() == category) {
                System.out.println((i + 1) + ". " + products[i]);
            }
        }
    }

    public void addToCart(int productNumber) {

        int index = productNumber - 1;

        if (index >= 0 && index < products.length) {

            if (cartCount < cart.length) {
                cart[cartCount] = products[index];
                cartCount++;

                System.out.println("Товар " + (productNumber)+ " добавлен в корзину");
            }
        }
    }

    public void showCart() {
        System.out.println("Корзина:");

        for (int i = 0; i < cartCount; i++) {
            System.out.println((i + 1) + ". " + cart[i]);
        }
    }

    public void buy() {

        double sum = 0;

        for (int i = 0; i < cartCount; i++) {
            sum += cart[i].getPrice();
        }

        System.out.println("Покупка совершена");
        System.out.println("Сумма: " + sum);

        cartCount = 0;
    }
}