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
public class Combate {

    Scanner reader = new Scanner(System.in);

    public void Combatir(Personaje perIn, Enemigo eneIn) { //El metodo necesita parametros: el objeto personaje de la localización en la que estemos y un objeto enemigo.

        perIn.escapar = false;
        int eleccionPocion;
        while (perIn.vida > 0 && eneIn.vida > 0 && perIn.escapar == false) {

            System.out.println("Opciones:");
            System.out.println("1. Ataque físico."); //Realizará tantos puntos como dañoTotal se tenga.
            System.out.println("2. Ataque mágico."); //Realizara tantos puntos como dañoMagico Total se tenga. Necesita mana.
            System.out.println("3. Beber pocion");
            System.out.println("4. Ver información del personaje");
            System.out.println("5. Huir");           

            int eleccion = reader.nextInt();

            switch (eleccion) {
                case 1:  

                    eneIn.recibirDaño(perIn.realizarDaño()); //El metodo recibir daño necesita un daño. Usa un return.
                    enter();
                    if (eneIn.getVida() <= 0) {   //Si el enemigo se queda sin vida por el ataque, el combate termina.
                        break;
                    }
                    if (eneIn.vida < 30 && eneIn.pocionVida > 0) {  //Si tiene pociones, el enemigo puede usarlas al tener poca vida.
                        eneIn.tomarPocionVida();
                        enter();
                    } else {
                        perIn.recibirDaño(eneIn.getDañoBasico());  //Si no usa poción, el enemigo usa su turno en atacar.
                        enter();
                    }
                    break;

                case 2:

                    if (perIn.mana >= 30) {
                        eneIn.recibirDaño(perIn.realizarDañoMagico());  //Metodo identico pero usando DañoMagicoTotal como parametro.
                        perIn.mana = perIn.mana - 30;
                        enter();
                        if (eneIn.getVida() <= 0) {
                            break;
                        }
                        if (eneIn.vida < 30 && eneIn.pocionVida > 0) {
                            eneIn.tomarPocionVida();
                            enter();
                        } else {
                            perIn.recibirDaño(eneIn.getDañoBasico());
                            enter();
                        }
                        break;
                    } else {
                        System.out.println("Tienes menos de 50 puntos de mana. No puedes realizar un ataque magico."); //En caso de no tener suficiente mana.
                        break;
                    }

                case 3:

                    System.out.println("1.Poción de Vida");
                    System.out.println("2. Poción de Mana");

                    eleccionPocion = reader.nextInt();

                    switch (eleccionPocion) {      //Se gasta un turno en usar pocion, igual que si se atacase.
                        case 1:
                            perIn.tomarPocionVida();
                            enter();
                            perIn.recibirDaño(eneIn.getDañoBasico());
                            enter();
                            break;

                        case 2:
                            perIn.tomarPocionMana();
                            enter();
                            perIn.recibirDaño(eneIn.getDañoBasico());
                            enter();
                            break;

                    }
                    break;

                case 4:
                    perIn.getInfoPersonaje();
                    enter();
                    break;

                case 5:
                    perIn.vida = perIn.vida - 10;   //Huir tiene una penalizacion. Despues de usar el metodo combatir se especifica a donde se huye en cada situacion especifica.
                    perIn.escapar();
                    enter();
                    break;

            }
        }

        if (eneIn.vida <= 0) {   //Si el enemigo es vencido, se activa el metodo drop.
            eneIn.drop(perIn);

        } else if (perIn.vida <= 0) {  //En caso de que el jugador sea vencido, el juego termina.
            perIn.muerte();
            System.exit(0);
        }

    }

    public void enter() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public void insultar(Personaje perIn) {   //Metodo de combate unico para la mazmorra del bosque. Se puede utilizar en lugar del combate comun.
        Pirata pirata = new Pirata();
        Bosque bosque = new Bosque();
        int puntos = 0;
        int respuesta;
        System.out.println("Elige tu respuesta:");
        System.out.println("1. Sí que las hay, sólo que nunca las has aprendido.");
        System.out.println("2. Qué apropiado, tú peleas como una vaca.");
        System.out.println("3. Ya te están fastidiando otra vez las almorranas, ¿Eh?");
        respuesta = reader.nextInt();
        switch (respuesta) {
            case 1:
                puntos++;
                break;
            case 2:
                break;
            case 3:
                break;
        }
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("El extraño te dice: \" ¡No pienso aguantar tu insolencia aquí sentado!\" ");
        System.out.println("Elige tu respuesta:");
        System.out.println("1. Me haces pensar que alguien ya lo ha hecho.");
        System.out.println("2. Sólo he conocido a uno tan cobarde como tú.");
        System.out.println("3. Ya te están fastidiando otra vez las almorranas, ¿Eh?");
        respuesta = reader.nextInt();
        switch (respuesta) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                puntos++;
                break;
        }

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("El extraño te dice: \" ¡Tienes los modales de un mendigo!\" ");
        System.out.println("Elige tu respuesta:");
        System.out.println("1. Me alegra que asistieras a tu reunión familiar diaria.");
        System.out.println("2. Quería asegurarme de que estuvieras a gusto conmigo.");
        System.out.println("3. Cada palabra que sale de tu boca es una estupidez.");
        respuesta = reader.nextInt();
        switch (respuesta) {
            case 1:

                break;
            case 2:
                puntos++;
                break;
            case 3:
                break;
        }

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("El extraño te dice: \" Si tu hermano es como tú, mejor casarse con un cerdo.\" ");
        System.out.println("Elige tu respuesta:");
        System.out.println("1. Me haces pensar que alguien ya lo ha hecho.");
        System.out.println("2. Yo soy cola, tu pegamento!");
        System.out.println("3. Espero que ya hayas aprendido a no tocarte la nariz.");
        respuesta = reader.nextInt();
        switch (respuesta) {
            case 1:
                puntos++;
                break;
            case 2:

                break;
            case 3:
                break;
        }

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("El extraño te dice: \" ¡Demasiado bobo para mi nivel de inteligencia! \" ");
        System.out.println("Elige tu respuesta:");
        System.out.println("1. Sólo he conocido a uno tan cobarde como tú.");
        System.out.println("2. Y yo tengo un SALUDO para ti, ¿Te enteras?");
        System.out.println("3. Estaría acabado si la usases alguna vez.");
        respuesta = reader.nextInt();
        switch (respuesta) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                puntos++;
                break;
        }

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("El extraño te dice: \" Mis enemigos más sabios corren al verme llegar \" ");
        System.out.println("Elige tu respuesta:");
        System.out.println("1. Espero que ya hayas aprendido a no tocarte la nariz.");
        System.out.println("2. ¿Incluso antes de que huelan tu aliento?");
        System.out.println("3. ¡Una vez tuve un perro más listo que tu!");
        respuesta = reader.nextInt();
        switch (respuesta) {
            case 1:

                break;
            case 2:
                puntos++;
                break;
            case 3:

                break;
        }

        if (puntos >= 4) {  //En cas ode conseguir 4 o mas respuestas correctas.
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("El extraño se queda sorprendido con tu habilidad.");
            System.out.println("Agradecido por poder haber practicado sus dotes para el duelo, te regala su colgante.");
            System.out.println("Te explica que tiene propiedades magicas y a partir de ahora estarás protegido contra el daño por fuego.");
            perIn.objetoMaz2 = 1; //Dara acceso al castillo.
            enter();
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Te despides del extraño de cabello rubio y camisa blanca y te decides a salir del bosque.");
            enter();
            System.out.println("Cuando estás a punto de salir del claro algo te golpea en la cabeza provocando 1 punto de daño.");
            perIn.vida = perIn.vida - 1;
            System.out.println("Te giras y ves que, detrás de ti, hay un mono de tres cabezas subido a una rama.");
            enter();
            System.out.println("                     ____     ____");
            System.out.println("                   ,'    `. ,'    `.    ____");
            System.out.println("                 _/ ,----._/ ,----. \\ ,'    `.");
            System.out.println("                (.|( o  o(.|( o  o )_/ ,----. \\_");
            System.out.println("                  : > '' < : > '' <(.|( o  o )|.)");
            System.out.println("                   \\ ==== / \\ {__} / : > '' < ;");
            System.out.println("                    `.__,'`--`.__,'   \\  (_) /");
            System.out.println("                   ,-'            `--..>.___/");
            System.out.println("                  /                         `.");
            System.out.println("");
            System.out.println("El objeto que te habia tirado es una pequeña bolsa llena de Dineros. La guardas y te marchas.");
            perIn.dinero = perIn.dinero + 100;
            enter();
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Ahora tienes " + perIn.dinero + " Dineros.");

        } else {  //en caso de fallar el duelo se realizará un combate comun.
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("El extraño se queda sorprendido con tu lamentable habilidad.");
            System.out.println(" \"Si no puedo practicar mi habilidad para el insulto, practicaré la de la espada\"");
            System.out.println("Parece que quiere un combate mas tradicional.");
            enter();
            Combatir(perIn, pirata);
            if (perIn.escapar == true) {
                bosque.huida();
            }

        }

    }

}
