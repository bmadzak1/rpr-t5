package ba.unsa.etf.rpr.tutorijal05;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public Label display;
    Float storage = 0f;
    int operation = -1;

    public Button moduleButton;
    public Button divideBtn;
    public Button multiplyBtn;
    public Button minusBtn;
    public Button btn7;
    public Button btn4;
    public Button btn1;
    public Button btn0;
    public Button dotBtn;
    public Button btn8;
    public Button btn9;
    public Button btn5;
    public Button btn6;
    public Button btn2;
    public Button btn3;
    public Button plusBtn;
    public Button equalsBtn;


    public void buttonPressed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == btn1){
            if(display.getText().length() > 0){
                if(Float.parseFloat(display.getText()) == 0f)
                    display.setText("");
            }
            display.setText(display.getText() + "1");
        }else if(actionEvent.getSource() == btn2){
            if(display.getText().length() > 0){
                if(Float.parseFloat(display.getText()) == 0f)
                    display.setText("");
            }
            display.setText(display.getText() + "2");
        }else if(actionEvent.getSource() == btn3){
            if(display.getText().length() > 0){
                if(Float.parseFloat(display.getText()) == 0f)
                    display.setText("");
            }
            display.setText(display.getText() + "3");
        }else if(actionEvent.getSource() == btn4){
            if(display.getText().length() > 0){
                if(Float.parseFloat(display.getText()) == 0f)
                    display.setText("");
            }
            display.setText(display.getText() + "4");
        }else if(actionEvent.getSource() == btn5){
            if(display.getText().length() > 0){
                if(Float.parseFloat(display.getText()) == 0f)
                    display.setText("");
            }
            display.setText(display.getText() + "5");
        }else if(actionEvent.getSource() == btn6){
            if(display.getText().length() > 0){
                if(Float.parseFloat(display.getText()) == 0f)
                    display.setText("");
            }
            display.setText(display.getText() + "6");
        }else if(actionEvent.getSource() == btn7){
            if(display.getText().length() > 0){
                if(Float.parseFloat(display.getText()) == 0f)
                    display.setText("");
            }
            display.setText(display.getText() + "7");
        }else if(actionEvent.getSource() == btn8){
            if(display.getText().length() > 0){
                if(Float.parseFloat(display.getText()) == 0f)
                    display.setText("");
            }
            display.setText(display.getText() + "8");
        }else if(actionEvent.getSource() == btn9){
            display.setText(display.getText() + "9");
        }else if(actionEvent.getSource() == btn0) {
            if(display.getText().length() > 0){
                if(Float.parseFloat(display.getText()) == 0f)
                    display.setText("");
            }
            display.setText(display.getText() + "0");
        }else if(actionEvent.getSource() == plusBtn){
            storage = Float.parseFloat(display.getText());
            operation = 1;
            display.setText("");
        }else if(actionEvent.getSource() == minusBtn){
            storage = Float.parseFloat(display.getText());
            operation = 2;
            display.setText("");
        }else if(actionEvent.getSource() == multiplyBtn){
            storage = Float.parseFloat(display.getText());
            operation = 3;
            display.setText("");
        }else if(actionEvent.getSource() == divideBtn){
            storage = Float.parseFloat(display.getText());
            operation = 4;
            display.setText("");
        }else if(actionEvent.getSource() == moduleButton){
            storage = Float.parseFloat(display.getText());
            operation = 6;
            display.setText("");
        }else if(actionEvent.getSource() == dotBtn){
            if(!display.getText().contains("."))
                display.setText(display.getText() + ".");
        }else if(actionEvent.getSource() == equalsBtn){
            Float storage2 = Float.parseFloat(display.getText());
            Float result = 0f;
            if(operation == 1)
                result = storage + storage2;
            else if(operation == 2)
                result = storage - storage2;
            else if(operation == 3)
                result = storage * storage2;
            else if(operation == 4)
                result = storage/storage2;
            else if(operation == 5)
                result = storage%storage2;
            display.setText(String.valueOf(result));
        }
    }
}
