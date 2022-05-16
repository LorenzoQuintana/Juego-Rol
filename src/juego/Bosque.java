/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Bosque {

    Scanner reader = new Scanner(System.in);
    Combate combateBosque = new Combate();
    Personaje perBosque = new Personaje(); //Se crea un personaje nuevo que será utilizado dentro de esta localización.
    //Enemigos
    Pirata pirataBosque = new Pirata();
    int seleccionDuelo;

    public void setPerBosque(Personaje perIn) {            //Pasa la información del personaje principal al creado exclusivamente para esta localizacion
        perBosque.vida = perIn.vida;
        perBosque.mana = perIn.mana;
        perBosque.armadura = perIn.armadura;
        perBosque.dañoBasico = perIn.dañoBasico;
        perBosque.dañoTotal = perIn.dañoTotal;
        perBosque.dañoMagico = perIn.dañoMagico;
        perBosque.dañoMagicoTotal = perIn.dañoMagicoTotal;
        perBosque.pocionVida = perIn.pocionVida;
        perBosque.pocionMana = perIn.pocionMana;
        perBosque.dinero = perIn.dinero;
        perBosque.pocion = perIn.pocion;
        perBosque.cerveza = perIn.cerveza;
        perBosque.cuarzoMorado = perIn.cuarzoMorado;
        perBosque.objetoMaz2 = perIn.objetoMaz2;
        perBosque.objetoCasa1 = perIn.objetoCasa1;
        perBosque.mapa = perIn.mapa;
        perBosque.montura = perIn.montura;
        perBosque.ending = perIn.ending;

    }

    public void actualizarPer(Personaje perIn) {  //Pasa la nueva información al perosnaje principal.
        perIn.vida = perBosque.vida;
        perIn.mana = perBosque.mana;
        perIn.armadura = perBosque.armadura;
        perIn.dañoBasico = perBosque.dañoBasico;
        perIn.dañoTotal = perBosque.dañoTotal;
        perIn.dañoMagico = perBosque.dañoMagico;
        perIn.dañoMagicoTotal = perBosque.dañoMagicoTotal;
        perIn.pocionVida = perBosque.pocionVida;
        perIn.pocionMana = perBosque.pocionMana;
        perIn.dinero = perBosque.dinero;
        perIn.pocion = perBosque.pocion;
        perIn.cerveza = perBosque.cerveza;
        perIn.cuarzoMorado = perBosque.cuarzoMorado;
        perIn.objetoMaz2 = perBosque.objetoMaz2;
        perIn.objetoCasa1 = perBosque.objetoCasa1;
        perIn.mapa = perBosque.mapa;
        perIn.montura = perBosque.montura;
        perIn.ending = perBosque.ending;
    }

    public void getInfoPersonaje() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Información del personaje:");
        System.out.println("Puntos de vida: " + perBosque.vida);
        System.out.println("Puntos de mana: " + perBosque.mana);
        System.out.println("Puntos de armadura: " + perBosque.armadura);
        System.out.println("Puntos de daño basico: " + perBosque.dañoBasico);
        System.out.println("Puntos de daño total: " + perBosque.dañoTotal);
        System.out.println("Puntos de daño magico: " + perBosque.dañoMagico);
        System.out.println("Puntos de daño magico total: " + perBosque.dañoMagicoTotal);
        System.out.println("Pociones de vida: " + perBosque.pocionVida);
        System.out.println("Pociones de maná: " + perBosque.pocionMana);
        System.out.println("Dineros: " + perBosque.dinero);
    }

    public void enter() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public void cartelEntrada() {

        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⢀⣼⣦⠀⠀⣠⣿⣿⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣆⠀⠀⠀");
        System.out.println("⠀⠀⠒⣿⣿⣿⠓⠀⠀⠻⣿⣿⠀⢀⣴⣿⣦⡀⠀⢀⣾⣦⠘⢿⣿⣧⡀");
        System.out.println("⠀⢀⣴⣿⡿⠃⡄⠈⠻⣿⣟⣉⣀⠉⣽⡿⠋⠡⠴⣿⣿⣿⠓⠀⠙⢇⠀⠀");
        System.out.println("⠀⠿⣿⠟⢁⣾⣿⣦⣀⠘⠿⠟⢁⣼⣿⣿⣷⠂⣴⣿⣿⣿⣆⠘⢶⣶⣿⠶⠤⠀");
        System.out.println("⠀⣀⣀⡀⢉⣿⣿⣿⡍⠀⢀⣀⠙⢻⠿⢋⣤⣾⣿⣿⣿⣿⣿⣷⣄⠙⢿⣦⡀⠀");
        System.out.println("⠀⠟⠋⣠⣾⣿⣿⣿⣿⣦⣌⠉⠠⣤⣤⣤⡌⢙⣿⣿⣿⣿⣿⣿⠛⠛⠂⢈⣙⠀");
        System.out.println("⠀⠀⣉⡉⣹⣿⣿⣿⣿⣏⠉⣉⣀⣈⠙⠋⣠⣿⣿⣿⣿⣿⣿⣿⣆⠙⠛⠛⠛⠀");
        System.out.println("⠀⠀⠋⣴⣿⣿⣿⣿⣿⣿⣷⣌⠉⢁⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀");
        System.out.println("⠀⠴⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠦⠈⣙⠛⠛⠛⠛⠛⠛⠛⠛⣉⣉⠁⠀");
        System.out.println("⠀⠀⣦⣤⡄⢉⣉⣉⣉⠉⣡⣤⠀⠀⠀⣿⣿⣷⠀⢰⣿⣿⡇⢸⣿⣿⠀⠀⠀");
        System.out.println("⠀⠀⣿⣿⡇⣸⣿⣿⣿⡄⢻⣿⠀⠀⠀⣿⣿⣿⠀⢸⣿⣿⡇⢸⣿⣿⠀⠀⠀");
        System.out.println("⠀⠀⣿⣿⠁⣿⣿⣿⣿⡇⠸⠿⠀⠀⠀⣿⣿⣿⠀⢸⣿⣿⣇⠸⣿⣿⠀⠀⠀");
        System.out.println("⠀⠀⠛⠛⠀⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠉⠉⠉⠀⢸⣿⣿⣿⠀⠿⠿⠀⠀⠀⠀");

        if (perBosque.pocion == 1) {  //Se logra el acceso con la poción recibida en la mazmorra 2
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Encuentras un cartel que dice: Bosque de la amnesia.");
            System.out.println("Haces uso de tu poción anti-hechizos y consigues entrar en el bosque de la amnesia.");
            enter();
            claroBosque();
        } else {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Encuentras un cartel que dice: Bosque de la amnesia.");
            System.out.println("Intentas seguir avanzando pero se te empieza a nublar la vista y dejas de saber hacia donde estas andando.");
            enter();
        }
    }

    public void claroBosque() {  //Dos estados, dependiendo de si el jefe ha sido vencido o no.
        perBosque.guardarPersonaje(perBosque);

        if (perBosque.objetoMaz2 == 1) {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Llegas al claro del bosque. La losa de piedra donde se encontraba el extraño esta vacia.");
            System.out.println("No parece que puedas hacer mucho mas por aqui.");
            System.out.println("Decides salir del bosque.");
            enter();

        } else {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Te encuentras en un claro del bosque. Puedes ver a un extraño personaje sentado sobre una gastada losa de piedra.");
            System.out.println("");
            System.out.println("                   ,-~'`,");
            System.out.println("                  ( _.-'.\\");
            System.out.println("                   Y . .:`");
            System.out.println("                    \\ - /");
            System.out.println("                    ,`-'.");
            System.out.println("                 ,:'|  : ;.");
            System.out.println("               ,' | :  / | \\");
            System.out.println("              / ,'|  `'  | :");
            System.out.println("              \\ \\ :______; :");
            System.out.println("               `.`| .  . |,/");
            System.out.println("                 `;)'  ' :'   ");
            System.out.println("                  |  ,.  | ");
            System.out.println("                  | :  : | ");
            System.out.println("                  |_|  |_|  ");
            System.out.println("                  | |  | |   ");
            System.out.println("                  |_|  |_| ");
            System.out.println("                ,'__|  |__`.");
            System.out.println("");

            System.out.println("Cuando te acercas, te insulta: \"¡No hay palabras para describir lo asqueroso que eres!\"  ");
            enter();
            System.out.println("Que quieres hacer?");
            System.out.println("1. Insultarle tu a él, comenzando un duelo de insultos.");  //Se puede completar de ambas formas.
            System.out.println("2. Atacarle directamente.");
            System.out.println("3. Huir ante tan formidable oponente.");
            seleccionDuelo = reader.nextInt();

            switch (seleccionDuelo) {
                case 1:
                    combateBosque.insultar(perBosque);
                    break;
                case 2:
                    combateBosque.Combatir(perBosque, pirataBosque);
                    if (perBosque.escapar == true) {
                        huida();
                        break;
                    }
                    break;
                case 3:
                    huida();
                    break;

            }

        }

    }

    public void huida() {
        System.out.println("Acobardado, tambien huyes del bosque.");
        enter();
    }
}
