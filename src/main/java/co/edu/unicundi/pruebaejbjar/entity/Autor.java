package co.edu.unicundi.pruebaejbjar.entity;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author acer
 */
@Entity //Indica que es un objeto persistente a la bbdd
@Table (name = "autor")

@NamedQueries({
    @NamedQuery(name = "Autor.ListarTodos", query = "SELECT a FROM Autor a")    
})
public class Autor implements Serializable{
    @Id //LLave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "identificacion", nullable = false, length = 15, unique = true) //Columna de la tabla
    private String identificacion;
    
    @Column(name = "nombre", nullable = false, length = 30) //Columna de la tabla
    private String nombre;
    
    @Column(name = "apellido", nullable = false, length = 30) //Columna de la tabla
    private String apellido;
    
    @Column(name = "edad", nullable = false) //Columna de la tabla
    private Integer edad;
    
    @OneToMany(mappedBy = "autor", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Libro> libro; //Permite objetos repetidos
    
    //private Set<Libro> libro2; //No permite objetos repetidos

    public Autor() {
    }

    public Autor(String identificacion, String nombre, String apellido, Integer edad, List<Libro> libro) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.libro = libro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public List<Libro> getLibro() {
        return libro;
    }

    public void setLibro(List<Libro> libro) {
        this.libro = libro;
    }
}