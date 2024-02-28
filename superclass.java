// program to use super at variable level

class vehicle{
	int speed=170;
}
class car extends vehicle{
	int speed = 130;
	void display(){
		System.out.println("Maximum Speed: "+super.speed);
	}
}
class superclass
{
	public static void main(String[] args) {
		car c=new car();
		c.display();
	}
}