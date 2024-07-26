package programs.assigments.days.day1;

final class Car{
    
    public void carname(){
        System.out.println("BMW");
    }
}

class BMW{

    public static final void carcolor(){
        System.out.println("Black");
    }
}

//public class finalll extends FinalDemo
//it will not allow to extends final class you must create object of final class
public class finalll extends BMW{


    // tring to override the final method of BMW

    // public void carcolor(){
    //     This instance method cannot override the static method from BMW 
    // }

    public static void main(String[] args) {
        
        //final class must create object
        Car car = new Car();
        car.carname();
     
        // final method call 
        carcolor();

    }
            
}


/*
 *  >>>> Final class <<<<
 *  Must create objects of final class it will not extends in child class.
 * 
 * >>>> Final Method <<<<
 *  final method can't overrind in child class
 * 
 * >>>> Final Keyword <<<<
 *  if variable is final it not change again
 *  only in constructor or init time you can change
 *  
 */