// Java Program for Lowest Common Ancestor in a Binary Tree 
  
public class LCA {
	
	class Node { 
	    int data; 
	    Node left, right; 
	  
	    public Node(int value) { 
	        data = value; 
	        left = right = null; 
	    } 
	} 
	
	  Node root; 
	  
	  // constructor 
	    LCA() {  
	        root = null;  
	    }
	    
	    void insert(int data) { 
		       root = recursiveInsert(root, data); 
		    } 
		      
		    // recursive function to insert new data in tree
		    Node recursiveInsert(Node root, int data) { 
		  
		        // if tree empty, return node
		        if (root == null) { 
		            root = new Node(data); 
		            return root; 
		        } 
		  
		        // else, continue
		        if (data > root.data) 
		            root.right = recursiveInsert(root.right, data); 
		        else if (data < root.data) 
		            root.left = recursiveInsert(root.left, data); 
		  		        
		        return root; 
		    } 
		    Node lca(Node node, int n1, int n2)  
		    { 
		    	//empty
		        if (node == null) 
		            return null; 
		   
		        // if n1 & n2 < root; LCA in right
		        if (node.data < n1 && node.data < n2)  
		            return lca(node.right, n1, n2); 
		   
		        // if n1 & n2 < root; LCA in left
		        if (node.data > n1 && node.data > n2) 
		            return lca(node.left, n1, n2); 
		
		        return node; 
		    } 
		  
		   
		    public static void main(String[] args) { 
		        LCA bst = new LCA(); 
		  
		        /* create this BST 
		              10 
		           /     \ 
		          6      14 
		         /  \    /  \ 
		       4     8  12   16 
		         				*/
		        
		        int node1 = 12;
		        int node2 = 16;
		        
		        bst.insert(10); 
		        bst.insert(6); 
		        bst.insert(14); 
		        bst.insert(4); 
		        bst.insert(8); 
		        bst.insert(node1); 
		        bst.insert(node2); 
		  
		        Node ans = bst.lca(bst.root, node1, node2); 
		        System.out.println("LCA of " + node1 + " and " + node2 + " is " + ans.data);
		        
		    } 
} 
