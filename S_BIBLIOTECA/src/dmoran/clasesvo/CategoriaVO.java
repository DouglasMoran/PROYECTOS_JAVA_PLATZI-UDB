
package dmoran.clasesvo;

public class CategoriaVO {
    
    private int categoria_id;
    private String c_nombre; 

    public CategoriaVO() {
    }

    public CategoriaVO(int categorias_id, String c_nombre) {
        this.categoria_id = categorias_id;
        this.c_nombre = c_nombre;
    }

    public String getC_nombre() {
        return c_nombre;
    }

    public void setC_nombre(String c_nombre) {
        this.c_nombre = c_nombre;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }
    
    public int getCategorias_id() {
        return categoria_id;
    }
    
    @Override
    public String toString(){ 
        return c_nombre;
    }
    
    
}
