package programs.assigments.days.day2.relation;

public class person {
    
    private String name,homeKey;
    private Address address;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHomeKey() {
        return homeKey;
    }
    public void setHomeKey(String homeKey) {
        this.homeKey = homeKey;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "person [name=" + name + ", homeKey=" + homeKey + ", address=" + address + "]";
    }


    
}
