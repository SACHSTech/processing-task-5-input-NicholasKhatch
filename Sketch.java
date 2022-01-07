import processing.core.PApplet;

public class Sketch extends PApplet {

  boolean UPclick = false;
  boolean DOWNclick = false;
  boolean LEFTclick = false;
  boolean RIGHTclick = false;

  float r = 204;
  float g = 255;
  float b = 249;

  int textX = 50;
  int textY = 50;

  String typedstr = "";

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

    if (keyPressed){
      if (UPclick) {
        textY--;
      }
      if (DOWNclick) {
        textY++;
      }
      if (LEFTclick) {
        textX--;
      }
      if (RIGHTclick) {
        textX++;
      }
    }

    fill(255,255,255);
    textSize(40);
    text(key, textX, textY);

    fill(255,255,255);
    textSize(40);
    text(typedstr,0,100);

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

  public void keyPressed(){
    r = 0;
    g = 0;
    b = 0;

    if (keyCode == UP) {
      UPclick = true;
    }
    else if (keyCode == DOWN) {
      DOWNclick = true;
    }
    else if (keyCode == LEFT) {
      LEFTclick = true;
    }
    else if (keyCode == RIGHT) {
      RIGHTclick = true;
    }
  }

  public void keyReleased() {
    if (keyCode == UP) {
      UPclick = false;
    }
    else if (keyCode == DOWN) {
      DOWNclick = false;
    }
    else if (keyCode == LEFT) {
      LEFTclick = false;
    }
    else if (keyCode == RIGHT) {
      RIGHTclick = false;
    }
  }

  public void keyTyped(){
    typedstr += key;
  }
  // define other methods down here.
}