package andr.pr4.atelier;

public class Atelier {

    public void showWomenClothes(Clothes[] clothes) {

        for (int i = 0; i < clothes.length; i++) {

            if (clothes[i] instanceof WomenClothing) {
                WomenClothing womenClothing = (WomenClothing) clothes[i];
                womenClothing.dressWomen();
            }
        }
    }

    public void showMenClothes(Clothes[] clothes) {

        for (int i = 0; i < clothes.length; i++) {

            if (clothes[i] instanceof MenClothing) {
                MenClothing menClothing = (MenClothing) clothes[i];
                menClothing.dressMan();
            }
        }
    }
}