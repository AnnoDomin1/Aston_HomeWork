package PracticalExercises_L6_task_2;

public class Rectangle implements SquareAndPerimeter, GetColor{
    double rectangleSquare;
    double rectanglePerimeter;
    String colorPerimeter;
    String colorSquare;
    int side_1 = 7;
    int side_2 = 3;

    @Override
    public String getColorPerimeter() {
        return  colorPerimeter = "Green";
    }

    @Override
    public String getColorSquare() {
        return colorSquare = "White";
    }

    @Override
    public double square() {
        return rectangleSquare = side_1*side_2;
    }

    @Override
    public double perimeter() {
        return rectanglePerimeter = 2*(side_1+side_2);
    }
    @Override
    public void getInfo() {
        System.out.println("Фигура: Прямоугольник, периметр: " + perimeter() + ", площадь: " + square() +
                ", цвет фона: " + getColorPerimeter() + ", цвет границы: " + getColorSquare() +".");
    }
}
