/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author Lorenzo
 */
public class Guardia extends Enemigo {
    public Guardia() {                     //Subclase de enemigo con botín normal.
        super.vida = 50;
        super.mana = 0;
        super.armadura = 5;
        super.dañoBasico = 20;
        super.pocionVida = 1;
        super.pocionMana = 0;

    }
}
