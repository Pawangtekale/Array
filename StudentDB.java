package Array;

public class StudentDB {
	private String user;
	private String pass;
	
	private Student[] db= new Student[10];
	
	private boolean checkLogin;
	private int size;

	public StudentDB() {
		// TODO Auto-generated constructor stub
	}
	public StudentDB(String user,String pass) {
		this.user=user;
		this.pass=pass;
		System.out.println("DB is created..!");
	}
	public boolean login(String user,String pass) {
		if(user==this.user && pass==this.pass) {
			checkLogin=true;
			System.out.println("Login Success...");
			return true;
		}
		System.out.println("Invalid Credentials...");
		return false;
	}
	public boolean addStudent(String name,int age,int year,String degree,
			String blood,char gender,int mark,int roll) {
		if(checkLogin) {
			if(size<db.length*0.7) {
				db[size]=new Student(name,age,year,degree,blood,gender,roll,mark);
				size++;
				return true;
			}
			else {
				Student []temp=new Student[db.length*2];
				for(int i=0;i<size;i++) {
					temp[i]=db[i];
				}
				db=temp;
				db[size]=new Student(name,age,year,degree,blood,gender,roll,mark);
				size++;
				return true;
			}
		}
		System.out.println("Plase login...!");
		return false;
	}
	public void printDB() {
		if(checkLogin) {
			for(int i=0;i<size;i++) {
				System.out.println(db[i]);
			}
		}
		else {
			System.out.println("Please Login..");
		}
	}
	public boolean searchByName(String name) {
		if(checkLogin) {
			for (int i = 0; i < size; i++) {
				if(db[i].name.equalsIgnoreCase(name)) {
					return true;
				}
			}
		}
		return false;
	}
	/*public void sortByRoll() {
		if(checkLogin) {
			for (int i = 0; i < size-1; i++) {
				for (int j = 0; j < size-1-i; j++) {
					if(db[j].roll>db[j+1].roll) {
						Student temp=db[j];
						db[j]=db[j+1];
						db[j+1]=temp;
					}
				}
			}
			System.out.println("Please Login...");
		}
		
	}*/
	public void sortByRoll() {
	    if (checkLogin) {
	        // Bubble sort by roll number
	        for (int i = 0; i < size - 1; i++) {
	            for (int j = 0; j < size - 1 - i; j++) {
	                if (db[j].roll > db[j + 1].roll) {
	                    Student temp = db[j];
	                    db[j] = db[j + 1];
	                    db[j + 1] = temp;
	                }
	            }
	        }

	        // print sorted result
	        System.out.println("Sorted by Roll:");
	        for (int i = 0; i < size; i++) {
	            System.out.println(db[i].roll + " " + db[i].name);
	        }
	    } else {
	        // Only print login message if not logged in
	        System.out.println("Please Login...");
	    }
	}

	public void sortByName() {
		if(checkLogin) {
			for (int i = 0; i < size-1; i++) {
				for (int j = 0; j < size-1-i; j++) {
					if(db[j].name.compareTo(db[j+1].name)>0) {
						Student temp=db[j];
						db[j]=db[j+1];
						db[j+1]=temp;
					}
				}
			}
			System.out.println("Please Login...");
		}
	
	}
	public void sortByMark() {
	    if (checkLogin) {
	        // Bubble sort by Mark number
	        for (int i = 0; i < size - 1; i++) {
	            for (int j = 0; j < size - 1 - i; j++) {
	                if (db[j].mark > db[j + 1].mark) {
	                    Student temp = db[j];
	                    db[j] = db[j + 1];
	                    db[j + 1] = temp;
	                }
	            }
	        }

	        // print sorted result
	        System.out.println("Sorted by Mark:");
	        for (int i = 0; i < size; i++) {
	            System.out.println(db[i].mark + " " + db[i].name);
	        }
	    } else {
	        // Only print login message if not logged in
	        System.out.println("Please Login...");
	    }
	}
	
}
