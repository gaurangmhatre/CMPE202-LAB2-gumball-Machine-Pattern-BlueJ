

import java.util.Random;

public class HasCoinsState implements State {
    GumballMachine gumballMachine;
 
    public HasCoinsState(GumballMachine gumballMachine) {
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
        else{
            System.out.println("Opps!! Only Nickel,Dime and Quarter is allowed!");       
            return;
        }
        
        gumballMachine.setCoinTotalValue(gumballMachine.getCoinTotalValue() + n);        
    }
 
    public void ejectCoin() {
        System.out.println("Your"+ gumballMachine.getCoinTotalValue()+ " cents returned.");
        gumballMachine.setCoinTotalValue(0);
        gumballMachine.setState(gumballMachine.getNoCoinsState());
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        if(gumballMachine.getCoinTotalValue() < 50){
            int remainder = 50 - gumballMachine.getCoinTotalValue();
            System.out.println("You need "+ remainder +" more cents to get a gumball!");    
        }
        else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
