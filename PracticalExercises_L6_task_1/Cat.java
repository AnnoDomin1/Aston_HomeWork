package PracticalExercises_L6_task_1;

public class Cat extends Animals{
    private String cat_name;
    private int max_run_lenght = 200;
    private boolean satiety = false;
    private int  amount_for_satiety = 30;
    public Cat(String cat_name) {
       this.cat_name = cat_name;
    }


    @Override
    public void animalRun(int length_obstacle) {
        if(max_run_lenght < length_obstacle) {
            System.out.println(this.cat_name + " пробежал " + max_run_lenght + " м.");
        }else {
            System.out.println(this.cat_name + " пробежал " + length_obstacle + " м.");
        }
    }

    @Override
    public void animalSwim(int length_obstacle) {
        System.out.println("Кот " + this.cat_name + " не умеет плавать");
    }
    public void getSatiety(){
        if(satiety){
            System.out.println("Кот " + this.cat_name + " не голодный");
        }else {
            System.out.println("Кот " + this.cat_name + " голодный");
        }
    }
    public void eating(){
        if(satiety == false) {
            if (Powl.fullness_bowl > amount_for_satiety) {
                Powl.fullness_bowl -= amount_for_satiety;
                satiety = true;
            } else {
                satiety = false;
            }
        }else {
            System.out.println("Кот " + Cat.this.cat_name + "не голодный");
        }
    }



}
