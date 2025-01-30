package practicalЕxerciseL8;


public class Main {
    public static void main(String[] args) {
        String[][] array1 = {{"1", "2", "3"}, {"5", "6", "7"}, {"9", "10", "11"}, {"13", "14", "15"}, {"9", "10", "11"}};
        String[][] array2 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] array3 = {{"1", "f", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            System.out.println("Попытаемся вызвать метод для массива array1, у которого размерность 3на5 и все элементы состоят из цифр");
            ArrayMethod.integerParseInt(array1);
            System.out.println("У нас все получилось!");
        } catch (MyArraySizeException myArraySizeException) {
            System.err.println("Ошибка! " + myArraySizeException.getMessage());
        } catch (MyArrayDataException myArrayDataException) {
            System.err.println("Ошибка! " + myArrayDataException.getMessage());
        }
        try {
            System.out.println("Попытаемся вызвать метод для массива array2, у которого размерность 4на4 и все элементы состоят из цифр");
            ArrayMethod.integerParseInt(array2);
            System.out.println("У нас все получилось!");
        } catch (MyArraySizeException myArraySizeException) {
            System.err.println("Ошибка! " + myArraySizeException.getMessage());
        } catch (MyArrayDataException myArrayDataException) {
            System.err.println("Ошибка! " + myArrayDataException.getMessage());
        }
        try {
            System.out.println("Попытаемся вызвать метод для массива array2, у которого размерность 4на4 и среди элементов находится символ");
            ArrayMethod.integerParseInt(array3);
            System.out.println("У нас все получилось!");
        } catch (MyArraySizeException myArraySizeException) {
            System.err.println("Ошибка! " + myArraySizeException.getMessage());
        } catch (MyArrayDataException myArrayDataException) {
            System.err.println("Ошибка! " + myArrayDataException.getMessage());
        }


    }
}