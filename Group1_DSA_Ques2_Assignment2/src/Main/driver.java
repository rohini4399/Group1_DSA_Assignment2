package Main;

import service.*;

public class driver {

	public static void main(String[] args) {

		ModifyBST tree = new ModifyBST();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		tree.skewTree(tree.node);
		tree.printTree(tree.headNode);

	}

}
