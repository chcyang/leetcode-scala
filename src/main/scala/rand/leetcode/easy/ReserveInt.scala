package rand.leetcode.easy

object ReserveInt extends App {

  //  def reverse(x: Int): Int = {
  //    val str = x.toLong.abs.toString
  //    var res: Long = str.reverse.toLong
  //    if (x < 0) res = (-res)
  //    if (res > Int.MaxValue || res < Int.MinValue) res = 0L
  //    res.toInt
  //  }

  def reverse(x: Int): Int = {
    var y: Long = 0
    var z: Long = x
    do {
      val last = z % 10
      z = z / 10
      y = y * 10L + last
    } while (z != 0)

    if (y > Int.MaxValue || y < Int.MinValue) y = 0L
    y.toInt
  }

  println(reverse(-2147483648))
}
