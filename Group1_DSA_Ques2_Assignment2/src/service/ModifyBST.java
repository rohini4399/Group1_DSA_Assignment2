package service;

public class ModifyBST {

	public Node node;
	public Node prevNode = null;
	public Node headNode = null;

	public void skewTree(Node root) {

		if (root == null) {
			return;
		}

		skewTree(root.left);

		Node rightNode = root.right;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		skewTree(rightNode);
	}

	public void printTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		printTree(root.right);
	}

}
