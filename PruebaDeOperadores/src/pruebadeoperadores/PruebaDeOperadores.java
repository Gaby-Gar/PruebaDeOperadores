/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebadeoperadores;

/**
 *
 * @author LENOVO
 */
public class PruebaDeOperadores {
    int x;
    int y ;
    int z;
    String Pruebaoperador;
    
    public void calcular(){
        x = 5;
        y = 2;
        z = 6;
        Pruebaoperador = "Operador= $s " + (x + y + z);
        System.out.println(Pruebaoperador);
    }
    
    public static void main(String[] args) {
       PruebaDeOperadores calcular = new PruebaDeOperadores();
       calcular.calcular();
    }
    
}
