package practicalЕxerciseL8;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    private String message;

    public MyArraySizeException() {
        this.message = "Размерность массива не подходит для метода";
    }

    public MyArraySizeException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
