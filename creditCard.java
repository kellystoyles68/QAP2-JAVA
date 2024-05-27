// credit card java file

class CreditCard {
    private  Money balance;
    private final Money creditLimit;
    private final Person owner;


//constructor
public CreditCard (Person owner, Money creditLimit){
    this.owner = owner;
    this.creditLimit = new Money (creditLimit); //copy constructor
    this.balance = new Money (0);
}

//returns a balance
public Money getBalance(){
    return new Money (balance);
}

//returns personal
public Person getPersonals(){
    return owner;
}

//return new money credit limit
public Money getCreditLimit(){
    return new Money (creditLimit);
}

public void charge(Money amount) {
    if (balance.getAmount() + amount.getAmount() <= creditLimit.getAmount()) {
        balance = new Money(balance.getAmount() + amount.getAmount());
        System.out.println("Charge: " + amount);
    } else {
        System.out.println("Exceeds credit limit");
    }
}

//payment to CC
public void payment (Money amount){
  balance = new Money (balance.getAmount() - amount.getAmount());
    System.out.println ("Payment: " +  amount);
}}
