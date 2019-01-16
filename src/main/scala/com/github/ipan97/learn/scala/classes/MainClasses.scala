package com.github.ipan97.learn.scala.classes

/**
  * @author Ipan Taufik Rahman
  */
object MainClasses {
  def main(args: Array[String]): Unit = {
    val user1 = new User("Ipan Taufik Rahman")
    user1.print()

    val point1 = new Point()
    point1.x = 99
    point1.y = 107

    println(point1.x)
    println(point1.y)

    point1.move(20, 30)

    println(point1.x)
    println(point1.y)
  }
}
