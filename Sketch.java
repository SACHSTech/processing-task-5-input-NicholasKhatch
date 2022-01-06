import processing.core.PApplet;

public class Sketch extends PApplet {
	
  float r = 204;
  float g = 255;
  float b = 249;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(204, 255, 249);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    background(r,g,b);

    fill(255,255,255);
    ellipse(mouseX,mouseY,20,20);

    stroke(0, 0, 0);
    fill(63, 122, 55);
    rect(0,350,400,50);
  }

  public void mousePressed() {
    r = 222;
    g = 179;
    b = 51;
  }

  public void mouseDragged() {
    r = 26;
    g = 25;
    b = 64;
  }

  // define other methods down here.
}