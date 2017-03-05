import java.util.ArrayList;
import java.util.List;

import servicemgr.ServiceImplementation;
import servicemgr.ServiceImplementationService;
import servicemgr.Student;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * call the web service
		 * URL: http://rachelspc:8080/B00075594_SOAP_Assignment_Server/ServiceImplementationService?WSDL
		 */
		
		List<Student>list = new ArrayList<Student>();
				
		ServiceImplementationService service = new ServiceImplementationService();
		ServiceImplementation imp = service.getServiceImplementationPort();
		
		list = imp.addStudent("45","Deniss" , "31", "genius");
		list = imp.addStudent("01","Rachel" , "39", "nothing");
		list = imp.addStudent("99","Michal" , "37", "programming");
		
		for(Student s : list ){
			System.out.print(s.getId()+ " ");
			System.out.print(s.getName() + " ");
			System.out.print(s.getAge() + " ");
			System.out.print(s.getCourse() + " ");
			System.out.println( "----------------------------");
		}
		
		list = imp.delete("45");
		
		list = imp.show();
		
		for(Student s : list ){
			System.out.print(s.getId()+ " ");
			System.out.print(s.getName()+ " ");
			System.out.print(s.getAge()+ " ");
			System.out.print(s.getCourse()+ " ");
			System.out.println("-----------------------------------");
			
		}
		
		 list = imp.update("99", "Mike", "99", "moaner");
		
		 for(Student s : list ){
				System.out.print(s.getId()+ ": ");
				System.out.print(s.getName()+ " :");
				System.out.print(s.getAge()+ " :");
				System.out.print(s.getCourse());
				System.out.println("----------------------------");
				
			}

	}

}
