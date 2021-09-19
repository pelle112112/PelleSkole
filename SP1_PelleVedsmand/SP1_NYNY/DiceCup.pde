class DiceCup {

  void addDie(Die die) {

    if (amountOfDie < 10) {
      amountOfDie++;
      dieArray[amountOfDie-1] = die;
    }
  }

  void shake() {

    for (int i = 0; i < dieArray.length-(dieArray.length-amountOfDie); i++) {
      dieArray[i].roll();

      println("TERNINGE VÆRDIER: " + diceValues[i]);
    }
  }
  void drawDices (int x, int y, int size) {
    for (int i = 0; i < dieArray.length-(dieArray.length-amountOfDie); i++) {
      dieArray[i].draw(int(x+((i+1)*size*1.5)), y, size);
    }
  }

  void sortDie () {
    for (int i = 0; i < 10; i++) {
      if (diceValues[i] == 6) {
        dicePlacement[0][i] = dieArray[i];
        sixes++;
      }
      if (diceValues[i] == 5) {
        dicePlacement[1][i] = dieArray[i];
        fives++;
      }
      if (diceValues[i] == 4) {
        dicePlacement[2][i] = dieArray[i];
        fours++;
      }
      if (diceValues[i] == 3) {
        dicePlacement[3][i] = dieArray[i];
        threes++;
      }
      if (diceValues[i] == 2) {
        dicePlacement[4][i] = dieArray[i];
        twoes++;
      }
      if (diceValues[i] == 1) {
        dicePlacement[5][i] = dieArray[i];
        ones++;
      }
      println(" ");
      println(dicePlacement[1][i]);
    }

    //for (int i = 0; i < sixes; i++) {
      
      //dicePlacement[0][i].draw(int(x+((i+1)*size*1.5)), y, size); 
  //}
}
}
