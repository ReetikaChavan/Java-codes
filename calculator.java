class calculator
{
    public void areaOfCircle()
    {
        int r=4;
        double area;
        double pi=3.14;
        area=pi*r*r;
        System.out.print("Area of circle is: " +area);
    }
    public static void main(String[] args) 
    {
        calculator m = new calculator();
        m.areaOfCircle();
    }
}