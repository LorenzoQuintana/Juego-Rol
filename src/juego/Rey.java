/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author Lorenzo
 */
public class Rey extends Enemigo{
    
    
    public Rey() {                   //Subclase de enemigo con botín normal.
        super.vida = 150;
        super.mana = 0;
        super.armadura = 20;
        super.dañoBasico = 45;
        super.pocionVida = 2;
        super.pocionMana = 0;

    }
}
