package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shapes {
    double x1;
    double x2;
    double radius;

    public void Draw(GraphicsContext gc) {
        gc.setFill(ShapeColor);
        gc.fillOval(x1, x1, x2, x2);
    }

    public String toString() {
        return "Цвет круга " + super.ShapeColor;
    }

    public Circle(Color color, double x1, double x2) {
        super(color);
        this.x1 = x1;
        this.x2 = x2;
        //this.height = height;
    }
}