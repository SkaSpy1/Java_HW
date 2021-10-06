package lesson5;

public class Main {
    public static void main(String[] args) {


        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 32000, 30);
        persArray[1] = new Person("Kozlov Petr", "Engineer", "ivivn@mailbox.com", "893312312", 31000, 20);
        persArray[2] = new Person("Petrov Igor", "Postal", "ivvan@mailbox.com", "894312312", 34000, 40);
        persArray[3] = new Person("Noskov Pavel", "NeKto", "iivan@mailbox.com", "895312312", 35000, 45);
        persArray[4] = new Person("Tinkoff Anton", "Manager", "vivan@mailbox.com", "896312312", 37000, 55);

        for (Person item : persArray) {
            if (item.Age() > 40) item.Show();
        }
    }
}