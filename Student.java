package Array;

public class Student {
	
	String name;
	int age;
	int year;
	String degree;
	final String collage="MIT";
	String blood;
	char gendre;
	int roll;
	int mark;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name,int age,int year,String degree, String blood,char gender,int roll,int mark) {
		super();
		this.name=name;
		this.age=age;
		this.year=year;
		this.degree=degree;
		this.blood=blood;
		this.gendre=gender;
		this.roll=roll;
		this.mark=mark;
	}
	public String toString() {
		return "[Name: "+name+" Age: "+age+" Year: "+year+" Degree: "+degree+" Blood: "+blood+" Gender: "+gendre+" Roll: "+roll+" Mark: "+mark+"]";
	}
	public void displayStudent() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Year: "+year);
		System.out.println("Degree: "+degree);
		System.out.println("Collage: "+collage);
		System.out.println("Blood: "+blood);
		System.out.println("Gender: "+gendre);
		System.out.println("Roll: "+roll);
		System.out.println("Mark: "+mark);
	}

}
