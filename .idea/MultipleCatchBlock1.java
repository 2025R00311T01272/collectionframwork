public class MultipleCatchBlock1 {  
  public static void main(String[] args) {  
             try{       
                String name="Hello";
                System.out.println(name.charAt(7));
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println(e.getMessage());  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println(e.getMessage());  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println(e.getMessage());  
                  }             
                 
    }  
}

