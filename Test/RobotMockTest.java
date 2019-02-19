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

public class RobotMockTest {



        @Test
        public void testOwner() throws Exception {
            System.out.println("in test");
            Robot buddy = new Robot("buddy", 1);

            /*call the createMock to create a mock for the Owner class */
            Owner mockOwner = EasyMock.createMock(Owner.class);

            /* Tell PowerMock to intercept any new call and return mockOwner */
            PowerMock.expectNew(Owner.class, "John Smith", 10000.00).andReturn(mockOwner);

            /* set up the expected values and return values */
            expect(mockOwner.getMonthlyPayments()).andReturn(833.33);

            /*activate the mock */
            PowerMock.replay(mockOwner, Owner.class);

            double expResult = 833.33;
            double result = buddy.recordOwnerAndMonthlyPayments("John Smith");
            assertEquals(expResult, result, 0.05);
            /* verify that PowerMock was called and used */
            PowerMock.verify(mockOwner, Owner.class);
        }
    }





