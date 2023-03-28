package Exercise1;

import java.util.ArrayList;

class Browser {
	private static ArrayList<String> history=new ArrayList<String>();
	Browser(){
		
	}

	
	 Browser(String[] history){
		for(int i=0;i<history.length;i++) {
			this.history.add(history[i]);
		}
	}
	
	void addToHistory(String a) {
		history.add(a);
	}
	
	void setHistory(String[] inputHistory) {
		for(int i=0;i<inputHistory.length;i++) {
			this.history.add(inputHistory[i]);
		}
	}
	
	void getHistory() {
		
		System.out.println("History");			
//		for(int i=0;i<history.size();i++) {
			System.out.println(history);
//		}
//			System.out.println(history.toArray(new String[0])[i]);			
//		}
//		System.out.println();	
//		return history.toArray(new String[0]);
	}

}
