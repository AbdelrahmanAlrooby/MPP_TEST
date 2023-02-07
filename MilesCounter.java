package prob3;

import java.util.ArrayList;
import java.util.List;

public class MilesCounter {
	public static List<Vehicle> convertArray(Object[] vehicleArray) {
		List<Vehicle> vehivles = new ArrayList<>();
		for (int i = 0; i < vehicleArray.length; i++) {
			Vehicle v1 = (Vehicle) vehicleArray[i];
			vehivles.add(v1);
		}
		return vehivles;
	}

	public static int computeTotalMiles(List<Vehicle> vehicleList) {
		/* implement */
		int totalMiles=0;
		for (int i=0;i< vehicleList.size();i++)
		{
			totalMiles+= vehicleList.get(i).getMilesUsedToday();
		}
		return totalMiles;
	}
}
