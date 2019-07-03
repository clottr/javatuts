
public class HelloWorld {


    public void nonStaticTest() {
        System.out.Println("Tja bror va händs")
    }
    public void staticTest() {
        System.out.Println("You just 'string' amount of damage")
    }

    public static void main (Strings[] args){
        HelloWorld helloWorldObject= new HelloWorld();
        System.out.println("Hello World");
        helloWorldObject.nonStaticTest();
        staticTest();
    }

}