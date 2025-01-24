package practical_exercises;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Медведь", "Кирилл", "Игоревич", "kirill.medved@bk.ru",
                "89176310234", 1, 23);
        employee1.getInfo();
        Employee[] array_employee = new Employee[5];
        array_employee[0] = new Employee("Иванов", "Иван", "Иванович", "i.ivanov@mail.ru",
                "11111111111", 100000, 27);
        array_employee[1] = new Employee("Петров", "Петр", "Петрович", "petr_petr@mail.ru",
                "22222222222", 70000, 19);
        array_employee[2] = new Employee("Ермаков", "Константин", "Викторович", "Ermak_K@mail.ru",
                "33333333333", 120000, 34);
        array_employee[3] = new Employee("Петухов", "Роман", "Сергеевич", "PetuxovRoman@mail.ru",
                "44444444444", 111000, 40);
        array_employee[4] = new Employee("Курская", "Александра", "Дмитриевна", "Kursk_Alex@mail.ru",
                "5555555555", 20000, 33);
    }
}