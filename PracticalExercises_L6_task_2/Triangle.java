package PracticalExercises_L6_task_2;

public class Triangle implements SquareAndPerimeter, GetColor{
    double triangleSquare;
    double trianglePerimeter;
    String colorPerimeter;
    String colorSquare;
    int side_1 = 3;
    int side_2 = 4;
    int side_3 = 5;
    @Override
    public String getColorPerimeter() {
        return colorPerimeter = "Red";
    }

    @Override
    public String getColorSquare() {
        return colorSquare = "Black";
    }

    @Override
    public double square() {
        double half_perimeter = perimeter()/2;
        return triangleSquare = Math.sqrt(half_perimeter*(half_perimeter - side_1)*(half_perimeter - side_2)*(half_perimeter-side_3));
    }

    @Override
    public double perimeter() {
        return trianglePerimeter = side_1+side_2+side_3;
    }
    @Override
    public void getInfo() {
        System.out.println("Фигура: Треугольник, периметр: " + perimeter() + ", площадь: " + square() +
                ", цвет фона: " + getColorPerimeter() + ", цвет границы: " + getColorSquare() +".");
    }
}
