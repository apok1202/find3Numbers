import static org.junit.Assert.*;
import java.util.*;
import java.io.*;
import org.junit.Test;
public class TestFindThreeNumbers{

	//test 1 when arr={1,2,3,4,5,6,7,8} and sum=12
	@Test
	public  void testfindThreeNumbers1()
	{
		List<List<Integer> > triplets = new ArrayList<List<Integer>>();
		List<Integer> innerList1 = new ArrayList<Integer>();
		List<Integer> innerList2 = new ArrayList<Integer>();
		List<Integer> innerList3 = new ArrayList<Integer>();
		List<Integer> innerList4 = new ArrayList<Integer>();
		List<Integer> innerList5 = new ArrayList<Integer>();
		List<Integer> innerList6 = new ArrayList<Integer>();
		
		System.out.println(triplets);

		innerList1.add(1);
		innerList1.add(3);
		innerList1.add(8);
		triplets.add(innerList1);
		//innerList1.clear();
		innerList2.add(1);
		innerList2.add(4);
		innerList2.add(7);
		triplets.add(innerList2);
		//innerList.clear();
		innerList3.add(1);
		innerList3.add(5);
		innerList3.add(6);
		triplets.add(innerList3);
		//innerList.clear();
		innerList4.add(2);
		innerList4.add(3);
		innerList4.add(7);
		triplets.add(innerList4);
		//innerList.clear();
		innerList5.add(2);
		innerList5.add(4);
		innerList5.add(6);
		triplets.add(innerList5);
		//innerList.clear();
		innerList6.add(3);
		innerList6.add(4);
		innerList6.add(5);
		triplets.add(innerList6);
		//innerList.clear();

		int arr[]={1,2,3,4,5,6,7,8};

		assertEquals("Error in find3Nums",triplets,FindNumbers.findThreeNumbers(arr,12));
	}

	//Test2 when arr={1,2} and sum=12
	@Test
	public  void testfindThreeNumbers2()
	{
		List<List<Integer> > triplets = new ArrayList<List<Integer>>();

		int arr[]={1,2};

		assertEquals("Error in find3Nums",triplets,FindNumbers.findThreeNumbers(arr,12));
	}

	//Test3 when arr[]={ -1,-2,-3,-4,-5} and sum = -6
	@Test
	public void testfindThreeNumbers3()
	{
		List<List<Integer> > triplets = new ArrayList<List<Integer>>();
		List<Integer> innerList1 = new ArrayList<Integer>();
		innerList1.add(-3);
		innerList1.add(-2);
		innerList1.add(-1);
		triplets.add(innerList1);

		int arr[]={ -1,-2,-3,-4,-5};

		assertEquals("Error in find3Nums",triplets,FindNumbers.findThreeNumbers(arr,-6));

	}

	// Test4 when arr[]={0,0,0,0,0} and sum=0
	@Test
	public void tesfindThreeNumbers4()
	{
		List<List<Integer> > triplets = new ArrayList<List<Integer>>();
		List<Integer> innerList1 = new ArrayList<Integer>();
		innerList1.add(0);
		innerList1.add(0);
		innerList1.add(0);
		triplets.add(innerList1);

		int arr[]={ 0,0,0,0,0};

		assertEquals("Error in find3Nums",triplets,FindNumbers.findThreeNumbers(arr,0));

	}

	//Test when arr={1,2,4,5,105} and sum=111
	@Test
	public void tesfindThreeNumbers5()
	{
		List<List<Integer> > triplets = new ArrayList<List<Integer>>();
		List<Integer> innerList1 = new ArrayList<Integer>();
		List<Integer> innerList2 = new ArrayList<Integer>();


		innerList1.add(1);
		innerList1.add(5);
		innerList1.add(105);
		triplets.add(innerList1);

		innerList2.add(2);
		innerList2.add(4);
		innerList2.add(105);
		triplets.add(innerList2);

		int arr[]={ 1,2,4,5,105};

		assertEquals("Error in find3Nums",triplets,FindNumbers.findThreeNumbers(arr,111));

	}

	//Test when arr[]={-1,-2,4,-5,10,-7} and sum=12
	@Test
	public void tesfindThreeNumberss()
	{
		List<List<Integer> > triplets = new ArrayList<List<Integer>>();
		List<Integer> innerList1 = new ArrayList<Integer>();
		innerList1.add(-2);
		innerList1.add(4);
		innerList1.add(10);
		triplets.add(innerList1);

		int arr[] = {-1,-2,4,-5,10,-7};

		assertEquals("Error in find3Nums",triplets,FindNumbers.findThreeNumbers(arr,12));
	}


	//Test when arr[]={1,5,7,9,7,8,17,19,30,32} and sum=50
	@Test
	public void tesfindThreeNumbers7()
	{
		List<List<Integer> > triplets = new ArrayList<List<Integer>>();
		List<Integer> innerList1 = new ArrayList<Integer>();
		List<Integer> innerList2 = new ArrayList<Integer>();


		innerList1.add(1);
		innerList1.add(17);
		innerList1.add(32);
		triplets.add(innerList1);

		innerList2.add(1);
		innerList2.add(19);
		innerList2.add(30);
		triplets.add(innerList2);

		int arr[]={1,5,7,9,7,8,17,19,30,32};

		assertEquals("Error in find3Nums",triplets,FindNumbers.findThreeNumbers(arr,50));

	}

	//Test when arr[]={} and sum=50
	@Test
	public void tesfindThreeNumbers8()
	{
		List<List<Integer> > triplets = new ArrayList<List<Integer>>();
		int arr[]={};
		assertEquals("Error in find3Nums",triplets,FindNumbers.findThreeNumbers(arr,50));

	}



}