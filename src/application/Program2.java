package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TESTE 1: Department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);

		System.out.println("\n=== TESTE 2 Department findAll ===");
		List<Department> list2 = departmentDao.findAll();
		for (Department obj : list2) {
			System.out.println(obj);
		}

		//System.out.println("\n=== TESTE 3 Department insert ===");
		//Department newDepartment = new Department(null, "Music");
		//departmentDao.insert(newDepartment);
		//System.out.println("Inserted! New Id = " + newDepartment.getId());

		//System.out.println("\n=== TESTE 4 Department update ===");
		//department = departmentDao.findById(1);
		//department.setName("Movie");
		//departmentDao.update(department);
		//System.out.println("Updated Department!");

		System.out.println("\n=== TESTE 5 Department delete ===");
		departmentDao.deleteById(2);
		System.out.println("Department deleted from database!");

	}

}
