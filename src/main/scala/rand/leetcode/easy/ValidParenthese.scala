package rand.leetcode.easy

import com.sun.org.apache.xpath.internal.operations.And

import scala.collection.mutable

object ValidParenthese extends App {


  def isValid(s: String): Boolean = {

    if (s == "") return true
    var stack = new mutable.Stack[Char]
    var i: Int = 1
    var pre, current: Char = s(0)
    stack.push(pre)
    while (i < s.length) {
      current = s(i)
      if (!((pre == '(' && current == ')') || (pre == '{' && current == '}') || (pre == '[' && current == ']'))) {
        stack.push(current)
        pre = current
      } else {
        if (!stack.isEmpty) {
          stack.pop()
          if (!stack.isEmpty) {
            pre = stack.top
          } else {
            pre = current
          }
        }
      }
      i = i + 1
    }

    if (stack.isEmpty) return true
    false
  }


  def isValid2(s: String): Boolean = {

    if (s == "") return true
    var stack = new mutable.Stack[Char]
    var i: Int = 0
    while (i < s.length) {
      var current = s(i)
      if (current == '(' || current == '[' || current == '{') stack.push(current)
      else {
        if (stack.isEmpty) return false
        (stack.top, current) match {
          case ('(', ')') | ('{', '}') | ('[', ']') =>
            stack.pop()
          case _ =>
            stack.push(current)
        }
      }
      i = i + 1
    }

    if (stack.isEmpty) return true
    false
  }

  println(isValid2("()))"))
}
