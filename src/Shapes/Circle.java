package Shapes;
import Shapes.Interfaces.Shape;
public class Circle implements Shape {
    @Override
    public void Draw() {
        System.out.println("Inside Circle Draw method.");
    }
}
