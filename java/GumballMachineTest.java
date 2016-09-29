

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GumballMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GumballMachineTest
{
    /**
     * Default constructor for test class GumballMachineTest
     */
    GumballMachine gumballMachine;
    
    public GumballMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        gumballMachine = new GumballMachine(5);
    }

    @Test
    public void  testWithFifityCents()
    {
        
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        assertEquals(true, gumballMachine.isGumballInSlot());
        gumballMachine.takeGumballFromSlot(); // removing single gumball from the slot.
        assertEquals(false, gumballMachine.isGumballInSlot());
    }
    
    @Test
    public void testWithLessThanFiftyCents()
    {
        gumballMachine.insertQuarter();
        gumballMachine.insertDime();
        
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        assertEquals(false, gumballMachine.isGumballInSlot());//no gumball in the slot.
    }
    
    @Test
    public void testWithMoreThanFiftyCents()
    {
        gumballMachine.insertQuarter();
        gumballMachine.insertDime();
        gumballMachine.insertDime();
        gumballMachine.insertDime();
        gumballMachine.insertNickel();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        assertEquals(true, gumballMachine.isGumballInSlot());
        gumballMachine.takeGumballFromSlot();
        assertEquals(false, gumballMachine.isGumballInSlot());
    }
    
    @Test
    public void testWithMultipleGumballInSlots()
    {
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        
        assertEquals(true, gumballMachine.isGumballInSlot());
        gumballMachine.takeGumballFromSlot(); //removing both the gumballs from the slot.
        assertEquals(false, gumballMachine.isGumballInSlot());
    }
    
    @Test
    public void testingOnlyCrank()
    {
        assertEquals(false, gumballMachine.isGumballInSlot());
        gumballMachine.turnCrank();
        gumballMachine.turnCrank();
        assertEquals(false, gumballMachine.isGumballInSlot());// no gumball in the slot.
    }
    
    @Test
    public void testingEmptyGumballMachine()
    {
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        assertEquals(true, gumballMachine.isGumballInSlot());
        gumballMachine.takeGumballFromSlot();
        
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        assertEquals(true, gumballMachine.isGumballInSlot());
        gumballMachine.takeGumballFromSlot();
        
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        assertEquals(true, gumballMachine.isGumballInSlot());
        gumballMachine.takeGumballFromSlot();
        
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        assertEquals(true, gumballMachine.isGumballInSlot());
        gumballMachine.takeGumballFromSlot();
        
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        assertEquals(true, gumballMachine.isGumballInSlot());
        gumballMachine.takeGumballFromSlot();
            
        assertEquals(false, gumballMachine.isGumballInSlot());// no gumballs in the slot
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        assertEquals(false, gumballMachine.isGumballInSlot());
        
            
    }
    
    @Test
    public void testHasCoinState()
    {
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
               
        assertEquals(false, gumballMachine.isGumballInSlot());
        
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    

}
