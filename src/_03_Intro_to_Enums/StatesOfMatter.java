package _03_Intro_to_Enums;

public enum StatesOfMatter {
				
	SOLID(0), LIQUID(28), GAS(100);
	private int celsiusTemp;
	
private StatesOfMatter(int celsiusTemp) {
	this.celsiusTemp= celsiusTemp;
}
public float ConvertToFarenheit(float givenTemp) {
	return (givenTemp*9/5)+32;
}
}
