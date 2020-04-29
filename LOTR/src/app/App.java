package app;

import java.util.*;
import armas.Arma;
import personajes.Personaje;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println();

        LOTR miLOTR = new LOTR();

        System.out.println("Iniciando Catalogo");

        miLOTR.inicializarCatalogoPersonajes();

        System.out.println("Seleccion personaje 1");

        System.out.println("**** 01 - Legolast ****");
        System.out.println("**** 02 - Gimli *******");
        System.out.println("**** 03 - Frodo *******");
        System.out.println("**** 04 - Sam *********");
        System.out.println("**** 05 - Peregrim ****");
        System.out.println("**** 06 - Aragon ******");
        System.out.println("**** 07 - Gandalf *****");
        System.out.println("**** 08 - Saruman *****");
        System.out.println("**** 09 - Trol ********");
        System.out.println("**** 10 - Orco ********");
        System.out.println("**** 11 - Goblim ******");

        int p1n;
        p1n = Teclado.nextInt();

        System.out.println("Seleccion personaje 2");

        System.out.println("**** 01 - Legolast ****");
        System.out.println("**** 02 - Gimli *******");
        System.out.println("**** 03 - Frodo *******");
        System.out.println("**** 04 - Sam *********");
        System.out.println("**** 05 - Peregrim ****");
        System.out.println("**** 06 - Aragon ******");
        System.out.println("**** 07 - Gandalf *****");
        System.out.println("**** 08 - Saruman *****");
        System.out.println("**** 09 - Trol ********");
        System.out.println("**** 10 - Orco ********");
        System.out.println("**** 11 - Goblim ******");

        int p2n;
        p2n = Teclado.nextInt();

        Personaje p1 = miLOTR.elegiPersonaje(p1n);
        Personaje p2 = miLOTR.elegiPersonaje(p2n);

        boolean turnop1 = true;

        System.out.println("¡Ataque!");

        while (p1.getSalud() > 0 && p2.getSalud() > 0) {
            Personaje atacante;
            Personaje victima;
            if (turnop1) {
                atacante = p1;
                victima = p2;

            } else {
                atacante = p2;
                victima = p1;

            }
            System.out.println("Personaje " + atacante.getNombre() + " ataca");
            Arma armaelegida = elegirArma(atacante);


            System.out.println(atacante.getNombre() +" elegió "+ armaelegida);

            atacante.atacar(victima, armaelegida);
            System.out.println("a " + victima.getNombre() + " le queda " + victima.getSalud());
            turnop1 = !turnop1;

        }
        if (p1.getSalud() > 0) {
            System.out.println("Ganó personaje 1");
        } else {
            System.out.println("Ganó personaje 2");
        }
    }

    public static Arma elegirArma(Personaje personaje) {
        System.out.println("Elija el arma 1 o el arma 2");
        int idarma = Teclado.nextInt();

        return personaje.armas.get(idarma - 1);

    }

}