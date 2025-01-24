package practical_exercises;

public class Employee {
    static String name;
    static String surname;
    static String last_name;
    static String email;
    static String number_phone;
    static int salary;
    static int age;

    public Employee(String name, String surname, String last_name, String email, String phone, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.last_name = last_name;
        this.email = email;
        this.number_phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public static void getInfo(){
        System.out.println("ФИО: " + name + " " + surname + " " + last_name + "\n" + "Электронная почта: " + email + "\n" +
                "Номер телефона: " + number_phone + "\n" + "Зарплата: " + salary + "\n" + "Возраст: " + age);
    }
}
