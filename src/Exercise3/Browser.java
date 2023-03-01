package Exercise3;

public class Browser {
	public static int primTabs;
	public static Integer tabs = 0;
	
	public Browser() {
		primTabs++;     // Increment while new object creation
		tabs++;         //Increment while new object creation
	}
	
	public static Integer intToInteger() {
		return primTabs;				
	}
	
	public static int integerToInt() {
		return tabs;						
	}

}
