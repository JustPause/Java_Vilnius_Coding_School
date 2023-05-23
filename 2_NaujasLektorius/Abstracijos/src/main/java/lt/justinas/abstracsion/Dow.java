package lt.justinas.abstracsion;

public class Dow extends Bird implements Fly{
	
	@Override
	public void canFly(String A){
		
		System.out.println("2 canFly " + A);
	}
	
	@Override
	public void canLayEgg(String A){
		System.out.println("canLayEgg " + A);
	}
}
