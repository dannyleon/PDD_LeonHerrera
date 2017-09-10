public class Main{
	
	public static void main(String[]args){
		
		Logger logger=Logger.getInstance();
		logger.log("Usuario 1");
	}
	
}

public class Logger{
	
	private static Logger log;
	
	private Logger(){
		
		
	}
  

	public static Logger getInstance(){
		if(log==null){
			log=new Logger();
			
		}
		
		return log;
	}
	
	public void log(String msg){
		
		System.out.Println(msg);
	}
	
}
