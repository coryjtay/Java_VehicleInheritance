package edu.orangecoastcollege.cs170.ctaylor82.ic28;

public class Boat extends Vehicle {

	private int mNumberOfCabins;

	public Boat(int numberOfCabins, String manufacturer, int year) {
		mNumberOfCabins = numberOfCabins;
		mManufacturer = manufacturer;
		mYear = year;
	}

	public int getNumberOfCabins() {
		return mNumberOfCabins;
	}

	public void setNumberOfCabins(int numberOfCabins) {
		mNumberOfCabins = numberOfCabins;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + mNumberOfCabins;
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
		Boat other = (Boat) obj;
		if (mNumberOfCabins != other.mNumberOfCabins)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Boat [Manufacturer=" + mManufacturer + ", Year=" + mYear + ", Number Of Cabins=" + mNumberOfCabins + "]";
	}

}
