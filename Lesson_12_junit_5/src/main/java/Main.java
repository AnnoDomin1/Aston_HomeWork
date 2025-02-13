public class Main {
    public static void main(String[] args) {
        int factorialNumFive = countFactorial(5);
        System.out.println(factorialNumFive);
    }
    public static int countFactorial(int number){
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}