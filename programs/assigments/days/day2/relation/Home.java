package programs.assigments.days.day2.relation;

public class Home {
    
    public static void main(String[] args) {
        

       person ankit = new person();
       Address ad= new Address();
       ad.setApartment("garden apartment");
       ad.setBlock("A");
       ankit.setAddress(ad);
       ankit.setHomeKey("Home@2212");
       ankit.setName("Ankit");

       System.out.println(ankit);
    }
}
