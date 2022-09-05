package entities;

public class BusinessAccount extends Account {// BusinessAccount herdar Account
	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);// super é pra executar a lógica do contrutor da classe base
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {// se o valor for igual ou menor que o limit do emprestimo
			deposit(amount);
			balance += amount - 10.0;
		}
	}

}
