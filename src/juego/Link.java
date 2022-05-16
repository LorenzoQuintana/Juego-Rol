/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author Lorenzo
 */
public class Link extends Enemigo {
    public Link() {                      //Subclase de enemigo con botín normal.
        super.vida = 80;
        super.mana = 0;
        super.armadura = 10;
        super.dañoBasico = 30;
        super.pocionVida = 2;
        super.pocionMana = 0;

    }
}
