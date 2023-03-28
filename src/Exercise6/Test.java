package Exercise6;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String choice,site;
		int step,pos;
		BrowserHistory tab1=new BrowserHistory("www.facebook.com");
		Scanner obj =new Scanner(System.in);
		while(true) {
			System.out.println(tab1.currentPage+"\n1.visit"+"\n2.back"+"\n3.forward"+"\n4.get position"+"\nexit to quit");
			
			choice=obj.next();
			switch(choice) {
			case "1":System.out.println("enter the url: ");
			               site=obj.next();
			               tab1.visit(site);
			               continue;
			case "2":System.out.println("enter the number of steps to go back: ");
			               step=obj.nextInt();
			               System.out.println(tab1.back(step));
			               continue;
			case "3" :  System.out.println("Enter number of steps to go forward: ");		
						step = obj.nextInt();
						System.out.println(tab1.forward(step));
						continue;
			case "4" :  System.out.println("Enter position: ");		
						pos = obj.nextInt();
						String url = tab1.get(pos);
						System.out.println(url);
						continue;
			case "exit" : break;
			default:System.out.println("invalid input");
			continue;
			}
			break;
		}

	}

}
