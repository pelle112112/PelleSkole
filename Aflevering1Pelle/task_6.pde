void task6a (){
  int a = 0, b = 0;
  if (a == 10 || b == 10 || a+b == 10){
    println("success");
  }
  else{
    println("failure");
  }
}

void task6b (){
  int x = 11, y = 7, z = 12;
  if (x + y + z == 30){
    if(x % 10 == 0 || y % 10 == 0 || z % 10 == 0){
      println("failure!");
    }
    else{ 
      println("success!");
    }   
  }
  else{
    println("failure!");
  }
  
}
