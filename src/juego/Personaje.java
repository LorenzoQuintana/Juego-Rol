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
public class Personaje {

    
    //Estadisticas de personaje. Algunos se utilizarán unicamente para indicar progreso.
    int vida;      
    int mana;
    int armadura;
    int dañoBasico;
    int dañoTotal;
    int dañoMagico;
    int dañoMagicoTotal; 
    int pocionVida;
    int pocionMana;
    int dinero;
    int pocion = 0;
    int cerveza = 0; //Desbloquea un nuevo destino.
    int cuarzoMorado = 0;
    int objetoMaz2 = 0;
    int objetoCasa1 = 0;
    int mapa = 0; //Desbloquea un nuevo destino.
    int montura=0; //Cada montura tiene un numero. Eso decide la probabilidad de ser emboscado.
    int ending=0; //Cuando pasa a valer 1, el bucle cruce de caminos termina y el juego finaliza.
    boolean escapar = false;

    //CREACIÓN DE PERSONAJE______________________________________________________________________________________________________________________________________________________
    
    //Se crea un personaje basico, después se rellenan sus estadisticas segun la clase elegida.
    //Esto permite poder utilizar siempre al personaje basico en combate, lo que seria imposible de tener multiples subclases partiendo de "Personaje".
    public void rellenarGuerrero() {
        vida = 120;
        mana = -1000; //Los personajes que no pueden utilizar magia tienen un mana muy bajo para evitarselo.
        armadura = 0;
        dañoBasico = 15;
        pocionVida = 2;
        pocionMana = 0;
        dinero = 100;

    }

    public void rellenarPaladin() {
        vida = 150;
        mana = 50;
        armadura = 5;
        dañoBasico = 10;
        pocionVida = 5;
        pocionMana = 2;
        dinero = 100;

    }
    
    public void rellenarPicaro() {
        vida = 70;
        mana = -1000;
        armadura = 0;
        dañoBasico = 25;
        pocionVida = 2;
        pocionMana = 0;
        dinero = 100;

    }
    
    public void rellenarBarbaro() {
        vida = 170;
        mana = -1000;
        armadura = -15;
        dañoBasico = 20;
        pocionVida = 3;
        pocionMana = 0;
        dinero = 100;

    }
    
    public void rellenarMago() {
        vida = 50;
        mana = 300;
        armadura = 0;
        dañoBasico = -500;  //Los personajes que no pueden usar daño fisico tienen un daño basico muy bajo para impedirselo.
        dañoMagico=5;
        pocionVida = 5;
        pocionMana = 10;
        dinero = 100;

    }
    
    public void rellenarBardo() {
        vida = 70;
        mana = 150;
        armadura = 0;
        dañoBasico = 5;
        dañoMagico=0;
        pocionVida = 15;
        pocionMana = 5;
        dinero = 100;

    }

    //ESTADISTICAS-GUARDADO-CARGA_________________________________________________________________________________________________________________________________________________
    public void getInfoPersonaje() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Información del personaje:");
        System.out.println("Puntos de vida: " + vida);
        System.out.println("Puntos de mana: " + mana);
        System.out.println("Puntos de armadura: " + armadura);
        System.out.println("Puntos de daño basico: " + dañoBasico);
        System.out.println("Puntos de daño total: " + dañoTotal);
        System.out.println("Puntos de daño magico: " + dañoMagico);
        System.out.println("Puntos de daño magico total: " + dañoMagicoTotal);
        System.out.println("Pociones de vida: " + pocionVida);
        System.out.println("Pociones de maná: " + pocionMana);
        System.out.println("Dineros: " + dinero);

    }

    public void guardarPersonaje(Personaje perIn) {
        try {
            
            //Los atributos del personaje se guardan en un fichero. Se trata de numeros separados por puntos y coma.
            //El nombre del archivo siempre debe ser igual.
            //Solo se puede tener un personaje guardado por archivo.
            File f = new File("FichaPersonaje.txt");  
            f.createNewFile();
            Scanner reader = new Scanner(f);
            FileWriter fw = new FileWriter(f);

            Personaje per = new Personaje();
            per.rellenarGuerrero();

            //Se introducen los datos en el fichero.
            fw.write(perIn.vida + ";");
            fw.write(perIn.mana + ";");
            fw.write(perIn.armadura + ";");
            fw.write(perIn.dañoBasico + ";");
            fw.write(perIn.dañoTotal + ";");
            fw.write(perIn.dañoMagico + ";");
            fw.write(perIn.dañoMagicoTotal + ";");
            fw.write(perIn.pocionVida + ";");
            fw.write(perIn.pocionMana + ";");
            fw.write(perIn.dinero + ";");
            fw.write(perIn.pocion + ";");
            fw.write(perIn.cerveza + ";");
            fw.write(perIn.cuarzoMorado + ";");
            fw.write(perIn.objetoMaz2 + ";");
            fw.write(perIn.objetoCasa1 + ";");
            fw.write(perIn.montura + ";");
            fw.write(perIn.ending + ";");

            fw.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public void cargarPersonaje(Personaje perIn) {

        try { //Cargar un personaje guardado reestablece sus estadisticas y su progreso.
            int vida = 0;
            int mana = 0;
            int armadura = 0;
            int dañoBasico = 0;
            int dañoTotal = 0;
            int pocionVida = 0;
            int pocionMana = 0;
            int dinero = 0;
            int pocion = 0;
            

            File f = new File("FichaPersonaje.txt"); //Para poder usar un fichero, se debe llamar asi.
            Scanner reader = new Scanner(f);

            String[] datos = new String[0];
            while (reader.hasNextLine()) {                   //Se leen datos separados por puntos y coma, a continuacion, se introducen en un array.
                datos = (reader.nextLine()).split(";");
            }

            perIn.vida = Integer.parseInt(datos[0]);   //Los datos del array se trasmiten a las estadisticas del personaje.
            perIn.mana = Integer.parseInt(datos[1]);
            perIn.armadura = Integer.parseInt(datos[2]);
            perIn.dañoBasico = Integer.parseInt(datos[3]);
            perIn.dañoTotal = Integer.parseInt(datos[4]);
            perIn.dañoMagico = Integer.parseInt(datos[5]);
            perIn.dañoMagicoTotal = Integer.parseInt(datos[6]);
            perIn.pocionVida = Integer.parseInt(datos[7]);
            perIn.pocionMana = Integer.parseInt(datos[8]);
            perIn.dinero = Integer.parseInt(datos[9]);
            perIn.pocion = Integer.parseInt(datos[10]);
            perIn.cerveza = Integer.parseInt(datos[11]);
            perIn.cuarzoMorado = Integer.parseInt(datos[12]);
            perIn.objetoMaz2 = Integer.parseInt(datos[13]);
            perIn.objetoCasa1 = Integer.parseInt(datos[14]);
            perIn.montura = Integer.parseInt(datos[15]);
            perIn.ending = Integer.parseInt(datos[16]);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }

    //MECÁNICAS_____________________________________________________________________________________________________________________________________________________________________
    public boolean escapar() {
        System.out.println("Huyes del combate.");
        escapar = true;
        return escapar;
    }

    public int recibirDaño(int recibirIn) {  //Usado en el metodo Combatir.
        System.out.println("\n------------------------------------------------------------------\n");
        int dañoReal = recibirIn - armadura;
        System.out.println("Recibes " + dañoReal + " puntos de daño.");
        vida = vida - dañoReal;
        System.out.println("Te quedan " + vida + " puntos de vida.");

        System.out.println("\n------------------------------------------------------------------\n");
        return vida;

    }

    public int realizarDaño() {   //Usado en el metodo Combatir.
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Realizas un ataque provocando " + dañoTotal + " puntos de daño.");

        return dañoTotal;
    }
    
    public int realizarDañoMagico(){  //Usado en el metodo Combatir.
       System.out.println("\n------------------------------------------------------------------\n"); 
       System.out.println("Realizas un ataque mágico provocando " + dañoMagicoTotal + " puntos de daño.");
       return dañoMagicoTotal;
    }

    public void tomarPocionVida() {
        if (pocionVida > 0) {
            vida = vida + 50;
            pocionVida--;
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Has tomado una pocion de vida y has recuperado 50 puntos");
            System.out.println("Ahora tienes " + vida + " puntos de vida.");

        } else {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("No te quedan pociones de vida.");

        }
    }

    public void tomarPocionMana() {
        if (pocionMana > 0) {
            mana = mana + 50;
            pocionMana--;
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Has tomado una pocion de mana y has recuperado 50 puntos");
            System.out.println("Ahora tienes " + mana + " puntos de mana.");

        } else {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("No te quedan pociones de mana.");

        }
    }

    public void muerte() {  //Hace que el juego termine.
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Te has quedado sin puntos de vida y has muerto.");
        System.out.println("--GAME OVER--");

    }

    //INVENTARIO__________________________________________________________________________________________________________________________________________________________________
    
    //Los objetos del inventario no son "objetos" son metodos que modifican los atributos del personaje.
    
    //ARMAS     
    public void equiparEspada() {
        dañoTotal = dañoBasico + 20;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Te equipas una espada");

    }
    
    public void equiparDaga() {
        dañoTotal = dañoBasico + 15;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Te equipas una daga");

    }
    
    

    public void equiparMandoble() {
        dañoTotal = dañoBasico + 40;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Te equipas un mandoble");

    }

    public void equiparPalo() {
        dañoTotal = dañoBasico + 80;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Te equipas un palo");

    }
    
    public void equiparAlabarda() {
        dañoTotal = dañoBasico + 60;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Te equipas una alabarda.");

    }
    

    public void equiparMaza() {
        dañoTotal = dañoBasico + 15;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Te equipas una maza");
    }

    public void equiparMartillo() {
        dañoTotal = dañoBasico + 30;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Te equipas un martillo");
    }

    public void equiparEspadaEsmeralda() {
        dañoTotal = dañoBasico + 200;
    }
    
    public void equiparPorraCristal(){
        dañoTotal = dañoBasico + 45;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Te equipas la porra de cristal.");
    }
    

    //ARMADURAS
    public void equiparCuero() {
        armadura = armadura + 5;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Te vistes con armadura de cuero.");
    }

    public void equiparAcero() {
        armadura = armadura + 10;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Te vistes con armadura de acero.");
    }
    
    public void equiparCristal() {
        armadura = armadura + 20;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Te vistes con armadura de cristal.");
    }

    public void equiparRunica() {
        armadura = armadura + 30;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Te vistes con armadura rúnica.");
    }
    
    //ARTEFACTOS MAGICOS
    
    public void equiparMMadera(){
        dañoMagicoTotal = dañoMagico + 50;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Te equipas un medallón de madera sencillo.");
    }
    
    public void equiparMPulido(){
        dañoMagicoTotal = dañoMagico + 60;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Te equipas un medallón pulido.");
    }
    
    public void equiparMRunico(){
        dañoMagicoTotal = dañoMagico + 80;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Te equipas un medallón rúnico.");
    }
    
    public void equiparMCristal(){
        dañoMagicoTotal = dañoMagico + 70;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Te equipas un medallón con incrustaciones de cristal.");
    }
    
 
    public void mejorarArma(){
        dañoTotal=dañoTotal+5;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Mejoras tu arma actual. Ahora realizas "+dañoTotal+" puntos de daño total.");
    }
    
    public void mejorarArmadura(){
        armadura=armadura+5;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Mejoras tu armadura actual. Ahora tienes "+armadura+" puntos de armadura.");
    }
    
    public void mejorarMedallon(){
        dañoMagicoTotal=dañoMagicoTotal+10;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Mejoras tu medallón actual. Ahora realizas "+dañoMagicoTotal+" puntos de daño magico total.");
    }
    
    
    //Cambiar de "objeto" significa limpiar las estadisticas.

    public void desequiparArma() {
        dañoTotal = 0;
    }

    public void desequiparArmadura() {
        armadura = 0;
    }
    
    public void desequiparMedallon() {
        dañoMagicoTotal = 0;
    }
    
    

    //GETTERS-SETTERS_________________________________________________________________________________________________________________________________________________________________
    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setEscapar(boolean escapar) {
        this.escapar = escapar;
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
