package d.linked.list;




import junit.framework.Assert;

import org.junit.Test;

public class linkedListTest{

	@Test
	public void test() {

		String projectedNames = "Andrew Jack John Darren Zach ";
		linkedListTest list = new linkedListTest();
		list.add("Andrew");
		list.add("Jack");
		list.add("John");
		list.add("Darren");
		list.add("Zach"); 		

		Assert.assertEquals(projectedNames, list.printReverse());
	 }

	private void add(String string) {
		// TODO Auto-generated method stub
		
	}

	private String printReverse() {
		// TODO Auto-generated method stub
		return null;
	}
}
	