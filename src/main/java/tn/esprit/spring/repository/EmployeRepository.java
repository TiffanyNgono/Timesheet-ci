package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Employe;


@Repository
public interface EmployeRepository extends CrudRepository<Employe, Long> , JpaRepository<Employe, Long>{
	@Query("SELECT e FROM Employe e WHERE e.id=:id")
	 Employe findId(@Param("id") long id);
	
	@Query("SELECT e FROM Employe e WHERE e.role=:role")
	 List<Employe> findRole(@Param("role") String role);

}
