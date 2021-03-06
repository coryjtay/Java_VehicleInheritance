package edu.orangecoastcollege.cs170.ctaylor82.ic28;

public class Car extends Vehicle {

	private int mNumberOfDoors;

	public Car(int numberOfDoors, String manufacturer, int year) {
		mNumberOfDoors = numberOfDoors;
		mManufacturer = manufacturer;
		mYear = year;
	}

	public int getNumberOfDoors() {
		return mNumberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		mNumberOfDoors = numberOfDoors;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + mNumberOfDoors;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (mNumberOfDoors != other.mNumberOfDoors)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [Manufacturer=" + mManufacturer + ", Year=" + mYear + ", Number Of Doors=" + mNumberOfDoors + "]";
	}

}
