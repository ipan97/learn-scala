package com.github.ipan97.learn.scala.classes

/**
  * @author Ipan Taufik Rahman
  */
class Point() {

  private var _x = 0
  private var _y = 0
  private val bound = 100

  def x = _x

  def x_=(newValue: Int): Unit = {
    if (newValue < bound) _x = newValue else printWarning
  }

  def y = _y

  def y_=(newValue: Int): Unit = {
    if (newValue < bound) _y = newValue else printWarning
  }

  def move(dx: Int, dy: Int): Unit = {
    _x = dx
    _y = dy
    println(s"(${_x},${_y})")
  }

  private def printWarning = println("WARNING: Out of bounds")

}
