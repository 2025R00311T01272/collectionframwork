public class Finalmodifier {
    final String name="Ajay";
    void udateName(){
System.out.println("Update name"+name);
    }
    public static void main(String[] args){
System.out.println("Final method called");
Finalmodifier obj=new Finalmodifier();
obj.udateName();
    }
}
