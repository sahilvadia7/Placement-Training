package programs.library;



public class Auther {

    private String AutherFname,AutherLname;

    public String getAutherFname() {
        return AutherFname;
    }

    public void setAutherFname(String autherFname) {
        AutherFname = autherFname;
    }

    public String getAutherLname() {
        return AutherLname;
    }

    public void setAutherLname(String autherLname) {
        AutherLname = autherLname;
    }

    @Override
    public String toString() {
        return "Auther [AutherFname=" + AutherFname + ", AutherLname=" + AutherLname + "]";
    }

    
    
}