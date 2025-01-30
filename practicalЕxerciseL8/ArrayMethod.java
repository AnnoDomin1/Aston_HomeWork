package practicalЕxerciseL8;

public class ArrayMethod {

    public static void integerParseInt(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int[][] integerArray = new int[array.length][array.length];
        if (array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4) {
            throw new MyArraySizeException("размерность массива не подходит для данного метода");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j].matches("\\d+") == false) {
                    throw new MyArrayDataException("В переданном массиве на месте х = \"" + (i + 1) + "\", y = \"" + (j + 1) + "\", находится символ, который нельзя перевести в число.");
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                integerArray[i][j] = Integer.parseInt(array[i][j]);
            }
        }
    }
}
