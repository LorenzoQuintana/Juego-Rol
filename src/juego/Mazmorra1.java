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
public class Mazmorra1 {

    Scanner reader = new Scanner(System.in);
    int llaves = 0, maz1Completa = 0;
    boolean derechoVivo = true;  //Impedirán que los esqueletos puedan ser cambatidos varias veces.
    boolean izquierdoVivo = true;
    //Enemigos
    Esqueleto esqueletoAnciana = new Esqueleto();
    Esqueleto esqueletoDerecha = new Esqueleto();
    Esqueleto esqueletoIzquierda = new Esqueleto();
    EsqueletoJefe esqueletoAltar = new EsqueletoJefe();
    
    Combate combateMaz1 = new Combate();
    Personaje perMaz1 = new Personaje();  //Se crea un personaje nuevo que será utilizado dentro de esta localización.

    public void setPerMaz1(Personaje perIn) {  //Pasa la información del personaje principal al creado exclusivamente para esta localizacion
        perMaz1.vida = perIn.vida;
        perMaz1.mana = perIn.mana;
        perMaz1.armadura = perIn.armadura;
        perMaz1.dañoBasico = perIn.dañoBasico;
        perMaz1.dañoTotal = perIn.dañoTotal;
        perMaz1.dañoMagico = perIn.dañoMagico;
        perMaz1.dañoMagicoTotal = perIn.dañoMagicoTotal;
        perMaz1.pocionVida = perIn.pocionVida;
        perMaz1.pocionMana = perIn.pocionMana;
        perMaz1.dinero = perIn.dinero;
        perMaz1.pocion = perIn.pocion;
        perMaz1.cerveza = perIn.cerveza;
        perMaz1.cuarzoMorado = perIn.cuarzoMorado;
        perMaz1.objetoMaz2 = perIn.objetoMaz2;
        perMaz1.objetoCasa1 = perIn.objetoCasa1;
        perMaz1.mapa = perIn.mapa;
        perMaz1.montura = perIn.montura;
        perMaz1.ending = perIn.ending;
        

    }

    public void actualizarPer(Personaje perIn) {  //Pasa la nueva información al personaje principal.
        perIn.vida = perMaz1.vida;
        perIn.mana = perMaz1.mana;
        perIn.armadura = perMaz1.armadura;
        perIn.dañoBasico = perMaz1.dañoBasico;
        perIn.dañoTotal = perMaz1.dañoTotal;
        perIn.dañoMagico = perMaz1.dañoMagico;
        perIn.dañoMagicoTotal = perMaz1.dañoMagicoTotal;
        perIn.pocionVida = perMaz1.pocionVida;
        perIn.pocionMana = perMaz1.pocionMana;
        perIn.dinero = perMaz1.dinero;
        perIn.pocion = perMaz1.pocion;
        perIn.cerveza = perMaz1.cerveza;
        perIn.cuarzoMorado = perMaz1.cuarzoMorado;
        perIn.objetoMaz2 = perMaz1.objetoMaz2;
        perIn.objetoCasa1 = perMaz1.objetoCasa1;
        perIn.mapa = perMaz1.mapa;
        perIn.montura = perMaz1.montura;
        perIn.ending = perMaz1.ending;

    }

    public void getInfoPersonaje() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Información del personaje:");
        System.out.println("Puntos de vida: " + perMaz1.vida);
        System.out.println("Puntos de mana: " + perMaz1.mana);
        System.out.println("Puntos de armadura: " + perMaz1.armadura);
        System.out.println("Puntos de daño basico: " + perMaz1.dañoBasico);
        System.out.println("Puntos de daño total: " + perMaz1.dañoTotal);
        System.out.println("Puntos de daño magico: " + perMaz1.dañoMagico);
        System.out.println("Puntos de daño magico total: " + perMaz1.dañoMagicoTotal);
        System.out.println("Pociones de vida: " + perMaz1.pocionVida);
        System.out.println("Pociones de maná: " + perMaz1.pocionMana);
        System.out.println("Dineros: " + perMaz1.dinero);
        enter();
    }

    public void puertaExterior() {

        perMaz1.guardarPersonaje(perMaz1);  //El personaje se guarda en fichero.
        
        System.out.println("");
        System.out.println("                   |");
        System.out.println("                  / \\");
        System.out.println("                 //_\\\\");
        System.out.println("                //(_)\\\\");
        System.out.println("                 |/^\\|");
        System.out.println("       ,%%%%     // \\\\    ,@@@@@@@,");
        System.out.println("     ,%%%%/%%%  //   \\\\ ,@@@\\@@@@/@@,");
        System.out.println(" @@@%%%\\%%//%%%// === \\\\ @@\\@@@/@@@@@");
        System.out.println("@@@@%%%%\\%%%%%// =-=-= \\\\@@@@\\@@@@@@;%#####,");
        System.out.println("@@@@%%%\\%%/%%//   ===   \\\\@@@@@@/@@@%%%######,");
        System.out.println("@@@@@%%%%/%%//|         |\\\\@\\\\//@@%%%%%%#/####");
        System.out.println("'@@@@@%%\\\\/%~ |         | ~ @|| %\\\\//%%%#####;");
        System.out.println("  @@\\\\//@||   |  __ __  |    || %%||%%'######");
        System.out.println("   '@||  ||   | |  |  | |    ||   ||##\\//####");
        System.out.println("     ||  ||   | | -|- | |    ||   ||'#||###'");
        System.out.println("     ||  ||   |_|__|__|_|    ||   ||  ||");
        System.out.println("     ||  ||_/`  =======  `\\__||_._||  ||");
        System.out.println("_____||_/`      =======            `\\_||___");
        
        

        if (maz1Completa == 0) {  //Si la mazmorra  no ha sido completada.
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Te encuentras frente a las puertas de una iglesia abandonada.");
            System.out.println("Junto a ella se encuentra una anciana.");
            System.out.println("Que quieres hacer?");
            System.out.println("1. Entrar");
            System.out.println("2. Hablar con la anciana");
            System.out.println("3. Marcharte");

            int puerta = reader.nextInt();

            switch (puerta) {
                case 1:
                    System.out.println("\n------------------------------------------------------------------\n");
                    System.out.println("La anciana se convierte en un esqueleto y te impide la entrada.");
                    
                    
                    System.out.println("              .7");
                    System.out.println("            .'/");
                    System.out.println("           / /");
                    System.out.println("          / /");
                    System.out.println("         / /");
                    System.out.println("        / /");
                    System.out.println("       / /");
                    System.out.println("      / /");
                    System.out.println("     / /     ");
                    System.out.println("    / /   ");
                    System.out.println("  __|/");
                    System.out.println(",-\\__\\");
                    System.out.println("|f-\"Y\\|");
                    System.out.println("\\()7L/");
                    System.out.println(" cgD                            __ _");
                    System.out.println(" |\\(                          .'  Y '>,");
                    System.out.println("  \\ \\                        / _   _   \\");
                    System.out.println("   \\\\\\                       )(_) (_)(|}");
                    System.out.println("    \\\\\\                      {  4A   } /");
                    System.out.println("     \\\\\\                      \\uLuJJ/\\l");
                    System.out.println("      \\\\\\                     |3    p)/");
                    System.out.println("       \\\\\\___ __________      /nnm_n//");
                    System.out.println("       c7___-__,__-)\\,__)(\".  \\_>-<_/D");
                    System.out.println("                  //V     \\_\"-._.__G G_c__.-__<\"/ ( \\");
                    System.out.println("                         <\"-._>__-,G_.___)\\   \\7\\");
                    System.out.println("                        (\"-.__.| \\\"<.__.-\" )   \\ \\");
                    System.out.println("                        |\"-.__\"\\  |\"-.__.-\".\\   \\ \\");
                    System.out.println("                        (\"-.__\"\". \\\"-.__.-\".|    \\_\\");
                    System.out.println("                        \\\"-.__\"\"|!|\"-.__.-\".)     \\ \\");
                    System.out.println("                         \"-.__\"\"\\_|\"-.__.-\"./      \\ l");
                    System.out.println("                          \".__\"\"\">G>-.__.-\">       .--,_");
                    System.out.println("                              \"\"  G");
                    enter();
                    combateMaz1.Combatir(perMaz1, esqueletoAnciana);
                    if (perMaz1.escapar == true) {
                        puertaExterior();
                    }

                    System.out.println("");

                    System.out.println("Entras en la catedral.");
                    enter();

                    central();

                    break;
                case 2:
                    hablarAnciana();
                    break;
                case 3:
                    terminar();
                    break;
            }
        } else if (maz1Completa == 1) {  //si ya ha sido completada.
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Te encuentras frente a las puertas de una iglesia abandonada.");
            System.out.println("Ya has vencido a las criaturas que la habitaban y reclamado sus recompensas. No tiene sentido volver a entrar.");
            System.out.println("Te vuelves por el camino por el que has llegado.");
            System.out.println("\n------------------------------------------------------------------\n");
            enter();
        }

    }

    public void hablarAnciana() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Decides hablar con la anciana.");
        System.out.println("Te advierte de que el edificio esta maldito y deberias marcharte de alli.");
        System.out.println("Que quieres hacer?");
        System.out.println("1. Entrar de todas formas.");
        System.out.println("2. Marcharte.");

        int anciana = reader.nextInt();

        switch (anciana) {
            case 1:
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("Ignoras a la anciana e intentas entrar.");
                System.out.println("La anciana se convierte en un esqueleto y te impide la entrada.");
                System.out.println("              .7");
                    System.out.println("            .'/");
                    System.out.println("           / /");
                    System.out.println("          / /");
                    System.out.println("         / /");
                    System.out.println("        / /");
                    System.out.println("       / /");
                    System.out.println("      / /");
                    System.out.println("     / /     ");
                    System.out.println("    / /   ");
                    System.out.println("  __|/");
                    System.out.println(",-\\__\\");
                    System.out.println("|f-\"Y\\|");
                    System.out.println("\\()7L/");
                    System.out.println(" cgD                            __ _");
                    System.out.println(" |\\(                          .'  Y '>,");
                    System.out.println("  \\ \\                        / _   _   \\");
                    System.out.println("   \\\\\\                       )(_) (_)(|}");
                    System.out.println("    \\\\\\                      {  4A   } /");
                    System.out.println("     \\\\\\                      \\uLuJJ/\\l");
                    System.out.println("      \\\\\\                     |3    p)/");
                    System.out.println("       \\\\\\___ __________      /nnm_n//");
                    System.out.println("       c7___-__,__-)\\,__)(\".  \\_>-<_/D");
                    System.out.println("                  //V     \\_\"-._.__G G_c__.-__<\"/ ( \\");
                    System.out.println("                         <\"-._>__-,G_.___)\\   \\7\\");
                    System.out.println("                        (\"-.__.| \\\"<.__.-\" )   \\ \\");
                    System.out.println("                        |\"-.__\"\\  |\"-.__.-\".\\   \\ \\");
                    System.out.println("                        (\"-.__\"\". \\\"-.__.-\".|    \\_\\");
                    System.out.println("                        \\\"-.__\"\"|!|\"-.__.-\".)     \\ \\");
                    System.out.println("                         \"-.__\"\"\\_|\"-.__.-\"./      \\ l");
                    System.out.println("                          \".__\"\"\">G>-.__.-\">       .--,_");
                    System.out.println("                              \"\"  G");
                enter();
                combateMaz1.Combatir(perMaz1, esqueletoAnciana);
                System.out.println("");
                System.out.println("Detrás de la piedra donde se sentaba la anciana ves un par de armas abandonadas.");
                System.out.println("1. Equipar maza (15 de daño)");
                System.out.println("2. Equipar martillo (30 de daño)");
                System.out.println("3. Mantener el arma que ya llevas.");

                int eleccionArma = reader.nextInt();

                switch (eleccionArma) {
                    case 1:
                        perMaz1.desequiparArma();
                        perMaz1.equiparMaza();
                        System.out.println("Tu ataque total es ahora: " + perMaz1.dañoTotal);
                        enter();
                        break;

                    case 2:
                        perMaz1.desequiparArma();
                        perMaz1.equiparMartillo();
                        System.out.println("Tu ataque total es ahora: " + perMaz1.dañoTotal);
                        enter();
                        break;

                    case 3:
                        break;
                }

                System.out.println("");
                System.out.println("Entras en la iglesia.");
                enter();
                central();
                break;
            case 2:
                terminar();
                break;
        }
    }

    public void central() {  //Da acceso a varias habitaciones, al terminar en ellas, se volverá aqui.
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Te encuentras en la gran nave central de la iglesia.");
        System.out.println("Hay una puerta a cada lado y una gran puerta enfrente, donde deberia estar el altar.");
        System.out.println("Que quieres hacer?");
        System.out.println("1. Usar la puerta central.");
        System.out.println("2. Usar la puerta de la derecha.");
        System.out.println("3. Usar la puerta de la izquierda.");
        System.out.println("4. Usar la puerta por la que has entrado y huir.");

        int central = reader.nextInt();

        switch (central) {
            case 1:

                if (llaves == 2) {  //Acceso permitido.
                    System.out.println("\n------------------------------------------------------------------\n");
                    System.out.println("Vuelves a la gran puerta central y usas ambas llaves.");
                    enter();

                    altar();
                } else if (llaves == 1) { 
                    System.out.println("\n------------------------------------------------------------------\n");
                    System.out.println("Vuelves a la gran puerta central pero no puedes abrirla, te falta una llave.");
                    enter();

                    central();

                } else {  //Se informa de la necesario para continuar.
                    System.out.println("\n------------------------------------------------------------------\n");
                    System.out.println("Intentas utilizar la gran puerta central pero se encuentra cerrada.");
                    System.out.println("Al inspeccionarla, descubres dos pequeñas cerraduras. Quizas las llaves esten en alguna de las salas laterales.");
                    enter();

                    central();

                }
                break;
            case 2:
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("Utilizas la puerta de la derecha.");
                enter();

                derecha();

                break;

            case 3:
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("Utilizas la puerta de la izquierda.");
                enter();

                izquierda();
                break;

            case 4:

                terminar();

                break;

        }
    }

    public void altar() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Cuando entras en la ultima sala te encuentras al jefe de los esqueletos custodiando un cofre.");
        
        
        
        System.out.println("");
        System.out.println("                              _.--\"\"-._");
        System.out.println("  .                         .\"         \".");
        System.out.println(" / \\    ,^.         /(     Y             |      )\\");
        System.out.println("/   `---. |--'\\    (  \\__..'--   -   -- -'\"\"-.-'  )");
        System.out.println("|        :|    `>   '.     l_..-------.._l      .'");
        System.out.println("|      __l;__ .'      \"-.__.||_.-'v'-._||`\"----\"");
        System.out.println(" \\  .-' | |  `              l._       _.'");
        System.out.println("  \\/    | |                   l`^^'^^'j");
        System.out.println("        | |                _   \\_____/     _");
        System.out.println("        j |               l `--__)-'(__.--' |");
        System.out.println("        | |               | /`---``-----'\"1 |  ,-----.");
        System.out.println("        | |               )/  `--' '---'   \\'-'  ___  `-.");
        System.out.println("        | |              //  `-'  '`----'  /  ,-'   I`.  \\");
        System.out.println("      _ L |_            //  `-.-.'`-----' /  /  |   |  `. \\");
        System.out.println("     '._' / \\         _/(   `/   )- ---' ;  /__.J   L.__.\\ :");
        System.out.println("      `._;/7(-.......'  /        ) (     |  |            | |");
        System.out.println("      `._;l _'--------_/        )-'/     :  |___.    _._./ ;");
        System.out.println("        | |                 .__ )-'\\  __  \\  \\  I   1   / /");
        System.out.println("        `-'                /   `-\\-(-'   \\ \\  `.|   | ,' /");
        System.out.println("                           \\__  `-'    __/  `-. `---'',-'");
        System.out.println("                              )-._.-- (        `-----'");
        System.out.println("                             )(  l\\ o ('..-.");
        System.out.println("                       _..--' _'-' '--'.-. |");

        enter();
        combateMaz1.Combatir(perMaz1, esqueletoAltar);
        if (perMaz1.escapar == true) {
            central();
        }
        System.out.println("");
        System.out.println("Abres el cofre y en el encuentras un cuarzo morado ya tallado.");
        System.out.println("Parece valioso asi que te lo guardas, podría ser util en el futuro.");
        enter();
        perMaz1.cuarzoMorado++;  //Necesario para acceder a la siguiente mazmorra.

        maz1Completa = 1;  //Impide que la mazmorra se pueda volver a completar.

        System.out.println("");
        System.out.println("Vuelves a la entrada de la iglesia.");
        enter();
        puertaExterior();

    }

    public void derecha() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Entras en la sala de la derecha.");

        if (derechoVivo == true) {

            System.out.println("En ella, hay un esqueleto con el que combates.");
            System.out.println("              .7");
                    System.out.println("            .'/");
                    System.out.println("           / /");
                    System.out.println("          / /");
                    System.out.println("         / /");
                    System.out.println("        / /");
                    System.out.println("       / /");
                    System.out.println("      / /");
                    System.out.println("     / /     ");
                    System.out.println("    / /   ");
                    System.out.println("  __|/");
                    System.out.println(",-\\__\\");
                    System.out.println("|f-\"Y\\|");
                    System.out.println("\\()7L/");
                    System.out.println(" cgD                            __ _");
                    System.out.println(" |\\(                          .'  Y '>,");
                    System.out.println("  \\ \\                        / _   _   \\");
                    System.out.println("   \\\\\\                       )(_) (_)(|}");
                    System.out.println("    \\\\\\                      {  4A   } /");
                    System.out.println("     \\\\\\                      \\uLuJJ/\\l");
                    System.out.println("      \\\\\\                     |3    p)/");
                    System.out.println("       \\\\\\___ __________      /nnm_n//");
                    System.out.println("       c7___-__,__-)\\,__)(\".  \\_>-<_/D");
                    System.out.println("                  //V     \\_\"-._.__G G_c__.-__<\"/ ( \\");
                    System.out.println("                         <\"-._>__-,G_.___)\\   \\7\\");
                    System.out.println("                        (\"-.__.| \\\"<.__.-\" )   \\ \\");
                    System.out.println("                        |\"-.__\"\\  |\"-.__.-\".\\   \\ \\");
                    System.out.println("                        (\"-.__\"\". \\\"-.__.-\".|    \\_\\");
                    System.out.println("                        \\\"-.__\"\"|!|\"-.__.-\".)     \\ \\");
                    System.out.println("                         \"-.__\"\"\\_|\"-.__.-\"./      \\ l");
                    System.out.println("                          \".__\"\"\">G>-.__.-\">       .--,_");
                    System.out.println("                              \"\"  G");
                    
            enter();
            combateMaz1.Combatir(perMaz1, esqueletoDerecha);
            if (perMaz1.escapar == true) {
                central();
            }
            System.out.println("Al morir, el esqueleto suelta una llave.");
            System.out.println("Vuelves a la sala central.");
            enter();
            llaves++;
            derechoVivo = false;
        } else {
            System.out.println("Pero ya has vencido al esqueleto y recogido la llave.");
            System.out.println("Vuelves a la sala central.");
            enter();
        }
        central();

    }

    public void izquierda() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Entras en la sala de la izquierda.");

        if (izquierdoVivo == true) {
            System.out.println("En ella, hay un esqueleto con el que combates.");
            System.out.println("              .7");
                    System.out.println("            .'/");
                    System.out.println("           / /");
                    System.out.println("          / /");
                    System.out.println("         / /");
                    System.out.println("        / /");
                    System.out.println("       / /");
                    System.out.println("      / /");
                    System.out.println("     / /     ");
                    System.out.println("    / /   ");
                    System.out.println("  __|/");
                    System.out.println(",-\\__\\");
                    System.out.println("|f-\"Y\\|");
                    System.out.println("\\()7L/");
                    System.out.println(" cgD                            __ _");
                    System.out.println(" |\\(                          .'  Y '>,");
                    System.out.println("  \\ \\                        / _   _   \\");
                    System.out.println("   \\\\\\                       )(_) (_)(|}");
                    System.out.println("    \\\\\\                      {  4A   } /");
                    System.out.println("     \\\\\\                      \\uLuJJ/\\l");
                    System.out.println("      \\\\\\                     |3    p)/");
                    System.out.println("       \\\\\\___ __________      /nnm_n//");
                    System.out.println("       c7___-__,__-)\\,__)(\".  \\_>-<_/D");
                    System.out.println("                  //V     \\_\"-._.__G G_c__.-__<\"/ ( \\");
                    System.out.println("                         <\"-._>__-,G_.___)\\   \\7\\");
                    System.out.println("                        (\"-.__.| \\\"<.__.-\" )   \\ \\");
                    System.out.println("                        |\"-.__\"\\  |\"-.__.-\".\\   \\ \\");
                    System.out.println("                        (\"-.__\"\". \\\"-.__.-\".|    \\_\\");
                    System.out.println("                        \\\"-.__\"\"|!|\"-.__.-\".)     \\ \\");
                    System.out.println("                         \"-.__\"\"\\_|\"-.__.-\"./      \\ l");
                    System.out.println("                          \".__\"\"\">G>-.__.-\">       .--,_");
                    System.out.println("                              \"\"  G");
                    
            enter();
            combateMaz1.Combatir(perMaz1, esqueletoIzquierda);
            if (perMaz1.escapar == true) {
                central();
            }
            System.out.println("Al morir, el esqueleto suelta una llave.");
            System.out.println("Vuelves a la sala central.");
            enter();
            izquierdoVivo = false;
            llaves++;
        } else {
            System.out.println("Pero ya has vencido al esqueleto y recogido la llave.");
            System.out.println("Vuelves a la sala central.");
            enter();
        }

        central();

    }

    public void terminar() {  //mensaje en caso de huida.
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Parece que no tienes lo que hay que tener para completar esta aventura.");
        System.out.println("Huyes acobardado por el camino por el que llegaste.");
        enter();

    }
    
    public void enter(){
   Scanner scanner = new Scanner(System.in);
   scanner.nextLine();
}

}
