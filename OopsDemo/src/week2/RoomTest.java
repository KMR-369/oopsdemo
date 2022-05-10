package week2;

public class RoomTest {

	public static void main(String[] args) {
		
		Room r1 = new Room();
		
		r1.setRoomNo(101);
		r1.setRoomType("Luxury");
		r1.setRoomArea(2000);
		r1.setACMachine("No");
		
		System.out.println("******************************************");
		System.out.println("The room no is: "+r1.getRoomNo());
		System.out.println("The room type is: "+r1.getRoomType());
		System.out.println("The room Area is:"+r1.getRoomArea());
		System.out.println("The has AC Machine:"+r1.getACMachine());
		
		Room r2 = new Room();
		
		r2.setRoomNo(102);
		r2.setRoomType("Delux");
		r2.setRoomArea(3000);
		r2.setACMachine("Yes");
		
		System.out.println("******************************************");
		System.out.println("The room no is: "+r2.getRoomNo());
		System.out.println("The room type is: "+r2.getRoomType());
		System.out.println("The room Area is:"+r2.getRoomArea());
		System.out.println("The has AC Machine:"+r2.getACMachine());

	}

}
