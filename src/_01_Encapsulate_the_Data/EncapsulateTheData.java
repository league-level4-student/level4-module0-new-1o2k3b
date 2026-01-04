package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

	// 1. Encapsulate all the members.

	// 2. Implement the setter restrictions described above each member variable.

	// 3. Pass all the JUnit tests.

	/* 
	 * All negative arguments should set itemsReceived to 0.
	 */

	private int itemsReceived;

	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive.
	 * 
	 * All parameters outside this range should set degreesTurned to the nearest
	 * bound.
	 */

	private double degreesTurned;

	/*
	 * nomenclature must not contain an empty String.
	 * 
	 * An empty String parameter should set nomenclature to a String with a single
	 * space.
	 */

	private String nomenclature;

	/*
	 * memberObj must not be a String.
	 * 
	 * A String parameter should set memberObj to a new Object();
	 * 
	 * Hint: Use the instanceof operator.
	 * 
	 * Example:
	 * 
	 * Robot rob = new Robot();
	 * 
	 * System.out.println(rob instanceof Robot); // prints true
	 * 
	 * System.out.println(rob instanceof Random); //prints false
	 */

	private Object memberObj;

	public void setItemsReceived(int randomPositiveNum) {
		// TODO Auto-generated method stub
		itemsReceived = randomPositiveNum;
	}

	public Integer getItemsReceived() {
		// TODO Auto-generated method stub
		if(itemsReceived<0) {
			itemsReceived = 0;
		}
		return itemsReceived;
		
	}

	public void setDegreesTurned(double randomPositiveNum) {
		// TODO Auto-generated method stub
		degreesTurned = randomPositiveNum;
		
	}

	public Double getDegreesTurned() {
		if(degreesTurned<0 ) {
			degreesTurned = 0;
		}
		if(degreesTurned>360) {
			degreesTurned = 360;
		}
		// TODO Auto-generated method stub
		return degreesTurned;
	}

	public void setNomenclature(String randomString) {
		// TODO Auto-generated method stub
		nomenclature = randomString;
	}

	public Object getNomenclature() {
		// TODO Auto-generated method stub
		if(nomenclature.equals("")) {
			nomenclature = " ";
		}
		return nomenclature;
	}

	public void setMemberObj(Object randomObject) {
		// TODO Auto-generated method stub
		memberObj = randomObject;
		
	}

	public Object getMemberObj() {
		// TODO Auto-generated method stub
		if(memberObj instanceof String) {
		memberObj = new Object();
		}
		return memberObj;
	}



	
}
