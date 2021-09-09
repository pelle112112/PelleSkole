void task7a (){
   int input = 20, inputStart = input;
   for(input = 20; input > 0; input--){
     if (input == 6){
       print("six "); 
     }
     else if (input == (inputStart / 2)){
       print("HALF! "); 
     }
     else {
       print(input + " ");
     }
   }
}

//The for-loop works will all positive integers, but it wont do anything with negative integers, since input only gets smaller.
