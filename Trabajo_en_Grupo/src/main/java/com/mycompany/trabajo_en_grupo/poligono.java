package com.mycompany.trabajo_en_grupo;

public class poligono {

    // variables 
    boolean verificar = false;
    private double apotema;
    private double numerol;
    private double lado;
    private double perimetro;

    public poligono(double ap, double num, double l) {
        this.apotema = ap;
        this.numerol = num;
        this.lado = l;

    }
    public double perimetro() {
        this.perimetro = this.lado * this.numerol;
        return this.lado * this.numerol;

   }
    public double area() {
        return ((this.perimetro) * this.apotema) / 2;
    }
}