class circle
 {
   int radius;

 circle(int r)
   {
     radius=r;
   }
void calc_area()
 {
   double area;
  area=3.14*radius*radius;
 System.out.println("area is "+area);

}
   public static void main(String args[])
    {
       circle a1=new circle(5);
       a1.calc_area();
    }

 }