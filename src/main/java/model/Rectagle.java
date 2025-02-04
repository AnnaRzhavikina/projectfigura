package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectagle extends Shapes {
    double length;
    double height;

    public void Draw(GraphicsContext gc) {
        gc.setFill(ShapeColor);
        gc.fillRect(50, 60, length, height);
    }

    // Метод perimeter() удален

    public String toString() {
        return "Цвет квадрата " + super.ShapeColor;
    }

    public Rectagle(Color color, double length, double height) {
// calling Shape constructor
        super(color);
        this.length = length;
        this.height = height;
    }
}