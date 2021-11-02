package co.edu.unicundi.pruebaejbjar.view;

import javax.persistence.*;
import jdk.nashorn.internal.ir.annotations.Immutable;

/**
 *
 * @author acer
 */
@Entity
@Table(name = "vista_autor_libro")
@Immutable

@NamedQueries({
    @NamedQuery(name = "VistaAutor.Listar", 
            query = "SELECT a.id, a.nombre, a.edad, a.identificacion, "
                    + "COUNT(l.id_autor) AS cantidad_libros, "
                    + "MAX(l.no_paginas) AS libro_mas_paginas, "
                    + "(SELECT b.nombre FROM Libro b WHERE b.no_paginas = "
                    + "(SELECT MAX(b.no_paginas) from Libro b)) AS nombre_libro_mas_paginas "
                    + "FROM Autor a, Libro l GROUP BY a.id") 
})

public class VistaAutorLibro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "id_autor", nullable = false)
    private Integer idAutor;
    
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    
    @Column(name = "edad", nullable = false)
    private Integer edad;
    
    @Column(name = "identificacion", nullable = false, length = 10, unique = true)
    private String identificacion;
    
    @Column(name = "cantidad_libros", nullable = false)
    private Integer cantidadLibros;
    
    @Column(name = "libro_mas_paginas", nullable = false)
    private Integer libroMasPaginas;
    
    @Column(name = "nombre_libro_mas_paginas", nullable = false, length = 30)
    private String nombreLibroMasPaginas;

    public VistaAutorLibro() {
    }

    public VistaAutorLibro(Integer idAutor, String nombre, Integer edad, String identificacion, Integer cantidadLibros, Integer libroMasPaginas, String nombreLibroMasPaginas) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.cantidadLibros = cantidadLibros;
        this.libroMasPaginas = libroMasPaginas;
        this.nombreLibroMasPaginas = nombreLibroMasPaginas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Integer getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(Integer cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public Integer getLibroMasPaginas() {
        return libroMasPaginas;
    }

    public void setLibroMasPaginas(Integer libroMasPaginas) {
        this.libroMasPaginas = libroMasPaginas;
    }

    public String getNombreLibroMasPaginas() {
        return nombreLibroMasPaginas;
    }

    public void setNombreLibroMasPaginas(String nombreLibroMasPaginas) {
        this.nombreLibroMasPaginas = nombreLibroMasPaginas;
    }
}
