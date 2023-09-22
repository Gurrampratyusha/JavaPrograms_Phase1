package Exceptions;

public class ThrowEx {
       public void div(int a, int b)
       {  
    	   if(b==0)
    	   {
    		   throw new ArithmeticException();
    	   
    	  }
    	   else {
    		   int c=a/b;
    		   System.out.println("the divison os 2 nymbers is :" +c);
    	   }
    	   int c = a/b ;
    	   System.out.println("The division of 2 numbers is :" +c);
       }
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ThrowEx obj = new ThrowEx();
       obj.div(12,0);
	}

}
