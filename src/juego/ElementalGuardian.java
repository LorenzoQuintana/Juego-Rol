/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ElementalGuardian extends Enemigo {

    public ElementalGuardian() {
        super.vida = 80;
        super.mana = 0;
        super.armadura = 0;
        super.dañoBasico = 25;
        super.pocionVida = 1;
        super.pocionMana = 0;

    }

    @Override  //Metodo drop unico que ofrece recompensas especificas.
    public void drop(Personaje perIn) {
        Scanner reader=new Scanner(System.in);
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Al morir, el guardian cae hecho pedazos.");
        System.out.println("Ves que el brazo con la porra de cristal está intacto y podrias usarlo como arma.");
        System.out.println("Que quieres hacer?");
        System.out.println("1. Equipar porra de cristal (45 de daño)");
        System.out.println("2. Mantener el arma actual.");
        int eleccionCristal=reader.nextInt();
        
        switch(eleccionCristal){
            case 1:
                perIn.desequiparArma();
                perIn.equiparPorraCristal();
                System.out.println("Tu ataque total es ahora: " + perIn.dañoTotal);
                enter();
                break;
                
            case 2:
                System.out.println("Mantienes tu arma actual.");
                enter();
        }
        
        System.out.println("Seguro que si añadieses algunos de estos cristales a tu medallón, aumentarias su potencia.");
        System.out.println("Que quieres hacer?");
        System.out.println("1. Equipar medallón con incrustaciones de cristal. (70 de daño)");
        System.out.println("2. Mantener el medallón actual.");
        eleccionCristal=reader.nextInt();
        
        switch(eleccionCristal){
            case 1:
                perIn.desequiparMedallon();
                perIn.equiparMCristal();
                System.out.println("Tu ataque mágico total es ahora: " + perIn.dañoMagicoTotal);
                enter();
                break;
                
            case 2:
                System.out.println("Mantienes tu medallón actual.");
                enter();
        }
    }
    public void enter(){
   Scanner scanner = new Scanner(System.in);
   scanner.nextLine();
}

}

