package tn.esprit.spring.repository;




import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entities.Contrat;

@Repository
public interface ContratRepository extends CrudRepository<Contrat, Long> {
	@Query(value = "SELECT * FROM Contrat where Employe = ?1", nativeQuery = true) Contrat findContartByEmployee(Long emplid);	
	@Transactional
	@Modifying
	@Query("UPDATE Contrat c " + "SET c.typecontrat = ?1 WHERE c.reference = ?2")void updateC(String typecontrat , long  ref);
	




}

