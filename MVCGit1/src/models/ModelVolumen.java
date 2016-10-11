package models;

/**
 *
 * @author Sergio
 */

public class ModelVolumen {
    double ladoCubo;
    double radioEsfera;
    double radioCilindro;
    double alturaCilindro;

    public double getLadoCubo() {
        return ladoCubo;
    }

    public void setLadoCubo(double ladoCubo) {
        this.ladoCubo = ladoCubo;
    }

    public double getRadioEsfera() {
        return radioEsfera;
    }

    public void setRadioEsfera(double radioEsfera) {
        this.radioEsfera = radioEsfera;
    }

    public double getRadioCilindro() {
        return radioCilindro;
    }

    public void setRadioCilindro(double radioCilindro) {
        this.radioCilindro = radioCilindro;
    }

    public double getAlturaCilindro() {
        return alturaCilindro;
    }

    public void setAlturaCilindro(double alturaCilindro) {
        this.alturaCilindro = alturaCilindro;
    }

    public double volumenCubo(double ladoCubo) {
        double volumen = (ladoCubo * ladoCubo * ladoCubo);
        return volumen;
    }  

    public double volumenEsfera(double radioEsfera) {
        double volumen = ((4 / 3) * (3.1416)) * (radioEsfera);
        return volumen;
    }
    
    public double volumenCilindro(double radioCilindro, double alturaCilindro) {
        double volumen = ((3.1416) * (radioCilindro * radioCilindro)) * alturaCilindro;
        return volumen;
    }
}
