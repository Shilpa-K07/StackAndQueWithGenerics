public class StackImplementation {
	final LinkedListImplementation linkedList;
	public StackImplementation() {
		linkedList = new LinkedListImplementation();
	}
	public void push(NodeInf newNode) {
		linkedList.add(newNode);
	}
	public void printStack() {
		linkedList.printNodes();		
	}
	public NodeInf peak() {
		return linkedList.head;
	}
	
}
