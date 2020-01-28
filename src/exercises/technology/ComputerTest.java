package exercises.technology;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;

import org.junit.*;
import org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ComputerTest {
    Computer exampleLaptop;
    Computer exampleSmartphone;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Initializing Computer class and subclass tests...");
    }
    @Before
    public void newLaptop(){
        exampleLaptop = new Laptop("Asus","Windows 10", "2.3 kg",1366,768,false,false);
        exampleSmartphone = new SmartPhone("LG","Android 10.0","6.3 oz", 1080,2160, new String[]{"Verizon", "T-Mobile", "Sprint"});
    }
    @Test
    public void testLaptopConstructs(){
        assertEquals(exampleLaptop.getBrand(), "Asus");
    }
    @Test
    public void testReturnsResolution(){
        assertEquals(exampleLaptop.returnResolution(), "1366x768");
    }
    @Test
    public void testRecommendedForDigitalArt(){
        assertEquals(((Laptop)exampleLaptop).isRecommendedForDigitalArt(), false);
    }
    @Test
    public void testSmartphoneConstructs(){
        assertEquals(exampleSmartphone.getBrand(),"LG");
    }
}