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
public class BandidoJefe extends Enemigo {

    public BandidoJefe() {
        super.vida = 120;
        super.mana = 0;
        super.armadura = 0;
        super.dañoBasico = 35;
        super.pocionVida = 2;
        super.pocionMana = 0;

    }

    @Override  //Metodo drop unico que ofrece recompensas especificas.
    public void drop(Personaje perIn) {
        Scanner reader = new Scanner(System.in);
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Despues de que el jefe Bandido muera, registras su tienda.");
        System.out.println("Descubres un cofre con 1000 Dineros. Una recompensa digna de tan asombrosa azaña.");
        enter();
        perIn.dinero = perIn.dinero + 1000;
        System.out.println("Ahora tienes " + perIn.dinero + " Dineros.");
        enter();
        perIn.mapa = 2;
    }

    public void enter() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

}
