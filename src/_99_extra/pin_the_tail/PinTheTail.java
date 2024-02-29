package _99_extra.pin_the_tail;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import processing.core.PApplet;
import processing.core.PImage;

public class PinTheTail extends PApplet {
    static final int WIDTH = 1000;
    static final int HEIGHT = 800;
    PImage donkey;
    PImage tail;
    int tailX;
    int tailY;
    boolean set = false;
    int appeared = 0;
    boolean win = false;



    @Override
    public void setup() {
    	donkey = loadImage("donkey.jpg");      //change the file name if you need to
    	tail = loadImage("tail.jpg");      //change the file name if you need to
    	tail.resize(150, 250);     //replace width, height with your tail's dimensions
    }
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
    	clear();
    	if(dist(0,0, mouseX, mouseY) < 30) {
    		image(donkey, 0, 0, WIDTH, HEIGHT);
    		//System.out.println("Showing Donkey");
    	} else {
    		//System.out.println("Hiding donkey");
    	}
    	if(set){
    		image(tail, tailX, tailY);
    	} else {
    		image(tail, mouseX - 90, mouseY - 40);
    	}
    	
    	if(mousePressed){
    		for(int i = 0; i < mouseX - 90; i++) {
    			tailX = i;
    		}
    		for(int i = 0; i < mouseY - 40; i++) {
    			tailY = i;
    		}
    		set = true;
    		//System.out.println(dist(105, 310, tailX, tailY));
        	//System.out.println("Set Tail");
        }
    	
    	
    	if(dist(80, 225, tailX, tailY) < 85 && dist(80, 225, tailX, tailY) > 70) {
    		//System.out.println("Winning position");
    		playWhoohoo();
    		win = true;
    	}
    	
    	if(win) {
    		fill(0, 255, 0);
    	}

    	rect(0, 0, 30, 30);
    	rect(105, 310, 40, 40);
    	
    	if(appeared > 1000) {
    		rect(0,0, 300, 300);
    		textSize(24);
    		text("Welcome to pin tail on the donkey, you will get to see where the donkey is when hover over the box in the corner"
    				+ "\nHowever will be blind when you try to place the tail on the donkey",100,20);
    		appeared++;
    	}
    }

    static public void main(String[] args) {
        PApplet.main(PinTheTail.class.getName());
        
    }
    
    /*********************** DO NOT MODIFY THE CODE BELOW ********************/

    Clip clip = null;

    public void playDoh() {
        if (clip == null || !clip.isActive()) {
            clip = playSound("homer-doh.wav");
        }
    }

    public void playWhoohoo() {
        if (clip == null || !clip.isActive()) {
            clip = playSound("homer-woohoo.wav");
        }
    }

    public Clip getSong(String fileName) {
        String path = "src/";
        Clip clip = null;

        // Note: use .wav files
        try {
            clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path + fileName));
            clip.open(inputStream);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " for " + path + fileName);
        }

        return clip;
    }

    public Clip playSound(String fileName) {
        final Clip clip = getSong(fileName);

        new Thread(new Runnable() {
            @Override
            public void run() {
                clip.start();
            }
        }).start();

        return clip;
    }
}
