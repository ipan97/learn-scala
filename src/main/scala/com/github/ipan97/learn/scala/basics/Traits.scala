package com.github.ipan97.learn.scala.basics

/**
  * @author Ipan Taufik Rahman
  */
object Traits {

  trait Greeter {
    def greet(name: String): Unit = {
      println("Hello, " + name + "!")
    }
  }

  class DefaultGreeter extends Greeter

  class CustomizableGreeter(prefix: String, postfix: String) extends Greeter {
    override def greet(name: String): Unit = {
      println(prefix + name + postfix)
    }
  }

  def main(args: Array[String]): Unit = {

    val greeter = new DefaultGreeter()
    greeter.greet("Scala developer")

    val customGreeter = new CustomizableGreeter("How are you, ", "?")
    customGreeter.greet("Scala developer")

    println("Hello Scala Developer")
  }

}
