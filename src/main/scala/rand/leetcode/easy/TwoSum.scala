package rand.leetcode.easy

import scala.util.control.Breaks._

object TwoSum extends App {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {

    val res =  nums.combinations(2).find(_.sum == target).get
      Array(nums.indexOf(res(0)),nums.lastIndexOf(res(1)))
  }

  var rest = twoSum(Array(3, 2, 3)
    , 6
  )

  rest.foreach(println)
}
