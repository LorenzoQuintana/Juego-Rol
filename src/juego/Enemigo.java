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
public class Enemigo {  //Clase de la que parten todas los tipos de enemigo.

    int vida;
    int mana;
    int armadura;
    int dañoBasico;
    int dañoTotal;
    int pocionVida;
    int pocionMana;
    
    //MECANICAS_______________________________________________________________________________________________________________________________

    public int recibirDaño(int recibirIn) {

        
        int dañoReal=recibirIn-armadura;
        System.out.println("El enemigo recibe " + dañoReal + " puntos de daño.");
        vida = vida - dañoReal;
        System.out.println("Le quedan " + vida + " puntos de vida.");
        return vida;

    }

    public int calcularDaño(int dañoArma) { //Utilizada en combate.
        dañoTotal = dañoBasico + dañoArma;
        return dañoTotal;
    }

    public int realizarDaño() {  //Utilizada en combate.
        return dañoTotal;
    }

    public void tomarPocionVida() { 
        if (pocionVida > 0) {
            vida = vida + 30;
            pocionVida--;
            System.out.println("El enemigo ha tomado una pocion de vida y ha recuperado 30 puntos");
            System.out.println("Ahora tiene " + vida + " puntos de vida.");
        } else {
            System.out.println("No le quedan pociones de vida.");
        }
    }

    public void tomarPocionMana() {
        if (pocionMana > 0) {
            mana = mana + 30;
            pocionMana--;
            System.out.println("El enemigo ha tomado una pocion de mana y ha recuperado 30 puntos");
            System.out.println("Ahora tiene " + mana + " puntos de mana.");
        } else {
            System.out.println("No le quedan pociones de mana.");
        }
    }
    
    public void drop(Personaje perIn){  //Sistema de botin generico. Mediante un numero aleatorio se decide si el enemigo suelta botin o no, ademas del tipo de botin.
        Scanner reader = new Scanner(System.in);
        int eleccionArma;
        int randomDrop = (int) Math.floor(Math.random() * 100);

        if (randomDrop < 30) {
            System.out.println("Has vencido a tu enemigo.");
            enter();
        } else if (randomDrop < 75 && randomDrop >= 30) {
            int dropDinero = (int) Math.floor(Math.random() * 15 + 15);
            System.out.println("");
            System.out.println("Al morir, el enemigo suelta: " + dropDinero + " Dineros.");
            perIn.dinero = perIn.dinero + dropDinero;
            System.out.println("Ahora tienes: " + perIn.dinero + " Dineros.");
            enter();
        } else if (randomDrop < 95 && randomDrop >= 75) {

            int dropPocion = (int) Math.floor(Math.random() * 2);
            switch (dropPocion) { //Otro numero aleatorio decide el tipo de poción.
                case 0:
                    System.out.println("");
                    System.out.println("Al morir, el enemigo suelta una poción de vida.");
                    perIn.pocionVida++;
                    System.out.println("Pociones de vida: " + perIn.pocionVida);
                    enter();
                    break;

                case 1:
                    System.out.println("");
                    System.out.println("Al morir, el enemigo suelta una poción de mana.");
                    perIn.pocionMana++;
                    System.out.println("Pociones de mana: " + perIn.pocionMana);
                    enter();
                    break;

            }

        } else {
            int dropArma = (int) Math.floor(Math.random() * 3); //Otro numero aleatorio decide el tipo de poción.
            switch (dropArma) {
                case 0:
                    System.out.println("Al morir, el enemigo suelta un martillo. Quieres equiparlo?");
                    System.out.println("1. Si");
                    System.out.println("2. No, mantener el arma actual.");
                    eleccionArma = reader.nextInt();
                    switch (eleccionArma) {
                        case 0:
                            perIn.desequiparArma();
                            perIn.equiparMartillo();
                            System.out.println("Tu ataque total es ahora: " + perIn.dañoTotal);
                            enter();
                            break;

                        case 1:
                            break;
                           
                    }
                    break;

                case 1:
                    System.out.println("Al morir, el enemigo suelta una maza. Quieres equiparla?");
                    System.out.println("1. Si");
                    System.out.println("2. No, mantener el arma actual.");
                    eleccionArma = reader.nextInt();
                    switch (eleccionArma) {
                        case 0:
                            perIn.desequiparArma();
                            perIn.equiparMaza();
                            System.out.println("Tu ataque total es ahora: " + perIn.dañoTotal);
                            enter();
                            break;

                        case 1:
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Al morir, el enemigo suelta una espada. Quieres equiparla?");
                    System.out.println("1. Si");
                    System.out.println("2. No, mantener el arma actual.");
                    eleccionArma = reader.nextInt();
                    switch (eleccionArma) {
                        case 0:
                            perIn.desequiparArma();
                            perIn.equiparEspada();
                            System.out.println("Tu ataque total es ahora: " + perIn.dañoTotal);
                            enter();
                            break;

                        case 1:
                            break;
                    }
                    break;

            }

        }
    }

    public void muerte() {
        System.out.println("El enemigo se ha quedado sin puntos de vida y ha muerto.");
    }
    
    public void enter(){
   Scanner scanner = new Scanner(System.in);
   scanner.nextLine();
}
    
    //GETTERS-SETTERS__________________________________________________________________________________________________________________________________

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public int getArmadura() {
        return armadura;
    }

    public int getPocionVida() {
        return pocionVida;
    }

    public void setPocionVida(int pocionVida) {
        this.pocionVida = pocionVida;
    }

    public int getPocionMana() {
        return pocionMana;
    }

    public void setPocionMana(int pocionMana) {
        this.pocionMana = pocionMana;
    }

    public int getDañoBasico() {
        return dañoBasico;
    }

    public int getDañoTotal() {
        return dañoTotal;
    }
}
