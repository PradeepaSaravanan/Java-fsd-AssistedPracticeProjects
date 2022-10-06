package Exp;
class Bird
{
	String name;
	String Colour;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	
}
public class Encapuslation {
	public static void main (String[] args)
	{
        Bird b= new Bird();
        b.setName("Dove");
        b.setColour("White");
        System.out.println("Bird Name: "+ b.getName()+"\n Bird colour: "+ b.getColour());
	}

}
