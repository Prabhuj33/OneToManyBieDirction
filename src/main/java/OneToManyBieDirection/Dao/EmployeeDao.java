
package OneToManyBieDirection.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToManyBieDirection.dto.Company;
import OneToManyBieDirection.dto.Employee;


public class EmployeeDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}
	
	public void updateEmployee(int id,Employee  employee) {
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class, id);
		if(dbEmployee!=null) {
//			id is present
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			employee.setId(id);
			employee.setCompany(dbEmployee.getCompany());
			entityManager.merge(employee);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry Id is not present");
		}
	}
	
	
	public void findEmployee(int id) {
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class, id);
		if(dbEmployee!=null) {
//			id is present
			System.out.println(dbEmployee);
		}else {
			System.out.println("Sorry Id is not present");
		}
	}
	public void deleteEmployee(int id) {
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class, id);
		if(dbEmployee!=null) {
//			id is present
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			Company dbCompany=dbEmployee.getCompany();
			List<Employee> employees=dbCompany.getEmployees();
			employees.remove(dbEmployee);
			
			dbCompany.setEmployees(employees);
			
			entityManager.remove(dbEmployee);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry Id is not present");
		}
	}
	
	
	
	
	
	
}