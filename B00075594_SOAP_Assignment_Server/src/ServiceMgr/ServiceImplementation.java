package ServiceMgr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.jws.WebService;

import StudentMgr.Student;

@WebService
public class ServiceImplementation {

	
	
	
	/**
	 * creating an instance of the Student array list
	 */
	List<Student>list = new ArrayList<Student>();
	


	/**
	 * add a new student
	 * @param id
	 * @param name
	 * @param age
	 * @param course
	 * @return
	 */
	public List<Student> addStudent(String id, String name, String age, String course){
		
		Student s1 = new Student(id, name, age, course);
		s1.setId(id);
		s1.setName(name);
		s1.setAge(age);
		s1.setCourse(course);
		list.add(s1);
		
		return list;
	}//end add()
	
	
	/**
	 * delete a student by id
	 * @param id
	 * @return
	 */
	public List<Student> delete(String id){
		
		for(Iterator <Student> iterator = list.listIterator(); iterator.hasNext();){
			
			if(iterator.next().getId().equals(id)){
				iterator.remove();
			}
		}
		return list;
	}//end delete()
	
	
	/**
	 * Update an existing student by Id
	 * @param id
	 * @param name
	 * @param age
	 * @param course
	 * @return
	 */
	public List<Student> update(String id, String name, String age, String course){
		
		for(Student s1 : list){
			
			if(s1.getId().equals(id)){
				s1.setName(name);
				s1.setAge(age);
				s1.setCourse(course);	
			}	
		}
		return list;
	}//end update()
	
	
	/**
	 * Show a Student searching by id
	 * @param id
	 * @param name
	 * @param age
	 * @param course
	 * @return
	 */
	public List<Student> show(){
		
		/*Student s1 = new Student(id, name, age, course);
		s1.setId(id);
		s1.setName(name);
		s1.setAge(age);
		s1.setCourse(course);
		list.add(s1);*/
		
		return list;
	}//end show()
	

}
