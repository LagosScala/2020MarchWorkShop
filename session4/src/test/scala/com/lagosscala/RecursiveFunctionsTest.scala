package com.lagosscala


import org.scalatest.WordSpec

import com.lagosscala.RecursiveFunction._ 

class RecursiveFunctionsTest extends WordSpec {


    "The recursive " should {
        "sum the list in sumByAccumulator" in {
          val sum = sumByAccumulator(List(2,3,4,5))

          assert(sum == 45)
        }
    }
}