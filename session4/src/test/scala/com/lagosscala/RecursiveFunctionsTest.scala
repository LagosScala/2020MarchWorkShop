package com.lagosscala


import org.scalatest.WordSpec

import com.lagosscala.RecursiveFunction._ 

class RecursiveFunctionsTest extends WordSpec {


    "The recursive " should {
        "sum the list in sumByAccumulator function" in {
          val sum = sumByAccumulator(List(2,3,4,5))

          assert(sum == 14)
        }

        "sum the list using the sumByIfElse function" in {
          val sum  = sumByIfElse(List(1,2,3,4,5))
          assert(sum == 15)
        }
    }
}