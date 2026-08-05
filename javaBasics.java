//boiler palte code
// public class javaBasics{
//     public static void main(String args[]){
//        System.out.println("hello pooja!");
//        System.out.println("hello pooja!");
//        System.out.println("hello pooja!");
//     }
// }

//print pattern
// public class javabasics{
//     public static void main(String args[]){
//         System.out.println("****");
//          System.out.println("***");
//           System.out.println("**");
//            System.out.println("*");
//     }
// }

//variables
// public class javaBasics{
//     public static void main(String args[]){
//        int a = 10;
//        int b = 5;
//        System.out.println(a);
//        System.out.println(b);   
//        String name = "pooja mandal";
//        System.out.println(name);
//     }
// }

//public class javaBasics{
    //public static void main(String args[]){
       //byte - sare no. store ho sakte h
       //byte b = 8;
       //System.out.println(b);
       //char- sare character store ho sakte h jaise a,b,c,.... but sare charcter singlr hi honge
       //char ch = 'a';
       //System.out.println(ch);
       //boolean - store karate h true or false
       //boolean  var = true; 
       //float - to store decimal vaue
      // float price = 10.5;
       //int - whole value
      // int number = 25;
       //long - badi avlue ka integer uske liye long
      //double - jab float se bhi bad number store karn ah tan double use karte h 
      //short - number store kara sakte h 
//       short n = 240;

//     }
// }

// public class javaBasics{
//     public static void main(String args[]){
//         int a = 10;
//         int b = 5;
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }

import java.util.*;

// public class javaBasics{
//        public static void main(String args[]){
//          Scanner sc = new Scanner(System.in);
        //  String input = sc.next();
        //  System.out.println(input);

        //  jab ham ek word likte h or badme hamne dusrea word likha to ek bar bas ek hi word print hoga dusra nahi hoha to uske liye ham nextline ka use karte h 
        //  String name = sc.nextLine();
        //  System.out.println(name);

        //  int number = sc.nextInt();
        //  System.out.println(number);

        // float price = sc.nextFloat();
        //  System.out.println(price);

        // double num = sc.nextDouble();
        //  System.out.println(num);
//        }
// }

//sum of a & b 

/* import java.util.*;

 public class javaBasics{
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println(sum);
  }
 }
 */
  
  //product of a & b 

 /* import java.util.*;

  public class javaBasics{
    public static void main(String args[]){
      Scanner sc = new Scanner (System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int product = a * b;
      System.out.println(product);

    }
  }*/

 //calculate area of circle
  // import java.util.*;

  // public class javaBasics {
  //   public static void main(String args[]){
  //      Scanner sc = new Scanner (System.in);
  //      float rad = sc.nextFloat();
  //      float area = 3.14f * rad * rad; //decimal se float banane ke liye ksi bhi vlaue ko to uske age f likhna paddta h jaise 3.14f
  //      System.out.println(area);
  //   }
  // }

  // type conversion -> implicit 
  //-happen when type compatible ho  campre ho sake jo jaise number etc
  //destination type > source type
  // type conversion no conversion hota h jo java automaticalyy kar deta h
  // sequesce to store data
  // byte -> short -> int -> float -> long ->double
// jiase byte ka data uske age hi store kar sakte h jaise float ka dat long me hi store kar sakte h agar uske piche store kiya to data losss ho sakta h 
// import java.util.*;
// public class JavaBasics {
//   public static void main(String args[]){
//   Scanner sc = new Scanner(System.in);
//   float number = sc.nextInt();
//   System.out.println(number);
//   }
// }


//TYPE CASTING -> narrowing,explicit
//jisko java allow nahi karta to use ham jaberdati karte h mtlb esi vale jisko hamchota karne ki kosish karte h or java hame keh raha h ki apka loss ho jayegaa data ka per fir bhi ham un value ko assign karna cahte h naye variables ko us type ko type conversion kaehte h

// import java.util.*;

// public static void main(String args[]){
//   Scanner sc = new Scanner(System.in);
//   float a = 25.12f;
//   int b = (int)a;
//   System.out.println(b);
// }

//type promotion -> automatic type conversion
//2 rule 1-> if one of the operand is long then the whole expression will be promoted to long
//2-> if one of the operand is float  then the whole expression will be promoted to float
//3-> if one of the operand is double then the whole expression will be promoted to double
// java automatically promotes each byte ,short,or char operand to int when evluating an expression.
// import java.util.*;
// public class javaBasics{
//   public static void main(String args[]){
//     char a = 'a';
//     char b = 'b';
//     System.out.println((int)(b));
//     System.out.println((int)(a));
//     System.out.println(b - a);
//   }
// }

//operators
//binary
// import java.util.*;
// public class javaBasics{
//   public static void main(String args[]){
//     int A = 10;
//     int B = 5;
//     System.out.println("add = " + (A + B));
//     System.out.println("sub = " + (A - B));
//     System.out.println("mul = " + (A * B));
//     System.out.println("modulo = " + (A % B));
//     System.out.println("div = " + (A / B));
//   }
// }

//unary
//pre
// import java.util.*;
// public class javaBasics{
//   public static void main(String args[]){
//     int a = 10;
//     int b = --a;
//     System.out.println(a);
//     System.out.println(b);

//   }
// }

// import java.util.*;
//  public class javaBasics{
//   public static void main(string args[]){
//     int a = 10;
//     int b = ++a;
//     System.out.println(a);
//     System.out.println(b);
//   }
//  }


//post
// import java.util.*;
// public class javaBasics{
//   public static void main(String args[]){
//     int a = 10;
//     int b = a--;
//     System.out.println(a);
//     System.out.println(b);

//   }
// }


// import java.util.*;
// public class javaBasics{
//   public static void main(String args[]){
//     int a = 10;
//     int b = a++;
//     System.out.println(a);
//     System.out.println(b);
//   }
// }

//relational operators

import java.util.*;
 public class javaBasics{
  public static void main(String args[]){
    int a = 10;
    // int b = 5;
     int b = 10;
    System.out.println((a == b));
  }
 }

