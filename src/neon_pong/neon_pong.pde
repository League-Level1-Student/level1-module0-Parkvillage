import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;
int x= 800;
int y= 700;
int x_speed= 10;
int y_speed= 10;

void setup (){
  size(850, 850);
  background(0, 0,0);
  minim = new Minim (this);
  
backgroundImage = loadImage("background.jpg");
  sound = minim.loadSample("pong.wav", 128);

  
  
}
void draw(){
 image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);
fill(mouseY, 0,mouseX);
stroke(250, 255, 0);
ellipse(x, y, 35, 35);

x+= x_speed;
y+= y_speed;

if(x>width || x<10)
{
  x_speed=-x_speed;
      sound.trigger();
}
if(y>height-17 || y<17)
{
  y_speed=-y_speed;
      sound.trigger();
     

  }
 rect(750, mouseY, 50, 100);
 if(intersects(x, y, 750, mouseY,50)== true){
   x_spe-= x_speed;
   
 }
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}