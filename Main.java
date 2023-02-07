package prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unchecked")
public class Main {

	public static void main(String[] args) {
		ListsEqual le = new ListsEqual();
		testTwoNullLists(le);
		testTwoEmptyLists(le);
		testOneNullOneNotNull(le);
		testSameSizeDifferentElements(le);
		testSublistNotEqual(le);
		testSameElementsDifferentOrder(le);
		testIdenticalLists(le);
	}
	//expected: true
	public static void testTwoNullLists(ListsEqual le) {
		List<Integer> list1 = null;
		List<Integer> list2 = null;
		System.out.println(le.listsAreEqual(list1, list2));
	}
	//expected: true
	public static void testTwoEmptyLists(ListsEqual le) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		System.out.println(le.listsAreEqual(list1, list2));
	}
	//expected: false
	public static void testOneNullOneNotNull(ListsEqual le) {
		List<Integer> list1 = null;
		List<Integer> list2 = Arrays.asList(1,3);
		System.out.println(le.listsAreEqual(list1, list2));
	}
	//expected: false	
	public static void testSameSizeDifferentElements(ListsEqual le) {	
		List<Integer> list1 = new ArrayList() {
			{
				add(1);add(3);
			}
		};
		List<Integer> list2 = new ArrayList() {
			{
				add(1);add(2);
			}
		};
		System.out.println(le.listsAreEqual(list1, list2));
		
	}
	//expected: false
	public static void testSublistNotEqual(ListsEqual le) {
		List<Integer> list1 = new ArrayList() {
			{
				add(1);add(2);add(3);
			}
		};
		List<Integer> list2 = new ArrayList() {
			{
				add(1);add(2);
			}
		};
		System.out.println(le.listsAreEqual(list1, list2));
	}
	
	//expected: false
	public static void testSameElementsDifferentOrder(ListsEqual le) {
		List<Integer> list1 = new ArrayList() {
			{
				add(1);add(2);add(3);
			}
		};
		List<Integer> list2 = new ArrayList() {
			{
				add(1);add(3);add(2);
			}
		};
		System.out.println(le.listsAreEqual(list1, list2)); 
	}
	
	//expected: true
	public static void testIdenticalLists(ListsEqual le) {
		List<Integer> list1 = new ArrayList() {
			{
				add(1);add(2);add(3);
			}
		};
		List<Integer> list2 = new ArrayList() {
			{
				add(1);add(2);add(3);
			}
		};
		System.out.println(le.listsAreEqual(list1, list2));
	}

}
