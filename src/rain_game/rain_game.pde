int i= 0;
  int randomNumber;
  int score=0;
  
  void setup(){
  size(500, 500);
  
  
  
  
  
}
void draw(){
  background(66, 95, 244);
fill(75, 200, 216);


ellipse(randomNumber, i, 10, 30);
i+=5;
fill(132, 70, 15);
rect(mouseX,450, 50, 50);
if(i== 500){
 randomNumber=(int) random(width);
  i=0;
checkCatch(randomNumber);


}

}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }