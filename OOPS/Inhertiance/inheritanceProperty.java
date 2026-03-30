class superClass{
    public superClass(){
        System.out.println("This is the constructor of the super class.");
    }
    public superClass(int a){
        System.out.println("This is the parameterized constructor of the super class. Value of a: " + a);
    }
}

class subClass extends superClass{
    public subClass(){
        System.out.println("This is the constructor of the sub class.");
    }
    public subClass(int a, int b){
        super(a); 
        System.out.println("This is the parameterized constructor of the sub class. Value of b: " + b);
    }
}




public class inheritanceProperty {
    public static void main(String args[]){
        subClass obj1 = new subClass();
        System.out.println();
        subClass obj2 = new subClass(10, 20);
    }
}


