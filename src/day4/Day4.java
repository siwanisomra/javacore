
package day4;
class box
{
    public static  double area=30;
    private double width;
    private double height;
    private double depth;
    box(box b)
    {
        width=b.width;
        height=b.height;
        depth=b.depth;
    }
    box()
    {
        width=-1;
        height=-1;
        depth=-1;
    }
    box(double w,double h,double d)
    {
        width=d;
        height=h;
        depth=d;
    }
    box(double o)
    {
        width=height=depth=0;
    }
    double volume()
    {
        return width*height*depth;
    }
     static double area()
    {
        return area;
    }
}
class boxweight extends box
{
double weight;
boxweight(boxweight l)
{
super(l);
weight=l.weight;
}
boxweight(double w,double h,double d,double m)
{
super(w,h,d);
weight=m;
}
boxweight()
{
super();
weight=-1;
}
boxweight(double r)
{
super(r);
weight=r;
}
}


public class Day4 {

    
    public static void main(String[] args) {
        boxweight mybox1=new boxweight(10,20,15,34);
        boxweight mybox2=new boxweight(4);
        boxweight mybox3=new boxweight();
        boxweight mybox=new boxweight(mybox1);
        double vol;
        double area;
        area=mybox1.area();
        vol=mybox1.volume();
        System.out.println("volume of box is "+vol);
        System.out.println("weight of mybox1 is "+mybox1.weight);
        System.out.println("area of mybox1 is "+area);
        System.out.println();
        vol=mybox2.volume();
         area=mybox2.area();
        System.out.println("volume of box is "+vol);
        System.out.println("weight of mybox2 is "+mybox2.weight);
        System.out.println("area of mybox2 is "+area);
        System.out.println();
        vol=mybox3.volume();
         area=mybox3.area();
        System.out.println("volume of box is "+vol);
        System.out.println("weight of mybox3 is "+mybox3.weight);
        System.out.println("area of mybox3 is "+area);
        System.out.println();
        vol=mybox.volume();
         area=mybox.area();
        System.out.println("volume of box is "+vol);
        System.out.println("weight of mybox is "+mybox.weight);
        System.out.println("area of mybox is "+area);
        System.out.println();
                

      
        
    }
    
}
