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
public class Castillo {

    Scanner reader = new Scanner(System.in);
    Combate combateCastillo = new Combate();
    Personaje perCastillo = new Personaje(); //Se crea un personaje nuevo que será utilizado dentro de esta localización.
    //Enemigos
    Guardia guardiaAlmacen = new Guardia();
    Guardia guardiaSuperior1 = new Guardia();
    Guardia guardiaSuperior2 = new Guardia();
    GuardiaJefe jefeEscaleras = new GuardiaJefe();
    GuardiaJefe jefeSuperior = new GuardiaJefe();
    Rey rey = new Rey();

    boolean antorcha = false;

    public void setPerCastillo(Personaje perIn) {  //Pasa la información del personaje principal al creado exclusivamente para esta localizacion
        perCastillo.vida = perIn.vida;
        perCastillo.mana = perIn.mana;
        perCastillo.armadura = perIn.armadura;
        perCastillo.dañoBasico = perIn.dañoBasico;
        perCastillo.dañoTotal = perIn.dañoTotal;
        perCastillo.dañoMagico = perIn.dañoMagico;
        perCastillo.dañoMagicoTotal = perIn.dañoMagicoTotal;
        perCastillo.pocionVida = perIn.pocionVida;
        perCastillo.pocionMana = perIn.pocionMana;
        perCastillo.dinero = perIn.dinero;
        perCastillo.pocion = perIn.pocion;
        perCastillo.cerveza = perIn.cerveza;
        perCastillo.cuarzoMorado = perIn.cuarzoMorado;
        perCastillo.objetoMaz2 = perIn.objetoMaz2;
        perCastillo.objetoCasa1 = perIn.objetoCasa1;
        perCastillo.mapa = perIn.mapa;
        perCastillo.montura = perIn.montura;
        perCastillo.ending = perIn.ending;

    }

    public void actualizarPer(Personaje perIn) {  //Pasa la nueva información al perosnaje principal.
        perIn.vida = perCastillo.vida;
        perIn.mana = perCastillo.mana;
        perIn.armadura = perCastillo.armadura;
        perIn.dañoBasico = perCastillo.dañoBasico;
        perIn.dañoTotal = perCastillo.dañoTotal;
        perIn.dañoMagico = perCastillo.dañoMagico;
        perIn.dañoMagicoTotal = perCastillo.dañoMagicoTotal;
        perIn.pocionVida = perCastillo.pocionVida;
        perIn.pocionMana = perCastillo.pocionMana;
        perIn.dinero = perCastillo.dinero;
        perIn.pocion = perCastillo.pocion;
        perIn.cerveza = perCastillo.cerveza;
        perIn.cuarzoMorado = perCastillo.cuarzoMorado;
        perIn.objetoMaz2 = perCastillo.objetoMaz2;
        perIn.objetoCasa1 = perCastillo.objetoCasa1;
        perIn.mapa = perCastillo.mapa;
        perIn.montura = perCastillo.montura;
        perIn.ending = perCastillo.ending;
    }

    public void getInfoPersonaje() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Información del personaje:");
        System.out.println("Puntos de vida: " + perCastillo.vida);
        System.out.println("Puntos de mana: " + perCastillo.mana);
        System.out.println("Puntos de armadura: " + perCastillo.armadura);
        System.out.println("Puntos de daño basico: " + perCastillo.dañoBasico);
        System.out.println("Puntos de daño total: " + perCastillo.dañoTotal);
        System.out.println("Puntos de daño magico: " + perCastillo.dañoMagico);
        System.out.println("Puntos de daño magico total: " + perCastillo.dañoMagicoTotal);
        System.out.println("Pociones de vida: " + perCastillo.pocionVida);
        System.out.println("Pociones de maná: " + perCastillo.pocionMana);
        System.out.println("Dineros: " + perCastillo.dinero);
    }

    public void enter() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public void puertaEntrada() { 
        perCastillo.guardarPersonaje(perCastillo);  //El personaje se guarda en fichero.
        System.out.println("");
        System.out.println("                       X_x");
        System.out.println("                      / \\\\\\");
        System.out.println("                      |0| |");
        System.out.println("                    )(|_|-'X");
        System.out.println("                   /  \\\\Y// \\");
        System.out.println("                   |0 | | |0|");
        System.out.println("                   |  | | |_|");
        System.out.println("            )(__X,,|__|000;;;-,)(,");
        System.out.println("           /  \\\\\\;;;;;;;;;;;;/    \\");
        System.out.println("           |0 | |            | 0  |");
        System.out.println("         )_|  | |____)-----( |    |");
        System.out.println("        ///|__|-'////       \\|___)=(__X");
        System.out.println("       /////////////         \\///   \\/ \\");
        System.out.println("       |           |  U    U |//     \\u|");
        System.out.println("       |   )_,-,___|_)=(     | |  0  |_|_X");
        System.out.println("       |  ///   \\\\|//   \\    | |  __ |/// \\");
        System.out.println("     )_')(//     \\Y/     >---)=( /  \\|  | |-----------------");
        System.out.println("    //// ,\\ u   u |   u /////   \\|  ||__|A|----------------");
        System.out.println("   |  | .. |      |    ///// ,-, \\__||--------------------");
        System.out.println("---'--'_::_|______'----| u | | | |-----------------------");
        System.out.println("                       |___|_|_|_|----------------------");
        System.out.println("                            `--------------------------");

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Te encuentras ante un amenazador castillo. La gran puerta principal esta subida y el terreno que lo rodea esta quemado.");
        System.out.println("Yo me marcharía de aqui lo antes posible.");
        System.out.println("Que quieres hacer?");
        System.out.println("1. Avanzar hacia el castillo para intentar entrar.");
        System.out.println("2. Marcharse de aqui.");
        int eleccionPuerta = reader.nextInt();

        switch (eleccionPuerta) {
            case 1:

                //Diferentes situaciones según cuantas y cuales de las dos "llaves" se posean
                if (perCastillo.objetoMaz2 == 0 && perCastillo.objetoCasa1 == 0) {
                    System.out.println("\n------------------------------------------------------------------\n");
                    System.out.println("Segun te acercas al castillo, uno de los guardias sobre el muro te detecta.");
                    System.out.println("Hace sonar un grave \"Pipipiiiii\" en una trompeta y acto seguido te lanzan una gran bola de fuego. ");
                    System.out.println("No tienes forma de protegerte y recibes 50 puntos de daño.");
                    perCastillo.vida = perCastillo.vida - 50;
                    enter();

                    if (perCastillo.vida <= 0) {
                        perCastillo.muerte();
                        enter();
                        System.exit(0);
                    }
                    System.out.println("Te quedan: " + perCastillo.vida + " puntos de vida.");
                    System.out.println("Huyes de alli con las pocas fuerzas que te quedan.");
                    enter();
                } else if (perCastillo.objetoMaz2 == 1 && perCastillo.objetoCasa1 == 0) {
                    System.out.println("\n------------------------------------------------------------------\n");
                    System.out.println("Segun te acercas al castillo, uno de los guardias sobre el muro te detecta.");
                    System.out.println("Hace sonar un grave \"Pipipiiiii\" en una trompeta y acto seguido te lanzan una gran bola de fuego. ");
                    System.out.println("El colgante que conseguiste en el bosque te protege del fuego y no recibes ningun daño.");
                    enter();

                    System.out.println("Te acercas hasta el gran portalón de entrada. No vas a poder pasar por aqui.");
                    System.out.println("Sin embargo, descubres una pequeña puerta lateral con cerradura. Sería una buena forma de entrar si pudieras hacerte con la llave.");
                    enter();

                    System.out.println("No tienes forma de entrar así que te marchas");
                    enter();
                } else if (perCastillo.objetoMaz2 == 0 && perCastillo.objetoCasa1 == 1) {
                    System.out.println("\n------------------------------------------------------------------\n");
                    System.out.println("Segun te acercas al castillo, uno de los guardias sobre el muro te detecta.");
                    System.out.println("Hace sonar un grave \"Pipipiiiii\" en una trompeta y acto seguido te lanzan una gran bola de fuego. ");
                    System.out.println("No tienes forma de protegerte y recibes 50 puntos de daño.");
                    perCastillo.vida = perCastillo.vida - 50;
                    enter();

                    if (perCastillo.vida <= 0) {
                        perCastillo.muerte();
                        enter();
                        System.exit(0);
                    }
                    System.out.println("Te quedan: " + perCastillo.vida + " puntos de vida.");
                    System.out.println("Huyes de alli con las pocas fuerzas que te quedan.");
                    enter();
                } else if (perCastillo.objetoMaz2 == 1 && perCastillo.objetoCasa1 == 1) {
                    System.out.println("\n------------------------------------------------------------------\n");
                    System.out.println("Segun te acercas al castillo, uno de los guardias sobre el muro te detecta.");
                    System.out.println("Hace sonar un grave \"Pipipiiiii\" en una trompeta y acto seguido te lanzan una gran bola de fuego. ");

                    System.out.println("El colgante que conseguiste en el bosque te protege del fuego y no recibes ningun daño.");
                    enter();

                    System.out.println("Te acercas hasta el gran portalón de entrada. No vas a poder pasar por aqui.");
                    System.out.println("Sin embargo, descubres una pequeña puerta lateral con cerradura. Sería una buena forma de entrar si pudieras hacerte con la llave.");
                    enter();

                    System.out.println("Usas la llave que conseguiste en el pueblo y entras en el castillo");
                    enter();
                    sala1();

                }

                break;
            case 2:
                System.out.println("Abandonas el lugar.");
                break;
        }

    }

    public void sala1() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Te encuentras en una pequeña habitación vacia con 3 puertas. ");
        System.out.println("1. Puerta de la derecha.");
        System.out.println("2. Puerta de la izquierda.");
        System.out.println("3. Volver por la puerta por la que has entrado.");
        int eleccionSala = reader.nextInt();

        switch (eleccionSala) {
            case 1:
                salaDerechaBajo();
                break;

            case 2:
                salaIzquierdaBajo();
                break;

            case 3:
                System.out.println("Sales del castillo");
                puertaEntrada();
                break;

        }

    }

    public void salaDerechaBajo() {

        if (antorcha == false) {

            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Entras en un pequeño almacén. A parte de suministros, tambien encuentras un guardia.");
            System.out.println("");
            System.out.println("                                 _A_");
            System.out.println("                                / | \\");
            System.out.println("                               |.-=-.|");
            System.out.println("                               )\\_|_/(");
            System.out.println("                            .=='\\   /`==.");
            System.out.println("                          .'\\   (`:')   /`.");
            System.out.println("                        _/_ |_.-' : `-._|__\\_");
            System.out.println("                       <___>'\\    :   / `<___>");
            System.out.println("                       /  /   >=======<  /  /");
            System.out.println("                     _/ .'   /  ,-:-.  \\/=,'");
            System.out.println("                    / _/    |__/v^v^v\\__) \\");
            System.out.println("                    \\(\\)     |V^V^V^V^V|\\_/");
            System.out.println("                     (\\\\     \\`---|---'/");
            System.out.println("                       \\\\     \\-._|_,-/");
            System.out.println("                        \\\\     |__|__|");
            System.out.println("                         \\\\   <___X___>");
            System.out.println("                          \\\\   \\..|../");
            System.out.println("                           \\\\   \\ | /");
            System.out.println("                            \\\\  /V|V\\");
            System.out.println("                             \\|/  |  \\");
            System.out.println("                              '--' `--`  ");
            System.out.println("");
            combateCastillo.Combatir(perCastillo, guardiaAlmacen);
            if (perCastillo.escapar == true) {
                sala1();
            }

            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Con el almacén despejado, haces acopio de algunas cosas.");
            System.out.println("Te guardas 7 pociones de vida y 7 de mana");
            perCastillo.pocionVida = perCastillo.pocionVida + 7;
            perCastillo.pocionMana = perCastillo.pocionMana + 7;
            System.out.println("Ahora tienes " + perCastillo.pocionVida + " pociones de vida y "+perCastillo.pocionMana+" pociones de mana.");
            enter();
            System.out.println("Te guardas una antorcha, podría ser util.");
            antorcha = true;
            enter();
            System.out.println("Tambien encuentras varias alabardas. (60 de daño)");
            System.out.println("Que quieres hacer?");
            System.out.println("1. Equipar alabarda. (60 de armadura)");
            System.out.println("2. Mantener el arma actual.");

            int eleccionAlabarda = reader.nextInt();

            switch (eleccionAlabarda) {

                case 1:
                    perCastillo.desequiparArma();
                    perCastillo.equiparAlabarda();
                    System.out.println("Tu ataque total es ahora: " + perCastillo.dañoTotal);
                    enter();
                    break;

                case 2:
                    System.out.println("Mantienes tu arma.");
                    enter();
                    break;
            }

            System.out.println("Sales del almacén.");
            enter();
            
            
        } else if (antorcha == true) { //en caso de entrar una segunda vez.
            System.out.println("Vuelves a entrar en el almacén. Solo quedan alabardas.");
            System.out.println("Que quieres hacer?");
            System.out.println("1. Equipar alabarda.");
            System.out.println("2. Mantener el arma actual.");

            int eleccionAlabarda = reader.nextInt();

            switch (eleccionAlabarda) {

                case 1:
                    perCastillo.desequiparArma();
                    perCastillo.equiparAlabarda();
                    System.out.println("Tu ataque total es ahora: " + perCastillo.dañoTotal);
                    enter();
                    break;

                case 2:
                    System.out.println("Mantienes tu arma.");
                    enter();
                    break;
            }
            System.out.println("Sales del almacén.");
            enter();

        }

        sala1();
    }

    public void salaIzquierdaBajo() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Entras en una habitación completamente a oscuras.");

        if (antorcha == false) { //En caso de entrar sin haber completado la sala Derecha previamente.
            System.out.println("No ves nada. Deberias encontrar una forma de alumbrar la sala.");
            System.out.println("Sales de la habitación.");
            enter();

        } else if (antorcha == true) {
            System.out.println("No ves nada, asi que prendes la antorcha que cogiste en el almacén.");
            System.out.println("Lo que parecia una simple habitación resulta ser un largo pasillo.");
            System.out.println("Lo recorres hasta llegar a una gran habitación.");
            enter();
            escaleras();
        }
    }

    public void escaleras() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("La habitación solo parece ofrecer una forma de continuar, unas grandes escaleras que suben al piso superior.");
        System.out.println("Sin embargo, las escaleras estan custodiadas por una gran guardia con escudo y alabarda.");
        System.out.println("");
        System.out.println("  ,   A           {}");
        System.out.println(" / \\, | ,        .--.");
        System.out.println("|    =|= >      /.--.\\");
        System.out.println(" \\ /` | `       |====|");
        System.out.println("  `   |         |`::`|");
        System.out.println("      |     .-;`\\..../`;_.-^-._");
        System.out.println("     /\\\\/  /  |...::..|`   :   `|");
        System.out.println("     |:'\\ |   /'''::''|   .:.   |");
        System.out.println("      \\ /\\;-,/\\   ::  |..:::::..|");
        System.out.println("      |\\ <` >  >._::_.| ':::::' |");
        System.out.println("      | `\"\"`  /   ^^  |   ':'   |");
        System.out.println("      |       |       \\    :    /");
        System.out.println("      |       |        \\   :   /");
        System.out.println("      |       |___/\\___|`-.:.-`");
        System.out.println("      |        \\_ || _/    `");
        System.out.println("      |        <_ >< _>");
        System.out.println("      |        |  ||  |");
        System.out.println("      |        |  ||  |");
        System.out.println("      |       _\\.:||:./_");
        System.out.println("      |      /____/\\____\\");
        System.out.println("");

        combateCastillo.Combatir(perCastillo, jefeEscaleras);
        if (perCastillo.escapar == true) {
            System.out.println("Vuelves a la primera sala.");
            sala1();
        }

        System.out.println("Una vez que lo derrotas, usas las escaleras para subir.");
        pisoSuperior();

    }

    public void pisoSuperior() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Una vez que llegas al piso superior encuentras a 3 guardias protegiendo una gran puerta dorada: Las estancias del rey.");
        System.out.println("Se trata de 2 guardias normales y uno que parece el jefe, similar al que protegia las escaleras.");
        enter();
        //3 combates seguidos.
        System.out.println("Primero te ataca uno de los guardias ordinarios.");
        System.out.println("");
            System.out.println("                                 _A_");
            System.out.println("                                / | \\");
            System.out.println("                               |.-=-.|");
            System.out.println("                               )\\_|_/(");
            System.out.println("                            .=='\\   /`==.");
            System.out.println("                          .'\\   (`:')   /`.");
            System.out.println("                        _/_ |_.-' : `-._|__\\_");
            System.out.println("                       <___>'\\    :   / `<___>");
            System.out.println("                       /  /   >=======<  /  /");
            System.out.println("                     _/ .'   /  ,-:-.  \\/=,'");
            System.out.println("                    / _/    |__/v^v^v\\__) \\");
            System.out.println("                    \\(\\)     |V^V^V^V^V|\\_/");
            System.out.println("                     (\\\\     \\`---|---'/");
            System.out.println("                       \\\\     \\-._|_,-/");
            System.out.println("                        \\\\     |__|__|");
            System.out.println("                         \\\\   <___X___>");
            System.out.println("                          \\\\   \\..|../");
            System.out.println("                           \\\\   \\ | /");
            System.out.println("                            \\\\  /V|V\\");
            System.out.println("                             \\|/  |  \\");
            System.out.println("                              '--' `--`  ");
            System.out.println("");
        combateCastillo.Combatir(perCastillo, guardiaSuperior1);
        if (perCastillo.escapar == true) {
            System.out.println("Vuelves a la primera sala.");
            sala1();
        }
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Despues, el segundo.");
        System.out.println("");
            System.out.println("                                 _A_");
            System.out.println("                                / | \\");
            System.out.println("                               |.-=-.|");
            System.out.println("                               )\\_|_/(");
            System.out.println("                            .=='\\   /`==.");
            System.out.println("                          .'\\   (`:')   /`.");
            System.out.println("                        _/_ |_.-' : `-._|__\\_");
            System.out.println("                       <___>'\\    :   / `<___>");
            System.out.println("                       /  /   >=======<  /  /");
            System.out.println("                     _/ .'   /  ,-:-.  \\/=,'");
            System.out.println("                    / _/    |__/v^v^v\\__) \\");
            System.out.println("                    \\(\\)     |V^V^V^V^V|\\_/");
            System.out.println("                     (\\\\     \\`---|---'/");
            System.out.println("                       \\\\     \\-._|_,-/");
            System.out.println("                        \\\\     |__|__|");
            System.out.println("                         \\\\   <___X___>");
            System.out.println("                          \\\\   \\..|../");
            System.out.println("                           \\\\   \\ | /");
            System.out.println("                            \\\\  /V|V\\");
            System.out.println("                             \\|/  |  \\");
            System.out.println("                              '--' `--`  ");
            System.out.println("");
        combateCastillo.Combatir(perCastillo, guardiaSuperior2);
        if (perCastillo.escapar == true) {
            System.out.println("Vuelves a la primera sala.");
            sala1();
        }
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Una vez derrotados su lacayos, el lider se lanza a por tí.");
        System.out.println("");
        System.out.println("  ,   A           {}");
        System.out.println(" / \\, | ,        .--.");
        System.out.println("|    =|= >      /.--.\\");
        System.out.println(" \\ /` | `       |====|");
        System.out.println("  `   |         |`::`|");
        System.out.println("      |     .-;`\\..../`;_.-^-._");
        System.out.println("     /\\\\/  /  |...::..|`   :   `|");
        System.out.println("     |:'\\ |   /'''::''|   .:.   |");
        System.out.println("      \\ /\\;-,/\\   ::  |..:::::..|");
        System.out.println("      |\\ <` >  >._::_.| ':::::' |");
        System.out.println("      | `\"\"`  /   ^^  |   ':'   |");
        System.out.println("      |       |       \\    :    /");
        System.out.println("      |       |        \\   :   /");
        System.out.println("      |       |___/\\___|`-.:.-`");
        System.out.println("      |        \\_ || _/    `");
        System.out.println("      |        <_ >< _>");
        System.out.println("      |        |  ||  |");
        System.out.println("      |        |  ||  |");
        System.out.println("      |       _\\.:||:./_");
        System.out.println("      |      /____/\\____\\");
        System.out.println("");
        combateCastillo.Combatir(perCastillo, jefeSuperior);
        if (perCastillo.escapar == true) {
            System.out.println("Vuelves a la primera sala.");
            sala1();
        }

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("La sala esta libre de amenenazas. Usas la puerta para entrar en las estancias del rey.");
        enter();

        estancias();

    }

    public void estancias() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("El rey sabe a lo que has venido. Al oir el barullo de fuera se ha puesto su armadura dorada y ha cogido el simbolo de su poder: la espada esmeralda.");
        System.out.println("Vas a tener que arrancarla de sus muertas manos si quieres hacerte con la espada.");

        System.out.println("");
        System.out.println("      _,.");
        System.out.println("    ,` -.)");
        System.out.println("   ( _/-\\\\-._");
        System.out.println("  /,|`--._,-^|            ,");
        System.out.println("  \\_| |`-._/||          ,'|");
        System.out.println("    |  `-, / |         /  /");
        System.out.println("    |     || |        /  /");
        System.out.println("     `r-._||/   __   /  /");
        System.out.println(" __,-<_     )`-/  `./  /");
        System.out.println("'  \\   `---'   \\   /  /");
        System.out.println("    |           |./  /");
        System.out.println("    /           //  /");
        System.out.println("\\_/' \\         |/  /");
        System.out.println(" |    |   _,^-'/  /");
        System.out.println(" |    , ``  (\\/  /_");
        System.out.println("  \\,.->._    \\X-=/^");
        System.out.println("  (  /   `-._//^`");
        System.out.println("   `Y-.____(__}");
        System.out.println("    |     {__)");
        System.out.println("          ()");

        enter();

        combateCastillo.Combatir(perCastillo, rey);
        if (perCastillo.escapar == true) {
            System.out.println("Vuelves a la primera sala.");
            sala1();
        }

        System.out.println("El Rey cae derrotado, su cruel dominio sobre estas tierras ha terminado.");
        enter();
        System.out.println("Recoges la espada Esmeralda, con ella serás reconocido como el nuevo monarca.");
        System.out.println("¿Seras un rey justo o te convertirás en tirano como el anterior?");
        perCastillo.desequiparArma(); //Se equipa el arma en caso de que se quiera seguir jugando.
        perCastillo.equiparEspadaEsmeralda();
        perCastillo.dinero = perCastillo.dinero + 5000;
        enter();

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("ENHORABUENA! HAS COMPLETADO LA CAMPAÑA DE \"PHAKO'S QUEST\".");
        System.out.println("Puedes terminar el juego o seguir explorando el mundo.");
        System.out.println("1. Finalizar el juego.");
        System.out.println("2. Volver al cruce de caminos y continuar la aventura.");

        int eleccionFinal = reader.nextInt();

        switch (eleccionFinal) {
            case 1:  //El juego y el programa terminan. Se rompe el bucle del cruce de caminos.
                System.out.println("                                                                        _________          _______    _______  _        ______  ");
                System.out.println("                                                                        \\__   __/|\\     /|(  ____ \\  (  ____ \\( (    /|(  __  \\ ");
                System.out.println("                                                                           ) (   | )   ( || (    \\/  | (    \\/|  \\  ( || (  \\  )");
                System.out.println("                                                                           | |   | (___) || (__      | (__    |   \\ | || |   ) |");
                System.out.println("                                                                           | |   |  ___  ||  __)     |  __)   | (\\ \\) || |   | |");
                System.out.println("                                                                           | |   | (   ) || (        | (      | | \\   || |   ) |");
                System.out.println("                                                                           | |   | )   ( || (____/\\  | (____/\\| )  \\  || (__/  )");
                System.out.println("                                                                           )_(   |/     \\|(_______/  (_______/|/    )_)(______/ ");
                System.out.println("");
                perCastillo.ending = 1;
                break;
            case 2:
                break;  //Se vuelve al bucle del cruce de caminos.
        }
    }

}
