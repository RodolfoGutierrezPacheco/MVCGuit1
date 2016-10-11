package controllers;

/**
 *
 * @author Sergio
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ModelVolumen;
import views.ViewVolumen;

import sogc.DataFlow;

public class ControllerVolumen implements ActionListener {
    ModelVolumen modelVolumen;
    ViewVolumen viewVolumen;
    DataFlow dataFlow;

    public ControllerVolumen(ModelVolumen modelVolumen, ViewVolumen viewVolumen, DataFlow dataFlow) {
        this.modelVolumen = modelVolumen;
        this.viewVolumen = viewVolumen;
        this.dataFlow = dataFlow;
        
        this.viewVolumen.jb_calcularCubo.addActionListener(this);
        this.viewVolumen.jb_calcularEsfera.addActionListener(this);
        this.viewVolumen.jb_calcularCilindro.addActionListener(this);
        
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewVolumen.jb_calcularCubo)
            volumenCubo();
        else if(e.getSource() == viewVolumen.jb_calcularEsfera)
            volumenEsfera();
        else if(e.getSource() == viewVolumen.jb_calcularCilindro)
            volumenCilindro();
    }
    
    public void initView() {
        modelVolumen.getLadoCubo();
        modelVolumen.getRadioEsfera();
        modelVolumen.getRadioCilindro();
        modelVolumen.getAlturaCilindro();
    }
    
    public void volumenCubo() {
        Double ladoCubo = Double.parseDouble(viewVolumen.jtf_ladoCubo.getText());
        viewVolumen.jtf_resultadoCubo.setText("" + modelVolumen.volumenCubo(ladoCubo));
        dataFlow.stringToDouble(ladoCubo.toString());
    }
    
    public void volumenEsfera() {
        Double radioEsfera = Double.parseDouble(viewVolumen.jtf_radioEsfera.getText());
        viewVolumen.jtf_resultadoEsfera.setText("" + modelVolumen.volumenEsfera(radioEsfera));
        dataFlow.stringToDouble(radioEsfera.toString());
    }
    
    public void volumenCilindro() {
        Double radioCilindro = Double.parseDouble(viewVolumen.jtf_radioCilindro.getText());
        Double alturaCilindro = Double.parseDouble(viewVolumen.jtf_alturaCilindro.getText());
        viewVolumen.jtf_resultadoCilindro.setText("" + modelVolumen.volumenCilindro(radioCilindro, alturaCilindro));
        dataFlow.stringToDouble(radioCilindro.toString());
        dataFlow.stringToDouble(alturaCilindro.toString());
    }
}
