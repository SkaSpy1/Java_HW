package lesson6;

public class Dog extends Animal {
    public Dog(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }

    @Override
    public boolean run(int length) {
        return length <= runLimit;
    }

    @Override
    public boolean swim(int length) {
        return length <= swimLimit;
    }
}