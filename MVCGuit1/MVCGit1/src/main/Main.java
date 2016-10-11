package main;

import models.*;
import views.*;
import controllers.*;

import javax.swing.JPanel;

import sogc.DataFlow;

public class Main {

    public static void main(String[] lrs) {
        DataFlow dataFlow = new DataFlow();
        
        ModelPerimetro modelPerimetro = new ModelPerimetro();
        ViewPerimetro viewPerimetro = new ViewPerimetro();
        ControllerPerimetro controllerPerimetro = new ControllerPerimetro(modelPerimetro, viewPerimetro, dataFlow);
        
        ModelArea modelArea = new ModelArea();
        ViewArea viewArea = new ViewArea();
        ControllerArea controllerArea =new ControllerArea(modelArea, viewArea, dataFlow);
        
        ModelVolumen modelVolumen = new ModelVolumen();
        ViewVolumen viewVolumen = new ViewVolumen();
        ControllerVolumen controllerVolumen = new ControllerVolumen(modelVolumen, viewVolumen, dataFlow);
        
        JPanel paneArray[] = new JPanel[3];
        paneArray[0] = viewPerimetro;
        paneArray[1] = viewArea;
        paneArray[2] = viewVolumen;
        
        MainModel mainModel = new MainModel();
        MainView mainView = new MainView();
        MainController mainController = new MainController(mainModel, mainView, paneArray);
    }   
}
