package ncs.test8;

public class AmountNotEnough extends Exception{
	public AmountNotEnough() {}
	public AmountNotEnough(String msg) {
		super(msg);
	}
}
