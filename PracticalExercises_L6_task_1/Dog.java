package PracticalExercises_L6_task_1;

public class Dog extends Animals {
    private String dog_name;
    private int max_run_lenght = 500;
    private int max_swim_lenght = 10;

    public Dog(String dog_name) {
        this.dog_name = dog_name;
    }

    @Override
    public void animalRun(int length_obstacle) {
        if (max_run_lenght < length_obstacle) {
            System.out.println(this.dog_name + " пробежал " + max_run_lenght + " м.");
        } else {
            System.out.println(this.dog_name + " пробежал " + length_obstacle + " м.");
        }
    }

    @Override
    public void animalSwim(int length_obstacle) {
        if (max_swim_lenght < length_obstacle) {
            System.out.println(this.dog_name + " проплыл " + max_swim_lenght + " м.");
        } else {
            System.out.println(this.dog_name + " проплыл " + length_obstacle + " м.");
        }
        super.animalSwim(length_obstacle);
    }
}


