package Exercise6;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class BrowserHistory {
	private static ArrayList<String> history=new ArrayList<String>();
	String currentPage;
	int index;
	public BrowserHistory(String homePage) {
		currentPage=homePage;
		history.add(currentPage);
	}
	
	
	void visit(String url) {
		try {
			
			System.out.println(history);
			StringTokenizer sections=new StringTokenizer(url,".");
			String domain=sections.nextToken();
			while(sections.hasMoreTokens()) {
				domain=sections.nextToken();
			}
			if (domain.equals("org")||domain.equals("com")||domain.equals("in")) {
				history.add(url);
				System.out.println(url+" added successfull");
				currentPage=url;
			}
			else throw new InvalidURLException("Invalid url extension");
		}
		catch(InvalidURLException e) {
			System.out.println(e);
			
		}
	}
	
	
	String back(int steps) {
		try {
			
		index=history.indexOf(currentPage);
		if(steps<index+1) {
			currentPage=history.get(index-steps);
		    }
		   else throw new NoHistoryFoundException("no history found");
		
	       }
		
		catch (NoHistoryFoundException e) {
			currentPage=history.get(0);
			return e.toString();
			
		}
		return currentPage;
	}
	String forward(int steps) {
		try {
			index=history.indexOf(currentPage);
			if(steps<=history.size()-(index+1)) {
				currentPage=history.get(index+steps);
				return currentPage;
			}
			else {
				throw new NoHistoryFoundException("no history");
			}
		}
		catch(NoHistoryFoundException e) {
			currentPage = history.get(history.size()-1);
			return e.toString();
		}
	}
	String get(int position) {
		try {
			if(position<0) {
				throw new InvalidPositionException("invalid position");
			}
			else return history.get(position);
		}
		catch(InvalidPositionException e) {
			return e.toString();
		}
		catch(IndexOutOfBoundsException e) {
			return e + " Invalid position";
		}
		
	}

}
