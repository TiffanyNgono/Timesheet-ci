package tn.esprit.spring.services;

import tn.esprit.spring.entities.Contrat;



import java.util.List;




public interface ContratService {

	List<Contrat> retrieveAllContrat();
	Contrat addContrat(Contrat c);
	void deleteContrat(long ref);
	void updateContrat(long ref,String typecontrat) ;
	Contrat retrieveContrat(long ref);
	Contrat retrieveContratByEmploye(long empId);
	
}
