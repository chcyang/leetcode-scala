package rand.leetcode.easy

object Palindrome extends App {

  def isPalindrome(x: Int): Boolean = {
    if (x < 0) return false
    var dist: Long = 0L
    var src: Int = x
    while (src != 0) {
      dist = dist * 10  + src % 10
      src = src / 10
    }
    if(dist == x) return true
    false
  }

  println(isPalindrome(1235321))

}
