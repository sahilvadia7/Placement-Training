package programs.assigments.days.day2.interfaces;

interface Membership {

    void displayMembershipDetails();
    double calculateMembershipFee();
}

class BasicMembership implements Membership{

    @Override
    public void displayMembershipDetails() {
        System.out.println("Membership : Basic Membership");
        System.out.println("Privileges : Cardio equipment");
    }

    @Override
    public double calculateMembershipFee() {
        return 2000;
      
    }
    
}

class StandardMembership implements Membership{

    @Override
    public void displayMembershipDetails() {
        System.out.println("Membership : Standard Membership");
        System.out.println("Privileges : Cardio & Weightlifting equipment");
    }

    @Override
    public double calculateMembershipFee() {
        return 3500;
      
    }
    
}

class PremiumMembership implements Membership{

    @Override
    public void displayMembershipDetails() {
        System.out.println("Membership : Preminum Membership");
        System.out.println("Privileges : Access to all gym facilities, including cardio, weightlifting, and group classes.");
    }

    @Override
    public double calculateMembershipFee() {
        return 5000;
      
    }
    
}

public class GymMembershipSystem {
    public static void main(String[] args) {
        
        Membership basicMembership = new BasicMembership();
        basicMembership.displayMembershipDetails();
        System.out.println("Price : "+basicMembership.calculateMembershipFee());

        Membership standardMembership = new StandardMembership();
        standardMembership.displayMembershipDetails();
        System.out.println("Price : "+standardMembership.calculateMembershipFee());

        Membership premiumMembership = new PremiumMembership();
        premiumMembership.displayMembershipDetails();
        System.out.println("Price : "+premiumMembership.calculateMembershipFee());
    }
    
}
