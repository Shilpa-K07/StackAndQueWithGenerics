public class QueueImplementation {
	final LinkedListImplementation linkedList;
	
	public QueueImplementation() {
		linkedList = new LinkedListImplementation();
	}
	public void add(NodeInf newNode) {
		linkedList.append(newNode);
	}
	public void printStack() {
		linkedList.printNodes();
	}
	public NodeInf element() {
		return linkedList.head;
	}
}
