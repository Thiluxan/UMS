import java.util.Scanner;
class StudentRegistration {
	String name;
	int age, select;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to University Management System\n\n....\nStudent Registration");
		System.out.println("\nPlease Submit the following information,\nName: ");
		name = sc.next();
		System.out.println("Age: ");
		age = sc.nextInt();
		System.out.println("Select Course Number from following list");
		System.out.println("[1] SENG 11111 - Introduction to Programming");
		System.out.println("[2] SENG 11112 - Fundamentals of Engineering");
		System.out.println("[3] SENG 11113 - Data Structures and Algorithms");
		select = sc.nextInt();
	}
	public void Display() {
		System.out.println("Welcome to University Management System\n\n....\nStudent Registration Completed");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		switch(select) {
		case 1:
			System.out.println("Subject: SENG 11111 - Introduction to Programming");
			break;
		case 2:
			System.out.println("Subject: SENG 11112 - Fundamentals of Engineering");
			break;
		case 3:
			System.out.println("Subject: SENG 11113 - Data Structures and Algorithms");
			break;
		}
	}
}
