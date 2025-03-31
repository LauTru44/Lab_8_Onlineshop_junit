import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  mik
 * @version 0.1
 */
/* 14) - public Test()

  -  @BeforeEach
    public void setUp()
    
  -  @AfterEach
    public void tearDown()
    
 * 17) options: show source, get details by selecting the test in the list.
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
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

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
    }
    
    //Exercise 15
     @Test
        public void testAddCommentSameAuthor() 
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
         assertEquals(false, salesIte1.addComment("James Duckling", "don't matter", 1));
        assertEquals(1, salesIte1.getNumberOfComments());
    }
    
    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
    }
    
    //Exercise 16
    @Test
    public void negativeTestingRange()
    {
        SalesItem salesIte1 = new SalesItem("yes", 10);
        assertEquals(false, salesIte1.addComment("Laura", "ew", 6));
        assertEquals(false, salesIte1.addComment("mario", "yes", 0));
    }
    
    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
    }

    @Test
    public void addComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain Surgery for Dummies.", 9899);
        assertEquals(true, salesIte1.addComment("Fred", "Great - I perform brain surgery every week now!", 4));
    }

    //Exercise 19
    @Test
    public void findMostHelpfulComment()
    {
        SalesItem salesIte1 = new SalesItem("toy", 10);
        assertEquals(true, salesIte1.addComment("laura", "yes", 3));
        Comment comment1 = salesIte1.findMostHelpfulComment();
        assertNotNull(comment1);
        assertNotNull(comment1.getFullDetails());
    }


    @Test
    public void getNumberOfComments()
    {
        SalesItem salesIte2 = new SalesItem("toy", 10);
        assertEquals(true, salesIte2.addComment("laura", "yes", 1));
        assertEquals(true, salesIte2.addComment("mario", "no", 5));
        assertEquals(2, salesIte2.getNumberOfComments());
    }

    //Exercise 20
    @Test
    public void TestingComments()
    {
        SalesItem salesIte1 = new SalesItem("toy", 10);
        assertEquals(true, salesIte1.addComment("1", "1", 1));
        assertEquals(true, salesIte1.addComment("2", "2", 2));
        assertEquals(true, salesIte1.addComment("3", "3", 3));
        salesIte1.downvoteComment(1);
        salesIte1.upvoteComment(2);
        salesIte1.showInfo();
        assertEquals(3, salesIte1.getNumberOfComments());
        salesIte1.removeComment(1);
        salesIte1.showInfo();
        assertEquals(2, salesIte1.getNumberOfComments());
    }

    @Test //exercise 20
    public void noCommentsAvailable()
    {
        SalesItem salesIte2 = new SalesItem("toy", 10);
        assertNull(salesIte2.findCommentByAuthor("laura"));
        assertNull(salesIte2.findMostHelpfulComment());
    }
}



















