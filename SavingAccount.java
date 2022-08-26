public class SavingAccount {
	public static double annualInterestRate;
	private double savingsBalance;
	public void SavingsAccount() {
		annualInterestRate = 0.0;
		savingsBalance = 0.0;
	}
	public void SavingsAccount(double intRate, double savBal) {
		annualInterestRate = intRate;
		savingsBalance = savBal;
	}
	public double calculateMonthlyInterest() {
		double intRate = (savingsBalance * annualInterestRate/12);
		savingsBalance = savingsBalance + intRate;
		return intRate;
	}
	public static void modifyInterestRate(double newInteresRate) {
		annualInterestRate = newInteresRate;
	}
	public void setSavingsBalance(double newBal) {
		savingsBalance = newBal;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public static void main(String[] args) {
		SavingAccount saver1=new SavingAccount();
		SavingAccount saver2=new SavingAccount();
		saver1.setSavingsBalance(2000.00);
		saver2.setSavingsBalance(3000.00);
		SavingAccount.modifyInterestRate(0.04);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Updated Balence for saver1:"+saver1.getSavingsBalance());
		System.out.println("Updated Balence for saver2:"+saver2.getSavingsBalance());
		
		SavingAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Updated Balence for saver1:"+saver1.getSavingsBalance());
		System.out.println("Updated Balence for saver2:"+saver2.getSavingsBalance());
		
		
	}

}
public class Circle {
	private static int count;  
	float center,radius;
	public Circle(float c,float r) {
		this.center=c;
		this.radius=r;
		count++;
	}
	Circle(){
		System.out.println("this a default constructor");  
		count++;
	}
void display() {
	System.out.println("Center:"+center+" "+"radius:"+radius);
}
	public static void main(String[] args) {
		Circle c1=new Circle(12.4f,23.7f);
		Circle c2=new Circle(22.4f,24.9f);
		c1.display();
		c2.display();
		Circle c3=new Circle();
		System.out.print("Total Number of Instance: " + Circle.count); 
		
	}

}