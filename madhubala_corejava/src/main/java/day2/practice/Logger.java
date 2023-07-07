package day2.practice;


public class Logger {
	
	
	
	public void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}

	public void log(String infomsg) {

		System.out.println("Log: " + infomsg);
	
	}
	
	public void erorr(String errormsg) {
		
	
		System.out.println("erorr: " + errormsg);
	}
	

	public static void main(String[] args) {
		
		
		
		Logger message = new Logger();
		message.debug("there ae some issues in debug that");
		message.log("log this value ");

		message.erorr("compilation eror");

		message.debug("In calling mthod there are error ");
		
		
		
	}
	
}