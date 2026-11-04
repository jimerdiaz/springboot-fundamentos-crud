package mx.tecnm.demo.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.tecnm.demo.crud.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

}
