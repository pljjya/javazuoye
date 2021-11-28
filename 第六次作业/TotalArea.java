
public class TotalArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ccc[] circleArray;
		circleArray=createCircleArray();
		printCircleArray(circleArray);
	}
	public static Ccc[] createCircleArray() {
		Ccc[] circleArray=new Ccc[5];
		for(int i=0;i<circleArray.length;i++) {
			circleArray[i]=new Ccc(Math.random()*100);
		}
		return circleArray;
	}
	public static void printCircleArray(Ccc[] circleArray) {
		System.out.printf("%-30s%-15s\n","Radius","Area");
		for(int i=0;i<circleArray.length;i++) {
			System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
		}
		System.out.println("_____________________________");
		System.out.printf("%-30s%-15f\n","The total area of circles is",sum(circleArray));
	}
	public static double sum(Ccc[] circleArray) {
		double sum=0;
		for(int i=0;i<circleArray.length;i++) {
			sum+=circleArray[i].getArea();
		}
		return sum;
	}
}
