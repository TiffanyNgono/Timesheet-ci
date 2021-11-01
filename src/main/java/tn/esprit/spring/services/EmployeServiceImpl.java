/**
 * 
 */
package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.repository.EmployeRepository;

/**
 * @author By KDM
 *
 */
@Service
public class EmployeServiceImpl implements IEmployeService {

	@Autowired
	EmployeRepository empRepository;

	@Override
	public List<Employe> retrieveAllEmploye() {
		
		return empRepository.findAll();
	}


	@Override
	public Employe addEmploye(Employe emp) {
		return empRepository.save(emp);
	}

	@Override
	public void deleteEmploye(String id) {
		empRepository.deleteById(Long.parseLong(id));
	}


	@Override
	public Employe updateEmploye(Employe emp) {
		return (empRepository.findId(emp.getId()) != null) ? empRepository.save(emp) : null;
	}

	
	@Override
	public Employe retrieveEmploye(String id) {
		return empRepository.findById(Long.parseLong(id)).orElse(null);
	}


	@Override
	public List<Employe> retrieveEmployes(String role) {
		return empRepository.findRole(role);
	}

}
