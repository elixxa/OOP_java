package andr.pr4.atelier;

public class TestAtelier {

    public static void main(String[] args) {

        Clothes[] clothes = {
                new TShirt(Size.M, 1500, "Белая"),
                new Pants(Size.L, 2500, "Черные"),
                new Skirt(Size.S, 2000, "Красная"),
                new Tie(Size.XXS, 1000, "Синий")
        };

        Atelier atelier = new Atelier();

        System.out.println("Женская одежда:");
        atelier.showWomenClothes(clothes);

        System.out.println();

        System.out.println("Мужская одежда:");
        atelier.showMenClothes(clothes);
    }
}