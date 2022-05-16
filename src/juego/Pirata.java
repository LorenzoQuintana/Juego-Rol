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
public class Pirata extends Enemigo {

    public Pirata() {                 
        super.vida = 100;
        super.mana = 0;
        super.armadura = 0;
        super.dañoBasico = 40;
        super.pocionVida = 2;
        super.pocionMana = 0;

    }

    @Override                        //metodo drop unico. Solo aparecerá en el caso de entrar en combate con el personaje.
    public void drop(Personaje perIn) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Derrotas al extraño pero antes de darle el golpe final se rinde y te pide que no lo hagas.");
        System.out.println("A cambio de su vida te ofrece sus colgantes. Al parecer, el primero tiene propiedades magicas y con él estarás protegido contra el daño por fuego.");
        perIn.objetoMaz2=1; //Permitirá acceso al casstillo.
        enter();
        System.out.println("El segundo es un medallón rúnico de ataque.");
        System.out.println("Que quieres hacer?");
        System.out.println("1. Equipar medallón rúnico. (80 de daño)");
        System.out.println("2. Mantener el medallón actual.");
        int eleccionMedallon = reader.nextInt();

        switch (eleccionMedallon) {
            case 1:
                perIn.desequiparMedallon();
                perIn.equiparMRunico();
                System.out.println("Tu ataque mágico total es ahora: " + perIn.dañoMagicoTotal);
                enter();
                break;

            case 2:
                System.out.println("Mantienes tu medallón actual.");
                enter();
        }

        System.out.println("Aceptas la oferta y le dejas marchar.");
        System.out.println("El extraño sale corriendo hacia los arboles mientras grita: \"Tu eres cola, yo pegamento!\"");
        perIn.objetoMaz2 = perIn.objetoMaz2 + 1;
        enter();

    }
}
