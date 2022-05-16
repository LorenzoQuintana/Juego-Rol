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
public class Pueblo {

    Scanner reader = new Scanner(System.in);

    int eleccionPueblo, eleccionMercado, eleccionArmas, eleccionArmaduras, eleccionPociones, eleccionMonturas, eleccionMedallones, factorial;
    int rupias = 0, aventurero = 0, tula = 0;
    boolean timado = false, cuernosVendidos = false;

    Combate combatePueblo = new Combate();
    Personaje perPueblo = new Personaje();  //Se crea un personaje nuevo que será utilizado dentro de esta localización.

    //Enemigos
    Link link = new Link();
    Rata ratatula = new Rata();

    public void setPerPueblo(Personaje perIn) {  //Pasa la información del personaje principal al creado exclusivamente para esta localizacion
        perPueblo.vida = perIn.vida;
        perPueblo.mana = perIn.mana;
        perPueblo.armadura = perIn.armadura;
        perPueblo.dañoBasico = perIn.dañoBasico;
        perPueblo.dañoTotal = perIn.dañoTotal;
        perPueblo.dañoMagico = perIn.dañoMagico;
        perPueblo.dañoMagicoTotal = perIn.dañoMagicoTotal;
        perPueblo.pocionVida = perIn.pocionVida;
        perPueblo.pocionMana = perIn.pocionMana;
        perPueblo.dinero = perIn.dinero;
        perPueblo.pocion = perIn.pocion;
        perPueblo.cerveza = perIn.cerveza;
        perPueblo.cuarzoMorado = perIn.cuarzoMorado;
        perPueblo.objetoMaz2 = perIn.objetoMaz2;
        perPueblo.objetoCasa1 = perIn.objetoCasa1;
        perPueblo.mapa = perIn.mapa;
        perPueblo.montura = perIn.montura;
        perPueblo.ending = perIn.ending;

    }

    public void actualizarPer(Personaje perIn) {  //Pasa la nueva información al perosnaje principal.
        perIn.vida = perPueblo.vida;
        perIn.mana = perPueblo.mana;
        perIn.armadura = perPueblo.armadura;
        perIn.dañoBasico = perPueblo.dañoBasico;
        perIn.dañoTotal = perPueblo.dañoTotal;
        perIn.dañoMagico = perPueblo.dañoMagico;
        perIn.dañoMagicoTotal = perPueblo.dañoMagicoTotal;
        perIn.pocionVida = perPueblo.pocionVida;
        perIn.pocionMana = perPueblo.pocionMana;
        perIn.dinero = perPueblo.dinero;
        perIn.pocion = perPueblo.pocion;
        perIn.cerveza = perPueblo.cerveza;
        perIn.cuarzoMorado = perPueblo.cuarzoMorado;
        perIn.objetoMaz2 = perPueblo.objetoMaz2;
        perIn.objetoCasa1 = perPueblo.objetoCasa1;
        perIn.mapa = perPueblo.mapa;
        perIn.montura = perPueblo.montura;
        perIn.ending = perPueblo.ending;
    }

    public void getInfoPersonaje() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Información del personaje:");
        System.out.println("Puntos de vida: " + perPueblo.vida);
        System.out.println("Puntos de mana: " + perPueblo.mana);
        System.out.println("Puntos de armadura: " + perPueblo.armadura);
        System.out.println("Puntos de daño basico: " + perPueblo.dañoBasico);
        System.out.println("Puntos de daño total: " + perPueblo.dañoTotal);
        System.out.println("Puntos de daño magico: " + perPueblo.dañoMagico);
        System.out.println("Puntos de daño magico total: " + perPueblo.dañoMagicoTotal);
        System.out.println("Pociones de vida: " + perPueblo.pocionVida);
        System.out.println("Pociones de maná: " + perPueblo.pocionMana);
        System.out.println("Dineros: " + perPueblo.dinero);
        enter();
    }

    public void puertaPrincipal() {
        perPueblo.guardarPersonaje(perPueblo); //El personaje se guarda en fichero.
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Te encuentras en la puerta principal del pueblo.");
        System.out.println("");
        System.out.println("                                                           |>>>");
        System.out.println("                   _                      _                |");
        System.out.println("    ____________ .' '.    _____/----/-\\ .' './========\\   / \\");
        System.out.println("   //// ////// /V_.-._\\  |.-.-.|===| _ |-----| u    u |  /___\\");
        System.out.println("  // /// // ///==\\ u |.  || | ||===||||| |T| |   ||   | .| u |_ _ _ _ _ _");
        System.out.println(" ///////-\\////====\\==|:::::::::::::::::::::::::::::::::::|u u| U U U U U");
        System.out.println(" |----/\\u |--|++++|..|'''''''''''::::::::::::::''''''''''|+++|+-+-+-+-+-+");
        System.out.println(" |u u|u | |u ||||||..|              '::::::::'           |===|>=== _ _ ==");
        System.out.println(" |===|  |u|==|++++|==|              .::::::::.           | T |....| V |..");
        System.out.println(" |u u|u | |u ||HH||         \\|/    .::::::::::.");
        System.out.println(" |===|_.|u|_.|+HH+|_              .::::::::::::.              _");
        System.out.println("                __(_)___         .::::::::::::::.         ___(_)__");
        System.out.println("---------------/  / \\  /|       .:::::;;;:::;;:::.       |\\  / \\  \\-------");
        System.out.println("______________/_______/ |      .::::::;;:::::;;:::.      | \\_______\\________");
        System.out.println("|       |     [===  =] /|     .:::::;;;::::::;;;:::.     |\\ [==  = ]   |");
        System.out.println("|_______|_____[ = == ]/ |    .:::::;;;:::::::;;;::::.    | \\[ ===  ]___|____");
        System.out.println("     |       |[  === ] /|   .:::::;;;::::::::;;;:::::.   |\\ [=  ===] |");
        System.out.println("_____|_______|[== = =]/ |  .:::::;;;::::::::::;;;:::::.  | \\[ ==  =]_|______");
        System.out.println(" |       |    [ == = ] /| .::::::;;:::::::::::;;;::::::. |\\ [== == ]      |");
        System.out.println("_|_______|____[=  == ]/ |.::::::;;:::::::::::::;;;::::::.| \\[  === ]______|_");
        System.out.println("   |       |  [ === =] /.::::::;;::::::::::::::;;;:::::::.\\ [===  =]   |");
        System.out.println("___|_______|__[ == ==]/.::::::;;;:::::::::::::::;;;:::::::.\\[=  == ]___|_____");
        System.out.println("");

        System.out.println("");
        System.out.println("Antes de entrar, un guardia te detiene.");
        System.out.println("\"Contraseña: Cual es el factorial de 5?");
        factorial = reader.nextInt();

        if (factorial != 120) {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("\"Lo siento, no te puedo dejar entrar. Vuelve cuando lo sepas.\"");  //En caso de falalr, se volverá al cruce de caminos.
            enter();
        } else {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("El guardia te deja entrar en el pueblo.");
            enter();
            plazaCentral();
        }

    }

    public void plazaCentral() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Existen varios lugares de interes:");
        System.out.println("1. Taberna");
        System.out.println("2. Plaza del mercado.");
        System.out.println("3. Entrar en una casa sin invitación.");
        System.out.println("4. Entrar en otra casa tambien sin invitación.");
        System.out.println("5. Fábrica.");
        System.out.println("6. Salir del pueblo.");
        if (tula == 1) {
            System.out.println("7. Casa invadida por la Ratatula.");  //Destino disponible cuando se complete un requisito.
        }

        eleccionPueblo = reader.nextInt();

        switch (eleccionPueblo) {
            case 1:
                taberna();
                break;
            case 2:
                mercado();
                break;

            case 3:
                casa1();
                break;

            case 4:
                casa2();
                break;

            case 5:
                fabrica();
                break;

            case 6:
                break;

            case 7:
                casaTula();
                break;
        }
    }

    public void mercado() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Te encuentras en la plaza del pueblo. Se está celebrando un mercado.");  //Acceso a las diferentes tiendas.
        System.out.println("Tienes " + perPueblo.dinero + " Dineros para gastar.");
        System.out.println("Te fijas en varios mercaderes interesantes:");
        System.out.println("1. Hablar con el mercader de armas.");
        System.out.println("2. Hablar con el mercader de armaduras.");
        System.out.println("3. Hablar con el mercader de pociones.");
        System.out.println("4. Hablar con el mercader de monturas.");
        System.out.println("5. Hablar con el mercader de medallones mágicos.");
        System.out.println("6. Volver a la plaza central del pueblo.");

        eleccionMercado = reader.nextInt();

        switch (eleccionMercado) {

            case 1:
                mercaderArmas();
                break;

            case 2:
                mercaderArmaduras();
                break;
            case 3:
                mercaderPociones();
                break;
            case 4:
                mercaderMonturas();
                break;

            case 5:
                mercaderMedallones();
                break;

            case 6:
                plazaCentral();
                break;

        }

    }

    public void taberna() {

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Llegas a la principal taberna del pueblo.");
        System.out.println("Pides una cerveza.");
        enter();

        if (perPueblo.cerveza == 0) { //En la primera visita.
            System.out.println("El tabernero te reconoce como aventurero y te habla de una iglesia invadida por esqueletos.");
            System.out.println("Se encuentra en el monte Meteoro, un lugar que no conocias hasta ahora.");
            perPueblo.cerveza++;
            enter();
        } else {
            System.out.println("Disfrutas de la cerveza y la música mientras descansas un rato.");
            System.out.println("En una mesa al fondo ves un grupo de gente jugando a los dados, parece que tambien usan unas pequeñas figuras, pero no les haces mucho caso.");

            if (tula == 0) { //En la segunda visita.

                System.out.println("Observas a un hombre que va enseñando a todo el mundo el dibujo de una extraña rata.");
                System.out.println("Según dice, se trata de la mitica Ratatula, que ha invadido su casa.");
                tula = 1;

                enter();
            }

        }
        
        

        System.out.println("Que quieres hacer?");
        System.out.println("1. Ir al baño.");
        System.out.println("2. Marcharte.");
        int eleccionTaberna = reader.nextInt();

        //Sin importar la visita.
        switch (eleccionTaberna) {

            case 1:
                System.out.println("Entras al baño de la taberna. En la pared ves un grabado medio quemado de dos niños vestidos de marineros. ");
                System.out.println("Ante tan terrorifica visión, te acobardas y sales corriendo de la taberna.");
                enter();
                plazaCentral();
                break;

            case 2:
                System.out.println("Te terminas la cerveza y sales de la taberna.");
                enter();

                plazaCentral();
                break;
        }

    }
//No se podrá comprar sin tener el dinero suficiente.
//Las armas y armaduras compradas desequipan el arma o armadura actual y equipan el nuevo.
//Las pociones y monturas compradas modifican el atributo correspondiente directamente.

    public void mercaderArmas() {
        do {

            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Ojeas los productos del mercader.");
            System.out.println("Las armas que ofrece aumentan el daño basico del personaje.");
            System.out.println("1. Comprar martillo. (30 Dineros) (30 de daño)");
            System.out.println("2. Comprar maza. (25 Dineros) (15 de daño)");
            System.out.println("3. Comprar espada. (30 Dineros) (20 de daño)");
            System.out.println("4. Comprar daga. (15 Dineros) (15 de daño)");
            System.out.println("5. Comprar mandoble. (50 Dineros) (40 de daño)");
            System.out.println("6. Comprar palo. (3 Dineros)");
            System.out.println("7. Mejorar el arma actual. (25 Dineros) (+5 de daño)");
            System.out.println("8. Salir");
            eleccionArmas = reader.nextInt();

            switch (eleccionArmas) {
                case 1:
                    if (perPueblo.dinero >= 30) {
                        perPueblo.desequiparArma();
                        perPueblo.equiparMartillo();
                        System.out.println("Tu ataque total es ahora: " + perPueblo.dañoTotal);
                        perPueblo.dinero = perPueblo.dinero - 30;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();
                    } else {
                        System.out.println("No tienes suficiente dinero.");
                    }
                    enter();
                    break;
                case 2:
                    if (perPueblo.dinero >= 30) {
                        perPueblo.desequiparArma();
                        perPueblo.equiparMaza();
                        System.out.println("Tu ataque total es ahora: " + perPueblo.dañoTotal);
                        perPueblo.dinero = perPueblo.dinero - 25;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();
                    } else {
                        System.out.println("No tienes suficiente dinero");
                    }
                    enter();
                    break;

                case 3:
                    if (perPueblo.dinero >= 30) {
                        perPueblo.desequiparArma();
                        perPueblo.equiparEspada();
                        System.out.println("Tu ataque total es ahora: " + perPueblo.dañoTotal);
                        perPueblo.dinero = perPueblo.dinero - 25;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();
                    } else {
                        System.out.println("No tienes suficiente dinero");
                    }
                    enter();
                    break;

                case 4:
                    if (perPueblo.dinero >= 15) {
                        perPueblo.desequiparArma();
                        perPueblo.equiparDaga();
                        System.out.println("Tu ataque total es ahora: " + perPueblo.dañoTotal);
                        perPueblo.dinero = perPueblo.dinero - 15;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();
                    } else {
                        System.out.println("No tienes suficiente dinero");
                    }
                    enter();
                    break;

                case 5:
                    if (perPueblo.dinero >= 50) {
                        perPueblo.desequiparArma();
                        perPueblo.equiparMandoble();
                        System.out.println("Tu ataque total es ahora: " + perPueblo.dañoTotal);
                        perPueblo.dinero = perPueblo.dinero - 50;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();
                    } else {
                        System.out.println("No tienes suficiente dinero");
                    }
                    enter();
                    break;
                case 6:
                    if (perPueblo.dinero >= 3) {
                        perPueblo.desequiparArma();
                        perPueblo.equiparPalo();
                        System.out.println("Tu ataque total es ahora: " + perPueblo.dañoTotal);
                        perPueblo.dinero = perPueblo.dinero - 3;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                    } else {
                        System.out.println("No tienes suficiente dinero.");
                    }
                    enter();
                    break;

                case 7:
                    if (perPueblo.dinero >= 25) {
                        perPueblo.mejorarArma();
                        System.out.println("Tu ataque total es ahora: " + perPueblo.dañoTotal);
                        perPueblo.dinero = perPueblo.dinero - 25;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                    } else {
                        System.out.println("No tienes suficiente dinero.");
                    }
                    enter();
                    break;

                case 8:
                    System.out.println("Dejas el puesto.");
                    break;
            }

        } while (eleccionArmas != 8);

        mercado();
    }

    public void mercaderArmaduras() {
        do {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Ojeas los productos del mercader.");
            System.out.println("Las armaduras que ofrece reducen el daño recibido por ataques enemigos.");
            System.out.println("1. Comprar armadura de cuero. (50 Dineros) (5 de armadura)");
            System.out.println("2. Comprar armadura de acero. (90 Dineros) (10 de armadura)");
            System.out.println("3. Mejorar la armadura actual. (25 Dineros) (+5 de armadura)");
            System.out.println("4. Salir");
            if (perPueblo.pocion == 1) {  //Opciones desbloqueadas al terminar la mazmorra 2
                System.out.println("5. Usar las escamas de dragon para fabricar una armadura de cristal. (100 Dineros) (20 de armadura)");
                System.out.println("6. Vender los cuernos del dragón por 200 Dineros.");
            }
            eleccionArmaduras = reader.nextInt();

            switch (eleccionArmaduras) {
                case 1:
                    if (perPueblo.dinero >= 50) {
                        perPueblo.desequiparArmadura();
                        perPueblo.equiparCuero();
                        System.out.println("Tu indice de armadura es ahora de: " + perPueblo.armadura);
                        perPueblo.dinero = perPueblo.dinero - 50;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();
                    } else {
                        System.out.println("No tienes suficiente dinero");
                    }
                    enter();
                    break;
                case 2:
                    if (perPueblo.dinero >= 90) {
                        perPueblo.desequiparArmadura();
                        perPueblo.equiparAcero();
                        System.out.println("Tu indice de armadura es ahora de: " + perPueblo.armadura);
                        perPueblo.dinero = perPueblo.dinero - 90;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();
                    } else {
                        System.out.println("No tiene suficiente dinero");
                    }
                    enter();
                    break;

                case 3:
                    if (perPueblo.dinero >= 25) {

                        perPueblo.mejorarArmadura();
                        System.out.println("Tu indice de armadura es ahora de: " + perPueblo.armadura);
                        perPueblo.dinero = perPueblo.dinero - 25;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();
                    } else {
                        System.out.println("No tiene suficiente dinero");
                    }
                    enter();
                    break;

                case 4:
                    System.out.println("Dejas el puesto.");
                    break;

                case 5:
                    if (perPueblo.dinero >= 100) {
                        perPueblo.desequiparArmadura();
                        perPueblo.equiparCristal();
                        System.out.println("Tu indice de armadura es ahora de: " + perPueblo.armadura);
                        perPueblo.dinero = perPueblo.dinero - 100;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();
                    } else {
                        System.out.println("No tienes suficiente dinero.");
                    }
                    enter();
                    break;

                case 6:

                    if (cuernosVendidos == false) {
                        System.out.println("Los cuernos de cristal son muy apreciados. El mercadores te paga 200 Dineros por ellos.");
                        perPueblo.dinero = perPueblo.dinero + 200;
                        System.out.println("Ahora tienes: " + perPueblo.dinero + " Dineros.");
                        cuernosVendidos = true;
                        enter();
                    } else {
                        System.out.println("No te quedan cuernos de dragón. No puedes vender mas.");
                    }
                    break;
            }

        } while (eleccionArmaduras != 4);
        mercado();
    }

    public void mercaderPociones() {

        do {

            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Ojeas los productos del mercader.");
            System.out.println("Las pociones que ofrece pueden ser utilizadas en combate para reestablacer puntos de vida o mana.");
            System.out.println("1. Comprar poción de vida. (20 Dineros) (+50 de vida)");
            System.out.println("2. Comprar poción de mana. (20 Dineros) (+50 de mana)");
            System.out.println("3. Abandonar el puesto.");

            eleccionPociones = reader.nextInt();

            switch (eleccionPociones) {
                case 1:
                    if (perPueblo.dinero >= 20) {
                        System.out.println("Compras un poción de vida.");
                        perPueblo.dinero = perPueblo.dinero - 20;
                        perPueblo.pocionVida++;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();
                    } else {
                        System.out.println("No tienes suficiente dinero");
                    }
                    enter();
                    break;
                case 2:
                    if (perPueblo.dinero >= 20) {
                        System.out.println("Compras un poción de mana.");
                        perPueblo.dinero = perPueblo.dinero - 20;
                        perPueblo.pocionMana++;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();
                    } else {
                        System.out.println("No tienes suficiente dinero.");
                    }
                    enter();
                    break;
                case 3:
                    System.out.println("Dejas el puesto.");
                    break;

            }
        } while (eleccionPociones != 3);

        mercado();
    }

    public void mercaderMonturas() {

        do {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Ojeas los productos del mercader.");
            System.out.println("Las monturas que ofrece reducen la posibilidad de ser emboscado mientras viajas.");
            System.out.println("1. Comprar caballo. (50 Dineros) (1/8 posibilidades de ser emboscado)");
            System.out.println("2. Comprar pegaso.(80 Dineros) (1/10 posibilidades de ser emboscado)");
            System.out.println("3. Comprar moto lunar de tecnologia enana. (100 Dineros) (Elimina la posibilidad de ser emboscado)");
            System.out.println("4. Abandonar el puesto.");
            if (timado == true) {
                System.out.println("5. Reclamar al mercader para intentar recuperar tu dinero.");
            }
            eleccionMonturas = reader.nextInt();

            switch (eleccionMonturas) {

                case 1:
                    if (perPueblo.dinero >= 50) {
                        System.out.println("Compras un caballo.");
                        perPueblo.dinero = perPueblo.dinero - 50;
                        perPueblo.montura = 1;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();
                    } else {
                        System.out.println("No tienes suficiente dinero.");
                    }
                    enter();
                    break;

                case 2:
                    if (perPueblo.dinero >= 80) {
                        System.out.println("Compras un pegaso.");
                        perPueblo.dinero = perPueblo.dinero - 80;
                        perPueblo.montura = 2;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();
                    } else {
                        System.out.println("No tienes suficiente dinero.");
                    }
                    enter();
                    break;

                case 3:
                    if (perPueblo.dinero >= 100) {
                        System.out.println("Compras una moto lunar.");
                        perPueblo.dinero = perPueblo.dinero - 100;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();

                        System.out.println("Sin embargo, la moto esta diseñada para repartir pizzas en la luna. La gravedad de este planeta es demasiado alta e impide que funcione.");
                        System.out.println("Creo que te han timado.");
                        timado = true;
                        enter();

                    } else {
                        System.out.println("No tienes suficiente dinero.");
                    }
                    enter();
                    break;

                case 4:
                    System.out.println("Dejas el puesto.");
                    break;

                case 5:
                    System.out.println("\n------------------------------------------------------------------\n");
                    System.out.println("El mercader se niega. Te dice que todas las ventas son finales.");
                    enter();
                    System.out.println("Comienza a atender a otro cliente, asi que olvidas tus principios y le robas la bolsa mientras esta distraido.");
                    System.out.println("Ha debido guardar tu dinero en otro lugar porque solo hay 50 Dineros en la bolsa.");
                    perPueblo.dinero = perPueblo.dinero + 50;
                    System.out.println("Ahora tienes " + perPueblo.dinero + " Dineros.");
                    timado = false;
                    enter();
                    break;
            }
        } while (eleccionMonturas != 4);
        mercado();
    }

    public void mercaderMedallones() {
        do {

            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Ojeas los productos del mercader.");
            System.out.println("Los medallones que ofrece pueden usarse para realizar ataques mágicos. (Siempre que tu clase empiece con la habilidad)");
            System.out.println("1. Comprar medallón de madera.  (40 Dineros) (50 puntos de daño mágico)");
            System.out.println("2. Comprar medallón pulido. (60 Dineros) (60 puntos de daño mágico)");
            System.out.println("3. Mejorar el medallón actual. (25 Dineros) (+10 puntos de daño mágico)");
            System.out.println("4. Abandonar el puesto.");

            eleccionMedallones = reader.nextInt();

            switch (eleccionMedallones) {
                case 1:
                    if (perPueblo.dinero >= 40) {
                        System.out.println("Compras un medallón de madera.");
                        perPueblo.dinero = perPueblo.dinero - 40;
                        perPueblo.desequiparMedallon();
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();
                    } else {
                        System.out.println("No tienes suficiente dinero");
                    }
                    enter();
                    break;
                case 2:
                    if (perPueblo.dinero >= 60) {
                        System.out.println("Compras un medallón pulido.");
                        perPueblo.dinero = perPueblo.dinero - 60;
                        perPueblo.pocionMana++;
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();
                    } else {
                        System.out.println("No tienes suficiente dinero.");
                    }
                    enter();
                    break;

                case 3:
                    if (perPueblo.dinero >= 25) {
                        System.out.println("Mejoras tu medallón actual.");
                        perPueblo.dinero = perPueblo.dinero - 25;
                        perPueblo.mejorarMedallon();
                        System.out.println("Te quedan: " + perPueblo.dinero + " Dineros.");
                        enter();
                    } else {
                        System.out.println("No tienes suficiente dinero.");
                    }
                    enter();
                    break;

                case 4:
                    System.out.println("Dejas el puesto.");
                    break;

            }
        } while (eleccionMedallones != 4);

        mercado();
    }

    public void enter() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public void casa1() {  //Diferentes estados según la visita.
        if (rupias == 0) {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Entras en la casa de alguien que no conoces y tus instintos de aventurero te obligan a romper cada uno de los jarrones que ves.");
            System.out.println("En el interior de uno de ellos encuentras 200 rupias.");
            enter();

            System.out.println("Pero en este juego se usan los Dineros, asi que no te sirven para nada.");
            enter();
            System.out.println("Decepcionado, sales de la casa.");
            System.out.println("La familia que se encontraba comiendo en la sala principal de la casa aun sigue en shock sin poder explicarse que es lo que ha pasado.");
            enter();
            rupias = 1;
        } else if (rupias == 1) {

            if (aventurero == 0) {
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("Vuelves a entrar en la casa de los jarrones. A parte de los restos de ceramica en el suelo tambien te encuentras con otro aventurero como tu.");
                System.out.println("No dice nada pero parece realmente enfadado porque alguien encontrara esos jarrones antes que él.");
                enter();
                System.out.println("");
                System.out.println("              _______");
                System.out.println("         ..-'`       ````---.");
                System.out.println("       .'          ___ .'````.'SS'.");
                System.out.println("      /        ..-SS####'.  /SSHH##'.");
                System.out.println("     |       .'SSSHHHH##|/#/#HH#H####'.");
                System.out.println("    /      .'SSHHHHH####/||#/: \\SHH#####\\");
                System.out.println("   /      /SSHHHHH#####/!||;`___|SSHH###\\");
                System.out.println("-..__    /SSSHHH######.         \\SSSHH###\\");
                System.out.println("`.'-.''--._SHHH#####.'           '.SH####/");
                System.out.println("  '. ``'-  '/SH####`/_             `|H##/");
                System.out.println("  | '.     /SSHH###|`'==.       .=='/\\H|");
                System.out.println("  |   `'-.|SHHHH##/\\__\\/        /\\//|~|/");
                System.out.println("  |    |S#|/HHH##/             |``  |");
                System.out.println("  |    \\H' |H#.'`              \\    |");
                System.out.println("  |        ''`|               -     /");
                System.out.println("  |          /H\\          .----    /");
                System.out.println("  |         |H#/'.           `    /");
                System.out.println(" |          \\| | '..            /");
                System.out.println("  |    ^~DLF   /|    ''..______.'");
                System.out.println("   \\          //\\__    _..-. | ");
                System.out.println("    \\         ||   ````     \\ |_");
                System.out.println("     \\    _.-|               \\| |_");
                System.out.println("     _\\_.-'   `'''''-.        |   `--.");
                System.out.println(" ''``    \\            `''-;    \\ /");
                System.out.println("         \\      .-'|     ````.' -");
                System.out.println("          |    .'  `--'''''-.. |/");
                System.out.println("          |  .'               \\|");
                System.out.println("          |.'");
                System.out.println("");
                System.out.println("");
                System.out.println("Saca su espada y escudo, esta claro que quiere venganza.");

                combatePueblo.Combatir(perPueblo, link);
                if (perPueblo.escapar == true) {
                    plazaCentral();
                }
                aventurero = 1;
            } else {
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("Entras de nuevo en la casa, pero solo encuentras ceramica rota y una familia atemorizada.");
                System.out.println("Lo mejor seria marcharse de aqui.");
            }
        }
        plazaCentral();
    }

    public void casa2() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Entras en la casa de alguien que no conoces y tus instintos de aventurero te obligan a romper cada uno de los jarrones que ves.");
        System.out.println("Sin embargo, el dueño te detiene y te suplica que no destruyas sus humildes posesiones.");
        System.out.println("Para que te marches de alli, te soborna con una llave. Al parecer, el hombre solia ser guardia en el castillo y la usaba para poder entrar por la puerta lateral.");
        perPueblo.objetoCasa1 = 1;
        plazaCentral();
    }

    public void casaTula() {
        System.out.println("\n------------------------------------------------------------------\n");

        if (tula == 1) {
            System.out.println("Entras en la casa abandonada. Tus ojos aun no se han acostumbrado a la oscuridad cuando de una puerta sale lo que parece una enorme... rata.");
            System.out.println(" \" https://pbs.twimg.com/media/EuaFNAdXYAEceo2.jpg\" Gruñe la rata antes de lanzarse al ataque.");

            System.out.println("");
            System.out.println("         __             _,-\"~^\"-.");
            System.out.println("       _// )      _,-\"~`         `.");
            System.out.println("     .\" ( /`\"-,-\"`                 ;");
            System.out.println("    / 6                             ;");
            System.out.println("   /           ,             ,-\"     ;");
            System.out.println("  (,__.--.      \\           /        ;");
            System.out.println("   //'   /`-.\\   |          |        `._________");
            System.out.println("     _.-'_/`  )  )--...,,,___\\     \\-----------,)");
            System.out.println("   (((\"~` _.-'.-'           __`-.   )         //");
            System.out.println("         (((\"`             (((---~\"`         //");
            System.out.println("                                            ((________________");
            System.out.println("                                            `----\"\"\"\"~~~~^^^```");
            System.out.println("");
            enter();
            combatePueblo.Combatir(perPueblo, ratatula);
            if (perPueblo.escapar == true) {
                plazaCentral();
            }
            System.out.println("Con la legendaria Ratatula derrotada, exploras la casa.");
            System.out.println("Te encuentras una rara armadura rúnica sobre un maniquí, sería un justo pago por devolverle la casa a ese hombre.");
            System.out.println("Que quieres hacer?");
            System.out.println("1. Quedarte con la armadura y equipartela. (30 de armadura)");
            System.out.println("2. Dejarla donde está. No necesitas recompensa.");
            int runica = reader.nextInt();

            switch (runica) {
                case 1:
                    perPueblo.desequiparArmadura();
                    perPueblo.equiparRunica();
                    System.out.println("Ahora tienes " + perPueblo.armadura + " puntos de armadura.");
                    enter();

                    System.out.println("Te marchas de la casa.");
                    enter();
                    break;

                case 2:
                    System.out.println("Antes de que puedas marcharte de la casa, el dueño aparece.");
                    System.out.println("Te da la gracias por lo que has hecho y te recompensa con 100 Dineros.");
                    enter();
                    break;
            }

            tula = 2;

            plazaCentral();
        }
    }

    public void fabrica() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Llegas a una fabrica a las afueras del pueblo.");
        System.out.println("En la puerta hay un gran revuelo. Parece que los trabajadores se están peleando ya que tienen opiniones encontradas en cuanto al objetivo de la fábrica.");
        enter();
        System.out.println("Un grupo dice que se dedican a fabricar puertas.");
        System.out.println("El otro mantiene que siempre han sido una fabrica de ruedas.");
        enter();
        System.out.println("Solo un trabajador se mantiene al margen de ambos grupos. Por mucho que grite que son una fabrica de puertas con ruedas, nadie le hace caso.");
        enter();
        System.out.println("Decides marcharte.");
        enter();
        plazaCentral();
    }

}
