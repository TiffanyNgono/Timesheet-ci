/**
 * 
 */
package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Employe;

/**
 * @author By KDM
 *
 */
public interface IEmployeService {

	List<Employe> retrieveAllEmploye(); 
	Employe addEmploye(Employe emp);
	void deleteEmploye(String id);
	Employe updateEmploye(Employe emp);
	Employe retrieveEmploye(String id);
	List<Employe> retrieveEmployes(String role);
}
