package Exercise2;

import java.util.ArrayList;

public class Browser {
	public static Browser[] all=new Browser[20];
	Browser(){
		for(int i=0;i<all.length;i++) {
			if(all[i]==null) {
			all[i]=this;
			break;
			}
		}
	}
	
	
	
	public void WhoAmI() {
		System.out.println("I'm a Browser");
	}
}





class GoogleChrome extends Browser{
	

	  public static final double versionNo=1.0;
	  boolean isLocationAccessible,isCameraAccessible,isMicroponeAccessible;
		  
		  public GoogleChrome(){
				
				super();
			}
			
	
    public void setPermissions(String permissionFor,boolean permission) {
	  switch(permissionFor) {
	case "location":
		this.isCameraAccessible=permission;
		break;
	case "camera":
		this.isLocationAccessible=permission;
		break;
	case "microphone":
		this.isMicroponeAccessible=permission;
		break;
		
	}
		
	}


    public void setPermissions(boolean isCameraAccessible,boolean isLocationAccessible,boolean isMicroponeAccessible) {
	  this.isCameraAccessible=isCameraAccessible;
	  this.isLocationAccessible=isLocationAccessible;
	  this.isMicroponeAccessible=isMicroponeAccessible;
	
   }


	public void resetPermissions(String permissionFor) {
					switch(permissionFor) {
					case "location":
						this.isCameraAccessible=false;
						break;
					case "camera":
						this.isLocationAccessible=false;
						break;
					case "microphone":
						this.isMicroponeAccessible=false;
						break;
					}
		
				}
	
	
					public void resetPermissions() {
						this.isCameraAccessible=false;
						this.isLocationAccessible=false;
						this.isMicroponeAccessible=false;
					}

		@Override
		public void WhoAmI() {
			System.out.println("I'm GOOGLE CHROME");
			
		}
	
}





class Firefox extends Browser implements MultipleAccountContainers{
	public static ArrayList<String> containers=new ArrayList<String>();
	
	Firefox(){
		super();
	}
	
		@Override
		public void WhoAmI() {
			System.out.println("I'm FIREFOX ");
		}
		
		
		@Override
		public void addContainer(String container) {
			containers.add(container);
			
		}
		@Override
		public void leaveContainer(String container) {
			for(String i:containers) {
				if(i.equals(container)) {
					containers.remove(i);
					
				}
			}
			
		}
		
		
	
}
