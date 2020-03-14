package com.lagosscala

import scala.annotation.tailrec 

object RecursiveFunction {

    //
    def sumByAccumulator(list: List[Int]): Int = {
      
        @tailrec
       def acc(ax: List[Int], sum: Int ): Int = {
           ax match {
               case Nil => sum 
               case x :: tail => acc(tail, sum + x)
           }
        }
           acc(list,0)
       
    }

    def sumByIfElse(list: List[Int]): Int = {
        if(list.isEmpty) 0 
        else list.head + sumByIfElse(list.tail)
    }
}
