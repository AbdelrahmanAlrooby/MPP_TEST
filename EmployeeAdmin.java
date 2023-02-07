package prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeAdmin {

	/**
	 * Returns a list of Employees whose social security number is on the input list
	 * socSecNums and whose salary is > 80000. The list must be ordered by social
	 * security number, from lowest to highest. To sort, you must use a Collections
	 * sorting method and you must define your own Comparator to be used to compare
	 * Employees by ssn.
	 */
//	

	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {

		Map<String, Employee> existingEmp = new HashMap<>();

		for (int i = 0; i < socSecNums.size(); i++) {

			if (table.containsKey(socSecNums.get(i))) {
				Employee currEmp = table.get(socSecNums.get(i));
				if (currEmp.getSalary() > 80000)
					existingEmp.put(socSecNums.get(i), currEmp);
			}

		}

		// sort list of employee arrcording to ssn
		List<String> sortedSSN = new ArrayList<>(existingEmp.keySet());
		Collections.sort(sortedSSN);

		List<Employee> result = new ArrayList<>();

		for (int i = 0; i < sortedSSN.size(); i++) {

			String ssn = sortedSSN.get(i);

			result.add(existingEmp.get(ssn));
		}
		return result;

	}
}
