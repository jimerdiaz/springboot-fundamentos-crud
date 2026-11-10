package mx.tecnm.demo.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mx.tecnm.demo.crud.model.Alumno;
import mx.tecnm.demo.crud.repository.AlumnoRepository;

@Service 
public class AlumnoService {

    private final AlumnoRepository repository;

    public AlumnoService(AlumnoRepository repository) {
        this.repository = repository;

    }

    public List<Alumno> obtenerTodos() {
        return repository.findAll();
    }

    public Alumno guardar(Alumno alumno) {
        return repository.save(alumno);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }

}
