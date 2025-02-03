package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shapes {
    double x1;
    double x2;
    double y1;
    double y2;
    double x3;
    double y3;

    public void Draw(GraphicsContext gc) {
        gc.setStroke(ShapeColor);
        gc.strokeLine(x1, y1, x2, y2);
        gc.strokeLine(x1, y1, x3, y3);
        gc.strokeLine(x2, y2, x3, y3);
    }

    public String toString() {
        return "Цвет треугольника " + super.ShapeColor;
    }

    public Triangle(Color color, double x1, double y1, double x2, double y2, double x3, double y3) {
        super(color);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }
}