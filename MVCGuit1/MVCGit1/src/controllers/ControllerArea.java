package controllers;

/**
 *
 * @author r3n0
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ModelArea;
import views.ViewArea;

import sogc.DataFlow;

public class ControllerArea implements ActionListener {
    ModelArea modelArea=new ModelArea();
    ViewArea viewArea =new ViewArea();
        DataFlow dataFlow;
        
    public ControllerArea(ModelArea modelArea, ViewArea viewArea, DataFlow dataFlow)    {
        this.modelArea=modelArea;
        this.viewArea=viewArea;
        this.dataFlow=dataFlow;
        
        this.viewArea.jb_calcularCirculo.addActionListener(this);
        this.viewArea.jb_calcularCuadrado.addActionListener(this);
        this.viewArea.jb_calcularTriangulo.addActionListener(this);
        
        initView();
    }
        
        
    @Override
    public void actionPerformed(ActionEvent d) {
        if (d.getSource()==viewArea.jb_calcularCirculo)
            areaCirculo();
        else if(d.getSource()==viewArea.jb_calcularCuadrado)
            areaCuadrado();
        else if(d.getSource()==viewArea.jb_calcularTriangulo)
            areaTriangulo();
    }
    public void initView()  {
        modelArea.getAltura();
        modelArea.getBase();
        modelArea.getLado();
        modelArea.getRadio();
    }
    
    public void areaCirculo()   {
        Double radio = Double.parseDouble(viewArea.jtf_radio.getText());
        viewArea.jtf_resultadoCirculo.setText(""+modelArea.areaCirculo(radio)+" cm");
        dataFlow.stringToDouble(radio.toString());
    }
    
    public void areaCuadrado()  {
        Double lado=Double.parseDouble(viewArea.jtf_lado.getText());
        viewArea.jtf_resultadoCuadrado.setText(""+modelArea.areaCuadrado(lado)+" cm");
        dataFlow.stringToDouble(lado.toString());
    }
    
    public void areaTriangulo() {
        Double base=Double.parseDouble(viewArea.jtf_base.getText());
        Double altura=Double.parseDouble(viewArea.jtf_altura.getText());
        viewArea.jb_calcularTriangulo.setText(""+modelArea.areaTriangulo(base, altura)+" cm");
        dataFlow.stringToDouble(base.toString());
        dataFlow.stringToDouble(altura.toString());
    }
}
