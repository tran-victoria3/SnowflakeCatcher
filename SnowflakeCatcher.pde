SnowFlake [] bob = new SnowFlake[100];

void setup()
{
  size(700,700);
  background(0);

  for(int i = 0; i < bob.length ; i++){
    bob[i] = new SnowFlake((int)(Math.random()* 800),(int)(Math.random()*800));
  }
}
void draw()
{
  for(int i =0; i < bob.length; i++){
    bob[i].erase();
    bob[i].lookDown();
    bob[i].move();
    bob[i].wrap();
    bob[i].show();

  }
}
void mouseDragged()
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
 void show()
 {
   fill(255);
   ellipse(myX,myY,7,7);
 }

 void move()
 {
  if(isMoving == true){
    myY++;
  }
}

void lookDown()
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


void erase(){
  fill(0);
  noStroke();
  ellipse(myX,myY-1,11,11);

}


  void wrap()
  {
     if(myY > 680){
        myX = (int)(Math.random()*700);
        myY = 10;
      } 
  }
}


