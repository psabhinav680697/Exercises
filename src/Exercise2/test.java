package Exercise2;

public class test {

	public static void main(String[] args) {
//		new Browser();
		GoogleChrome a= new GoogleChrome();
		a.WhoAmI();
		Firefox  b= new Firefox();
		b.WhoAmI();
		a.setPermissions("location", false);
		System.out.println("isLocationAccessible:"+a.isLocationAccessible);
//System.out.println(GoogleChrome.versionNo);
        System.out.println("version no:"+a.versionNo);
		int countChrome = 0;
		Browser tabOne= new GoogleChrome();
		Browser tabTwo= new Firefox();
		Browser tabThree= new GoogleChrome();
		Browser tabFour= new Firefox();
		Browser tabFive= new GoogleChrome();
		Browser tabSix= new GoogleChrome();
		
		
		
			for(int i=0;i<Browser.all.length;i++) {
				if(Browser.all[i] instanceof GoogleChrome) {
					countChrome++;
					
				}
			}
			System.out.println("NUmber of tabs:"+countChrome);

	}

}
