

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		/*gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		//System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);*/
		
		System.out.println("1.------------------------");
		gumballMachine.insertDime();
		gumballMachine.insertQuarter();
		gumballMachine.insertDime();
		gumballMachine.insertDime();
		gumballMachine.turnCrank();
		//System.out.println(gumballMachine);
		gumballMachine.takeGumballFromSlot();
		
		
		System.out.println("2.------------------------");
		gumballMachine.insertDime();
		gumballMachine.insertQuarter();
		gumballMachine.insertNickel();
		gumballMachine.insertDime();
		gumballMachine.turnCrank();
		//System.out.println(gumballMachine);
		gumballMachine.takeGumballFromSlot();
		
		System.out.println("3.------------------------");
		gumballMachine.insertDime();
		gumballMachine.getState();
		gumballMachine.turnCrank();
		gumballMachine.getState();
		//System.out.println(gumballMachine);
		
		
		gumballMachine.takeGumballFromSlot();
		
		
	}
}
