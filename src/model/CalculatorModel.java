package model;

public class CalculatorModel {
	private double num1;
	private double num2;
	private double ans;

	public CalculatorModel() {
		this.num1 = 0;
		this.num2 = 0;
		this.ans = 0;
	}

	public CalculatorModel(double num1, double num2, double ans) {
		this.num1 = num1;
		this.num2 = num2;
		this.ans = ans;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getAns() {
		return ans;
	}

	public void setAns(double ans) {
		this.ans = ans;
	}

	public void cong() {
		this.ans = this.num1 + this.num2;
	}

	public void tru() {
		this.ans = this.num1 - this.num2;
	}

	public void nhan() {
		this.ans = this.num1 * this.num2;
	}				

	public void chia() {	
		this.ans = this.num1 / this.num2;
	}
}
