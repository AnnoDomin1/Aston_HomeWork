package practicalЕxerciseL8;

public class MyArrayDataException extends NumberFormatException {
    private String message;

    public MyArrayDataException() {
        this.message = "В массиве есть переменная, котороя не является числовым значением";
    }

    public MyArrayDataException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
