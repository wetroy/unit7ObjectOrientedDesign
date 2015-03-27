   
/*
 * Output: 
x is object of type: Class1
y is object of type: Class2
y's superclass is Class1

 *  
 */

class Class1 {
  int a;

  float b;
}

class Class2 extends Class1 {
  double c;
}

public class MainClass {
  public static void main(String args[]) {
    Class1 x = new Class1();
    Class2 y = new Class2();
    Class clObj;

    clObj = x.getClass(); // get Class reference
    System.out.println("x is object of type: " + clObj.getName());

    clObj = y.getClass(); // get Class reference
    System.out.println("y is object of type: " + clObj.getName());
    clObj = clObj.getSuperclass();
    System.out.println("y's superclass is " + clObj.getName());
  }
}
