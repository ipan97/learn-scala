package com.github.ipan97.learn.scala.basics

/**
  * @author Ipan Taufik Rahman
  */
object Classes extends App {

  val point = Point(1, 2)
  val anotherPoint = Point(1, 2)
  val yetAnotherPoint = Point(1, 2)

  if (point == anotherPoint) {
    println(point + " and " + anotherPoint + "are the same.")
  } else {
    println(point + " and " + anotherPoint + " are different.")
  }

  if (point == yetAnotherPoint) {
    println(point + " and " + yetAnotherPoint + " are the same.")
  } else {
    println(point + " and " + yetAnotherPoint + " are different.")
  }

  class Greeter(prefix: String, suffix: String) {
    def greet(name: String): Unit = println(prefix + name + suffix)
  }

  case class Point(x: Int, y: Int) {
  }

}
