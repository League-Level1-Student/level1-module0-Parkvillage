import ddf.minim.*;
Minim minim;
AudioPlayer song;


PImage pictureOfRecord;
int speed= 20;
void setup(){
  minim = new Minim(this);
  song = minim.loadFile("awesomeTrack.mp3", 512);
size(1010,1010);
pictureOfRecord= loadImage("spinning record.jpeg");
pictureOfRecord.resize(1010,1010);
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}
void draw(){
  speed++;
  
  if(mousePressed){
    rotateImage(pictureOfRecord,speed);
    song.play();
    
  }else{
    song.pause();
  }
  image(pictureOfRecord,0, 0);


}