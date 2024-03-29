package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Department department;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {

	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {// adicionar na lista
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {// remover na lista
		contracts.remove(contract);
	}

	// Como trabalhador ganhou no ano e m�s, somando o salario base com contrato
	public double income(int year, int month) {// contrato com "desse m�s e ano"
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();//declarando Calendar 
		for (HourContract c : contracts) {// para cada contrato c na listinha de contracts
			cal.setTime(c.getDate());//pegou o contrato "c" com a data do calendario 
			int c_year = cal.get(Calendar.YEAR);//o ano do catranto "c"
			int c_month = 1 + cal.get(Calendar.MONTH);//o m�s do catranto "c"
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
