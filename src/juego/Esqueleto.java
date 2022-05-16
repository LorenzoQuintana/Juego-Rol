/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

import java.util.Scanner;
import juego.Enemigo;

/**
 *
 * @author Lorenzo
 */
public class Esqueleto extends Enemigo {

    public Esqueleto() {                  //Subclase de enemigo con botín normal.
        super.vida = 50; 
        super.mana = 0;
        super.armadura = 0;
        super.dañoBasico = 20;
        super.pocionVida = 0;
        super.pocionMana = 0;

    }

   

}
