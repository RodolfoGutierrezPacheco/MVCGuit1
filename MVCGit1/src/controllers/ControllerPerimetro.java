package controllers;

/**
 *
 * @authors Luis y Sergio
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ModelPerimetro;
import views.ViewPerimetro;

import sogc.DataFlow;

public class ControllerPerimetro implements ActionListener {
    ModelPerimetro modelPerimetro;
    ViewPerimetro viewPerimetro;
    
    DataFlow dataFlow;

    public ControllerPerimetro(ModelPerimetro modelPerimetro, ViewPerimetro viewPerimetro, DataFlow dataFlow) {
        this.modelPerimetro = modelPerimetro;
        this.viewPerimetro = viewPerimetro;
        this.dataFlow = dataFlow;
        
        this.viewPerimetro.jb_calcularCirculo.addActionListener(this);
        this.viewPerimetro.jb_calcularCuadrado.addActionListener(this);
        this.viewPerimetro.jb_calcularTriangulo.addActionListener(this);
        
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == viewPerimetro.jb_calcularCirculo)
            perimetroCirculo();
        else if(a.getSource() == viewPerimetro.jb_calcularCuadrado)
            perimetroCuadrado();
        else if(a.getSource() == viewPerimetro.jb_calcularTriangulo)
            perimetroTriangulo();
    }
    
    public void initView() {
        modelPerimetro.getDiametro();
        modelPerimetro.getLado();
        modelPerimetro.getAngulo();
    }
    
    public void perimetroCirculo() {
        Double diametro = Double.parseDouble(viewPerimetro.jtf_diametro.getText());
        viewPerimetro.jtf_resultadoCirculo.setText("" + modelPerimetro.perimetroCirculo(diametro));
        dataFlow.stringToDouble(diametro.toString());
    }
    
    public void perimetroCuadrado() {
        Double lado = Double.parseDouble(viewPerimetro.jtf_lado.getText());
        viewPerimetro.jtf_resultadoCuadrado.setText("" + modelPerimetro.perimetroCuadrado(lado));
        dataFlow.stringToDouble(lado.toString());
    }
    
    public void perimetroTriangulo() {
        Double angulo = Double.parseDouble(viewPerimetro.jtf_angulo.getText());
        viewPerimetro.jtf_resultadoTriangulo.setText("" + modelPerimetro.perimetroTriangulo(angulo));
        dataFlow.stringToDouble(angulo.toString());
    }
}
