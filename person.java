    //person.java

class Person {
    private final String  firstName;
    private final String  lastName;
    private final Address Address;
    

    public Person (String firstName, String lastName, Address Address) 
    {
    this.firstName = firstName;
    this.lastName = lastName;
    this.Address = Address;
}

@Override
public String toString(){
    return "First Name: " + firstName + "Last Name: " + lastName + "Address: " + Address;
}
}