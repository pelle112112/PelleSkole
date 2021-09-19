class Die {

  color dieColor;
  color eyeColor;
  int size;
  int dieValue;


  int roll() {
    dieValue = int(random(1, 7));
    println(dieValue);
    diceValues[amountOfDie-1] = dieValue;
    return dieValue;
  }

  void draw (int x, int y, int size) {
    stroke(0);
    y = 0;
    size = 100;
    //x = x + (150 * amountOfDie);
    
    
    
    fill(random(255), random(255), random(255));
    
    rect(x, y, 100, 100);
    
    
    fill(random(255), random(255), random(255));

    if (dieValue == 1) {
      ellipse(x+50, y+50, 15, 15);
    }
    if (dieValue == 2) {
      ellipse(x+25, y+25, 15, 15);
      ellipse(x+75, y+75, 15, 15);
    }
    if (dieValue == 3) {
      ellipse(x+25, y+25, 15, 15);
      ellipse(x+50, y+50, 15, 15);
      ellipse(x+75, y+75, 15, 15);
    }
    if (dieValue == 4) {
      ellipse(x+25, y+25, 15, 15);
      ellipse(x+75, y+25, 15, 15);
      ellipse(x+25, y+75, 15, 15);
      ellipse(x+75, y+75, 15, 15);
    }
    if (dieValue == 5) {
      ellipse(x+50, y+50, 15, 15);
      ellipse(x+25, y+25, 15, 15);
      ellipse(x+75, y+25, 15, 15);
      ellipse(x+25, y+75, 15, 15);
      ellipse(x+75, y+75, 15, 15);
    }
    if (dieValue == 6) {
      ellipse(x+25, y+25, 15, 15);
      ellipse(x+50, y+25, 15, 15);
      ellipse(x+75, y+25, 15, 15);
      ellipse(x+25, y+75, 15, 15);
      ellipse(x+50, y+75, 15, 15);
      ellipse(x+75, y+75, 15, 15);
    }
  }
}
