package com.github.ipan97.learn.scala

import org.scalatest.FunSuite

/**
  * @author Ipan Taufik Rahman
  */
class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }
}
