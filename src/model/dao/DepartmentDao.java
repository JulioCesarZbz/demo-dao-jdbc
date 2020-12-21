package model.dao;

import java.sql.SQLException;
import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id) throws SQLException;
	List<Department> findAll();
}
