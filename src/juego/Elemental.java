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
public class Elemental extends Enemigo {

    public Elemental() {            //Subclase de enemigo con botín normal.
        super.vida = 70;
        super.mana = 0;
        super.armadura = 5;
        super.dañoBasico = 15;
        super.pocionVida = 0;
        super.pocionMana = 0;

    }

    
    

}
