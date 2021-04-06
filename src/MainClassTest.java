import org.junit.Test;

public class MainClassTest {

    MainClass number = new MainClass();

    @Test
    public void testGetLocalNumber() {
        if (number.getLocalNumber() == 14) {
            System.out.println("Number == 14");
        } else {
            System.out.println("Number != 14");
        }
    }

}
