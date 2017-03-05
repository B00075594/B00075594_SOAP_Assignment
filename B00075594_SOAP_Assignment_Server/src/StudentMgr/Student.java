package StudentMgr;

public class Student {
	
	/**
	 * declre variables
	 */
	private String id;
	private String name;
	private String age;
	private String course;

	//constructor
	public Student(String id, String name, String age, String course) {
		super();
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name= name;
		this.age = age;
		this.course = course;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}


	/**
	 * setters and getters for all variables
	 * @return
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

}
