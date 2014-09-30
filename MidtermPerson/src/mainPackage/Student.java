package mainPackage;

public class Student extends Person {
	private final String classStatus;
	
	
	
	public Student(String classStatus) {
		this.classStatus = classStatus;
		}

	public String getClassStatus() {
		return classStatus;
	}
	
	@Override
	public String toString(){
		return getClass().getName();
		}
	}

