package modelo;

/**
 * Created by Eduardo on 24/11/18.
 */

public class Categoria {
    String id_categoria;
    String nombre;
    public Categoria(String id_categoria, String nombre) {
        this.id_categoria = id_categoria;
        this.nombre = nombre;
    }
    public String getId_categoria() {return id_categoria;}
    public void setId_categoria(String id_categoria) {this.id_categoria = id_categoria;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
}
