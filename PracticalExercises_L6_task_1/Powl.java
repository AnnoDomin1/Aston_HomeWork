package PracticalExercises_L6_task_1;

public class Powl {
    public static int fullness_bowl = 100;
    public static void add_food_to_bowl(int count){
        if(count+Powl.fullness_bowl > 100){
            Powl.fullness_bowl=100;
        }else{
            Powl.fullness_bowl+=count;
        }
    }
}