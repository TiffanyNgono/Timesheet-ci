
package tn.esprit.spring.service;

 
import java.text.ParseException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.services.IDepartementService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartementServiceImplTest {

		@Autowired
		IDepartementService ds; 
	
		@Test
		public void testRetrieveAllDepartements() {
			List <Departement> ld = ds.retrieveAllDepartements();
		}
		
		
		@Test
		public void testAddDepartement() throws ParseException {
			Departement d = new Departement("Nouur Jaafer");
			Departement d1 = ds.addDepartement(d);
		}
	 
		@Test
		public void testUpdateUSer() throws ParseException {
	  		
	  	}
	
		@Test
		public void testRetrieveDepartement() {
			Departement d = ds.retrieveDepartement("2");
			System.out.println("Departement : "+d.toString());
		}
		
		@Test
		public void testDeleteDepartement() {
			ds.deleteDepartement("5");
			
		}
		
		// 5 tests unitaires  
 
}





