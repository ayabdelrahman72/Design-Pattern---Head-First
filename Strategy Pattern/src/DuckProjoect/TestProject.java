package DuckProjoect;

public class TestProject {

	public static void main(String[] args) {
		
		MallardDuck mallard= new MallardDuck();
		mallard.display();
		mallard.perfomFly();
		mallard.performQuack();
		
		mallard.setQuackBehvior(new MuteQuack());
		mallard.performQuack();
		
		///////////////////////////////////////////////////////////////////////////////////
	
		RubberDuck rubber = new RubberDuck();
		rubber.display();
		rubber.perfomFly();
		rubber.performQuack();
		
		rubber.setFlyBehvior(new FlyWithWings());
		rubber.perfomFly();

	}

}
