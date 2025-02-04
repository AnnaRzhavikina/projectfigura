package com.example.prog2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import model.*;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public ColorPicker picker;
    public TextField textF;
    @FXML
    private Canvas my_canvas;
    @FXML
    private GraphicsContext gc;
    Shapes sp = new Rectagle(Color.BLUE, 200, 200);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = my_canvas.getGraphicsContext2D();
    }
    public Shapes getShape(int i){
        if (i == 2){
            return new Oval(Color.GREY, 50, 60, 250, 160);
        }
        else if (i == 4){
            return new Rectagle(Color.BLUE, 200, 200);
        }
        else if (i == 3){
            return new Triangle(Color.BLACK, 70, 0, 10, 180, 200, 170 );
        }
        else if (i == 1){
            return new Circle(Color.GREEN, 70, 200);
        }
        return new Rectagle(Color.PURPLE, 200, 200);
    }

    public void pressF(KeyEvent keyEvent) {

        gc.clearRect(0, 0, my_canvas.getHeight(), my_canvas.getHeight());

        if(!textF.getText().equals("") ){
            sp = getShape(Integer.parseInt(textF.getText()));
            sp.setShapeColor(picker.getValue());
            sp.Draw(gc);
        }
    }
}