
public class child extends parent {

	@Override
	public void book() {
		super.book();
		System.out.println("the mountain");
		System.out.println("the rock ");
		System.out.println("the tree");
	}
	
	@Override
	public void newspaper() {
		super.newspaper();
		System.out.println("the hindu");
		System.out.println("indian express");
		System.out.println("daily event");
	}
	
	public static void main(String[] args) {
		child u = new child();
		u.book();
		u.newspaper();
		
		
	}
	
	
	
	
	
	
}
