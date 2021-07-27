package DuckProjoect;

public abstract class Duck {
 protected FlyBehavior flyBehavior;
 protected QuackBehavior quackBehavior;
 public void swin() {
	 System.out.println("I can swim");
 }
 public void perfomFly() {
	 flyBehavior.fly();
 }
 public void performQuack() {
	 quackBehavior.quack();
 }
 public abstract void display();
 public void setFlyBehvior(FlyBehavior fly) {
	     flyBehavior=fly;
 }
 public void setQuackBehvior(QuackBehavior quack) {
     quackBehavior=quack;
}

}
