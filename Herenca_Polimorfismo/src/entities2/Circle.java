package entities2;

import entities2.enums.Color;

public class Circle extends Shape{
	private Double radius;
	
	public Circle() {
		super();
	}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {//Para clacular a area de circulo 
		return Math.PI * radius * radius;
	}
	
}
