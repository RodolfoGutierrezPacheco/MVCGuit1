package models;

/**
 *
 * @authors Luis y Sergio
 */

public class ModelPerimetro {
    double diametro;
    double lado;
    double angulo;

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
    
    public double perimetroCirculo(double diametro) {
        double perimetro = (3.1416 * diametro);
        return perimetro;
    }
    
    public double perimetroCuadrado(double lado) {
        double perimetro = (4 * lado);
        return perimetro;
    }
    
    public double perimetroTriangulo(double angulo) {
        double perimetro = (3 * angulo);
        return perimetro;
    }
}
