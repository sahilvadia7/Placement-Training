package programs.assigments.days.day2.relation;

public class Address {

    private String block,apartment;

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Address [block=" + block + ", apartment=" + apartment + "]";
    }

    
}
