package Exercise1;

public class Internet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser chrome=new Browser();
		chrome.addToHistory("www.youtube.com");
		chrome.addToHistory("www.facebook.com");
		chrome.getHistory();
		Browser opera=new Browser();
		opera.getHistory();
		opera.addToHistory("www.instagram.com");
		opera.addToHistory("www.book my show.com");
		String[] history = {"www.instagram.com","www.book my show.com"};
		opera.setHistory(history);
		opera.getHistory();		
	}

}
