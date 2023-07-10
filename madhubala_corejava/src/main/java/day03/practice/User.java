package day03.practice;

public class User {
private String name;
private String email;
private String password;
	
	public User(){
		
	}
	
public User(String name,String password,String email){
		this.name=name;
		this.password=password;
		this.email=email;
	
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		 User user=new User("Madhu","Madhu.06","Madhubala@gmail.com");
		
		 System.out.println(user.name);
			System.out.println(user.password);
			System.out.println(user.email);
		
	}
}
