/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsup06.gp.pkg02;

/**
 *
 * @author leski
 */
public class Circulo {
   

public class Circulo {
    
}
private double diametro;
private double radio;
private double pi;

public Circulo(double d, double r, double pi){
    this.diametro = d;
    this.radio =r;
    this.pi=3.1416;
}
public double area(){
    return this.pi*(radio*radio);
}
public double perimetro(){
    return this.pi*diametro;
}
}
