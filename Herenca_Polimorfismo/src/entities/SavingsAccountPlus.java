package entities;

public class SavingsAccountPlus extends SavingsAccount{
	@Override
	public void withdraw(double amount) {//n�o consegue utilizar por ter final na hern�a 
		balance -= amount + 2.0;
	}
}
