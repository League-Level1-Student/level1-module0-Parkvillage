import ddf.minim.*;  
Minim minim;
AudioSample sound;
int x= 800;
int y= 700;
int x_speed= 5;
int y_speed= 5;
void setup (){
  size(850, 850);
background(0, 0, 0);
  minim = new Minim (this);
 
sound = minim.loadSample("pong.wav", 128);


}
void draw(){
rect(850, 0, 5, 50);
  background(0, 0, 0);
fill(0, 255, 187);
stroke(250, 255, 0);
ellipse(x, y, 35, 35);
x+= x_speed;
y+= y_speed;
if(x>width-17 || x<17){
  x_speed=-x_speed;
      sound.trigger();
}
if(y>height-17 || y<17){
  y_speed=-y_speed;
      sound.trigger();
  }

}