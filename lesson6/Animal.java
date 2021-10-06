package lesson6;

public abstract class Animal {
    protected int runLimit;
    protected int swimLimit;


    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;

    }

    public abstract boolean run(int length);

    public abstract boolean swim(int length);


}