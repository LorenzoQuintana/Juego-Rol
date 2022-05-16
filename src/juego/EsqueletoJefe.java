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
public class EsqueletoJefe extends Enemigo {

    public EsqueletoJefe() {              //Subclase de enemigo con botín normal.
        super.vida = 60;
        super.mana = 0;
        super.armadura = 0;
        super.dañoBasico = 15;
        super.pocionVida = 1;
        super.pocionMana = 0;

    }

   

}
