/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author Lorenzo
 */
public class Rata extends Enemigo {

    public Rata() {               //Subclase de enemigo con botín normal.
        super.vida = 100;
        super.mana = 0;
        super.armadura = 0;
        super.dañoBasico = 35;
        super.pocionVida = 0;
        super.pocionMana = 0;
    }
    }