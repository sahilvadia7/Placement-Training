package programs.assigments.days.day1;

abstract class Cars {


    // abstract method must want abstract class to define 
    // abstract class also have normal method
    // 
    abstract void model();

    public void color(){
        System.out.println("black");
    }
}

class Porsche extends Cars{

    @Override
    void model() {
       System.out.println("911");
    }
}

public class abstractt {
    
    public static void main(String[] args) {
        
        Cars porsche = new Porsche();
        porsche.model();
        porsche.color();
    }
}
 