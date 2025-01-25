package PracticalExercises_L6_task_2;

public class Circle implements SquareAndPerimeter, GetColor{
    double circleSquare;
    double circlePerimeter;
    String colorPerimeter;
    String colorSquare;
    int radius = 5;

    @Override
    public String getColorPerimeter() {
       return colorPerimeter = "Blue";
    }

    @Override
    public String getColorSquare() {
        return colorSquare = "Yellow";
    }

    @Override
    public double square() {
        return circleSquare = Math.PI* Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return circlePerimeter = 2*Math.PI*radius;
    }

    @Override
    public void getInfo() {
        System.out.println("Фигура: Круг, периметр: " + perimeter() + ", площадь: " + square() +
                ", цвет фона: " + getColorPerimeter() + ", цвет границы: " + getColorSquare() +".");
    }
}
