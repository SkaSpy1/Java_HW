package lesson6;

public class Cat extends Animal {
    public Cat(int runLimit) {
        super(runLimit, 0);
    }

    @Override
    public boolean run(int length) {
        return length <= runLimit;
    }

    @Override
    public boolean swim(int length) {
        return false;
    }
}