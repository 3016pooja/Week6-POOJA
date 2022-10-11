package callingprogrammjava;

/*3.	Write a Java programme using the following steps.
3.1	Declare one instance and one static variable.
3.2	Declare one instance method.
3.3	Declare one static method.
3.4	Call both instance and static variables into both instance and static methods inside the print statement.
3.5	Declare the Main method.
3.6	Call both instance and static methods into the Main method and run the programme. */

public class Programme3 {

    int a= 16;// instance variable
    static int b=10;// static variable
    public static void main(String[] args) {
        Programme3 obj= new Programme3();
        obj.ins();
        my();

    }

    //instace method
    public void  ins(){
        System.out.println(a);
        System.out.println(Programme3.b);
    }
    public static  void my(){
        Programme3 programme3=new Programme3();
        System.out.println(programme3.a);
        System.out.println(b);
    }
}
