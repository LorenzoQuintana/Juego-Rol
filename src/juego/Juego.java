/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Juego {

    //FUNCIONAMIENTO DEL PROGRAMA:
    //Se crea un objeto personaje principal.
    //Una vez creado y guardado se comienza un bucle llamado "Cruce de caminos". Una vez iniciado continuará hasta el final del juego.
    //Desde ese bucle se puede acceder a varias clases "localizaciones". Cada una de ellas tendrá su propio objeto personaje que recibirá los atributos del principal.
    //Los metodos de una localizacion estan comunicados entre sí. Si se llega a uno que no comunica con otro, se vuelve al cruce de caminos.
    //Una vez que se vuelve al cruce, el personaje especifico de la localización copia sus atributos en el personaje principal.

    public static void main(String[] args) {

        try {
            File f = new File("FichaPersonaje.txt"); //Fichero de guardado.
            f.createNewFile();
            Personaje per = new Personaje(); //Personaje basico. Copia sus atributos al especifico de una localizacion cuando se entra en ella. Recibe los atributos actualizados cuando se sale.

            titulo();              //Simple titulo en ascii
            crearPersonaje(per);   //Se crea el personaje principal. Se elige la clase y se guarda en el fichero.
            cruceDeCaminos(per);   //Bucle que se mantiene durante toda la partida. Da acceso a las diferentes localizaciones.

        } catch (IOException e) {
            System.out.println("error: " + e);
        }
    }

    static void crearPersonaje(Personaje perIn) {
        Scanner reader2 = new Scanner(System.in);
        int eleccion, opcionPer;

        do {
            System.out.println("");
            System.out.println(" __  __ ___ _  _ _   _   ___ ___ ___ _  _  ___ ___ ___  _   _    ");
            System.out.println("|  \\/  | __| \\| | | | | | _ \\ _ \\_ _| \\| |/ __|_ _| _ \\/_\\ | |   ");
            System.out.println("| |\\/| | _|| .` | |_| | |  _/   /| || .` | (__ | ||  _/ _ \\| |__ ");
            System.out.println("|_|  |_|___|_|\\_|\\___/  |_| |_|_\\___|_|\\_|\\___|___|_|/_/ \\_\\____|");
            System.out.println("");
            System.out.println("1. CREAR PERSONAJE");
            System.out.println("2. CARGAR PERSONAJE"); 
            System.out.println("3. INFORMACIÓN SOBRE EL JUEGO (LEER ANTES DE JUGAR)");
            eleccion = reader2.nextInt();

            switch (eleccion) {
                case 1:

                    do {
                        System.out.println("\n------------------------------------------------------------------\n");
                        System.out.println("¿CUAL ES LA CLASE DE TU PERSONAJE?");
                        System.out.println("1. Guerrero                                  2.Paladin");
                        System.out.println("   ()                                        |`-._/\\_.-`|");
                        System.out.println("   )(                                        |    ||    |");
                        System.out.println("o======o                                     |___o()o___|");
                        System.out.println("   ||                                        |__((<>))__|");
                        System.out.println("   ||                                        \\   o\\/o   /");
                        System.out.println("   ||                                         \\   ||   /");
                        System.out.println("   ||                                          \\  ||  /");
                        System.out.println("   ||                                           '.||.'");
                        System.out.println("   \\/                                             ``");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("3. Pícaro                                     4.Bárbaro");
                        System.out.println("   __                                           ,  /\\  .  ");
                        System.out.println("   ||                                          //`-||-'\\\\ ");
                        System.out.println("  _||_                                        (| -=||=- |)");
                        System.out.println(" ( || )                                        \\\\,-||-.// ");
                        System.out.println("   ||                                           `  ||  '  ");
                        System.out.println("   ||                                              || ");
                        System.out.println("   ||                                              || ");
                        System.out.println("   \\/                                              || ");
                        System.out.println("                                                   || ");
                        System.out.println("                                                   ()");
                        System.out.println("");
                        System.out.println("5. Mago                                       6.Bardo");
                        System.out.println("");
                        System.out.println("(`-._o_.-')                                      |&|");
                        System.out.println(" (`- | -')                                        #");
                        System.out.println("  `-.|.-'                                         #");
                        System.out.println("    o|o                                           #");
                        System.out.println("   ( | )                                         _#_");
                        System.out.println("    `!'                                         ( # )");
                        System.out.println("    (|)                                         / 0 \\ ");
                        System.out.println("     X                                         ( === )");
                        System.out.println("    (|)                                         `---'  ");
                        System.out.println("    '|`                                       ");
                        System.out.println("");

                        System.out.println("7. Información sobre las clases.");
                        opcionPer = reader2.nextInt();

                        switch (opcionPer) {
                            case 1:
                                intro();
                                System.out.println("");
                                System.out.println("Has creado un guerrero.");
                                perIn.rellenarGuerrero();
                                perIn.equiparEspada();

                                break;

                            case 2:
                                intro();
                                System.out.println("");
                                System.out.println("Has creado un paladín.");
                                perIn.rellenarPaladin();
                                perIn.equiparMartillo();
                                perIn.equiparMMadera();

                                break;

                            case 3:
                                intro();
                                System.out.println("");
                                System.out.println("Has creado un pícaro.");
                                perIn.rellenarPicaro();
                                perIn.equiparEspada();

                                break;

                            case 4:
                                intro();
                                System.out.println("");
                                System.out.println("Has creado un bárbaro.");
                                perIn.rellenarBarbaro();
                                perIn.equiparMandoble();

                                break;

                            case 5:
                                intro();
                                System.out.println("");
                                System.out.println("Has creado un mago.");
                                perIn.rellenarMago();
                                perIn.equiparMMadera();

                                break;

                            case 6:
                                intro();
                                System.out.println("");
                                System.out.println("Has creado un bardo.");
                                perIn.rellenarBardo();
                                perIn.equiparEspada();
                                perIn.equiparMMadera();

                                break;

                            case 7:
                                clases();
                                break;

                        }

                    } while (opcionPer == 7);

                    perIn.guardarPersonaje(perIn); //Despues de crear un personaje, se guarda.
                    perIn.getInfoPersonaje();
                    enter();
                    break;

                case 2:
                    perIn.cargarPersonaje(perIn); //Permite saltar la creación de personaje y rescatar uno ya guardado.
                    perIn.getInfoPersonaje();
                    enter();
                    break;

                case 3:
                    info();  //Información general sobre el juego (Forma de juego, caracteristicas...)
                    break;
            }

        } while (eleccion == 3);

    }

    //Bucle que se mantiene durante toda la partida. Da acceso a las diferentes localizaciones.
    //Necesita al personaje como parametro para que pueda ser copiado a lso personajes especificos de cada zona.
    //No termina hasta no terminar el juego.
    
    static void cruceDeCaminos(Personaje perIn) {  
        int ending = 0;
        Scanner readerCaminos = new Scanner(System.in);
        Mazmorra1 maz1 = new Mazmorra1();
        Pueblo pueblo = new Pueblo();
        Bosque bosque = new Bosque();
        Mazmorra2 maz2 = new Mazmorra2();
        Campamento camp = new Campamento();
        Castillo castillo = new Castillo();

        int eleccionCamino;

        do {
            emboscada(perIn);
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Te encuentras en un cruce de caminos.");
            System.out.println("1. Ir al norte. (Castillo final)");
            System.out.println("2. Ir al sur. (Pueblo)");
            System.out.println("3. Ir al este. (Bosque)");
            System.out.println("4. Ir al oeste. (Mazmorra 2)");
            if (perIn.cerveza == 1) {
                System.out.println("5. Ir al noroeste.(Mazmorra 1)");
            }

            if (perIn.mapa > 0) {
                System.out.println("6. Ir al campamento bandido.");
            }
            eleccionCamino = readerCaminos.nextInt();

            switch (eleccionCamino) {
                case 1:
                    emboscada(perIn);  //Viajar a cualquier lugar tiene riesgo de emboscada.
                    castillo.setPerCastillo(perIn); //Se actualiza el personaje vacio y especifico de esa localizacion.
                    castillo.puertaEntrada(); //Se activa la primera estancia de esta localización. A las demas se accederá a partir de esta.
                    castillo.actualizarPer(perIn); //Al salir, los atributos actualizados son copiados de nuevo al personaje principal.
                    break;

                case 2:
                    emboscada(perIn);
                    pueblo.setPerPueblo(perIn);
                    pueblo.puertaPrincipal();
                    pueblo.actualizarPer(perIn);
                    break;

                case 3:
                    emboscada(perIn);
                    bosque.setPerBosque(perIn);
                    bosque.cartelEntrada();
                    bosque.actualizarPer(perIn);
                    break;

                case 4:
                    emboscada(perIn);
                    maz2.setPerMaz2(perIn);
                    maz2.puertaPrincipal();
                    maz2.actualizarPer(perIn);

                    break;

                case 5:
                    emboscada(perIn);
                    maz1.setPerMaz1(perIn);
                    maz1.puertaExterior();
                    maz1.actualizarPer(perIn);
                    break;

                case 6:
                    emboscada(perIn);
                    camp.setPerCampamento(perIn);
                    camp.alrededores();
                    camp.actualizarPer(perIn);
                    break;

            }
        } while (perIn.ending == 0); //Ending pasa a valer uno al termianr la campaña y decidir terminar.
    }

    static void emboscada(Personaje perIn) {
        Bandido band1 = new Bandido();
        Combate combate = new Combate();

        int random = 0;  //Un random decide si hay emboscada, diferentes valores de montura producen difernetes random.
        switch (perIn.montura) {

            case 0:
                random = (int) Math.floor(Math.random() * 5);
                break;

            case 1:
                random = (int) Math.floor(Math.random() * 8);
                break;

            case 2:
                random = (int) Math.floor(Math.random() * 10);
                break;

        }

        if (random == 2) {  //Si el random es 2, hay emboscada.
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Mientras viajabas, te encuentras con una emboscada, un bandido aparece y te ataca.");
            System.out.println("");
            System.out.println("                             .I.");
            System.out.println("                            / : \\");
            System.out.println("                            |===|");
            System.out.println("                            >._.<");
            System.out.println("                        .=-<     >-=.");
            System.out.println("                       /.'`(`-+-')'`.\\");
            System.out.println("                     _/`.__/  :  \\__.'\\_");
            System.out.println("                    ( `._/\\`. : .'/\\_.' )");
            System.out.println("                     >-(_) \\ `:' / (_)-<");
            System.out.println("                     | |  / \\___/ \\  | |");
            System.out.println("                     )^( | .' : `. | )^(");
            System.out.println("                    |  _\\|`-._:_.-'| \\  |");
            System.out.println("                    \"-<\\)| :  |  : |  \"-\"");
            System.out.println("                     (\\\\| : / \\ : |");
            System.out.println("                        \\\\-:-| |-:-')");
            System.out.println("                         \\\\:_/ \\_:_/");
            System.out.println("                         |\\\\_| |_:_|");
            System.out.println("                         (;\\\\/ \\__;)");
            System.out.println("                         |: \\\\  | :|");
            System.out.println("                         \\: /\\\\ \\ :/");
            System.out.println("                         |==| \\\\|==|");
            System.out.println("                        /v-'(  \\\\`-v\\");
            System.out.println("                       // .-'   \\\\. \\\\");
            System.out.println("                       `-'       \\\\`-'    ");
            System.out.println("                                  \\|");
            System.out.println("");
           

            enter();
            combate.Combatir(perIn, band1);

            int rand2 = (int) Math.floor(Math.random() * 3); //posibilidad aleatoria de recibir un mapa.
            if (rand2 == 0) {

                if (perIn.mapa == 0) {
                    System.out.println("Revisas las pertenencias del bandido y encuentras un mapa con la ubicación de su campamento.");
                    enter();
                    perIn.mapa = 1;
                }
            }
        } else {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Viajas sin problemas a tu destino.");

        }
    }

    static void enter() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    static void clases() {  //informacion sobre las diferentes "clases"
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("En esta versión de \" PHAKO'S QUEST\" existen 6 clases diferentes:");
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("GUERRERO: La opción equilibrada. Vida y ataque medios. Comienza con espada y 2 pociones de vida.");
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("PALADIN: Tanque. Gran cantidad de vida pero con ataque básico bajo. PUEDE USAR MAGIA DESPUES DE CONSEGUIR UN MEDALLÓN. Comienza con 5 de armadura, 5 pociones de vida Y 2 de mana.");
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("PICARO: Cañón de cristal. Vida baja pero ataque basico sobresaliente. Comienza con daga y 2 pociones de vida.");
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("BARBARO: Berserker. Gran vida y ataque. Comienza con armadura negativa y 3 pociones de vida. ");
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("MAGO: Destrucción mágica. Vida muy baja pero ataque magico demoledor. NO PUEDE USAR EL ATAQUE FÍSICO. Comienza con medallón, 5 pociones de vida y 10 de mana.");
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("BARDO: Curandero. Ni la vida ni el ataque destacan. PUEDE USAR MAGIA. Empieza con medallón, 15 pociones de vida y 5 de mana.");
        enter();
    }

    static void info() {  //informacion general sobre el juego.
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("--BIENVENIDO A LA VERSIÓN ALPHA DE \"PHAKO´S QUEST\"-- ");
        System.out.println("FUNCIONAMIENTO:");
        System.out.println("-El juego funciona de forma sencilla, usando los números para seleccionar la acción a realizar.");
        System.out.println("-A veces, el juego se detiene en un momento en el que no se presenta ninguna elección. Esto ayuda a que no aparezca demasiada información al mismo tiempo.");
        System.out.println("-En estas situaciones, se pulsará ENTER para continuar.");
        System.out.println("IMPORTANTE: No pulsar letras o teclas diferentes a las anteriormente mencionadas. (Por favor, sed buenos y no me rompais el juego)");
        enter();
        System.out.println("");
        System.out.println("CARACTERISTICAS PRINCIPALES:");
        System.out.println("-RPG por turnos. Durante el combate elegirás que hacer y a continuación tu enemigo responderá.");
        System.out.println("-Crea tu propio personaje usando las diferentes clases con caracteristicas diferentes.");
        System.out.println("-Todas las clases pueden equiparse todos los objetos pero algunas estarán limitadas en algunas disciplinas.");
        System.out.println("Tener un medallón equipado es necesario para poder usar el ataque mágico.");
        System.out.println("-Solo el Paladín, Mago y Bardo podrán usar el ataque mágico. El mago no podrá atacar cuerpo a cuerpo.)");
        System.out.println("");
        System.out.println("");
        System.out.println("-12 tipos de enemigo a los que derrotar.");
        System.out.println("-Se podrá huir de los combates, volviendo a una localización anterior y reduciendo un daño leve.");
        System.out.println("-Sistema de armas,armaduras y medallones equipables y mejorables. (Solo se podrán llevar encima 1 arma, 1 armadura y 1 medallón.)");
        System.out.println("-Sistema de pociones consumibles");
        System.out.println("-Sistema de botín. Los enemigos derrotados podrá dejar recompensas aleatorias.");
        enter();
        System.out.println("");
        System.out.println("-7 localizaciones diferentes por explorar.");
        System.out.println("-Exploración compleja. El poder adentrarse en algunas localizaciones conlleva haber completado otras anteriormente.");
        System.out.println("-Mundo abierto, volver a una localización ya visitada puede conllevar interaciones diferentes.");
        System.out.println("-Objetivos secundarios con recompensas unicas.");
        enter();
        System.out.println("");
        System.out.println("-Sistema de comercio. Podrás usar el dinero que ganes en comprar armas, armaduras, pociones e incluso monturas.");
        System.out.println("-Se podrán contratar los servicios del fabricante de armas o armaduras para mejorar las estadisticas de aquellas que tengan equipadas.");
        enter();
        System.out.println("");
        System.out.println("-Podrás ser emboscado durante tus viajes entre localizaciones.");
        System.out.println("-Si tienes suerte, algun bandido derrotado podría proporcionarte un mapa con la localización de su campamento.");
        System.out.println("-Se podrá reducir la frecuencia de estas emboscadas mediante el uso de una montura.");
        enter();

    }

    static void titulo() {
        System.out.println("     _,.");
        System.out.println("    ,` -.)");
        System.out.println("   ( _/-\\\\-._");
        System.out.println("  /,|`--._,-^|            ,");
        System.out.println("  \\_| |`-._/||          ,'|");
        System.out.println("    |  `-, / |         /  /");
        System.out.println("    |     || |        /  /  ");
        System.out.println("     `r-._||/   __   /  /   ");
        System.out.println(" __,-<_     )`-/  `./  /     _______           _______  _        _______  _______      _______           _______  _______ _________");
        System.out.println("'  \\   `---'   \\   /  /     (  ____ )|\\     /|(  ___  )| \\    /\\(  ___  )(  ____ \\    (  ___  )|\\     /|(  ____ \\(  ____ \\\\__   __/");
        System.out.println("    |           |./  /      | (    )|| )   ( || (   ) ||  \\  / /| (   ) || (    \\/    | (   ) || )   ( || (    \\/| (    \\/   ) (   ");
        System.out.println("    /           //  /       | (____)|| (___) || (___) ||  (_/ / | |   | || (_____     | |   | || |   | || (__    | (_____    | |   ");
        System.out.println("\\_/' \\         |/  /        |  _____)|  ___  ||  ___  ||   _ (  | |   | |(_____  )    | |   | || |   | ||  __)   (_____  )   | |   ");
        System.out.println(" |    |   _,^-'/  /         | (      | (   ) || (   ) ||  ( \\ \\ | |   | |      ) |    | | /\\| || |   | || (            ) |   | |   ");
        System.out.println(" |    , ``  (\\/  /_         | )      | )   ( || )   ( ||  /  \\ \\| (___) |/\\____) |    | (_\\ \\ || (___) || (____/\\/\\____) |   | |");
        System.out.println("  \\,.->._    \\X-=/^         |/       |/     \\||/     \\||_/    \\/(_______)\\_______)    (____\\/_)(_______)(_______/\\_______)   )_(  ");
        System.out.println("  (  /   `-._//^`  ");
        System.out.println("   `Y-.____(__}");
        System.out.println("    |     {__)");
        System.out.println("");
        enter();

    }

    static void intro() { //Texto de introduccion. Se muestra al crear un personaje nuevo.
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("El rey tirano ha aterrorizado estas tierras durante años. Es hora de que alguien le plante cara.");
        System.out.println("Eres Phako, una aventurero con la misión de derrotar al malvado rey.");
        System.out.println("Cuando lo hagas, podrás hacerte con el simbolo de la realeza, la Espada Esmeralda, con ella serás reconocido como nuevo rey.");
        System.out.println("¿Conseguirás entrar en el castillo y cumplir con tu destino?");
        enter();
    }

}
