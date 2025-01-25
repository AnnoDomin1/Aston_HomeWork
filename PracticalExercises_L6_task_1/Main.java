package PracticalExercises_L6_task_1;


public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик");
        barsik.animalRun(100);
        barsik.animalRun(1000);
        System.out.println(Animals.number_animal);
        Dog bobik = new Dog("Бобик");
        Dog tuzik = new Dog("Тузик");
        Cat myrzik = new Cat("Мурзик");
        System.out.println(Animals.number_animal);
        myrzik.animalSwim(20);
        tuzik.animalSwim(8);
        bobik.animalSwim(200);
        myrzik.getSatiety();
        myrzik.eating();
        myrzik.getSatiety();
        Cat[] cats_array = new Cat[5];
        String[] name_cats = {"Персик","Димон","Тишка","Снежок","Рыжик"};
        for (int i = 0; i < 5; i++) {
            cats_array[i] = new Cat(name_cats[i]);
        }
        for (int i = 0; i < 5; i++) {
            cats_array[i].eating();
        }
        for (int i = 0; i < 5; i++) {
            cats_array[i].getSatiety();
        }
        Powl.add_food_to_bowl(200);

    }
}

