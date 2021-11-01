/**
 * 
 */
package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
	
	private static final Logger l = LogManager.getLogger(UserServiceImpl.class);

	@Override
	public List<Employe> retrieveAllEmploye() {
		List<Employe> lemp =empRepository.findAll();
		l.info("We have "+lemp.size() +" employees");
		return lemp;
	}


	@Override
	public Employe addEmploye(Employe emp) {
		l.info("add user "+emp);
		return empRepository.save(emp);
	}

	@Override
	public void deleteEmploye(String id) {
		if(empRepository.findId(Long.parseLong(id)) != null){
			l.info("Employe with id = "+id +"deleted");
			empRepository.deleteById(Long.parseLong(id));
		}else{
			l.warn("Employe with id : " + id + "Not exist");
		}
	}


	@Override
	public Employe updateEmploye(Employe emp) {
		l.info("Employe = "+ emp +"updated");
		return (empRepository.findId(emp.getId()) != null) ? empRepository.save(emp) : null;
	}

	
	@Override
	public Employe retrieveEmploye(String id) {
		l.info("Getting Employe with id = "+id);
		return empRepository.findById(Long.parseLong(id)).orElse(null);
	}


	@Override
	public List<Employe> retrieveEmployes(String role) {
		List<Employe> lemp = empRepository.findRole(role);
		l.info("Getting Size of employe with role = "+role +"  : " +lemp.size());
		return lemp;
	}

}
