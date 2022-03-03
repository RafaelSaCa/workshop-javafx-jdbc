package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao(); 

	public List<Department> findAll(){
		
		return dao.findAll();
		
	}
	
	
}

/*dados MOCKADOS nao acessados direto do banco somente teste
List<Department> list = new ArrayList<Department>();
list.add(new Department(1,"Livros"));
list.add(new Department(2,"Computadores"));
list.add(new Department(3,"Eletronicos"));
return list;
*/
