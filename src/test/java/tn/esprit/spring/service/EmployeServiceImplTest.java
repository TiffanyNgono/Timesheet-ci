

package tn.esprit.spring.service;

 
import java.text.ParseException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceImplTest {

		@Autowired
		IEmployeService es;
		
		@Test
		public void testAddEmploye() throws ParseException {
			Employe emp = new Employe("Koeke", "Maurel", "dodo@gmail.com", true, Role.ADMINISTRATEUR);
			Employe empA = es.addEmploye(emp);
			Assert.assertEquals(emp.getPrenom() , empA.getPrenom());
		}
		
		@Test
		public void testModifyEmploye() throws ParseException{
			Employe emp = new Employe(5L , "Koeke Dodo", "Maurel", "dodo@gmail.com", null, true, Role.INGENIEUR);
			Employe empM = es.updateEmploye(emp);
			Assert.assertEquals(emp.getPrenom() , empM.getPrenom());
		}
		@Test
		public void testRetrieveEmploye() throws ParseException {
			List <Employe> employes =  es.retrieveAllEmploye();
			//Assert.assertEquals(69, employes.size());
		}
		
		@Test
		public void testEmploye() throws ParseException{
			Employe e = es.retrieveEmploye("15");
			Assert.assertEquals(15, e.getId());
		}
		
		@Test
		public void testDeleteEmploye() throws ParseException{
			es.deleteEmploye("21");
			Assert.assertNull(es.retrieveEmploye("20"));
		}
		
		@Test
		public void testRetrieveEmployeByRole() throws ParseException {
			List <Employe> employes =  es.retrieveAllEmploye();
			//Assert.assertEquals( 68, employes.size());
		}
		
 
}





