package edu.orangecoastcollege.cs170.ctaylor82.ic28;

import java.util.ArrayList;

public class VehicleDemo {

	public static void main(String[] args) {

		ArrayList<Vehicle> List = new ArrayList<>();

		List.add(new Boat(1, "Parker", 2015));
		List.add(new Boat(2, "Sea Ray", 2016));
		List.add(new Car(4, "Tesla", 2017));
		List.add(new Car(4, "Subaru STI", 2019));

		for (Vehicle boat : List)
			System.out.println(boat);
	}

}
