package rand.leetcode.easy

object LongestCommonPrefix extends App {

  def longestCommonPrefix(strs: Array[String]): String = {

    var prefix = ""
    if (!strs.isEmpty) {
      var index = findIndex(strs)
      if (index > 0) prefix = strs(0).slice(0, index)
    }
    prefix
  }

  def findIndex(strs: Array[String]): Int = {
    var j: Int = 0
    while (j < strs(0).length) {
      var i: Int = 0
      if (strs(0) == "") return j
      var pre, current: Char = strs(0)(j)
      while (i < strs.length) {
        if (j >= strs(i).length ) return j
        current = strs(i)(j)
        if (current != pre) return j
        i = i + 1
      }
      j = j + 1
    }
    j
  }

  println(longestCommonPrefix(Array("aa","")))
}
