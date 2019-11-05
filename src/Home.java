import java.util.Scanner;
public class Home {

	public static void main(String[] args) {
		System.out.println("Welcome to University Management System");
		System.out.println("Press [1] Register as a student");
		System.out.println("Press [2] Register as a lecturer");
		Scanner sc = new Scanner(System.in);
		int selection = sc.nextInt();
		StudentRegistration stu = new StudentRegistration();
		switch(selection) {
		case 1:
			stu.input();
			stu.Display();
			break;
		case 2:
			System.out.println("System under construction");
			break;
		}
	}

}
