/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Bandido extends Enemigo {
    
public Bandido() {                  //Subclase de enemigo con botín normal.
        super.vida = 50;
        super.mana = 0;
        super.armadura = 5;
        super.dañoBasico = 20;
        super.pocionVida = 0;
        super.pocionMana = 0;

    }
}

