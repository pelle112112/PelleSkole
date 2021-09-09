
  color red = color(255,0,0);
  color yellow = color(255,255,0);
  color green = color(0,255,0);
  color grey = color (155);
  
void setup() {
  size(250, 700);
  stroke(0);
  strokeWeight(10);
  background(255);
  rectMode(CENTER);
  fill(0);
  rect(125, 350, 200, 600);
  ellipseMode(CENTER);
  fill(grey);
  ellipse(width/2, height/2-200, 200, 200);
  ellipse(width/2, height/2, 200, 200);
  ellipse(width/2, height/2+200, 200, 200);
}

int i = 1;
void draw(){
  frameRate(1);
  if(i > 5){
    fill(red);
    ellipse(width/2, height/2-200, 200, 200); 
    fill(grey);
    ellipse(width/2, height/2+200, 200, 200);
  }
  else if(i == 4 || i == 5){
    fill(yellow);
    ellipse(width/2, height/2, 200, 200);
  }
  else{
    fill(green);
    ellipse(width/2, height/2+200, 200, 200);
    fill(grey);
    ellipse(width/2, height/2-200, 200, 200);
  }
  i++;
  if(i == 10){
    i = 1;
  } 
}
