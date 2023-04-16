
class square implements Shape{
	private double side; 
	
	public square(double side) {
		this.side = side; 
	}
	
	public double getSide() {
		return side; 
	}
	
	public void setSide(double side) {
		this.side = side; 
	}
	
	public double getArea() {
		return side * side; 
	}
	
	public double getPerimeter() {
		return 4 * side; 
	}
	
}
