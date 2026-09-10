public class Abstraction{
    abstract class Vehicle{
        abstract void start();
        void stop(){
            System.out.println("Vehicle stopped");
        }

    }
    class Car extends Vehicle{
        void start(){
            System.out.println("Car starts with akey");
        }
    }
        public static void main(String[] args){
            Vehicle v = new Car();
            v.start();
            v.stop();
            
        }
    }

