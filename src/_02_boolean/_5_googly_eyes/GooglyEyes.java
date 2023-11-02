package _02_boolean._5_googly_eyes;

import processing.core.PApplet;
import processing.core.PImage;

/*
 * Goal: Put googly eyes on a face!
 * 
 * Instructions:
 * 1. Find an image on the Internet and drop it into the /images folder at the
 *    top level of this module. It can be anything as long as it has large eyes! X
 * 
 * 2. Declare a variable for the image:
 *    PImage face; X
 * 
 * 3. In your setup() method, import your image using the following code:
 *    face = loadImage("face.jpg");X
 * 
 * 4. Resize your face image to the size of the window using the resize() method. X
 * 
 * 5. In the draw() method, place a white ellipse over the left eye of your image.
      HINT: To find out where to put it, add code to print the mouseX and
      mouseY where you click the mouse. X
 *
 * 6. Now add a pupil (the black part) to the left eye.
 * 
 * 7. Use mouseX and mouseY to move the left pupil where the mouse moves.
 * 
 * 8. Repeat the same steps for the right eye.
 * 
 * 9. Add a right pupil and make it move by using
 *    mouseX + [distance from left eye] and mouseY + [distance from left eye].
 * 
 * 10.Here's the tricky part: stop the pupils from going outside of the white
 *    circles! To do this, imagine a rectangle that the pupil should stay
 *    within. When mouseX and mouseY goes outside of these bounds, set it back
 *    to the boundary. Put this code before you draw the pupils.
 */
public class GooglyEyes extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    PImage face;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }
    
    @Override
    public void setup() {
    	face = loadImage("cat.jpg");
    	face.resize(WIDTH, HEIGHT);
    	background(face);
    }

    @Override
    public void draw() {
    	if(mousePressed){
            println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
        }
    	
    	int x = mouseX;
    	int y = mouseY;
    	
    	//Draw eyes
    	noStroke();
    	
    	fill(0, 0, 0);
    	ellipse(219, 278, 215, 170);
    	ellipse(552, 267, 215, 170);
    	
    	//Pupils
    	
    	fill(260, 260, 260);
    	
    	//When mouse moves, change pupil position
    	if(((x >= 140 && x <= 300) && (y >= 200 && y <= 335))) {
    		background(face);
    		fill(0, 0, 0);
        	ellipse(219, 278, 215, 170);
        	ellipse(552, 267, 215, 170);
        	fill(260, 260, 260);
    		ellipse(x, y, 20, 20);
    		ellipse(x + 300, y, 20, 20);
        } else if ((x >= 440 && x <= 600) && (y >= 200 && y <= 335)){
        	background(face);
        	fill(0, 0, 0);
        	ellipse(219, 278, 215, 170);
        	ellipse(552, 267, 215, 170);
        	fill(260, 260, 260);
        	ellipse(x, y, 20, 20);
    		ellipse(x - 300, y, 20, 20);
        } else {
        	background(face);
        	fill(260, 260, 260);
        	ellipse(219, 278, 215, 170);
        	ellipse(552, 267, 215, 170);
        	fill(0, 0, 0);
        	ellipse(530, 280, 20, 20);
        	ellipse(230, 280, 20, 20);
        }
    }

    static public void main(String[] args) {
        PApplet.main(GooglyEyes.class.getName());
        
    }
}
