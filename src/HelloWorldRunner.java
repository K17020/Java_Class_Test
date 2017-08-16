public class HelloWorldRunner {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        countToTen counting = new countToTen();
        hello.sayHello();
        counting.countNumber();
    }
}
// Class prints out hello world
class HelloWorld {

    private String message = "Hello World";

    public void sayHello() {
        System.out.println(message);
    }

}
// Class prints out 0-9
class countToTen{

    public void countNumber(){

        for ( int num = 0; num<10; num++){
         System.out.println(num);
        }
    }
}