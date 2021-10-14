package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }


    public void setFood(int f) {
        if (f < 0) {
            System.out.println("В миске не осталось еды!");
            food = 0;
        } else food = f;
    }

    public int getFood() { //Чтение параметра food
        return food;
    }

    public void decreaseFood(int n) {
        setFood(food);
        food -= n;
    }


    public void increaseFood(int n) { //Увеличение еды в миске
        food += n;
    }

    public void info() { //Сколько в миске еды
        System.out.println("В миске еды: " + getFood());
    }
}
