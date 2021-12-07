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
    val len = nums.length
    var step = 0
    for (i <- 0 to len - 1) {

      if (i <= len - step - 1) {
        while (nums(i) == `val` && i <= (len - 1 - step)) {
          step += 1
          for (j <- 0 to len - i - 2) {
            nums(i + j) = nums(i + j + 1)
          }
        }
      }

    }

    len - step
  }

}
