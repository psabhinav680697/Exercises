package Exercise2;

public interface MultipleAccountContainers {
	public default void addContainer() {
		System.out.println("new container added");
	}
	public default void leaveContainer() {
		System.out.println("container left");
	}

}
