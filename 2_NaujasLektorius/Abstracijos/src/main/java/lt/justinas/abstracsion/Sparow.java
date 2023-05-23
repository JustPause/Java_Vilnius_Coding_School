package lt.justinas.abstracsion;

public class Sparow extends Bird implements Fly{
	
	@Override
	public void canFly(String A){
	
	}
	
	@Override
	public void canLayEgg(String A){
		System.out.println("canLayEgg " + A);
	}
}