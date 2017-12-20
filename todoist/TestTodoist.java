

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestTodoist.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestTodoist
{
    private Todoist todoist1;

    /**
     * Default constructor for test class TestTodoist
     */
    public TestTodoist()
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
        todoist1 = new Todoist();
        todoist1.addTarea("asdf");
        todoist1.addTarea("asd");
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
