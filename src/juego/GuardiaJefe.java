/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author Lorenzo
 */
public class GuardiaJefe extends Enemigo {
    public GuardiaJefe() {                   //Subclase de enemigo con botín normal.
        super.vida = 100;
        super.mana = 0;
        super.armadura = 10;
        super.dañoBasico = 25;
        super.pocionVida = 1;
        super.pocionMana = 0;

    }
}