package Exercise5;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Browser browser =new Browser();
		
		Browser.Bookmarks bookmark=browser.new Bookmarks();
		
		Browser.History history=new Browser.History();
		
		Browser shortcuts=new Browser() {                                  //anonymous inner class.......
			static ArrayList<String> shortcut=new ArrayList<String>();		
		};	
	}

}
