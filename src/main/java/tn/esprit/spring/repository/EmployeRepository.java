package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.Employe;


public interface EmployeRepository extends CrudRepository<Employe, Long> , JpaRepository<Employe, Long>{
	@Query("SELECT e FROM Employe e WHERE e.id=:id")
	 Employe findId(@Param("id") long id);

}
