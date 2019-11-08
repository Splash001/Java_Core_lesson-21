package ua.lviv.lgs;

public class PracticeClass {
	
	@Practice("Practice name")	
	private String name;
	@Practice("Practice age")
	private int age;
	@Practice("Practice height")
	private int height;
	@Practice("Practice weight")
	private int weight;
	
	public PracticeClass(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "PracticeClass [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
}
