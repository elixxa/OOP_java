package andr.pr4.seasons;

public class TestSeason {

    public static void main(String[] args) {

        Season favoriteSeason = Season.SUMMER;

        System.out.println("Мое любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: "
                + favoriteSeason.getAverageTemperature());
        System.out.println("Описание: "
                + favoriteSeason.getDescription());

        printFavoriteSeason(favoriteSeason);

        System.out.println();

        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: "
                    + season.getAverageTemperature());
            System.out.println("Описание: "
                    + season.getDescription());
            System.out.println();
        }
    }

    public static void printFavoriteSeason(Season season) {

        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;

            case WINTER:
                System.out.println("Я люблю зиму");
                break;

            case SPRING:
                System.out.println("Я люблю весну");
                break;

            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}