package Day23;

public class NameLambdaExpression {

	import java.util.*;  
	public class LambdaExpressionExample7{  
	    public static void main(String[] args) {  
	          
	        List<String> list=new ArrayList<String>();  
	        list.add("Ashu");  
	        list.add("name2");  
	        list.add("name3");  
	        list.add("name4");  
	          
	        list.forEach(  
	            (n)->System.out.println(n)  
	        );  
	    }  
	}  
	
}
