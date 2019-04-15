int y= 0;
  int randomNumber;
  int score=0;
  
  void setup(){
  size(500, 500);
  
  
  
  
  
}
void draw(){
  background(66, 95, 244);
fill(75, 200, 216);


ellipse(randomNumber, y, 10, 30);
checkCatch(randomNumber);
y+=5;
fill(132, 70, 15);
rect(mouseX,450, 50, 50);
if(y==500){
 randomNumber=(int) random(width);
  y=0;



}
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);

}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); 
}