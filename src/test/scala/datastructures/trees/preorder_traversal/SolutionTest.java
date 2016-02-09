package datastructures.trees.preorder_traversal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class SolutionTest {

    @Mock
    Node mockNode;


    Node n1 = new Node();
    Node n2 = new Node();
    Node n3 = new Node();
    Node n4 = new Node();
    Node n5 = new Node();
    Node n6 = new Node();

    @InjectMocks
    Solution unit = new Solution();

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);


        n3.left = n5;
        n3.right = n2;
        n5.left = n1;
        n5.right = n4;
        n2.left = n6;

        n1.data = 1;
        n2.data = 2;
        n3.data = 3;
        n4.data = 4;
        n5.data = 5;
        n6.data = 6;

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testPreOrder() throws Exception {


        unit.preOrder(n3);
    }

    @Test
    public void testPreOrderStack() throws Exception {
        unit.preOrderStack(n3);
    }

    @Test
    public void testPostOrder() throws Exception {
        unit.postOrder(n3);
    }

    @Test
    public void testInOder() throws Exception {
        unit.inOrder(n3);
    }
}