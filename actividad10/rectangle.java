
class rectangle implements Shape{
	private double baser; 
	private double alturar; 
	
	
	public rectangle(double baser, double alturar) {
		this.baser = baser; 
		this.alturar = alturar; 
		}
	
	public double getBaser() {
		return baser; 
	}
	
	public void setBaser(double baser){
		this.baser = baser; 
	}
	
	public double getAlturar() {
		return alturar; 
	}
	
	public void setAlturar(double alturar) {
		this.alturar = alturar; 
	}
	
	public double getArea() {
		return baser * alturar / 2; 
	}
	
	public double getPerimeter() {
		return (baser * 2) + (alturar * 2); 
	}
}