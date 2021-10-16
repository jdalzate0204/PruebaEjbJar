package co.edu.unicundi.pruebaejbjar.service.impl;

import co.edu.unicundi.pruebaejbjar.entity.Alumno;
import co.edu.unicundi.pruebaejbjar.repository.IAlumnoRepo;
import co.edu.unicundi.pruebaejbjar.repository.impl.AlumnoRepoImpl;
import javax.ejb.*;
import co.edu.unicundi.pruebaejbjar.service.IAlumnoService;

/**
 * Nunca se pasa la clase bean al cliente, se pasa la interface nada más
 * @Stateful 
 * El sistema crea propios objetos del cliente y ningun otro cliente puede acceder
 * los objetos se pueden recuperar cuando desee siempre y cuando no se destruya la conexión
 * Ej: Sessión
 * @Stateless 
 * El sistema crea el objeto del cliente
 * mientras haga la petición nadie más puede acceder a ese objeto
 * despues de realizada la petición y retornar inmediatamente la conexión se destruye pero guarda el objeto en el pool para poder ser usado por otro cliente
 * PROBLEMAS: Guarda sesión de un cliente y otro puede acceder
 * SOLUCIÓN: 
 * 1. No colocar variables globales, si local
 * 2. Las variables locales se destruyen al momento de terminar el metodo 
 * Ej: Request
 * @Singleton
 * El sistema crea el objeto del cliente una sola vez
 * cuando termina la conexión se destruye la misma y el objeto se guarda en el pool
 * todos pueden acceder al mismo objeto por lo que se comparte información
 * el objeto dura lo que dura la aplcación 
 * Ej: Saber cuantos clientes estan conectados, información global
 * @author James Alzate Jr
 * //Logica fuerte de la aplicación (Conexión BBDD, Metodos)
 */
@Stateless //Inversión de control
public class AlumnoServiceImpl implements IAlumnoService {

    @EJB
    public IAlumnoRepo repo;

    @Override
    public void listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarPorId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Alumno obj) {
        //Validaciones, recorridos, for
        this.repo.guardar(obj);
    }

    @Override
    public void editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}