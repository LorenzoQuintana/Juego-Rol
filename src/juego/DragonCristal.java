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
public class DragonCristal extends Enemigo {

    public DragonCristal() {
        super.vida = 150;
        super.mana = 0;
        super.armadura = 10;
        super.dañoBasico = 40;
        super.pocionVida = 0;
        super.pocionMana = 0;

    }

    @Override
    public void drop(Personaje perIn) {  
        Scanner reader=new Scanner(System.in);
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("El anciano dragón cae derrotado.");
        System.out.println("No guardaba ningún tesoro, asi que decides fabricartelo tu mismo.");
        enter();
        System.out.println("A pesar de estar hecho de cristal, el dragón está sangrando lo que parece un liquido plateado.");
        System.out.println("Decides guardar un poco en un frasco. Sabes que la sangre de dragón tiene propiedades contra la magia.");
        perIn.pocion++;  //Permitirá entrar en el bosque y desbloquear nuevas opciones en los mercaderes.
        enter();
        System.out.println("Te haces con los cuernos del dragon, parecen estar hechos de algun tipo de gema y podrían ser valisosos.");
        enter();
        System.out.println("Ademas, arrancas unas cuantas escamas. Seguro que encuentras a alguien que puede hacerte una armadura con ellas.");  
        enter();
    }
    
    public void enter(){
   Scanner scanner = new Scanner(System.in);
   scanner.nextLine();
}

}

