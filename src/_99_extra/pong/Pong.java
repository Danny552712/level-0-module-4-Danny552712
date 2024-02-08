package _99_extra.pong;

import processing.core.PApplet;
import processing.core.PImage;

public class Pong extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int ballx = 400;
	int bally = 300;
	int xSpeed = 10;
	int ySpeed = 10;
	
	int rectx = mouseX;
	int recty = 500;
	
	PImage backgroundImage;
	
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	backgroundImage = loadImage("free-nature-images.jpg");
    }

    @Override
    public void draw() {
    	clear();
    	
    	image(backgroundImage, 0, 0, WIDTH, HEIGHT);
    	
    	if(ballx > WIDTH || ballx <= 0) {
    		xSpeed = -xSpeed;
    		//System.out.println("x: " + xSpeed);
    	}
    	
    	if(bally > HEIGHT || bally <= 0 || (bally == recty && (ballx >= mouseX && ballx <= mouseX + 100))) {
    		ySpeed = -ySpeed;
    		//System.out.println("y: " + ySpeed);
    	}
    	
    	ballx += xSpeed;
    	//System.out.println("x: (" + x + ")");
    	bally += ySpeed;
    	//System.out.println("y: (" + y + ")");
    	
    	fill(0, 0, 200);
    	stroke(250, 250, 250);
    	ellipse(ballx, bally, 20, 20);
    	
    	fill(0, 200, 0);
    	stroke(0, 0, 0);
    	rect(mouseX, recty, 100, 30);
    }

    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
        
        
    }
}