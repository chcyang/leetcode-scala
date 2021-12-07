package rand.leetcode.easy

object RemoveElement {
  def main(args: Array[String]): Unit = {
    val input = Array(3, 2, 2, 3)
    val re = removeElement(input, 2)

    for (i <- 0 until re) {
      println(input(i))
    }
  }

  def removeElement(nums: Array[Int], `val`: Int): Int = {
    var index = 0
    for (i <-0 until  nums.length) {
      if (nums(i) != `val`) {
        nums(index) = nums(i)
        index += 1
      }
    }

    index
  }

}
