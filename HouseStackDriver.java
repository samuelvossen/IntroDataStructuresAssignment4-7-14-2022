/** 
 * this class is the driver to test the rest of the House classes
 * @author samuel vossen
 *
 */
public class HouseStackDriver {
	/**
	 * This method creates an
	integer number representation of the
	values stored on the stack where the most
	significant digit is at the top of the stack.
	 * @param list
	 * a HouseLinkedStack object
	 * @return integer number representation of the
	values stored on the stack where the most
	significant digit is at the top of the stack.
	 * @postcondition the stack is now empty 
	 */

public static int stackToInt(HouseLinkedStack list) {;
	double pos =0;
	double output = 0;
	while(list.isEmpty() == false) {
		double num = list.pop().getSquareFoot();
		output = output + num * Math.pow(10,pos);
		pos = pos +1;
		
	}
	return (int)output;
	
}
/**
 * this method takes a specified number of items off the stack and adds their square feet together.
 * @param list
 * a HouseLinkedStack object
 * @param count
 * an integer
 * @return integer number representation the value of the square feet combined
 */
public static int popSome(HouseLinkedStack list, int count) {
	double counter =0;
	double output = 0;
	while(list.isEmpty() == false && counter < count) {
		double num = list.pop().getSquareFoot();
		output = output + num;
		counter++;
	
}
	return (int)output;
	
}
/**
 * this method removes a specified House object from a stack without changing the order of the stack
 * @param list
 * a HouseLinkedStack object.
 * @param target
 * a house object.
 * @postcondition the object has been removed from the stack.
 */
public static void extractFromStack(HouseLinkedStack list, House target) {
	HouseLinkedStack newStack = new HouseLinkedStack();
	while(list.isEmpty() == false) {
		House current = list.pop();
		if(current.equals(target) == false) {
			newStack.push(current);
		}
	}
	while(newStack.isEmpty() == false) {
		list.push(newStack.pop());
	}
}
/**
 * this method checks to see if two stacks are equal to each other. the stacks
 * are equal if they have the same objects in the same order.
 * @param list
 * a HouseLinkedStack object
 * @param secondList
 * a HouseLinkedStack object
 * @return True if the stacks are equal, False if they are not. 
 */
public static boolean equalStacks(HouseLinkedStack list, HouseLinkedStack secondList) {
	HouseLinkedStack newStack = new HouseLinkedStack();
	HouseLinkedStack secondNewStack = new HouseLinkedStack();
	boolean output = true;
	while (list.isEmpty() == false) {
		House current = list.pop();
		House secondCurrent = secondList.pop();
		if(current.equals(secondCurrent) == false) {
			output = false;
		}
		newStack.push(current);
		secondNewStack.push(current);
	}
	while(newStack.isEmpty() == false) {
		list.push(newStack.pop());
		secondList.push(secondNewStack.pop());
	}
	return output;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		House a = new House("apple street",1);
		House b = new House("bingo street",2);
		House c = new House("caviar street",3);
		House d= new House("drama street",4);
		House e = new House("easter street",5);
		HouseNode HouseNodeTest = new HouseNode(a,null);
		System.out.println("test of the HouseNode class:");
		HouseNode x = new HouseNode(a,null);
		System.out.println("getData test: " + HouseNodeTest.getData());
		HouseNodeTest.setData(b);
		System.out.println("setData test, output should now be equal to bingo street: " + "\n" +HouseNodeTest.getData());
		System.out.println("getLink test: " + HouseNodeTest.getLink());
		HouseNodeTest.setLink(x);
		System.out.println("setLink test, second item should now be equal to apple street: " + "\n" + HouseNodeTest.Display());
		HouseNodeTest.removeNodeAfter();
		System.out.println("removeNodeAfter test. apple street should be removed from list" + "\n" + HouseNodeTest.Display());
		HouseNodeTest.addNodeAfter(a);
		System.out.println("addNodeAfter test. apple street should be add to list" + "\n" + HouseNodeTest.Display());
		System.out.println("listPosition test, should return apple street" + "\n" + HouseNodeTest.listPosition(HouseNodeTest, 2).getData());
		System.out.println("listLength test, should return 2: " + "\n" + HouseNodeTest.listLength(HouseNodeTest));
		System.out.println("listSearch test, should return null: " + "\n" + HouseNodeTest.listSearch(HouseNodeTest,c));
		HouseLinkedStack test = new HouseLinkedStack();
		test.push(a);
		test.push(b);
		test.push(c);
		test.push(d);
		System.out.println(test.toString());
		System.out.println(stackToInt(test));
		test.push(a);
		test.push(b);
		test.push(c);
		test.push(d);
		System.out.println(popSome(test,3));
		HouseLinkedStack test2 = new HouseLinkedStack();
		test2.push(a);
		test2.push(b);
		test2.push(c);
		test2.push(d);
		extractFromStack(test2, b);
		System.out.println(test2.toString());
		HouseLinkedStack test3 = new HouseLinkedStack();
		test3.push(a);
		test3.push(b);
		test3.push(c);
		test3.push(d);
		HouseLinkedStack test4 = new HouseLinkedStack();
		test4.push(b);
		test4.push(a);
		test4.push(c);
		test4.push(d);
		System.out.println(test3.toString());
		System.out.println(test4.toString());
		System.out.println(equalStacks(test3,test4));
		System.out.println(test3.toString());
		System.out.println(test4.toString());
	}

}
