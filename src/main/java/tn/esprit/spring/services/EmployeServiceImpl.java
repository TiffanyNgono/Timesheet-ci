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
		System.out.println("OK");
		empRepository.deleteById(Long.parseLong(id));
		System.out.println("OK");
	}


	@Override
	public Employe updateEmploye(Employe emp) {
		Employe e = (empRepository.findId(emp.getId()) != null) ? empRepository.save(emp) : null;
		return e;
	}

	
	@Override
	public Employe retrieveEmploye(String id) {
		return empRepository.findById(Long.parseLong(id)).orElse(null);
	}


	@Override
	public List<Employe> retrieveEmployes(String role) {
		// TODO Auto-generated method stub
		return null;
	}

}
