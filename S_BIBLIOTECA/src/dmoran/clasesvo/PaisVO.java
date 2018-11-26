
package dmoran.clasesvo;

public class PaisVO {
    
    private int id;
    private String nombre;

    public PaisVO(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public PaisVO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
