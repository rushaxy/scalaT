
package com.rusha {

  class HelloWorld {

    def main() = {
      println("Hello !")
    }


  }

}

import com.rusha.HelloWorld
object Test_12 {

  def main(args: Array[String]=null): Unit = {
    (new HelloWorld).main()
  }

}