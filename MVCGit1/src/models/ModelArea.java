
package models;

/**
 *
 * @author r3n0
 */
public class ModelArea {
    private double radio;
    private double lado;
    private double base,altura;

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the diamtro to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    //#####################################################################################################    
    
    public double areaCirculo (double radio)    {
        double area=(3.1416*(radio*radio));
        return area;
    }
    public double areaCuadrado(double lado) {
        double area=(lado*lado);
        return area;
    }
    public double areaTriangulo(double base, double altura)  {
        double area=((base*altura)/2);
        return area;
    }   
}
