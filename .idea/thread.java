/**
 * Innerthread
 */


class invalidageException extends RuntimeException{
invalidageException(String msg){
    super(msg);
}
}

class validateage extends thread{
int age=10;
public void run(){
    if(age<18){
        System.out.println("Not eligible to vote");
    }
    else{
        System.out.println("eligible for voting");
    }
}
    
}

public class thread{
    public static void main(String[]args){
      validateage t1=new validateage();
      t1.start();
    }
}
