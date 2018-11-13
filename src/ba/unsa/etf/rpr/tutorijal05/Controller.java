package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    private SimpleStringProperty displayValue;
    public Label display;
    Double storage = 0d;
    int operation = -1;

    public Button moduleBtn;
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

    public Controller(){
        displayValue = new SimpleStringProperty("0");
    }

    public SimpleStringProperty displayValueProperty(){
        return displayValue;
    }

    @FXML
    public void initialize(){
        display.textProperty().bindBidirectional(displayValue);
    }


    public String getDisplayValue(){
        return displayValue.get();
    }

    public void buttonPressed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == btn1){
            if(displayValue.get().length() > 0){
                if(Double.parseDouble(displayValue.get()) == 0f)
                    displayValue.set("");
            }
            displayValue.set(displayValue.get() + "1");
        }else if(actionEvent.getSource() == btn2){
            if(displayValue.get().length() > 0){
                if(Double.parseDouble(displayValue.get()) == 0f)
                    displayValue.set("");
            }
            displayValue.set(displayValue.get() + "2");
        }else if(actionEvent.getSource() == btn3){
            if(displayValue.get().length() > 0){
                if(Double.parseDouble(displayValue.get()) == 0f)
                    displayValue.set("");
            }
            displayValue.set(displayValue.get() + "3");
        }else if(actionEvent.getSource() == btn4){
            if(displayValue.get().length() > 0){
                if(Double.parseDouble(displayValue.get()) == 0f)
                    displayValue.set("");
            }
            displayValue.set(displayValue.get() + "4");
        }else if(actionEvent.getSource() == btn5){
            if(displayValue.get().length() > 0){
                if(Double.parseDouble(displayValue.get()) == 0f)
                    displayValue.set("");
            }
            displayValue.set(displayValue.get() + "5");
        }else if(actionEvent.getSource() == btn6){
            if(displayValue.get().length() > 0){
                if(Double.parseDouble(displayValue.get()) == 0f)
                    displayValue.set("");
            }
            displayValue.set(displayValue.get() + "6");
        }else if(actionEvent.getSource() == btn7){
            if(displayValue.get().length() > 0){
                if(Double.parseDouble(displayValue.get()) == 0f)
                    displayValue.set("");
            }
            displayValue.set(displayValue.get() + "7");
        }else if(actionEvent.getSource() == btn8){
            if(displayValue.get().length() > 0){
                if(Double.parseDouble(displayValue.get()) == 0f)
                    displayValue.set("");
            }
            displayValue.set(displayValue.get() + "8");
        }else if(actionEvent.getSource() == btn9){
            displayValue.set(displayValue.get() + "9");
        }else if(actionEvent.getSource() == btn0) {
            if(displayValue.get().length() > 0){
                if(Double.parseDouble(displayValue.get()) == 0f)
                    displayValue.set("");
            }
            displayValue.set(displayValue.get() + "0");
        }else if(actionEvent.getSource() == plusBtn){
            storage = Double.parseDouble(displayValue.get());
            operation = 1;
            displayValue.set("");
        }else if(actionEvent.getSource() == minusBtn){
            storage = Double.parseDouble(displayValue.get());
            operation = 2;
            displayValue.set("");
        }else if(actionEvent.getSource() == multiplyBtn){
            storage = Double.parseDouble(displayValue.get());
            operation = 3;
            displayValue.set("");
        }else if(actionEvent.getSource() == divideBtn){
            storage = Double.parseDouble(displayValue.get());
            operation = 4;
            displayValue.set("");
        }else if(actionEvent.getSource() == moduleBtn){
            storage = Double.parseDouble(displayValue.get());
            operation = 6;
            displayValue.set("");
        }else if(actionEvent.getSource() == dotBtn){
            if(!displayValue.get().contains("."))
                displayValue.set(displayValue.get() + ".");
        }else if(actionEvent.getSource() == equalsBtn){
            Double storage2 = Double.parseDouble(displayValue.get());
            Double result = 0d;
            if(operation == 1)
                result = storage + storage2;
            else if(operation == 2)
                result = storage - storage2;
            else if(operation == 3)
                result = storage * storage2;
            else if(operation == 4)
                result = storage / storage2;
            else if(operation == 5)
                result = storage%storage2;
            else if(operation == 6)
                result = storage%storage2;
            displayValue.set(String.valueOf(result));
        }
    }
}
