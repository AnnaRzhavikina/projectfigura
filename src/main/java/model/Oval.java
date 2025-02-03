package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

    public class Oval extends Shapes {
        private double x;
        private double y;
        private double width;
        private double height;

        public void Draw(GraphicsContext gc) {
            gc.setFill(ShapeColor);
            gc.fillOval(x, y, width, height);
        }

        public String toString() {
            return "Цвет овала " + super.ShapeColor;
        }

        public Oval(Color color, double x, double y, double width, double height) {
            super(color);
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
    }
