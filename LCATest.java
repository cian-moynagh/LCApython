import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class LCATest {

	 LCA bst = new LCA(); 
	
	@Test
	public void lca () {
		LCA bst = new LCA();
		
		assertSame("nothing entered", null, bst.lca(bst.root, 1, 2));
		
		bst.insert(15);		
		assertSame("bst with only root", null,bst.lca(bst.root, 1, 2));
		
		bst.insert(10); 
	    bst.insert(6); 
	    bst.insert(14); 
	    bst.insert(4); 
	    bst.insert(8); 
	    bst.insert(12); 
	    bst.insert(16); 
        assertSame("full bst", 10 ,bst.lca(bst.root,14,5).data);
        	
	}

}
