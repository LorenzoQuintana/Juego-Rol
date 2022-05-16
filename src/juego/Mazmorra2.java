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
public class Mazmorra2 {

    Scanner reader = new Scanner(System.in);
    int maz2Completa = 0;

    Combate combateMaz2 = new Combate();
    Personaje perMaz2 = new Personaje();  //Se crea un personaje nuevo que será utilizado dentro de esta localización.
   
    //Enemigos
    Elemental ele1 = new Elemental();
    Elemental ele2 = new Elemental();
    Elemental ele3 = new Elemental();
    ElementalGuardian guardian1 = new ElementalGuardian();
    DragonCristal dragon = new DragonCristal();

    public void setPerMaz2(Personaje perIn) {  //Pasa la información del personaje principal al creado exclusivamente para esta localizacion
        perMaz2.vida = perIn.vida;
        perMaz2.mana = perIn.mana;
        perMaz2.armadura = perIn.armadura;
        perMaz2.dañoBasico = perIn.dañoBasico;
        perMaz2.dañoTotal = perIn.dañoTotal;
        perMaz2.dañoMagico = perIn.dañoMagico;
        perMaz2.dañoMagicoTotal = perIn.dañoMagicoTotal;
        perMaz2.pocionVida = perIn.pocionVida;
        perMaz2.pocionMana = perIn.pocionMana;
        perMaz2.dinero = perIn.dinero;
        perMaz2.pocion = perIn.pocion;
        perMaz2.cerveza = perIn.cerveza;
        perMaz2.cuarzoMorado = perIn.cuarzoMorado;
        perMaz2.objetoMaz2 = perIn.objetoMaz2;
        perMaz2.objetoCasa1 = perIn.objetoCasa1;
        perMaz2.mapa = perIn.mapa;
        perMaz2.montura = perIn.montura;
        perMaz2.ending = perIn.ending;

    }

    public void actualizarPer(Personaje perIn) {  //Pasa la nueva información al personaje principal.
        perIn.vida = perMaz2.vida;
        perIn.mana = perMaz2.mana;
        perIn.armadura = perMaz2.armadura;
        perIn.dañoBasico = perMaz2.dañoBasico;
        perIn.dañoTotal = perMaz2.dañoTotal;
        perIn.dañoMagico = perMaz2.dañoMagico;
        perIn.dañoMagicoTotal = perMaz2.dañoMagicoTotal;
        perIn.pocionVida = perMaz2.pocionVida;
        perIn.pocionMana = perMaz2.pocionMana;
        perIn.dinero = perMaz2.dinero;
        perIn.pocion = perMaz2.pocion;
        perIn.cerveza = perMaz2.cerveza;
        perIn.cuarzoMorado = perMaz2.cuarzoMorado;
        perIn.objetoMaz2 = perMaz2.objetoMaz2;
        perIn.objetoCasa1 = perMaz2.objetoCasa1;
        perIn.mapa = perMaz2.mapa;
        perIn.montura = perMaz2.montura;
        perIn.ending = perMaz2.ending;
    }

    public void getInfoPersonaje() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Información del personaje:");
        System.out.println("Puntos de vida: " + perMaz2.vida);
        System.out.println("Puntos de mana: " + perMaz2.mana);
        System.out.println("Puntos de armadura: " + perMaz2.armadura);
        System.out.println("Puntos de daño basico: " + perMaz2.dañoBasico);
        System.out.println("Puntos de daño total: " + perMaz2.dañoTotal);
        System.out.println("Puntos de daño magico: " + perMaz2.dañoMagico);
        System.out.println("Puntos de daño magico total: " + perMaz2.dañoMagicoTotal);
        System.out.println("Pociones de vida: " + perMaz2.pocionVida);
        System.out.println("Pociones de maná: " + perMaz2.pocionMana);
        System.out.println("Dineros: " + perMaz2.dinero);
        enter();
    }

    //en esta mazmorra, las estancias van pasando una detras de otra, no hay opcion de elegir el camino.
    public void puertaPrincipal() {
        perMaz2.guardarPersonaje(perMaz2);  //El personaje se guarda en fichero.

        System.out.println("");
        System.out.println("                    /   \\              /'\\       _                            ");
        System.out.println("\\_..           /'.,/     \\_         .,'   \\     / \\_                          ");
        System.out.println("   \\         /            \\      _/       \\_  /    \\     _                   ");
        System.out.println("    \\__,.   /              \\    /           \\/.,   _|  _/ \\                  ");
        System.out.println("         \\_/                \\  /',.,''\\      \\_ \\_/  \\/    \\                 ");
        System.out.println("                           _  \\/   /    ',../',.\\    _/      \\                ");
        System.out.println("             /           _/m\\  \\  /    |         \\  /.,/'\\   _\\               ");
        System.out.println("           _/           /MMmm\\  \\_     |          \\/      \\_/  \\              ");
        System.out.println("          /      \\     |MMMMmm|   \\__   \\          \\_       \\   \\_            ");
        System.out.println("                  \\   /MMMMMMm|      \\   \\           \\       \\    \\           ");
        System.out.println("                   \\  |MMMMMMmm\\      \\___            \\_      \\_   \\          ");
        System.out.println("                    \\|MMMMMMMMmm|____.'  /\\_            \\       \\   \\_        ");
        System.out.println("                    /'.,___________...,,'   \\            \\   \\        \\        ");
        System.out.println("                   /       \\          |      \\    |__     \\   \\_       \\        ");
        System.out.println("                 _/        |           \\      \\_     \\     \\    \\       \\_      ");
        System.out.println("                /                               \\     \\     \\_   \\        \\     ");
        System.out.println("                                                 \\     \\      \\   \\__      \\    ");
        System.out.println("                                                  \\     \\_     \\     \\      \\   ");
        System.out.println("                                                    |      \\     \\     \\      \\  ");
        System.out.println("                                                     \\            \\            \\");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Te encuentras en la base de una montaña. En ella se abre una conocida cueva, la cueva Amatista.");
        enter();

        if (maz2Completa == 0) { //Si la mazmorra no esta completa.
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Sin embargo, no puedes entrar, alguien ha colocado una gran puerta de metal bloqueando la entrada.");
            System.out.println("La puerta no tiene cerradura, pero descubres un hueco con forma de gema tallada.");
            enter();

            if (perMaz2.cuarzoMorado == 1) {  //Si se ha conseguido la llave.
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("Usas el cuarzo morado que conseguiste en la catedral en el hueco de la puerta y esta comienza a abrirse.");
                System.out.println("Decides entrar en la cueva.");
                enter();
                cueva1();
            } else {   //Si no se ha conseguido la llave.
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("No tienes con qué abrir la puerta asi que te vuelves por donde has venido.");
                enter();
            }
        } else if (maz2Completa == 1) { //En caso de que la mazmorra ya se haya completado.
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Ya has vencido a las criaturas que la habitaban y reclamado sus recompensas. No tiene sentido volver a entrar.");
            System.out.println("Te vuelves por el camino por el que has llegado.");
            enter();
        }
    }

    public void cueva1() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Te encuentras en una caverna. Parece que solo hay un camino posible, hacia delante y hacia abajo.");
        enter();
        cueva2();
    }

    public void cueva2() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Sigues descendiendo por la caverna cubierta de cristales cuando ves que algo se empieza a mover en los muros.");
        System.out.println("Se trata de dos criaturas que parecen estar hechas de cristal de roca.");
        enter();
        System.out.println("");
        System.out.println("                                               ____");
        System.out.println("   ___                                      .-~. /_\"-._");
        System.out.println("  `-._~-.                                  / /_ \"~o\\  :Y");
        System.out.println("      \\  \\                                / : \\~x.  ` ')");
        System.out.println("       ]  Y                              /  |  Y< ~-.__j");
        System.out.println("      /   !                        _.--~T : l  l<  /.-~");
        System.out.println("     /   /                 ____.--~ .   ` l /~\\ \\<|Y");
        System.out.println("    /   /             .-~~\"        /| .    ',-~\\ \\L|");
        System.out.println("   /   /             /     .^   \\ Y~Y \\.^>/l_   \"--'");
        System.out.println("  /   Y           .-\"(  .  l__  j_j l_/ /~_.-~    .");
        System.out.println(" Y    l          /    \\  )    ~~~.\" / `/\"~ / \\.__/l_");
        System.out.println(" |     \\     _.-\"      ~-{__     l  :  l._Z~-.___.--~");
        System.out.println(" |      ~---~           /   ~~\"---\\_  ' __[>");
        System.out.println(" l  .                _.^   ___     _>-y~");
        System.out.println("  \\  \\     .      .-~   .-~   ~>--\"  /");
        System.out.println("   \\  ~---\"            /     ./  _.-'");
        System.out.println("    \"-.,_____.,_  _.--~\\     _.-~");
        System.out.println("                ~~     (   _}");
        System.out.println("                        `. ~(");
        System.out.println("                          )  \\");
        System.out.println("                         /,`--'~\\--'");
        System.out.println("");
        System.out.println("");

        System.out.println("Corren hacia a ti con intención de atacarte.");
        enter();
        combateMaz2.Combatir(perMaz2, ele1);
        if (perMaz2.escapar == true) {
            puertaPrincipal();           //En caso de escapar, se vuelve a la entrada de la cueva.
        }
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Consigues vencer al primer enemigo pero el segundo aun vive.");
        System.out.println("");
        System.out.println("                                               ____");
        System.out.println("   ___                                      .-~. /_\"-._");
        System.out.println("  `-._~-.                                  / /_ \"~o\\  :Y");
        System.out.println("      \\  \\                                / : \\~x.  ` ')");
        System.out.println("       ]  Y                              /  |  Y< ~-.__j");
        System.out.println("      /   !                        _.--~T : l  l<  /.-~");
        System.out.println("     /   /                 ____.--~ .   ` l /~\\ \\<|Y");
        System.out.println("    /   /             .-~~\"        /| .    ',-~\\ \\L|");
        System.out.println("   /   /             /     .^   \\ Y~Y \\.^>/l_   \"--'");
        System.out.println("  /   Y           .-\"(  .  l__  j_j l_/ /~_.-~    .");
        System.out.println(" Y    l          /    \\  )    ~~~.\" / `/\"~ / \\.__/l_");
        System.out.println(" |     \\     _.-\"      ~-{__     l  :  l._Z~-.___.--~");
        System.out.println(" |      ~---~           /   ~~\"---\\_  ' __[>");
        System.out.println(" l  .                _.^   ___     _>-y~");
        System.out.println("  \\  \\     .      .-~   .-~   ~>--\"  /");
        System.out.println("   \\  ~---\"            /     ./  _.-'");
        System.out.println("    \"-.,_____.,_  _.--~\\     _.-~");
        System.out.println("                ~~     (   _}");
        System.out.println("                        `. ~(");
        System.out.println("                          )  \\");
        System.out.println("                         /,`--'~\\--'");
        System.out.println("");
        System.out.println("");

        enter();
        combateMaz2.Combatir(perMaz2, ele2);
        if (perMaz2.escapar == true) {
            puertaPrincipal();
        }
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Derrotas a todas las amenazas y decides seguir bajando por la caverna.");
        enter();
        cueva3();
    }

    public void cueva3() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Llegas a una estancia mas amplia. En un lateral ves unas cajas. Podrian tener algo de valor.");
        System.out.println("Que quieres hacer?");
        System.out.println("1. Examinar las cajas");
        System.out.println("2. Seguir bajando");
        int eleccionCajas1 = reader.nextInt();

        switch (eleccionCajas1) {
            case 1:
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("Mientras examinas las cajas, un elemental de cristal cae del techo causandote 5 puntos de daño");
                System.out.println("");
                System.out.println("                                               ____");
                System.out.println("   ___                                      .-~. /_\"-._");
                System.out.println("  `-._~-.                                  / /_ \"~o\\  :Y");
                System.out.println("      \\  \\                                / : \\~x.  ` ')");
                System.out.println("       ]  Y                              /  |  Y< ~-.__j");
                System.out.println("      /   !                        _.--~T : l  l<  /.-~");
                System.out.println("     /   /                 ____.--~ .   ` l /~\\ \\<|Y");
                System.out.println("    /   /             .-~~\"        /| .    ',-~\\ \\L|");
                System.out.println("   /   /             /     .^   \\ Y~Y \\.^>/l_   \"--'");
                System.out.println("  /   Y           .-\"(  .  l__  j_j l_/ /~_.-~    .");
                System.out.println(" Y    l          /    \\  )    ~~~.\" / `/\"~ / \\.__/l_");
                System.out.println(" |     \\     _.-\"      ~-{__     l  :  l._Z~-.___.--~");
                System.out.println(" |      ~---~           /   ~~\"---\\_  ' __[>");
                System.out.println(" l  .                _.^   ___     _>-y~");
                System.out.println("  \\  \\     .      .-~   .-~   ~>--\"  /");
                System.out.println("   \\  ~---\"            /     ./  _.-'");
                System.out.println("    \"-.,_____.,_  _.--~\\     _.-~");
                System.out.println("                ~~     (   _}");
                System.out.println("                        `. ~(");
                System.out.println("                          )  \\");
                System.out.println("                         /,`--'~\\--'");
                System.out.println("");
                System.out.println("");
                enter();
                perMaz2.vida = perMaz2.vida - 5;
                combateMaz2.Combatir(perMaz2, ele3);
                if (perMaz2.escapar == true) {
                    puertaPrincipal();
                }
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("Despues de eliminar al enemigo, terminas de buscar en las cajas.");
                System.out.println("No hay nada de valor.");
                enter();
                cueva4();
                break;
            case 2:
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("No te detienes y sigues descendiendo.");
                enter();
                cueva4();
                break;
        }
    }

    public void cueva4() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Despues de descender un poco más, descubres otra caverna amplia. Tambien encuentras algunas cajas apiladas.");
        System.out.println("Que quieres hacer?");
        System.out.println("1. Examinar las cajas");
        System.out.println("2. Seguir bajando");
        int eleccionCajas1 = reader.nextInt();

        switch (eleccionCajas1) {
            case 1:
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("Te detienes a buscar algo de valor en las cajas.");
                System.out.println("Tienes suerte y descubres 5 pociones de mana y 5 pociones de vida.");
                perMaz2.pocionVida = perMaz2.pocionVida + 5;
                perMaz2.pocionMana = perMaz2.pocionMana + 5;
                System.out.println("Continuas tu viaje.");
                enter();
                cueva5();
                break;

            case 2:
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("No te detienes y sigues descendiendo.");
                enter();
                cueva5();
                break;
        }

    }

    public void cueva5() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Con el tiempo, el camino deja de descender y simplemente avanza hacia delante en horizontal.");
        System.out.println("Puedes ver como, mas adelante, la caverna crece hasta formar una estancia gigantesca. ");
        System.out.println("Sin embargo, antes de que puedas ver con claridad lo que hay en esa cámara, algo te corta el camino.");
        System.out.println("Es una de las criaturas de cristal, pero esta es mas grande con una gran porra de cristal creciendo desde su propio brazo");
        System.out.println("Parece que tendrás que derrotarla si quieres continuar a la gran cámara de detrás.");
        System.out.println("");
        System.out.println("                        /^\\");
        System.out.println("                       /    \\");
        System.out.println("                      / /^H^\\ \\");
        System.out.println("                     / /$| |$$\\ \\");
        System.out.println("                    / /$$| |$$$\\  \\");
        System.out.println("                  / /$$$| |$$$$$\\  \\");
        System.out.println("                   / /$$$| |$$$$$$\\   \\");
        System.out.println("                  / /$$$$| |$$$$$$$$\\   \\    ____");
        System.out.println("                  / /$$$$| |$$$$:::::-----```    '\\");
        System.out.println("                 / /$$$$$| |/```                    \\");
        System.out.println("                 / /$$$$$/'`                          \\");
        System.out.println("                / /$$$$$|                               \\");
        System.out.println("                / /$$$$/        ____                      \\");
        System.out.println("               / /$$$/        /`^*#/'                       \\");
        System.out.println("               //$$/         /\\,/                            \\");
        System.out.println("              //$/          /k/                               \\");
        System.out.println("              //           /`                                  \\");
        System.out.println("             /                ,/:\\");
        System.out.println("           /              ,/'`V:::)             /~\\");
        System.out.println("       __/            ,/'`V /::::/            /####|");
        System.out.println("     /     _,.    ,/'`V$$| (::::/           /######|");
        System.out.println("    /   .*$~  ,/'`V$$$$$|  ):::/          /|######/");
        System.out.println("   /   /``,/'`V$$$$$$$$$| /:::/         /-/       |       __----");
        System.out.println(" /    ,/'`V/$$$$$$$$$$$| (:://        /  /#######/       /");
        System.out.println("|  /'`V   //$$$$$$$$$$$| |/ /       /   |########|     /");
        System.out.println("| /      //$$$$$$$$$$$|    /      /    /#########/");
        System.out.println("L/       //$$$$$$$$$$$|   /     /     /");
        System.out.println("        //$$$$$$$$$$$|   /    /      |########");
        System.out.println("        //$$$$$$$$$$$|  /   /       /##########");
        System.out.println("       //$$$$$$$$$$$|  /  /        /########");
        System.out.println("       //$$$$$$$$$$$$\\L'_/         |  ");
        System.out.println("");
        System.out.println("");

        System.out.println("");
        enter();
        combateMaz2.Combatir(perMaz2, guardian1);  //Con metodo loot propio.
        if (perMaz2.escapar == true) {
            puertaPrincipal();
        }
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Con el guardian caido, el camino hacia la gran camara se abre.");
        enter();
        camaraFinal();

    }

    public void camaraFinal() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Te adentras en la colosal caverna. Pero solo ves un gran montón de cristal en el centro.");
        System.out.println("Cuando estas a punto de darte la vuelta y marcharte despues de un descenso inutil, el monton de cristal empieza a moverse.");
        System.out.println("Parece que no era un simple monton, si no que se trata de un gigantesco dragón de cristal que estaba dormido.");
        System.out.println("Parece que no le ha gustado que le despertaras y no piensa dejarte escapar.");
        enter();
        System.out.println("");
        System.out.println("                                                       ____________");
        System.out.println("                                 (`-..________....---''  ____..._.-`");
        System.out.println("                                  \\\\`._______.._,.---'''     ,'");
        System.out.println("                                  ; )`.      __..-'`-.      /");
        System.out.println("                                 / /     _.-' _,.;;._ `-._,'");
        System.out.println("                                / /   ,-' _.-'  //   ``--._``._");
        System.out.println("                              ,','_.-' ,-' _.- (( =-    -. `-._`-.___");
        System.out.println("                            ,;.''__..-'   _..--.\\\\.--'````--.._``-.`-._`.");
        System.out.println("             _          |\\,' .-''        ```-'`---'`-...__,._  ``-.`-.`-.`.");
        System.out.println("  _     _.-,'(__)\\__)\\-'' `     ___  .          `     \\      `--._");
        System.out.println(",',)---' /|)          `     `      ``-.   `     /     /     `     `-.");
        System.out.println("\\_____--.  '`  `               __..-.  \\     . (   < _...-----..._   `.");
        System.out.println(" \\_,--..__. \\\\ .-`.\\----'';``,..-.__ \\  \\      ,`_. `.,-'`--'`---''`.  )");
        System.out.println("           `.\\`.\\  `_.-..' ,'   _,-..'  /..,-''(, ,' ; ( _______`___..'__");
        System.out.println("                   ((,(,__(    ((,(,__,'  ``'-- `'`.(\\  `.,..______      ");
        System.out.println("                                                      ``--------..._``--.__");
        System.out.println("");

        enter();

        combateMaz2.Combatir(perMaz2, dragon);  //Con metodo loot propio.

        System.out.println("No hay nada mas que hacer y vuelves a la salida de la cueva.");
        enter();
        maz2Completa = 1;

        puertaPrincipal();  //al terminar se vuelve a la entrada.
    }

    public void enter() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

}
