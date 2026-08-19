import com.sun.tools.jconsole.JConsoleContext;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

/*
1. Create four instances of the turtle object. Each instance should include different attributes (name, colors, shape, size, location, etc.).
2. Write your own method(s) with parameters to draw four different shapes (i.e. - star, polygon, circle, asterisk, pinwheel, symbols, etc.).
3. Have each of your four turtle objects draw a different shape with different sizes including different pen colors, pen sizes at different locations.
4. At the end of your program, have each turtle print out their name (getName()), what color (getColor() - RGB values) they are, what shape they drew and how far your turtle objects are from the top left corner (0,0) of the screen (getDistance(0,0) - distance from turtle object to 0,0).
*/

public class Main {
  public static void main(String[] args) {
    // World objects
    World world = new World(900, 900);

    // Turtle objects and setting attributes
    Turtle turtle1 = new Turtle(100, 100, world);
    turtle1.setShellColor(Color.red);
    turtle1.setName("thor");

    Turtle turtle2 = new Turtle(500, 500, world);
    turtle2.setShellColor(Color.orange);
    turtle2.setName("leo");

    Turtle turtle3 = new Turtle(100, 500, world);
    turtle3.setShellColor(Color.green);
    turtle3.setName("michael");

    Turtle turtle4 = new Turtle(500, 100, world);
    turtle4.setShellColor(Color.blue);
    turtle4.setName("luke");

    // Drawing
    turtle1.polygon(5, 50);
    turtle2.loop(5);
    turtle3.letterE(100);
    turtle4.star(75);

    // Printing names
    System.out.println("Turtle 1 | Name: " + turtle1.getName() + "\t Color: " + turtle1.getShellColor() + "\t Shape: " + "Hexagon " + " Distance from 0,0: " + turtle1.getDistance(0,0));
    System.out.println("Turtle 2 | Name: " + turtle2.getName() + "\t Color: " + turtle2.getShellColor() + "\t Shape: " + "Circle  " + " Distance from 0,0: " + turtle2.getDistance(0,0));
    System.out.println("Turtle 3 | Name: " + turtle3.getName() + " Color: " + turtle3.getShellColor() + "\t Shape: " + "Letter E" + " Distance from 0,0: " + turtle3.getDistance(0,0));
    System.out.println("Turtle 4 | Name: " + turtle4.getName() + "\t Color: " + turtle4.getShellColor() + "\t Shape: " + "Star    " + " Distance from 0,0: " + turtle4.getDistance(0,0));

    // World world2 = new World(true);

    // Turtle yertle2 = new Turtle(world2);
    // // Add your code here
    // yertle2.forward();
    // yertle2.turnRight();
    // yertle2.forward();

    // world.setVisible(true);
  }
}
