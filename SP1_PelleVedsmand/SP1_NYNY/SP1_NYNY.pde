Die die;
DiceCup dicecup;
int amountOfDie = 0, tempDieValue = 0;
Die[] dieArray = new Die[10];
int [] diceValues = new int [10];
Die [][] dicePlacement = new Die [6][10];
int x = 0, y = 0, size = 100;
int ones = 0, twoes = 0, threes = 0, fours = 0, fives = 0, sixes = 0;

void setup() {
  size(1800, 900);
  background(216);


  die = new Die();
  dicecup = new DiceCup();
}

void draw() {

  if (key == ENTER) {
    dicecup.addDie(new Die());
  
    dicecup.shake();
    
    dicecup.drawDices(0,0, 100);
    
    dicecup.sortDie();
  }
  noLoop();
}


void keyPressed() {
  loop();
}
