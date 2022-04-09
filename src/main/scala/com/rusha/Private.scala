package com.rusha

class Private {
}
class Outer{

  class Inner{

    private def f(){
      println("f")
    }

    class InnerMost{
      f() // 正确
    }

  }


//  (new Inner).f() //错误
}


object Test {
  def main(args: Array[String]): Unit = {
    val outer = (new Outer)
    val inner = new outer.Inner
    new inner.InnerMost
  }
}





class Outer1(val name : String){

  (outer) => class Inner(val name : String){
    def info(b: Inner)= println("Outer : " + outer.name + ",   inner : " + b.name)
  }

}

object OutPutResult{
  def main(args: Array[String]): Unit ={
    val outer = new Outer1("spark")

    val inner = new outer.Inner("scala")

    inner.info(inner)

    //这里inner1的foo不能引用inner2，inner2也不能引用inner1
    //也就是说inner1是从属于inner1这个实例的。因为你new的时候用的是outer1，并且赋值给了inner1.
//    inner.info
//    inner1.info(inner1)
  }
}








