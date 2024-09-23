package 박유민;

public class MultipleInheritanceTest {
	public static void main(String[] args) {
		Cars [] cars = new Cars[3]; //1
		
		cars[0] = new PassengerCar(); //2
		cars[1] = new Truck(500); //4
		cars[2] = new Pickup(4, 2000, 10000); //6
		
		for(int i = 0; i < 3; i++) { //13 //16 //19 //25
			cars[i].showInfo(); //14  //17 //20
		}
	}
}
interface Cars{ 
	public void showInfo(); 
}
class PassengerCar implements Cars{ 
	private int seats; 
	public PassengerCar() {seats = 2;} //3
	public PassengerCar(int n) {seats = n;} //9
	public int getSeats() {return seats;} //22
	public void setSeats(int n) {seats = n;}
	public void showInfo() {System.out.println("좌석 수 : " + seats);} //15
}
class Truck implements ITruck{ 
	private int payload;
	public Truck() {payload = 100;}
	public Truck(int w) {payload = w;} //5 //11
	public int getPayload() {return payload;} //24
	public void setPayload(int w) {payload = w;}
	public void showInfo() {System.out.println("적재 하중 : " + payload);} //18
}
interface ITruck extends Cars{
	public int getPayload();
	public void setPayload(int w);
}
class Pickup extends PassengerCar implements ITruck{ 
	private int tow_capacity;
	Truck truck;
	
	public Pickup() {super(4); truck = new Truck(1000); tow_capacity = 10000;}
	public Pickup(int s, int w, int c) { //7
		super(s); //8
		truck = new Truck(w); //10
		tow_capacity = c; //12
	} 
	public void setCapacity(int c) {tow_capacity = c;}
	public int getCapacity() {return tow_capacity;}
	public void showInfo() {System.out.println("좌석 수 : " + getSeats() + ", 적재 하중 : " + getPayload() + ", 견인 능력 : " + tow_capacity);} //21
	@Override
	public int getPayload() {
		return truck.getPayload(); //23
	}
	@Override
	public void setPayload(int w) {
		truck.setPayload(w);
	}
}