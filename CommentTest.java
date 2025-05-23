

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    //Exercise 18
    @Test 
    public void storeCorrectly(){
      Comment comment1 = new Comment("Laura","comment",3);  
    }
 
    //Exercise 18
    @Test
    public void upvote()
    {
        Comment comment1 = new Comment("laura", "yes", 3);
        comment1.upvote();
    }
    
    //Exercise 18
    @Test
    public void downvote()
    {
        Comment comment1 = new Comment("laura", "yes", 4);
        comment1.downvote();
    }
}



