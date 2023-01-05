package test.test03;

public class HealthInfo {

	protected String name;
    protected double height;
    protected double weight;

    public HealthInfo() {
        // �⺻ ������ do nothing
    }

    public HealthInfo(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void showInfo() {
        System.out.println(name + "���� ���� " + height + ", ������ " + weight + "kg �Դϴ�.");
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
	
