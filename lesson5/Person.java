package lesson5;

public class Person {
    private String full_name;
    private String position;
    private String email;
    private String phone;
    private float the_salary;
    private int age;

    public Person(String full_name, String position, String email, String phone, float Salary, int age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.the_salary = the_salary;
        this.age = age;
    }

    int Age() {
        return age;
    }

    void Show() {
        System.out.println(full_name + " " + position + " " + email + " " + phone + " " + the_salary + " " + age);
    }
}




