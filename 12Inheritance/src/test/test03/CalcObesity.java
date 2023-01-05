package test.test03;

public class CalcObesity extends HealthInfo {

	private double standardWeight;
	private double Obesity;
	
	public CalcObesity() {
		
	}
	
	
	public void setStandardWeight() {
		
		this.standardWeight = (super.getHeight() - 100) * 0.9;
		
	}
	
	public void setObesity() {
		
		this.Obesity = (super.getWeight() - this.standardWeight) / this.standardWeight * 100;
	
	}
	
	public String judgeB() {
		
		String result = "";
		if(this.Obesity < 10) {
			result = "정상";
		} else if(this.Obesity >= 10 && this.Obesity < 20) {
			result = "과체중";
		} else if(this.Obesity >= 20) {
			result = "비만";
		}
		
		return result;
	}
	
	public void printInfo() {
		String text = super.name + "님의 신장 " + super.height + ", 몸무게 " + super.weight + "kg => ";
	}
	
	
	
	
}
