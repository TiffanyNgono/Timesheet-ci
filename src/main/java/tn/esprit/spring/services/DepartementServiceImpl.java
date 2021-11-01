package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Departement;

import tn.esprit.spring.repository.DepartementRepository;

@Service
public class DepartementServiceImpl implements IDepartementService{
	
	@Autowired
	DepartementRepository departementRepository;
	
	private static final Logger l = LogManager.getLogger(DepartementServiceImpl.class);


	@Override
	public List<Departement> retrieveAllDepartements() {
		
		List<Departement> departements = null; 
		try {
	
			l.info("In retrieveAllDepartements() : ");
			departements = (List<Departement>) departementRepository.findAll();  
			for (Departement departement : departements) {
				l.debug("departement +++ : " + departement);
			} 
			l.info("Out of retrieveAllDepartements() : ");
		}catch (Exception e) {
			l.error("Error in retrieveAllDepartements() : " + e);
		}

		return departements;
	}

	@Override
	public Departement addDepartement(Departement d) {
		
		departementRepository.save(d);
		return d;
	}

	@Override
	public void deleteDepartement(String id) {
		departementRepository.deleteById(Long.parseLong(id));
		
	}

	@Override
	public Departement updateDepartement(Departement d) {
				return departementRepository.save(d);
	}

	@Override
	public Departement retrieveDepartement(String id) {
		
		return departementRepository.findById(Long.parseLong(id)).orElse(null);
	
	}

}
