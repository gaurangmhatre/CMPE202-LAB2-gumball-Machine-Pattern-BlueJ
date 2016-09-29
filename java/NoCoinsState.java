

public class NoCoinsState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int n) {
        //System.out.println("You inserted a quarter");
        //gumballMachine.setState(gumballMachine.getHasCoinsState());
        if(n==5)
        {
            System.out.println("You have entered a Nickel!");
        }else if(n==10)
        {
            System.out.println("You have entered a Dime!");        
        }else if(n==25)
        {
            System.out.println("You have entered an Quarter!");
        }
        else
        {
            System.out.println("Opps!! Only Nickel,Dime and Quarter is allowed!");       
            return;
        }
        
        gumballMachine.setCoinTotalValue(gumballMachine.getCoinTotalValue() + n);
        gumballMachine.setState(gumballMachine.getHasCoinsState());
        
    }
 
    public void ejectCoin() {
        System.out.println("Your"+ gumballMachine.getCoinTotalValue()+ " cents returned.");
        gumballMachine.setCoinTotalValue(0);
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for coins";
	}
}
