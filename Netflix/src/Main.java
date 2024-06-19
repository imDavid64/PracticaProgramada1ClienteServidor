import Netflix.Pelicula;
import Netflix.categorias.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Catalogo con todas las películas
        List<Pelicula> catalogo = crearCatalogo();


        // Variables
        boolean repetirMenu = true;
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        // Menú principal
        while (repetirMenu) {
            try {
                String menuPrincipal = "\n===========Bienvenid@ a Netflix===========\n" +
                        "1. Ver catalogo de comedias.\n" +
                        "2. Ver catalogo de accion.\n" +
                        "3. Ver catalogo de terror.\n" +
                        "4. Ver catalogo de drama.\n" +
                        "5. Ver todo el catálogo.\n" +
                        "6. Salir.\n";

                System.out.println(menuPrincipal);
                System.out.print("Elija una opción: ");

                String entradaUsuario = scanner.nextLine();
                opcion = Integer.parseInt(entradaUsuario);

                switch (opcion) {
                    case 1:


                        List<Pelicula> peliculasComedia = new ArrayList<>();

                        for (Pelicula peli : catalogo) {
                            if (peli instanceof PeliculaComedia) {
                                peliculasComedia.add(peli);
                            }
                        }


                        int i = 1;
                        String submenu = "";
                        for (Pelicula peli : peliculasComedia) {
                            submenu = submenu + i + " . " + peli.getTitulo() + "\n";
                            i += 1;
                        }
                        submenu = submenu + i + " . Salir\n";


                        boolean flag = false;

                        do {
                            System.out.println(submenu);
                            System.out.print("Elija una opción: ");
                            String opcionEscogida = scanner.nextLine();

                            String limite = String.valueOf(peliculasComedia.size() + 1);

                            //condición de salida del menú
                            if (opcionEscogida.equals(limite)) {
                                System.out.print("Regresando a menú principal ...");
                                flag = true;

                            }

                            try {
                                int numOpcion = Integer.parseInt(opcionEscogida);
                                PeliculaComedia Pelicula = (PeliculaComedia) peliculasComedia.get(numOpcion - 1);//preguntarle al profe si se puede xD
                                System.out.println(Pelicula.toString());
                                flag = true;
                            } catch (Exception e) {
                                System.out.println("La opción escogida no es válida");
                            }
                        }while(!flag);


                        break;
                    case 2:
                        //accion
                        System.out.println("Opción 2 seleccionada: ACCION.\n");
                        break;
                    case 3:
                        //terror
                        System.out.println("Opción 3 seleccionada: TERROR.\n");
                        break;
                    case 4:
                        // drama
                        System.out.println("Opción 4 seleccionada: DRAMA.\n");
                        break;

                    case 5:
                        // todos
                        System.out.println("Opción 5 seleccionada: Todas las películas.\n");
                        break;
                    case 6:
                        repetirMenu = false;
                        System.out.println("Saliendo...\n");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 4.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Parece que hubo un error :(\n");
                repetirMenu = false;
                break; // Salir del bucle en caso de error
            }
        } // while

        scanner.close();
    } // main

    public static List<Pelicula> crearCatalogo() {
        List<Pelicula> catalogo = new ArrayList<>();

        PeliculaTerror it = new PeliculaTerror("It", "Andy Muschietti", 2017, 135.0F);
        PeliculaTerror theConjuring = new PeliculaTerror("The Conjuring", "James Wan", 2013, 112.0F);
        PeliculaTerror hereditary = new PeliculaTerror("Hereditary", "Ari Aster", 2018, 127.0F);

        PeliculaComedia superbad = new PeliculaComedia("Superbad", "Greg Mottola", 2007, 113.0F);
        PeliculaComedia theHangover = new PeliculaComedia("The Hangover", "Todd Phillips", 2009, 100.0F);
        PeliculaComedia stepBrothers = new PeliculaComedia("Step Brothers", "Adam McKay", 2008, 98.0F);

        PeliculaAccion madMax = new PeliculaAccion("Mad Max: Fury Road", "George Miller", 2015, 120.0F);
        PeliculaAccion johnWick = new PeliculaAccion("John Wick", "Chad Stahelski", 2014, 101.0F);
        PeliculaAccion dieHard = new PeliculaAccion("Die Hard", "John McTiernan", 1988, 132.0F);

        PeliculaDrama theShawshankRedemption = new PeliculaDrama("The Shawshank Redemption", "Frank Darabont", 1994, 142.0F);
        PeliculaDrama forrestGump = new PeliculaDrama("Forrest Gump", "Robert Zemeckis", 1994, 142.0F);
        PeliculaDrama theGodfather = new PeliculaDrama("The Godfather", "Francis Ford Coppola", 1972, 175.0F);

        //gracias al polimorfismo se pueden insertar objetos de diferentes clases que estén relacionados
        catalogo.add(it);
        catalogo.add(theConjuring);
        catalogo.add(hereditary);

        catalogo.add(superbad);
        catalogo.add(theHangover);
        catalogo.add(stepBrothers);

        catalogo.add(madMax);
        catalogo.add(johnWick);
        catalogo.add(dieHard);

        catalogo.add(theShawshankRedemption);
        catalogo.add(forrestGump);
        catalogo.add(theGodfather);


        return catalogo;
    }
} // class
