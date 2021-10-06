package lesson6;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog(400, 5),
                new Cat(250)
        };
         int run =200;
        int swim =5;
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() +
                    "\nПробежал: "  + run +animal.run(200)+
                    "\nПроплыл: " + swim+animal.swim(5));
        }
    }
}