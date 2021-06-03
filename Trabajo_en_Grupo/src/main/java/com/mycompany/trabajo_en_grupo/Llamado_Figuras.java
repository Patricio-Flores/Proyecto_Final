/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajo_en_grupo;

import java.util.Scanner;
import com.mycompany.trabajo_en_grupo.Cuadrado;
import com.mycompany.trabajo_en_grupo.Rectangulo;
import com.mycompany.trabajo_en_grupo.triangulo;
import com.mycompany.trabajo_en_grupo.Rombo;
import com.mycompany.trabajo_en_grupo.ROMBOIDE;
import com.mycompany.trabajo_en_grupo.Trapecio;
import com.mycompany.trabajo_en_grupo.Circulo;
import com.mycompany.trabajo_en_grupo.poligono;

/**
 *
 * @author leski
 */
public class Llamado_Figuras {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Figuras Geometricas
        double Diagonalm=0,diagonalm=0,lado=0,b=0,bmayor=0, bmenor=0,apotema=0,num=0,altura=0,radio=0,pi=3.1416,diametro=0;
        int opcion=0;   
        
        
        Scanner sc=new Scanner (System.in);
                try{
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Tringulo");
        System.out.println("4. Rombo");
        System.out.println("5. Romboide");
        System.out.println("6. Trapecio");
        System.out.println("7. Circulo");
        System.out.println("8. Poligono");
        System.out.println("selecciones la figura");
        opcion=sc.nextInt();
        switch(opcion){
            case 1:
                System.out.println("ingrese el lado ");
                lado=sc.nextDouble();
                Cuadrado c=new Cuadrado(lado);
                System.out.println("El area del cuadrado es: "+c.area());
                System.out.println("El area del cuadrado es: "+c.perimetro());
                break;
            case 2:
                System.out.println("Ingrese la base: ");
                b=sc.nextDouble();
                System.out.println("Ingrese la altura: ");
                altura=sc.nextDouble();
                Rectangulo re=new Rectangulo(b,altura);
                System.out.println("El area del Rectangulo es: "+re.area());
                System.out.println("El Perimetro del Rectangulo es: "+re.perimetro());
                break;
            case 3:
                System.out.println("Ingrese la base: ");
                b=sc.nextDouble();
                System.out.println("Ingrese la altura: ");
                altura=sc.nextDouble();
                System.out.println("ingrese el lado ");
                lado=sc.nextDouble();
                triangulo t = new triangulo(b,altura,lado);
                System.out.println("El area del Triangulo es: "+t.area());
                System.out.println("El area del Triangulo: "+t.perimetro());
                break;
            case 4:
                System.out.println("Ingrese la diagonal mayor: ");
                Diagonalm=sc.nextDouble();
                System.out.println("Ingrese la diagonal menor: ");
                diagonalm=sc.nextDouble();
                System.out.println("ingrese el lado ");
                lado=sc.nextDouble();
                 Rombo r = new Rombo (Diagonalm,diagonalm,lado);
                 System.out.println("El area del Rombo es: "+r.area());
                System.out.println("El area del Rombo es: "+r.perimetro());
                break;
            case 5:
                 System.out.println("Ingrese la base: ");
                b=sc.nextDouble();
                System.out.println("Ingrese la altura: ");
                altura=sc.nextDouble();
                ROMBOIDE rom=new ROMBOIDE(b,altura);
                System.out.println("El area del Romboide es: "+rom.area());
                System.out.println("El area del Romboide es: "+rom.perimetro());
                break;
            case 6:
                System.out.println("ingrese el lado ");
                lado=sc.nextDouble();
                 System.out.println("Ingrese la base: ");
                b=sc.nextDouble();
                System.out.println("Ingrese la altura: ");
                altura=sc.nextDouble();
                System.out.println("Ingrese la base mayor: ");
                bmayor=sc.nextDouble();
                System.out.println("Ingrese la base menor: ");
                bmenor=sc.nextDouble();
                Trapecio tr = new Trapecio (altura,bmayor,bmenor,lado);
                System.out.println("El area del Trapecio es: "+tr.area());
                System.out.println("El area del Trapecio es: "+tr.perimetro());
                break;
            case 7:
                System.out.println("Ingrese el diametro: ");
                diametro=sc.nextDouble();
                System.out.println("Ingrese el radio: ");
                radio=sc.nextDouble();
                 Circulo cir=new Circulo(diametro,radio,pi);
                 System.out.println("El area del Circulo es: "+cir.area());
                System.out.println("El area del Circulo es: "+cir.perimetro());
                break;
            case 8:
                System.out.println("ingrese el lado ");
                lado=sc.nextDouble();
                System.out.println("Ingrese el apotema: ");
                apotema=sc.nextDouble();
                System.out.println("Ingrse el numero de lados: ");
                num=sc.nextDouble();
                  poligono po=new poligono(lado,apotema,num);
                  System.out.println("El area del Poligono es: "+po.area());
                System.out.println("El area del Poligono es: "+po.perimetro());
                break;
        }
        
       }catch(ArithmeticException e){
            System.out.println("No se puede dividir para cero.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(Exception e){
        
            System.out.println("Detectamos un Error comuniquese con un Servidor mas cercano");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
                finally{
            //cerrar la conexion 
            System.out.println("GRACIAS.");
        }
        
        
        
        
        
        
    }
    
}