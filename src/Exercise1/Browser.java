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
	
	void setHistory(String[] inputHistory) {
		for(int i=0;i<inputHistory.length;i++) {
			this.history.set(i,inputHistory[i]);
		}
	}
	
	String[] getHistory() {
		
		System.out.println("History");			
		for(int i=0;i<history.size();i++) {
			System.out.println(history.toArray(new String[0])[i]);			
		}
		System.out.println();	
		return history.toArray(new String[0]);
	}

}
