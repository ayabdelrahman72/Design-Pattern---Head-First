package DuckProjoect;

public class RubberDuck extends Duck{

	public RubberDuck() {
		flyBehavior= new flyNoWay();
		quackBehavior= new Squeak();
	}
	@Override
	public void display() {
		System.out.println("Rubber Duck : ");
		
	}
	

}
