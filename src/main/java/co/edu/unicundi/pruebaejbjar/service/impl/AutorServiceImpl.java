package co.edu.unicundi.pruebaejbjar.service.impl;

import co.edu.unicundi.pruebaejbjar.entity.Autor;
import co.edu.unicundi.pruebaejbjar.repository.IAutorRepo;
import co.edu.unicundi.pruebaejbjar.service.IAutorService;
import co.edu.unicundi.pruebaejbjar.view.VistaAutorLibro;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author acer
 */
@Stateless
public class AutorServiceImpl implements IAutorService{

    @EJB
    public IAutorRepo repo;
    
    @Override
    public void guardar(Autor obj) {
        this.repo.guardar(obj);
    }

    @Override
    public List<Autor> listar() {
        List<Autor> listaAutor = repo.listarTodos();
        
        for (Autor a: listaAutor)
            a.getLibro().clear();
        
        return listaAutor;
    }

    @Override
    public Autor listarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Autor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VistaAutorLibro> obtener() {
        return this.repo.obtener();
    }
    
}
