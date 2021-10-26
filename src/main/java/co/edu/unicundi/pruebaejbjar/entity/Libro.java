package co.edu.unicundi.pruebaejbjar.entity;

import java.io.Serializable;
import javax.persistence.*;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author acer
 */
@Entity //Indica que es un objeto persistente a la bbdd
@Table (name = "libro")
public class Libro implements Serializable{
    @Id //LLave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "nombre", nullable = false, length = 30) //Columna de la tabla
    private String nombre;
    
    @Column(name = "descripcion", nullable = false, length = 200) //Columna de la tabla
    private String descripcion;
    
    @Column(name = "no_paginas", nullable = false) //Columna de la tabla
    private Integer noPaginas;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_autor", nullable = false)
    private Autor autor;

    public Libro() {
    }

    public Libro(String nombre, String descripcion, Integer noPaginas, Autor autor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.noPaginas = noPaginas;
        this.autor = autor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNoPaginas() {
        return noPaginas;
    }

    public void setNoPaginas(Integer noPaginas) {
        this.noPaginas = noPaginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
