public class User {
    private String firstname;
    private String lastname;
    public static int userCount = 0;

    public User(String firstname, String lastname){
        userCount++;
        this. firstname = firstname;
        this. lastname = lastname;
    }

    public String getFirstName(){
        return this.firstname;

    }
    
    public void setFirstName(String firstName){
        this.firstname = firstName;

    }

    public String getLastName(){
        return this.lastname;

    }

    public void setLastName(String lastName){
        this.lastname = lastName;

    }
}
