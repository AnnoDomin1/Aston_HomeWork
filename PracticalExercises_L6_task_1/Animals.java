package PracticalExercises_L6_task_1;

public class Animals {
    public static int number_animal = 0;
    String name;

    public Animals() {
        Animals.number_animal++;
    }

    void animalRun(int length_obstacle){
        System.out.println(name + " пробежал " + length_obstacle + " м.");
    }
    void animalSwim(int length_obstacle){

    }
}
