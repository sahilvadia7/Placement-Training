package programs.assigments.days.day1;

class Car{

    // static variable is common sharing with all the object it will not creat copy of it self
    static int count1 = 0;
    int count2 = 0;

    public Car(int count2) {
        this.count2 = count2;
    }

    // static method allow to call method without creating object of class
    // static method is refre to class not an object
    // also you can call using class.method(); Car.model();
    static void model(){
        System.out.println("BMW");
       
    }

    // static block it allow to init variable just like constructor.
    // static method,block only allow static variable. 
    // if you pass static arguments into construtor it give warnning.
    // static block call before the constructor.

    static{
        count1 =10;
    }

}

public class Staticcc extends Car{
    
    public Staticcc(int count2) {
        super(count2);
        
    }

    public static void main(String[] args) {
        model();
    }
}
