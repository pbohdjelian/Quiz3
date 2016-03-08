package Problem1;

	public class Triangle {

		private double side1;
		private double side2;
		private double side3;

		public Triangle(){
			side1=1.0;
			side2=1.0;
			side3=1.0;
		}
		public Triangle(double s1,double s2,double s3){
			side1=s1;
			side2=s2;
			side3=s3;
	
		}
		public double getSide1() {
			return side1;
		}
		public double getSide2() {
			return side2;
		}
		public double getSide3() {
			return side3;
		}
		public double getArea(){
			double s4 = (side1 + side2 + side3 )/ 2 ;
			return(Math.sqrt(s4 * (s4 - side1) * (s4 - side2) * (s4 - side3)));
		}
		public double getPerimeter(){
			return(side1 + side2 + side3 ) ;
		}
		public String toString(){
			String S= "side 1: " + Double.toString(side1)+ "\nside 2: " + Double.toString(side2)+ "\nside 3: " + Double.toString(side3);
			return(S);
		}
}


