package lesson7;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        Plate plate = new Plate(30);
        createCats(cats);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        print(cats);
        plate.info();
    }

    static void createCats(Cat[] cats) {
        String[] names = {"\n" +
                "Aзaдeллo", "Букa", "Виски", "Гaрфилд", "Дaнтe", "Ермaк", "Рингo", "Жeрмoн", "Зeфир", "Зaхaр", "Император", "Изюмчик", "Кaзeмир", "Лaнцeлoт", "Мaртин", "Нильс", "Олaф"};
        Random random = new Random();
        Random appetite = new Random();
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(names[random.nextInt(names.length)], appetite.nextInt(21));
        }
    }

    static void print(Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].catInfo();
            System.out.println("Сытость: " + cats[i].getSatietyInfo());
        }
    }
}
