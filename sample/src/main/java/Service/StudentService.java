package Service;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.StudentDao;
import Entity.Student;
@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;
	public Collection<Student> getServiceStudent(){
		return studentDao.getStudent();
		
	}

}
