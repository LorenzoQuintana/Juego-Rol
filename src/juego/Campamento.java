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
public class Campamento {

    Scanner reader = new Scanner(System.in);
    Combate combateCamp = new Combate();
    Personaje perCamp = new Personaje(); //Se crea un personaje nuevo que será utilizado dentro de esta localización.
    
    //Enemigos
    BandidoJefe jefe1=new BandidoJefe();

    public void setPerCampamento(Personaje perIn) { //Pasa la información del personaje principal al creado exclusivamente para esta localizacion
        perCamp.vida = perIn.vida;
        perCamp.mana = perIn.mana;
        perCamp.armadura = perIn.armadura;
        perCamp.dañoBasico = perIn.dañoBasico;
        perCamp.dañoTotal = perIn.dañoTotal;
        perCamp.dañoMagico = perIn.dañoMagico;
        perCamp.dañoMagicoTotal = perIn.dañoMagicoTotal;
        perCamp.pocionVida = perIn.pocionVida;
        perCamp.pocionMana = perIn.pocionMana;
        perCamp.dinero = perIn.dinero;
        perCamp.pocion = perIn.pocion;
        perCamp.cerveza = perIn.cerveza;
        perCamp.cuarzoMorado = perIn.cuarzoMorado;
        perCamp.objetoMaz2 = perIn.objetoMaz2;
        perCamp.objetoCasa1 = perIn.objetoCasa1;
        perCamp.mapa = perIn.mapa;
        perCamp.montura = perIn.montura;
        perCamp.ending = perIn.ending;

    }

    public void actualizarPer(Personaje perIn) {  //Pasa la nueva información al perosnaje principal.
        perIn.vida = perCamp.vida;
        perIn.mana = perCamp.mana;
        perIn.armadura = perCamp.armadura;
        perIn.dañoBasico = perCamp.dañoBasico;
        perIn.dañoTotal = perCamp.dañoTotal;
        perIn.dañoMagico = perCamp.dañoMagico;
        perIn.dañoMagicoTotal = perCamp.dañoMagicoTotal;
        perIn.pocionVida = perCamp.pocionVida;
        perIn.pocionMana = perCamp.pocionMana;
        perIn.dinero = perCamp.dinero;
        perIn.pocion = perCamp.pocion;
        perIn.cerveza = perCamp.cerveza;
        perIn.cuarzoMorado = perCamp.cuarzoMorado;
        perIn.objetoMaz2 = perCamp.objetoMaz2;
        perIn.objetoCasa1 = perCamp.objetoCasa1;
        perIn.mapa = perCamp.mapa;
        perIn.montura = perCamp.montura;
        perIn.ending = perCamp.ending;
    }

    public void getInfoPersonaje() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Información del personaje:");
        System.out.println("Puntos de vida: " + perCamp.vida);
        System.out.println("Puntos de mana: " + perCamp.mana);
        System.out.println("Puntos de armadura: " + perCamp.armadura);
        System.out.println("Puntos de daño basico: " + perCamp.dañoBasico);
        System.out.println("Puntos de daño total: " + perCamp.dañoTotal);
        System.out.println("Puntos de daño magico: " + perCamp.dañoMagico);
        System.out.println("Puntos de daño magico total: " + perCamp.dañoMagicoTotal);
        System.out.println("Pociones de vida: " + perCamp.pocionVida);
        System.out.println("Pociones de maná: " + perCamp.pocionMana);
        System.out.println("Dineros: " + perCamp.dinero);
    }

    public void enter() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public void alrededores() {
        perCamp.guardarPersonaje(perCamp); //El personaje se guarda en fichero.
        System.out.println("");
        System.out.println("                           |");
        System.out.println("                          /^\\");
        System.out.println("                         / : \\             (  (   )");
        System.out.println("                        /  :  \\           (          )");
        System.out.println("                       / / : \\ \\        (    (   )  )");
        System.out.println("    (  )  (  )        /  / :  \\ \\         ( (   )  )  )");
        System.out.println("   (   ( (    )      / .   : '   \\");
        System.out.println("     (   ( )   )    / .   .:  '   \\                           .");
        System.out.println("      ( (   )      /   / . :  .    \\                                  .");
        System.out.println("                  /        :   .    \\                            .");
        System.out.println("                 /         :    .    \\               .");
        System.out.println("                /   /  ,   :        \\ \\      .                '    .  '");
        System.out.println("               /      ,    :           \\                  .    .      .");
        System.out.println("              /            :    \\     . \\  `    .     '      `");
        System.out.println("             /   ,     /   :     '     . \\  )     ' .          '  .  '  '");
        System.out.println("            /   ,     '    :  .   \\     . \\( ( ,   ,                 .");
        System.out.println("           /   ,     ,  /  :   ,   \\       \\        ( '    .  .` )     ,");
        System.out.println("          /   /   / ,      |    \\   '   \\   \\) ) ,)  )  .       (   )");
        System.out.println("         /         ,  /  _/ \\        '   `   \\(, (             ( ) ( (");
        System.out.println("        /    ,       /  /    \\_   \\       \\   \\)    )  .     (  ( (   )");
        System.out.println("       / .       /\\_/\\_/_    _ \\__/\\    \\      \\  (,     , '  .( ) ) (");
        System.out.println("     .`|.  ,    oooO   / )  ( \\   Oooo      \\  |'. )  )      )( ( ((, )");
        System.out.println("   .`  /  ,  / (   )  / (    ) \\  (   )    ,   \\) '. (    ( (  )/)\\))(");
        System.out.println("_.`   / _,  /_/ \\ (  (   )  (   )  ) /\\_    \\_  \\(  '.)  )   )(//\\)\\\\_)");
        System.out.println("\\_,._/_/_\\__/____\\_)__oooO__Oooo__(_/___\\___/_\\__|_),_/_._ )__//_/\\\\_\\\\__,_,._");
        System.out.println("  `' '`  ~ \"'` ^~~^'`   ~^  '~~^'   ^^~~' '~~~   `''  '`  ~'~~\"\" '^\"\"\"'' ~~ ^\"");

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Siguiendo las indicaciones del mapa, descubres el campamento de los bandidos.");
        System.out.println("1. Acercarte (NO ENTRAR, un bug evita que se pueda huir del combate sin haber derrotado a todos los bandidos.)"); 
        System.out.println("2. Marcharte");
        int eleccionPuerta = reader.nextInt();
        
        switch (eleccionPuerta) {
            case 1:
                entrada();
                break;

            case 2:
                System.out.println("No quieres problemas y te marchas del lugar.");
                enter();
                break;
        }
    }

    public void entrada() {

        if (perCamp.mapa == 1) {

            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Siguiendo las indicaciones del mapa, llegas al campamento de los bandidos.");
            System.out.println("De una de las tiendas sale el jefe de la banda de bandidos que esta atemorizando los caminos.");
            enter();

            System.out.println("Un bandido te ataca.");
            ascii();

                combateCamp.Combatir(perCamp, jefe1);
                if (perCamp.escapar == true) {
                    alrededores();
                }

                else {
            alrededores();
                }
        
        } else if (perCamp.mapa == 2) {  //En el caso de que ya haya sido completado.
            System.out.println("Entras en el campamento bandido pero lo encuentras desolado. No hay nada mas que hacer aqui.");
            System.out.println("Te marchas del lugar.");
            enter();
            alrededores();
        }

    }
    
    public void ascii(){            //Metodo que muestra un dibujo ASCII cada vez que te enfrentas a un bandido.
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
    }

}
