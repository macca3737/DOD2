/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dod;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author macca
 */
public class WorldTest {
    
    public WorldTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testWorldLocations() {
        // TODO Check The Locations have right descriptions.
         World world = new World();
         System.out.println("* UtilsJUnit4Test: WorldTest1 - check Locations");
         assertEquals("by a babbling brook", world.locations.get(0).desc);
         assertEquals("up in some misty mountains", world.locations.get(1).desc);
         assertEquals("in the cave of Gwent the dragon", world.locations.get(2).desc);
         assertEquals("in a sunny field", world.locations.get(3).desc);
         assertEquals("by a great oak", world.locations.get(4).desc);
         assertEquals("in some murky marshes", world.locations.get(5).desc);
         assertEquals("in some deserted tower ruins", world.locations.get(6).desc);
         assertEquals("on top of some high cliffs", world.locations.get(7).desc);
         assertEquals("on a lonely beach", world.locations.get(8).desc);
    }
    @Test
        public void testWorld() {
        // TODO Check if the World is empty.
         World world = new World();
         System.out.println("* UtilsJUnit4Test: WorldTest2 - check World is Populated");
         assertFalse(world.locations.isEmpty());

    }
    
    @Test
        public void testExits() {
        // TODO Check if the World is empty.
         World world = new World();
         System.out.println("* UtilsJUnit4Test: WorldTest3 - check Locations have exists");
         for (int i = 0; i < world.locations.size(); i++) {
                boolean noExit = true;
                
                Location test = world.locations.get(i);
                
                Location north = test.north;
                System.out.println(i + " Testing " + test.desc + " : " + north );
                if (north!=null) {               
                noExit=false;
                }
                
                Location east = test.east;
                System.out.println(i + " Testing " + test.desc + " : " + east );
                if (east!=null) {                
                noExit=false;
                }
                
                Location south = test.south;
                System.out.println(i + " Testing " + test.desc + " : " + south );
                if (south!=null) {                
                noExit=false;
                }
                
                Location west = test.west;
                System.out.println(i + " Testing " + test.desc + " : " + west );                
                if (west!=null) {
                noExit=false;
                }                                
                
                assertFalse(noExit);
         }
    }
    
}
