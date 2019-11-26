package libroapp;
import java.util.Scanner;
import java.util.InputMismatchException ;
public class LibroApp {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            String titulo, autor;
            int ejemplares;
            //Se crea el objeto libro1 utilizando el constructor con parámetros
            Libro libro1 = new Libro("El quijote", "Cervantes", 1, 0);
            //Se crea el objeto libro2 utilizando el constructor por defecto
            Libro libro2 = new Libro();
            
                
            System.out.println("Introduce título: ");
            titulo = teclado.nextLine();
            System.out.println("Introduce autor: ");
            autor = teclado.nextLine();
            
            System.out.println("Numero de ejemplares: ");
            try {
              ejemplares = teclado.nextInt();
            } catch(InputMismatchException exc) {
                ejemplares = 0;
                System.out.println("error" + exc.getMessage());
            }
            //Se asigna a libro2 losd atos pedidos por teclado. Para ello se utilizan los métodos setters
            libro2.setTitulo(titulo);
            libro2.setAutor(autor);
            libro2.setEjemplares(ejemplares);
            
            Libro libro3 = new Libro();
            
                
            System.out.println("Introduce título: ");
            titulo = teclado.nextLine();
            System.out.println("Introduce autor: ");
            autor = teclado.nextLine();
            
            System.out.println("Numero de ejemplares: ");
            try {
              ejemplares = teclado.nextInt();
            } catch(InputMismatchException exc) {
                ejemplares = 0;
                System.out.println("error" + exc.getMessage());
            }
            //Se asigna a libro2 losd atos pedidos por teclado. Para ello se utilizan los métodos setters
            libro3.setTitulo(titulo);
            libro3.setAutor(autor);
            libro3.setEjemplares(ejemplares);
            
            
            //Se realiza un prestamo de libro1. El método prestar() retorna true si se ha podido realizar el préstamo, sino false
            if (libro1.prestar()) {
                System.out.println("Se ha prestado el libro " + libro1.getTitulo());
            } else{ 
                System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
            }
            //Se realiza la devolución de libro1. El método devolver retorna true si se ha podido devolver, sino false
            if (libro1.devolver()){
                System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
            } else {
                System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
            }
            //Se realiza otro prestamo del libro
            if (libro1.prestar()) {
                System.out.println("Se ha prestado el libro " + libro1.getTitulo());
            } else{ 
                System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
            }
            //Se realiza otro préstamo del libro1. En este caso no se podrá realizar ya que solo hay un ejemplar de este libro y
            //ya está prestado. Se mostrará por pantalla el mensaje "no quedan ejemplares del libro..."
            if (libro1.prestar()) {
                System.out.println("Se ha prestado el libro " + libro1.getTitulo());
            } else{ 
                System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
            }
            //Mostrar los datos del objeto libro1
            System.out.println("Libro 1:");
            System.out.println("Titulo: "+ libro1.getTitulo());
            System.out.println("Autor: " + libro1.getAutor());
            System.out.println("Ejemplares: " + libro1.getEjemplares());
            System.out.println("Prestados: " + libro1.getPrestados());
            System.out.println();
            //Mostrar los datos del objeto libro2
            System.out.println("Libro 2:");
            System.out.println("Titulo: "+ libro2.getTitulo());
            System.out.println("Autor: " + libro2.getAutor());
            System.out.println("Ejemplares: " + libro2.getEjemplares());
            System.out.println("Prestados: " + libro2.getPrestados());
            System.out.println();
            
            System.out.println("Libro 3:");
            System.out.println("Titulo: "+ libro3.getTitulo());
            System.out.println("Autor: " + libro3.getAutor());
            System.out.println("Ejemplares: " + libro3.getEjemplares());
            System.out.println("Prestados: " + libro3.getPrestados());
            System.out.println();
    }
    
}
