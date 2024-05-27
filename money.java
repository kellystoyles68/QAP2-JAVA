//money.java

class Money {
    private long dollars;
    private long cents;

//default constructor
    public Money () {
        this.dollars = 0;
        this.cents = 0;
    }

//constructor
    public Money (double amount){
        this.dollars = (long) amount;
        this.cents = (long )((amount - this.dollars) *  100);
    }

//copy constructor
public Money (Money other){
    this.dollars = other.dollars;
    this.cents = other.cents;
}

// add method
public void add (Money other) {
    this.dollars += other.dollars;
    this.cents += other.cents;
    if (this.cents >= 100) {
        this.dollars += this.cents / 100;
        this.cents %=100;}
}

//subtract method
public void subtract (Money other) {
    this.dollars -=  other.dollars;
    this.cents -= other.cents;
    
    if (this.cents < 0) {
        this.cents += 100;
        this.dollars -=1;
    }
    if (this.dollars < 0) {
        this.dollars += 100;
        this.cents -=1;}
}

//getter amount
public double getAmount () {
    return this.dollars + this.cents/100;
}

//compareTo method
public int compareTo(Money other) {
    if (this.dollars != other.dollars) {
        return Long.compare(this.dollars, other.dollars);
    }else {
        return Long.compare(this.cents, other.cents);
    }
}
//boolean equals 
//@Override
//public boolean equals (Object obj ) {
//DONT KNOW WHAT I NEED TO WRITE HERE YET
//}

@Override
    public String toString() {
        return String.format("$%.2f", dollars + cents / 100.0);
    }
}