
class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}

public class ModifyBST {

	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void skewTree(Node root) {

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

	static void printTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		printTree(root.right);
	}

	public static void main(String[] args) {

		ModifyBST tree = new ModifyBST();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		skewTree(node);
		printTree(headNode);

	}

}