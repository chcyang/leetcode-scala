package rand.leetcode.easy

object RomanToInt extends App {

  def romanToInt(s: String): Int = {
    var cor: Int = 0
    var value: Int = 0
    var cur: Int = 0
    var next: Int = 0
    while (cor < s.length) {
      cur = symbolToValue(s.charAt(cor))
      if (cor < s.length - 1) next = symbolToValue(s.charAt(cor + 1))
      else next = 0
      if (next != null) {
        if (cur >= next) {
          value += cur
        } else {
          value += (next - cur)
          cor = cor + 1
        }
      } else {
        value += cur
      }
      cor = cor + 1
    }
    value
  }

  def symbolToValue(char: Char): Int = {

    char match {
      case 'I' => 1
      case 'V' => 5
      case 'X' => 10
      case 'L' => 50
      case 'C' => 100
      case 'D' => 500
      case 'M' => 1000
    }
  }

  println(romanToInt("MMMILVIII"))
}
