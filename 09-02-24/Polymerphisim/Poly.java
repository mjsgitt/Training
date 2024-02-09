
public class Poly{
    double a,b;

    // method overloading  1.0
    // if we call both methods with different parameters it will decide which parameter is inserted , called and subsequently it will be run.
    public int Add(int a , int b){
        System.out.println("printed int");
        return a+b;
    }
    public double Add(double a,double b){
        System.out.println("printed double");
        return a+b;
    }

    // method overloading 2.0
    // we can add the same method with different parameter to load the method.
    public int Add(int a , int b ,int c ){
        System.out.println("Printed 3 parameters int");
        return a+b+c;
    }

    // this is not completed . will learn about runtime polymerphism.
}