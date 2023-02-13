package Exercise1;

import java.util.ArrayList;

public class Browser {
	private static ArrayList<String> history=new ArrayList<String>();
	Browser(){
		
	}

	
	Browser(String[] history){
		for(int i=0;i<history.length;i++) {
			this.history.set(i,history[i]);
		}
	}
	
	void addToHistory(String a) {
		history.add(a);
	}
	void setHistory(String[] history) {
		for(int i=0;i<history.length;i++) {
			this.history.set(i,history[i]);
		}
	}
	String[] getHistory() {
		return history.toArray(new String[0]);
	}

}
