package controllers;

/**
 *
 * @author Sergio
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.MainModel;
import views.*;

import javax.swing.JPanel;

public class MainController implements ActionListener {
    MainModel mainModel;
    
    MainView mainView;
    ViewPerimetro viewPerimetro;
    ViewArea viewArea;
    ViewVolumen viewVolumen;
    
    JPanel paneArray [];

    public MainController(MainModel mainModel, MainView mainView, JPanel[] paneArray) {
        this.mainModel = mainModel;
        this.mainView = mainView;

        this.paneArray = paneArray;
        
        this.mainView.jmi_perimetro.addActionListener(this);
        this.mainView.jmi_area.addActionListener(this);
        this.mainView.jmi_volumen.addActionListener(this);
        
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mainView.jmi_perimetro)
            panelPerimetro();
        else if(e.getSource() == mainView.jmi_area)
            panelArea();
        else if(e.getSource() == mainView.jmi_volumen)
            panelVolumen();
    }
    
    public void initView() {
        mainView.setTitle("Cálculo de perímetros, áreas y volúmenes");
        mainView.setLocationRelativeTo(null);
        mainView.setVisible(true);
    }
    
    public void panelPerimetro() {
        mainView.setContentPane(paneArray[0]);
        mainView.revalidate();
        mainView.repaint();
    }
    
    public void panelArea() {
        mainView.setContentPane(paneArray[1]);
        mainView.revalidate();
        mainView.repaint();
    }
    
    public void panelVolumen() {
        mainView.setContentPane(paneArray[2]);
        mainView.revalidate();
        mainView.repaint();
    }
}
