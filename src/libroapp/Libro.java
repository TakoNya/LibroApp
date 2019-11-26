package libroapp;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    
    //constructor por omisión
    public Libro(){
    }
    
    //Constructor con parámetros
    public Libro(String titulo, String autor, int ejemplares, int prestados){
        this.titulo=titulo;
        this.autor= autor;
        this.ejemplares=ejemplares;
        this.prestados=prestados;
    }
    //getter y setters

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the ejemplares
     */
    public int getEjemplares() {
        return ejemplares;
    }

    /**
     * @param ejemplares the ejemplares to set
     */
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    /**
     * @return the prestados
     */
    public int getPrestados() {
        return prestados;
    }

    /**
     * @param prestados the prestados to set
     */
    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    //método para realizar el prestam de un libro
    public boolean prestar(){
        boolean prestado = true;
        if (prestados<ejemplares){
            prestados++;
        } else {
            prestado=false;
        }
        return prestado;
    }
    //método para realizar la devolución de un libro
    public boolean devolver(){
        boolean devuelto = true;
        if(prestados==0){
            devuelto=false;
        } else{
            prestados--;
        }
        return devuelto;
    }
    //método to String sobrescrito para mostrar los datos de la lase Libro
    @Override
    public String toString(){
        return "titulo: " + titulo + "\nautor:" + autor
                + "\nejemplares: "+ ejemplares + "\nprestados: " + prestados;
    }
}
