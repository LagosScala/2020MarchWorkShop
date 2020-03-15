package com.lagosscala.learnfunctions

import org.scalatest.wordspec.AnyWordSpec

class AnonymousFunctionTestSpec extends AnyWordSpec {

  "Anonymous Function object " should {
    "apply filter with function literal" in {
      assert(AnonymousFunctions.callFiltered.contains(2))
      assert(AnonymousFunctions.callFiltered.size == 1)
      assert(AnonymousFunctions.callliterralFiltered.size == 1)
    }

    "apply higher order function " in {
      assert(AnonymousFunctions.chainedPartialFunction.isInstanceOf[Int])
      assert(AnonymousFunctions.chainedPartialFunction == 9)
    }


    "apply anonymous function " in {
      assert(AnonymousFunctions.addResult == 7)
    }
  }
}