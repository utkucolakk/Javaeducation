package interface_samples.interface_sample01;

public class Rectangle implements Polygon {

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is : " + (length*breadth));

    }
}
