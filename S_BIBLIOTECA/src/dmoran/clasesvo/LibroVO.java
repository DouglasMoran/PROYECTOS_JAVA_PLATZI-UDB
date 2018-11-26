
package dmoran.clasesvo;

public class LibroVO {
    
    private int libro_id;
    private String nombre;
    private int numPag;
    private String isbn;
    private String fechaPublicacion;
    private String editorial;
    private String n_autor;
    //private String categoria;
    private String categoria_id;
    
    public LibroVO() {
    }

    public LibroVO(int libro_id, String nombre, int numPag, String isbn, String fechaPublicacion, String editorial, String n_autor, String categoria_id) {
        this.libro_id = libro_id;
        this.nombre = nombre;
        this.numPag = numPag;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
        this.n_autor = n_autor;
        this.categoria_id = categoria_id;
    }

    public int getLibro_id() {
        return libro_id;
    }

    public void setLibro_id(int libro_id) {
        this.libro_id = libro_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getN_autor() {
        return n_autor;
    }

    public void setN_autor(String n_autor) {
        this.n_autor = n_autor;
    }

    public String getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(String categoria_id) {
        this.categoria_id = categoria_id;
    }
    
    @Override
    public String toString(){ 
        return libro_id + nombre + numPag + isbn + fechaPublicacion + editorial + n_autor + categoria_id;
    }
    
    
}
