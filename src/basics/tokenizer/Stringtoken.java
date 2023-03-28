package basics.tokenizer;

import java.util.StringTokenizer;

public class Stringtoken {
public static void main(String args[]) {
	StringTokenizer ads= new StringTokenizer("my,name,is,abhinav",",");
//	System.out.println(ads.nextToken());
	while(ads.hasMoreTokens()) {
		System.out.println(ads.nextToken());
	}
}
}
