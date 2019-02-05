import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class RobotTest {

    @Rule
            public Timeout globaltimeout = Timeout.millis(2000);

    Robot buddy = new Robot("buddy",4);

    @Test
    public void TestgetName(){
        assertEquals("buddy",buddy.getName());
    }

    @Test
    public void TestgetAge(){
        assertEquals(4,buddy.getAge());
    }

    @Test
    public void TestisNotWorking(){
        assertFalse(buddy.isWorking());
    }

    @Test
    public void TestisWorking(){
        buddy.talkToRobot();
        assertTrue(buddy.isWorking());
    }

    @Test
    public void TestgetWorkingMessage(){
        buddy.talkToRobot();
        assertEquals("I am in working mode",buddy.getWorkingMessage());
    }

    @Test (expected = IllegalStateException.class)
    public void TestgetWorkingMessageFail(){
        assertEquals("I am in working mode",buddy.getWorkingMessage());
    }

    @Test (expected = IllegalArgumentException.class)
    public void TestgetNameFail(){
        Robot chuck = new Robot("",2);
        assertEquals("chuck",chuck.getName());

    }

    @Test (timeout=1000)//milliseconds
    public void TestwaitTillWorking(){
        buddy.waitTillWorking();
    }



}