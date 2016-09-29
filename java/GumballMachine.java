

public class GumballMachine implements IGumballMachine{
 
    State soldOutState;
    State noCoinsState;
    State hasCoinsState;
    State soldState;
 
    boolean isGumballInSlot;
    int numberOfGumballsInSlot;
    
    int coinTotalValue;
    State state = soldOutState;
    int count = 0;
 
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noCoinsState = new NoCoinsState(this);
        hasCoinsState = new HasCoinsState(this);
        soldState = new SoldState(this);

        coinTotalValue = 0;
        isGumballInSlot = false;
        
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoinsState;
        } 
    }
 
    public void insertQuarter()  {
        state.insertCoin(25);
    }

    public void insertDime()
    {
        state.insertCoin(10);
    }
    
    public void insertNickel()
    {
        state.insertCoin(5);
    } 
    
    public void ejectQuarter() {
        state.ejectCoin();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        isGumballInSlot= true;
        numberOfGumballsInSlot++;
        
        coinTotalValue= coinTotalValue-50;
        
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noCoinsState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinsState() {
        return noCoinsState;
    }

    public State getHasCoinsState() {
        return hasCoinsState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
    
    //----------Coin Total handler methods---------
    public void setCoinTotalValue(int value)
    {
        coinTotalValue = value;
    }
    
    public int getCoinTotalValue()
    {
        return coinTotalValue;
    }
    
    //-------------------------------------
    
    public boolean isGumballInSlot()
     { 
         return isGumballInSlot;
     }    
     
     public void takeGumballFromSlot()
    { 
        if(isGumballInSlot())
        {
            System.out.println("Taking "+numberOfGumballsInSlot+" gumball from the slot");    
            numberOfGumballsInSlot = 0;
            isGumballInSlot = false;
        }
        else
        {
            System.out.println("No gumball in the slot, You have to pay me 50 cents first");
        }
    }
}
