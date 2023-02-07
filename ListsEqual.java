package prob1;

import java.util.List;

public class ListsEqual {
	public boolean listsAreEqual(List<Integer> list1, List<Integer> list2) {
		  if (list1 == null && list2 == null)
		   return true;
		  if (list1 == null || list2 == null)
		   return false;

		  if (list1.size() == 0 && list2.size() == 0)
		   return true;
		   
		   return (list1.size() > 0 && list2.size() > 0 
		        && (list1.get(0) == list2.get(0)))
		        && (list1.size() > 1 && list2.size() > 1 
		        && listsAreEqual(list1.subList(1, list1.size()), list2.subList(1, list2.size())));
		 }

		}

