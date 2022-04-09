package com.rusha


//import  java.awt._
//import java.awt.{Color,Font}
//import java.util.{HashMap => JavaHashMap}
//import java.util.{HashMap => _,_}

object Hello {
  println( 1+1)

  println( (1+1).isNaN)

//  def hander(evt:java.awt.ActiveEvent): Unit ={
//
//  }

  def main(args: Array[String]): Unit = {
    println( "Hello !" )
  }
}


object Test_1 {
  def main(args: Array[String]) : Unit = {
    var a = 10
    var b = 20
    var c = 25
    var d = 25
    println("a + b = " + (a + b) )
    println("a - b = " + (a - b) )
    println("a * b = " + (a * b) )
    println("b / a = " + (b / a) )
    println("b % a = " + (b % a) )
    println("c % a = " + (c % a) )

  }
}
object Test_2 {
  def main(args: Array[String]) {
    var a = 10;
    var b = 20;
    println("a == b = " + (a == b) );
    println("a != b = " + (a != b) );
    println("a > b = " + (a > b) );
    println("a < b = " + (a < b) );
    println("b >= a = " + (b >= a) );
    println("b <= a = " + (b <= a) );
  }
}


object Test_3 {
  def main(args: Array[String]) {
    var a = true;
    var b = false;

    println("a && b = " + (a&&b) );

    println("a || b = " + (a||b) );

    println("!(a && b) = " + !(a && b) );
  }
}


object Test_4 {
  def main(args: Array[String]) {
    var a = 60;           /* 60 = 0011 1100 */
    var b = 13;           /* 13 = 0000 1101 */
    var c = 0;

    c = a & b;            /* 12 = 0000 1100 */
    println("a & b = " + c );

    c = a | b;            /* 61 = 0011 1101 */
    println("a | b = " + c );

    c = a ^ b;            /* 49 = 0011 0001 */
    println("a ^ b = " + c );

    c = ~a;               /* -61 = 1100 0011 */
    println("~a = " + c );

    c = a << 2;           /* 240 = 1111 0000 */
    println("a << 2 = " + c );

    c = a >> 2;           /* 15 = 1111 */
    println("a >> 2  = " + c );

    c = a >>> 2;          /* 15 = 0000 1111 */
    println("a >>> 2 = " + c );
  }
}

object Test_5 {
  def main(args: Array[String]) {
    var a = 10;
    var b = 20;
    var c = 0;

    c = a + b;
    println("c = a + b  = " + c );

    c += a ;
    println("c += a  = " + c );

    c -= a ;
    println("c -= a = " + c );

    c *= a ;
    println("c *= a = " + c );

    a = 10;
    c = 15;
    c /= a ;
    println("c /= a  = " + c );

    a = 10;
    c = 15;
    c %= a ;
    println("c %= a  = " + c );

    c <<= 2 ;
    println("c <<= 2  = " + c );

    c >>= 2 ;
    println("c >>= 2  = " + c );

    c >>= a ;
    println("c >>= a  = " + c );

    c &= a ;
    println("c &= 2  = " + c );

    c ^= a ;
    println("c ^= a  = " + c );

    c |= a ;
    println("c |= a  = " + c );
  }
}



object Test_6 {
  def main(args: Array[String]) {
    var a = 0;
    // for 循环
    for( a <- 1 to 10){
      println( "Value of a: " + a );
    }
  }
}
object Test_7 {
  def main(args: Array[String]) {
    var a = 0;
    // for 循环
    for( a <- 1 until 10){
      println( "Value of a: " + a );
    }
  }
}
object Test_8 {
  def main(args: Array[String]) {
    var a = 0;
    var b = 0;
    // for 循环
    for( a <- 1 to 3; b <- 1 to 3){
      println( "Value of a: " + a );
      println( "Value of b: " + b );

      println();
    }
  }
}
object Test_9 {
  def main(args: Array[String]) {
    var a = 0;
//    List(1,2,3)
    val numList = List(1,2,3,4,5,6);

    // for 循环
    for( a <- numList ){
      println( "Value of a: " + a );
    }
  }
}

object Test_10 {
  def main(args: Array[String]) {
    var a = 0
    val numList = List(1,2,3,4,5,6,7,8,9,10)

    // for 循环
    for(a <- numList
        if a != 3
        if a < 8){
      println( "Value of a: " + a );
    }

  }
}

object Test_11 {
  def main(args: Array[String]) {
    var a =
      0;
    val numList =
      List(1,2,3,4,5,6,7,8,9,10);

    // for 循环
    var retVal =
      for { a <- numList
             if a != 3
             if a < 8
          }yield numList


    // 输出返回值
    for( a <- retVal){
      println( "Value of a: " + a );
      for( a <- a){
        println( "Value of a: " + a );
      }

    }
  }
}

class Test_12(val x:Int){
  def m(x: Int) = x + 3


  (x: Int) => {var y=x + 3;print(y) ; y}

  def addInt( a:Int, b:Int ):Int= {
    var sum:Int = 0
    sum = a + b
    sum
  }
  def printMe() : Unit = {
    println("Hello, Scala!")
  }

}

object Test_12 {

  def main(args: Array[String]) {
    val test_12 = new Test_12(3)
    test_12.printMe()
    val m = test_12.m(100)
    println(m)

    val f = test_12
    println(f)
    println( "Returned Value : " + test_12.addInt(5,7) );
  }

}


object Test_13 {
  def main(args: Array[String]) {
    delayed(time(),timeV());//传名与传值调用
    printInt(b=5, a=7);
  }

  def time() = {
    println("获取时间，单位为纳秒 time")
    System.nanoTime
    System.nanoTime()
  }

  var timeV =  () => { println("获取时间，单位为纳秒 timeV") ;System.nanoTime}

  def delayed( t: => Long,tv: Long) = {
    println("在 delayed 方法内")
    println("参数： " + t)
    println("参数： " + tv)
    tv
    t
    tv
  }
  def printInt( a:Int, b:Int ) = {
    println("Value of a : " + a );
    println("Value of b : " + b );
  }

}

object WhyAlwaysMe {

  var flag: Boolean = true

  def useOrNotUse(x: Int, y: => Int) = {

    flag match{
      case true => x
      case false => x + y
    }

  }

  def main(args: Array[String]) = {

    println(useOrNotUse(1, 2))

    flag = false

    println(useOrNotUse(1, 2))

  }

}



object Test_14 {

  def main(args: Array[String]) {

    println( apply( layout, 10) )
    println( inc(10) )
    println( inc2(10) )

  }


  // 函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
  def apply(f: Int => String, v: Int) = f(v)

  val layout = (x:Int) => "[" + x.toString() + "]"
  def layout[A](x: A) = "[" + x.toString() + "]"

  var inc = (x:Int) => x+1
//  上述定义的匿名函数，其实是下面这种写法的简写：
  def inc2 = new Function1[Int,Int]{
    def apply(x:Int) = x + 200
  }

}


object Test_15 {
  def main(args: Array[String]) {
    println( factorial(0) )
    println( factorial(1) )
    println( factorial(2) )
    println( factorial(3) )
    println( factorial(10) )
  }

  def factorial(i: Long): Long = {

    def fact(i: Long, accumulator: Long): Long = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }

    fact(accumulator = 1000000000, i = i)

  }

}


import java.util.Date
object Test_16 {
  def main(args: Array[String]) {

    var logWithDateBound = log(new Date,_:String)

    logWithDateBound("message1" )
    Thread.sleep(1000)
    logWithDateBound("message2" )
    Thread.sleep(1000)
    logWithDateBound("message3" )
  }

  def log(date: Date, message: String)  = {
    println(date + "----" + message)
  }
}

object Test_17 {
  def main(args: Array[String]) {
    val str1:String = "Hello, "
    val str2:String = "Scala!"
    val str3:String = " Test"
    println( "str1 + str2 + str3 = " +  strcat(str1)(str2)(str3) )
  }

  def strcat(s1: String)(s2: String)(s3:String) = {
    s1 + s2 + s3
  }
}





