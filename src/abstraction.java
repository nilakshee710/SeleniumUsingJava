
public class abstraction {
	
	public abstract class Shape{
		abstract double calculateArea();
	}
	
	public class Rectangle extends Shape {
		public double getLength() {
			return length;
		}

		public void setLength(double length) {
			this.length = length;
		}

		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
		}

		private double length;
		private double width;
		
		
		 public Rectangle(double length, double width){
		        setLength(length);
		        setWidth(width);
		    }
		 
		
		double calculateArea()
		{
			return length * width;
		}
	}

	

}
