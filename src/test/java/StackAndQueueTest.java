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
	
	//UC-3
	@Test
	public void givenThreeNumbersWhenAddedToQueueShouldHsveFirstAddedElement() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(70);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(56);

		QueueImplementation queue = new QueueImplementation();
		queue.add(firstNode);
		queue.add(secondNode);
		queue.add(thirdNode);
		NodeInf result = queue.element();
		queue.printStack();
		Assert.assertEquals(firstNode, result);
	}
	
	@Test
	public void givenThreeNumbersWhenAddedToQueueShouldNotHsveFirstAddedElement() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(70);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(56);

		QueueImplementation queue = new QueueImplementation();
		queue.add(firstNode);
		queue.add(secondNode);
		queue.add(thirdNode);
		NodeInf result = queue.element();
		queue.printStack();
		Assert.assertNotEquals(thirdNode, result);
	}
}
