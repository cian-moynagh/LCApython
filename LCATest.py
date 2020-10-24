import unittest
import LCA

class TestLCA(unittest.TestCase):

    def test_findLCA(self):

        root = LCA.Node(1)
        result = LCA.findLCA(root, 4, 5)
        self.assertEqual(-1, -1) #only root in tree
        root.left = LCA.Node(2)
        root.right = LCA.Node(3)
        root.left.left = LCA.Node(4)
        root.left.right = LCA.Node(5)
        root.right.left = LCA.Node(6)
        root.right.right = LCA.Node(7)
        result = LCA.findLCA(root, 4, 5)
        self.assertEqual(2, result)
        
