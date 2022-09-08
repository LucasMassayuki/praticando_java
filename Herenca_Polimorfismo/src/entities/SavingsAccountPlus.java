package entities;

public class SavingsAccountPlus extends SavingsAccount{
	@Override
	public void withdraw(double amount) {//não consegue utilizar por ter final na hernça 
		balance -= amount + 2.0;
	}
}
