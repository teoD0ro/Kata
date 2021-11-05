import java.util.Scanner;


public class Test{ 
   
    
    public static void main (String[] args) {
         
        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String xy = in.nextLine();
          
       // System.out.println(xy);
       // in.close();
        
        char[] xy1 = new char[9];
        char operation=0;
        for (int i = 0; i < xy.length(); i++) {
            xy1[i] = xy.charAt(i);
            if (xy1[i] == '+') {
                operation = '+';
            }
            if (xy1[i] == '-') {
                operation = '-';
            }
            if (xy1[i] == '*') {
                operation = '*';
            }
            if (xy1[i] == '/') {
                operation = '/';
            
            }

        }
String[] words = xy.split("\\+|-|\\*|/");
//for(String word : words){
    //System.out.println(word);
    //String first = words[0];
    int i = 0; 
    int j = 0;
try {
   if((words[0].equals("I")|words[0].equals("II")|words[0].equals("III")|words[0].equals("IV")|words[0].equals("V")
        |words[0].equals("VI")|words[0].equals("VII")|words[0].equals("VIII")|words[0].equals("IX")|words[0].equals("X"))   
        &(words[1].equals("I")|words[1].equals("II")|words[1].equals("III")|words[1].equals("IV")|words[1].equals("V")
        |words[1].equals("VI")|words[1].equals("VII")|words[1].equals("VIII")|words[1].equals("IX")|words[1].equals("X"))){
    

System.out.println("Результат:" + RomanResult (words, operation));  
   }
   else{   
i = Integer.parseInt(words[0]); 
j = Integer.parseInt(words[1]);
System.out.println("Результат:" + result (i, j, operation));
   }
    //System.out.println(i);
    //System.out.println(j);
}
    catch (Exception e) {
     System.out.println("Ошибка: Неверно введено выражение");
   System.exit(0);   
    }
    }
        private static int result (int a, int b, char c){
    int z = 0;
        switch(c){
    case '+': 
        z = a + b;
        break;
    case '-': 
        z = a - b;
        break;
    case '*': 
        z = a * b;
        break;
    case '/': 
        z = a / b;
        break;
    
    }

        return z;
}
        private static String RomanResult (String[] words, char c){
    int a = 0; 
    int b = 0; 
    String z = null;
    String[] RomanNumbers = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
    "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
    "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
    "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };      
       if(words[0].equals("I")){
     a = 1;
}     
     else if(words[0].equals("II")){
     a = 2;
}
     else if(words[0].equals("III")){
     a = 3;    
}
     else if(words[0].equals("IV")){
     a = 4;    
}
     else if(words[0].equals("V")){
     a = 5;    
}
      else if(words[0].equals("VI")){
     a = 6;    
}
      else if(words[0].equals("VII")){
     a = 7;    
}
      else if(words[0].equals("VIII")){
     a = 8;    
}
      else if(words[0].equals("IX")){
     a = 9;    
}
      else if(words[0].equals("X")){
     a = 10;    
}
   if(words[1].equals("I")){
     b = 1;
}     
     else if(words[1].equals("II")){
     b = 2;
}
     else if(words[1].equals("III")){
     b = 3;    
}
     else if(words[1].equals("IV")){
     b = 4;    
}
     else if(words[1].equals("V")){
     b = 5;    
}
      else if(words[1].equals("VI")){
     b = 6;    
}
      else if(words[1].equals("VII")){
     b = 7;    
}
      else if(words[1].equals("VIII")){
     b = 8;    
}
      else if(words[1].equals("IX")){
     b = 9;    
}
      else if(words[1].equals("X")){
     b = 10;    
}
   try {
   z = RomanNumbers [result (a, b, c)];

   } 
   catch (ArrayIndexOutOfBoundsException e) {
   System.out.println("Ошибка: Отрицательный римский результат");
   System.exit(0);
   }
    return z; 
   }
   }

        
    

        