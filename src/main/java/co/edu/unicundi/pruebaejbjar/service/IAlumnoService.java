package co.edu.unicundi.pruebaejbjar.service;

import co.edu.unicundi.pruebaejbjar.entity.Alumno;
import javax.ejb.*;

/**
 *
 * @author James Alzate
 */
//Si no se coloca ninguna anotación, default @Local
//@Remote
@Local
public interface IAlumnoService {
    public void listar();
    public void listarPorId();
    public void guardar(Alumno obj);
    public void editar();
    public void eliminar();
}
