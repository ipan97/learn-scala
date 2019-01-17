package com.github.ipan97.learn.scala.scalaforjavadeveloper

/**
  * @author Ipan Taufik Rahman
  */
class Complex(real: Double, imaginary: Double) {
  def re: Double = real

  def im: Double = imaginary

  override def toString: String = "" + re + (if (im < 0) "-" else "+") + im + "i"
}
