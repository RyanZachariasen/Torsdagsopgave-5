package TaskOne;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    public Customer(String firstName, String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;

    }

    public String toString(){
        return "Customer name : " + firstName +" "+  lastName + "\n" +"Username : " + userName;

    }
    public String getFirstName(){
        return firstName;
    }  public String getLastName(){
        return firstName;
    }  public String getUserName(){
        return firstName;
    }
}
