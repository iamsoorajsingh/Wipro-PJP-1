/* Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
The dimensions of the Box are width, height, depth. 
The class should have a method that can return the volume of the box. 
Create an object of the Box class and test the functionalities. */

import java.io.*;
class Box
{
    double width;
    double height;
    double depth;
    Box()
    {
        System.out.println("Constructing Box");
        width = 100;
        height = 100;
        depth = 100;
    }
    double volume()
    {
        return width * height * depth;
    }
}

class Assignment_1
{
    public static void main(String args[])
    {
        Box mybox1 = new Box(); 
        double vol = mybox1.volume();
        System.out.println("Volume of the box is " + vol);
    }
}