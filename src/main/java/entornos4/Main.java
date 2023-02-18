/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornos4;

/**
 *
 * @author richardroj
 */
public class Main {

    public static void main(String[] args) {
        ECesta cesta;
        cesta = new ECesta("Apellidos del alumno", 100, "dni del alumno", 5);
        nuevoMetodo(cesta);
             
        
    }
    
    public static void nuevoMetodo(ECesta cesta){
        try {
            cesta.comprar(50);
        } catch (Exception e) {
            System.out.println("No se puede pagar ");
        }
        try {
            System.out.println("Solicitar actualización de bono");
            cesta.ActualizarBono(100);
        } catch (Exception e) {
            System.out.println("Error al recargar");
        }
        double bactual = cesta.bonificacion();
        System.out.println("Su bono actual es " + bactual);
        
    }

}
