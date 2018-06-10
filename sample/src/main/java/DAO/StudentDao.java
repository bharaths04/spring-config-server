package DAO;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import Entity.Student;

@Repository
public class StudentDao {
	private static Map<Integer,Student> students;
	
	static {
	
		students= new HashMap<Integer,Student>(){
			{
				put(1,new Student(1,"bharath","spring"));
				put(2,new Student(2,"bharath1","spring1"));
				put(3,new Student(2,"bharath12","spring12"));


			}
			
		};
	};
	
	
	public Collection<Student> getStudent(){
		return this.students.values();
		
	}
		

}
