import org.junit.Assert;
import org.junit.Test;

public class StackAndQueueTest {
	@Test
	public void givenThreeNumbersWhenAddedToStackShouldHaveLastAddedNode() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(70);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(56);

		StackImplementation stack = new StackImplementation();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.printStack();
		NodeInf result = stack.peak();
		Assert.assertEquals(thirdNode, result);
	}
	
	@Test
	public void givenThreeNumbersWhenAddedToStackShouldNotHaveLastAddedNode() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(70);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(56);

		StackImplementation stack = new StackImplementation();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.printStack();
		NodeInf result = stack.peak();
		Assert.assertNotEquals(firstNode, result);
	}
	
	//UC-2
	@Test
	public void givenThreeNumbersWhenPoppedShouldReturnLastAddedNode() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(70);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(56);

		StackImplementation stack = new StackImplementation();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		NodeInf result = stack.pop();
		stack.printStack();
		Assert.assertEquals(thirdNode, result);
	}
	
	@Test
	public void givenThreeNumbersWhenPoppedShouldNotReturnLastAddedNode() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(70);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(56);

		StackImplementation stack = new StackImplementation();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		NodeInf result = stack.pop();
		stack.printStack();
		Assert.assertNotEquals(firstNode, result);
	}
}
