package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (appetite <= p.getFood() && satiety == false) {
            satiety = true;
            p.decreaseFood(appetite);
        } else satiety = false;
    }

    public void catInfo() { //Вывод информации о коте в консоль
        System.out.println("Имя: " + name + ", Аппетит: " + appetite);
    }

    public boolean getSatietyInfo() { //Чтение сытости
        return satiety;
    }

}
