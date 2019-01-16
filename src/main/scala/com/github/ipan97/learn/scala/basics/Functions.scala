package com.github.ipan97.learn.scala

/**
  * @author Ipan Taufik Rahman
  */
object Functions extends App {
  // function expression (x: Int) => x + 1
  val addOne = (x: Int) => x + 1
  println(addOne(2))

  // function multiple parameter
  val add = (x: Int, y: Int) => x + y
  println(add(10, 10))

  // function no parameter
  val getAnswer = () => 42
  println(getAnswer())
}
