package com.trs

// 样例类
case class Person(name: String, age: Int)


object Test {

  def main(args: Array[String]) {
//    在伴生对象中提供了apply方法，所以可以不使用new关键字就可构建对象；
    val alice =  Person("Alice", 25)
    val bob =  Person("Bob", 32)
    val charlie =  Person("Charlie", 32)


    for (person <- List(alice, bob, charlie)) {

      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) =>
          println("Age: " + age + " year, name: " + name + "?")
      }

    }



  }

}
