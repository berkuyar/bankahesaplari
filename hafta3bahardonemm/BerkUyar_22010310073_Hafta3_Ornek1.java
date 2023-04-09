package hafta3bahardonemm;

public class BerkUyar_22010310073_Hafta3_Ornek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //int a
		Point p1 = new Point();
		Point p2 = new Point(4,8);
		Point p3 = new Point(3);
	/*	System.out.println("p1 : ( " + p1.x + " , " + p1.y + " )");
		System.out.println("p2 : ( " + p2.x + " , " + p2.y + " )");
		System.out.println("p3 : ( " + p3.x + " , " + p3.y + " )");*/
		
		System.out.println("p1 : ( " + p1.getX()+ "," + p1.getY()+ " ) ");
		p1.setLocation(6, 3);
		System.out.println("p1 : ( " + p1.getX()+ "," + p1.getY()+ " ) ");
		p1.translate(1, 1);
		System.out.println("p1 : ( " + p1.getX()+ "," + p1.getY()+ " ) ");
		Point.print();
		
		
	}

}
