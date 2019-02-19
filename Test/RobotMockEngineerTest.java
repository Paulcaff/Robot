import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.easymock.EasyMock.expect;
import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Robot.class)

public class RobotMockEngineerTest {



    @Test
    public void testEngineer() throws Exception {

        System.out.println("in test");
        Robot buddy = new Robot("buddy", 1);

        /*call the createMock to create a mock for the Owner class */
        Engineer mockEngineer = EasyMock.createMock(Engineer.class);

        /* Tell PowerMock to intercept any new call and return mockOwner */
        PowerMock.expectNew(Engineer.class, "John Smith", 46736).andReturn(mockEngineer);

        /* set up the expected values and return values */
        expect(mockEngineer.getContactNo()).andReturn(46736);

        /*activate the mock */
        PowerMock.replay(mockEngineer, Engineer.class);

        int expResult = 46746;
        int result = buddy.recordEngineer("John Smith",46736);
        assertEquals(expResult, result, 0.05);
        /* verify that PowerMock was called and used */
        PowerMock.verify(mockEngineer, Engineer.class);
    }
}