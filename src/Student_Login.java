package lab;
import java.sql.*;
import java.util.Scanner;

public class Student_Login {
    String uname, pwd;
    public void input(){
        System.out.println("Student Login Form\nUsername: ");
        Scanner sc = new Scanner(System.in);
        uname = sc.next();
        System.out.println("Password: ");
        pwd = sc.next();
    }
    public void retrieve(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydatabase", "root", "Luxan@22"
            );
            String sql = "SELECT * FROM emp WHERE Username = ?";
            String Name = null,course = null;
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, uname);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                 Name = rs.getString(2);
            }
            System.out.println("Hi "+Name+"\nYou have successfully registered for the following courses");
            String sqll = "SELECT * FROM course WHERE username = ?";
            PreparedStatement sts = con.prepareStatement(sqll);
            ResultSet result = st.executeQuery();
           if( result.next()) {
               course = result.getString(2);
           }
           System.out.println(course);


            con.close();
        }catch(Exception e) {System.out.println(e);}
    }
    public void choice() {
    	System.out.println("Please select an option\n1.Exit\n2.Registration");
    	Scanner sc = new Scanner(System.in);
    	int select = sc.nextInt();
    	switch(select) {
    	case 1:
    		System.out.println("Bye");
    		break;
    	case 2:
    		Student_Registration SR = new Student_Registration();
    		SR.input();
    		SR.add();
    		SR.Display();
    		break;
    	}
    }

}
