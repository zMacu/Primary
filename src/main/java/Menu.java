import exceptions.EmailException;
import helpers.Save;
import models.*;

import java.util.Scanner;


public class Menu {

    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void init() {

        while (true) {

            try {
                System.out.println("Seleccionar una de las siguientes opciones:");
                System.out.println("1. Crear Libro");
                System.out.println("2. Crear Revista");
                System.out.println("3. Salir");


                Integer value = getInt();
                BaseBook b = null;
                switch (value) {

                    case 1:
                        System.out.println("Es un libro");
                        Book libro = createBook();
                        b = libro;
                        System.out.println("Libro creado exitosamente");
                        break;
                    case 2:
                        System.out.println("Es una revista");
                        Magazine revista = createMagazine();
                        b = revista;
                        System.out.println("Revista creada exitosamente");
                        //return revista;
                        break;
                    case 3:
                        System.exit(1);
                        break;
                    default:
                        System.out.println("Ingrese un valor valido");
                        break;
                }

                Save.writeUsingFileWriter(b.toString());
                System.out.println("Creación guardada con exito! Felicitaciones");
            } catch (EmailException ex) {
                System.out.println(ex.getMessage());
                System.out.println("No se pudo crear el libro o revista porque el email del autor es invalido");
            } catch (Exception e) {
                System.out.println("Hubo un error no se pudo crear el libro o revista");
            }

        }
    }

    private Book createBook() {
        Commons c = getCommons();
        Maker author = getMaker();
        Maker designer = null;


        System.out.println("¿Es también diseñador?");
        System.out.println("1. SI");
        System.out.println("2. NO");

        Integer value = getInt();

        switch (value) {

            case 1:
                System.out.println("Usar mismos datos para el diseñador");
                designer = author;
                break;
            case 2:
                System.out.println("Usar otros datos para el diseñador");
                designer = getMaker();
                break;
            default:
                System.out.println("Ingresaste un valor invalido");
                System.exit(1);
                break;
        }


        Book b = new Book();
        b.setName(c.getName());
        b.setQty(c.getQty());
        b.setPrice(c.getPrice());
        b.setAuthors(author);
        b.setDesigners(designer);
        return b;

    }

    private Magazine createMagazine() {
        Commons c = getCommons();
        System.out.println("Ingresar frecuencia de lanzamiento:");
        int releaseFrequencyInDays = getInt();
        Maker designer = getMaker();

        Magazine m = new Magazine();
        m.setName(c.getName());
        m.setQty(c.getQty());
        m.setPrice(c.getPrice());
        m.setDesigners(designer);
        m.setReleaseFrequencyInDays(releaseFrequencyInDays);
        return m;

    }


    private Commons getCommons() {
        System.out.println("Ingresar nombre del libro/revista:");
        String name = getString();
        System.out.println("Ingresar precio:");
        Double price = getDouble();
        System.out.println("Ingresar cantidad:");
        int qty = getInt();

        Commons c = new Commons();
        c.setName(name);
        c.setPrice(price);
        c.setQty(qty);

        return c;
    }

    private Maker getMaker() {
        System.out.println("Ingresar nombre del creador:");
        String name = getString();
        System.out.println("Ingresar email:");
        String email = getString();
        System.out.println("Ingresar género:");
        String gender = getString();

        Maker maker = new Maker(name, email, gender);
        return maker;
    }

    private String getString() {
        if (this.scanner.hasNext()) {
            return this.scanner.next();
        }
        return null;
    }

    private Integer getInt() {
        if (this.scanner.hasNextInt()) {
            return this.scanner.nextInt();
        }
        return null;
    }

    private Double getDouble() {
        if (this.scanner.hasNextDouble()) {
            return this.scanner.nextDouble();
        }
        return null;
    }


}

