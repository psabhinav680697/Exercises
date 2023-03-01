package Excersise4;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Browser {
public static ArrayList<String> history=new ArrayList<String>();
void setHistory(String url) {
	
	for(int i=0;i<history.size();i++) {
			StringTokenizer s= new StringTokenizer(history.get(i)," ##");
		String siteName=s.nextToken();
		if(siteName.equals(url)) {
			int count=  Integer.parseInt(s.nextToken()) ;
			count++;
			history.set(i, siteName+" ##"+count);
			System.out.println(history.get(i));
			return;
		}
	}
	history.add(url+" ##1");
	System.out.println(url+" ##1");
}

}
