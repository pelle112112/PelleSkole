void MethodOne()
{
  int i = 1000; // You are not allowed to change this line.
  int max = 10;
  String output = i + " is greater than " + max + ".";
  println("");
  if (i > max)
  {
     println(output);
  } 
}

void MethodTwo() 
{
  int weekDay = 2; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;
  String nameOfDay = "";
  
  if (weekDay < 5){
    weekend = false;
  }
  else{
    weekend = true;
  }
  
  switch(weekDay){
    case 0:
    nameOfDay = "Monday";
    break;
  
    case 1:
    nameOfDay = "Tuesday";
    break;
    
    case 2:
    nameOfDay = "Wednesday";
    break;
    
    case 3:
    nameOfDay = "Thursday";
    break;
    
    case 4:
    nameOfDay = "Friday";
    break;
    
    case 5:
    nameOfDay = "Saturday";
    break;
    
    case 6:
    nameOfDay = "Sunday";
    break;
  }
  
  // Print the name of the weekday here: 
  println("The day of the week is: " + nameOfDay);
  
  // Print if it is weekend here:
  if(weekend == true){
    println("whoooo it is weekend");
  }
  else {
    println("no weekend for you..");
  }
    
  
}
