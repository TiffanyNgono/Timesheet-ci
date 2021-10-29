//
//
//package tn.esprit.spring.service;
//
// 
//import java.text.ParseException;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import tn.esprit.spring.entities.Employe;
//import tn.esprit.spring.entities.Role;
//import tn.esprit.spring.services.IEmployeService;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class EmployeServiceImplTest {
//
//		@Autowired
//		IEmployeService es;
//		
//		@Test
//		public void testAddEmploye() throws ParseException {
//			Employe emp = new Employe("Koeke", "Maurel", "dodo@gmail.com", true, Role.ADMINISTRATEUR);
//			Employe e = es.addEmploye(emp);
//			System.out.println(e.toString());
//		}
//		
//		@Test
//		public void testRetrieveEmploye() throws ParseException {
//			List <Employe> employes =  es.retrieveAllEmploye();
//			System.out.println(employes.size());
//		}
//		
//		@Test
//		public void testEmploye() throws ParseException{
//			Employe e = es.retrieveEmploye("2");
//			System.out.println("Employe : " + e.toString());
//		}
//		
//		@Test
//		public void testDeleteEmploye() throws ParseException{
//			
//			es.deleteEmploye("3");
//			System.out.println((es.retrieveEmploye("3") != null ) ? "Parfati" : "not good");
//		}
// 
//}
//
//
//
//
//
