package OneToManyBieDirectionController;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToManyBieDirection.Dao.CompanyDao;
import OneToManyBieDirection.Dao.EmployeeDao;
import OneToManyBieDirection.dto.Company;
import OneToManyBieDirection.dto.Employee;

public class CompanyEmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Company c=new Company();
//		c.setId(3);
//		c.setName("Unix");
//		c.setAddress("lucbc");
//		
//		
//		
//		Employee e=new 	Employee();
//		e.setId(301);
//		e.setName("Ramya");
//		e.setAddress("Chithambaram");
//		
//		Employee e1=new Employee();
//		e1.setId(302);
//		e1.setName("Priya");
//		e1.setAddress("chennai");
//
//		Employee e2=new Employee();
//		e2.setId(303);
//		e2.setName("Kalki");
//		e2.setAddress("Trichy");
//		
//		
//		e.setCompany(c);
//		e1.setCompany(c);
//		e2.setCompany(c);
//		
//		List<Employee> employee= new ArrayList<Employee>();
//		employee.add(e);
//		employee.add(e1);
//		employee.add(e2);
//		
//		c.setEmployees(employee);
//		
//		
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vinod");
//	    EntityManager em=emf.createEntityManager();
//	    EntityTransaction et=em.getTransaction();
//	    et.begin();
//	    
//	    em.persist(c);
//        em.persist(e);
//        em.persist(e1);	
//        em.persist(e2);
//	
//        et.commit();

	
	
	
	
	
	//update
		
//		Employee e=new Employee();
//		e.setId(102);
//        e.setName("libarna");
//        e.setAddress("Thanjai");
//        
//       
//	  EmployeeDao da=new EmployeeDao();
//	  da.updateEmployee(102, e);
//		
		
		//find
		
		EmployeeDao e=new EmployeeDao();
	    e.findEmployee(102);
		
		
		//delete

//		CompanyDao d=new CompanyDao();
//		d.deleteCompany(2);
////		
//		EmployeeDao e=new EmployeeDao();
//		e.deleteEmployee(303);
////		
		
		
	}	

}
