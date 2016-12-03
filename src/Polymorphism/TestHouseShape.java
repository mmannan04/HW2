package Polymorphism;

public class TestHouseShape {

	public static void main(String[] args) {
		
		HouseShape hs = new HouseShape();
		int rectangleSize = hs.area(11, 12, 12, 11);
		System.out.println(rectangleSize);
		int pentagonSize = hs.area(11, 12, 12, 11, 14);
		System.out.println(pentagonSize);
		HouseShape bigHouse = new BigHouse();
		int bigrectangleSize = bigHouse.area(11, 12, 12, 11, 14);
		System.out.println(bigrectangleSize);

	}

}
