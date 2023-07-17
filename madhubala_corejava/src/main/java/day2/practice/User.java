package day2.practice;

public class User {

	 private String name;  

	 private String password;  

	 private String id;  

	 private String email;  

	    public String getName() {  
	        return name;
	    }

	    public void setName(String name) {  
				this.name = name; 
	    }

	    public String getId() {  
	        return id;
	    }

	    public void setId(String i) {  
				this.id = i; 
	    }

	    public String getPassword() {  
	        return password;
	    }

	    public void setPassword(String password) {  
				this.password = password; 
	    }
	    
	    
	    public String getemailId() {  
	        return email;
	    }

	    public void setemailId(String email) {  
				this.email = email; 
	    }

	    public static void main(String[] args) {

	    	User user = new User();
	    	user.setName("Madhubala");      
	    	String name = user.getName();  
	    	System.out.println(name);   
	    	
	    	user.setId("12345");      
	    	String id = user.getId();  
	    	System.out.println(id);   
	    	
	    	user.setPassword("Madhu.06");   
	    	String password = user.getPassword();  
	    	System.out.println(password);   
	    	
	    	user.setemailId("Madhu@gmail.com");      
	    	String emialid = user.getemailId();  
	    	System.out.println(emialid);   
	
		}
}
