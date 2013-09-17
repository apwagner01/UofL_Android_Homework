package d.linked.list;
	
public class Node {

	private String value = "";
	private Node pointerNode = null;
	private Node previousNode = null;

	public Node(String input) {
		this.value = input;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Node getPointerNode() {
		return pointerNode;
	}

	public void setPointerNode(Node pointerNode) {
		this.pointerNode = pointerNode;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", pointerNode=" + pointerNode + "]";
	}

	public Node getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}
}
