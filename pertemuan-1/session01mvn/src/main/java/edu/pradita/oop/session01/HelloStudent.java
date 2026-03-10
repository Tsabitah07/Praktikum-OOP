package edu.pradita.oop.session01;

public class HelloStudent {
    private String name;

    // TODO: Constructor ini masih kosong, lengkapi!
    public HelloStudent(String name) {
        this.name = name;
    }

    // TODO: Method ini return-nya salah, perbaiki!
    public String greet() {
        return "Hello, " + name + "!";
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        HelloStudent student = new HelloStudent("Inas Tsabitah");
        System.out.println(student.greet());
    }
}
