void setup(){
size(900, 900);
background(246, 255, 0);


}
void draw(){
  //background(246, 255, 0);
  makeMagical();
  for(int i=0; i<=300; i++){
   float x = random(901);
   float y = random(901);
   fill(frameCount, i, 0);
   ellipse(getWormX(i), getWormY(i), 20, 20); 
  }
  if(mousePressed){
    for(int i=0; i<=300; i++){
   float x = random(901);
   float y = random(901);
   fill(frameCount, i, 255);
   ellipse(getWormX(i), getWormY(i), 20, 20); }
  }
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}