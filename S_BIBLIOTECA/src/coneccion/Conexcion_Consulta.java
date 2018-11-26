
package coneccion;

import dmoran.clasesvo.CategoriaVO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexcion_Consulta {
    
    static Connection conexion=null;
    static Statement sentencia;
    static ResultSet resultado;
    
    public static void conectar(){
        String ruta="jdbc:mysql://localhost/biblioteca";
        String user="root";
        String pass="kodigo2018";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection(ruta,user,pass); 
            sentencia= conexion.createStatement();
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("No conectado");
        }
    }
     
    public static ArrayList<CategoriaVO> llenarComoListaCategorias(){
        //CategoriasVO categoria = new CategoriasVO();
        ArrayList<CategoriaVO> lista = new ArrayList<CategoriaVO>();
        String q = "SELECT categoria_id, c_nombre FROM categorias";
        try {
            resultado = sentencia.executeQuery(q);
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(resultado.next()){
                lista.add(new CategoriaVO(resultado.getInt("categoria_id"), resultado.getString("c_nombre")));
                
                
            }
        } catch (Exception e) {
        }
        return lista;
    }
   
    public static ArrayList<Object[]> llenarTablaRegistros(){
        ArrayList<Object[]> registros = new ArrayList<Object[]>();
        String q = "SELECT libro_id, nombre, numPag, isbn,fechaPublicacion,editorial,n_autor,categorias.c_nombre FROM libros INNER JOIN categorias ON categorias.categoria_id = libros.libro_id";
        try {
            resultado = sentencia.executeQuery(q);
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(resultado.next()){
                
                Object[] filas = new Object[8];
                for (int i = 0; i < 8; i++) {
                    filas[i] = resultado.getObject(i+1);
                }
                registros.add(filas);
            }
        } catch (Exception e) {
        }
        return registros;
    }
    
    public static ArrayList<Object[]> buscarRegistros(String Nombre){
        ArrayList<Object[]> registros = new ArrayList<Object[]>();
        String q = "SELECT libro_id, nombre, numPag, isbn,fechaPublicacion,editorial,n_autor,categorias.c_nombre FROM libros INNER JOIN categorias ON categorias.categoria_id = libros.libro_id" + " WHERE Nombre='"+Nombre+"'";
        try {
            resultado = sentencia.executeQuery(q);
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(resultado.next()){
                
                Object[] filas = new Object[8];
                for (int i = 0; i < 8; i++) {
                    filas[i] = resultado.getObject(i+1);
                }
                registros.add(filas);
            }
        } catch (Exception e) {
        }
        return registros;
    }
    
    public static void eliminarRegistros(int ID){
        
        String q = "DELETE FROM libros" + " WHERE libro_id='"+ID+"'";
        try {
            sentencia.executeUpdate(q);
            System.out.println("true");
        } catch (Exception e) {
            System.out.println("false");
        }
        
    }
    
}
