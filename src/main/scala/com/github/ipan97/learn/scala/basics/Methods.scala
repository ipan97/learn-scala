package com.github.ipan97.learn.scala.basics

/**
  * @author Ipan Taufik Rahman
  */
object Methods extends App {
  def add(x: Int, y: Int): Int = x + y

  println(add(1, 5))

  //method with multiple parameter lists
  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier

  println(addThenMultiply(2, 3)(5))

  //method with no parameter lists at all.
  def name: String = System.getProperty("user.name")

  println(s"Hello ${name}")

  // method with multi-line expressions
  def getSquareString(input: Double): String = {
    val square = input * input
    square.toString
  }

  println(getSquareString(500))
}
