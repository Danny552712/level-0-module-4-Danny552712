package _99_extra.hide_the_creeper;

import processing.core.PApplet;
import processing.core.PImage;

public class HideTheCreeper extends PApplet {
    static final int WIDTH = 1000;
    static final int HEIGHT = 800;
    PImage creeper;     //at the top of your program
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	PImage minecraft = loadImage("green.jpg");     //in setup method
    	minecraft.resize(WIDTH, HEIGHT);          //in setup method
    	background(minecraft);          //in setup method
    	creeper = loadImage("creeper.png");     //in setup method
    	creeper.resize(10, 10);
    }
    
    
    
    
boolean creeperPlaced = true;
int currentX;
int currentY;


    @Override
    public void draw() {
    	if(mousePressed && creeperPlaced){
          image(creeper, mouseX, mouseY);
          creeperPlaced = false;
          currentX = mouseX + 5;
          currentY = mouseY + 5;
        } else if (mousePressed) {
        	if(isNear(currentX, mouseX) && isNear(currentY, mouseY)) {
        		fill(0, 255, 0);
        	} else {
        		fill(255, 0, 0);
        	}
        	ellipse(mouseX, mouseY, 10, 10);
        }
    	

    }
    
    public boolean isNear(int a, int b) {
		if (abs(a - b) < 10) {
		     return true;
		}else {
		     return false;
		}
    }

    static public void main(String[] args) {
        PApplet.main(HideTheCreeper.class.getName());
    }
}
