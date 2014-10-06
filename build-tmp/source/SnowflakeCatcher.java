import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SnowflakeCatcher extends PApplet {

SnowFlake [] bob = new SnowFlake[100];

public void setup()
{
  size(700,700);
  background(0);

  for(int i = 0; i < bob.length ; i++){
    bob[i] = new SnowFlake((int)(Math.random()* 800),(int)(Math.random()*800));
  }
}
public void draw()
{
  for(int i =0; i < bob.length; i++){
    bob[i].erase();
    bob[i].lookDown();
    bob[i].move();
    bob[i].wrap();
    bob[i].show();

  }
}
public void mouseDragged()
{
  if(mouseButton == LEFT){
    fill(255,0,0);
    noStroke();
    ellipse(mouseX,mouseY, 20,20);

  }
}

class SnowFlake
{
  int myX;
  int myY;
  boolean isMoving;
  
  SnowFlake(int x, int y)
  {

   myX = x;
   myY = y;
   isMoving = false;

 }
 public void show()
 {
   fill(255);
   ellipse(myX,myY,7,7);
 }

 public void move()
 {
  if(isMoving == true){
    myY++;
  }
}

public void lookDown()
{
  if(myY <= 800 && myY >= 0){
    if(get(myX, myY+8) != color(0) && get(myX, myY+8) != color(255)) {
      isMoving = false;
    }
    else{
      isMoving = true;
    }
  }
}


public void erase(){
  fill(0);
  noStroke();
  ellipse(myX,myY-1,11,11);

}


  public void wrap()
  {
     if(myY > 680){
        myX = (int)(Math.random()*700);
        myY = 10;
      } 
  }
}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SnowflakeCatcher" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
