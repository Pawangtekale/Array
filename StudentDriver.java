package Array;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDB sdb1=new StudentDB("Root","Root");
		sdb1.login("Root","Root");
		sdb1.addStudent("Pawan", 23, 4,"BE",  "B+",'M',98,  1234);
		sdb1.addStudent("Moni", 22, 3,"BTech",  "AB+",'F',67,  134);
		sdb1.addStudent("Raju", 21, 2,"BE",  "A+",'M',64,  1334);
		sdb1.addStudent("Kaju", 24, 4,"BE",  "O+",'F',68,  1434);
		sdb1.addStudent("Jaddu", 24, 3,"BE",  "A-",'M',77,  1534);
		sdb1.addStudent("rani", 25, 4,"BE",  "B+",'F',69,  1634);
		System.out.println(sdb1.searchByName("Moni"));
		//sdb1.printDB();
		
		//sdb1.sortByRoll();
		//sdb1.sortByName();
		//sdb1.printDB();
		sdb1.sortByMark();
		
	}

}
