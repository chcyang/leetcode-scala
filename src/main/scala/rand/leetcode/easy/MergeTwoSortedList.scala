package rand.leetcode.easy


class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}

object MergeTwoSortedList extends App {

  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    var l1Node: ListNode = l1
    var l2Node: ListNode = l2
    var current: ListNode = new ListNode()
    var start: ListNode = current
    while (l1Node != null && l2Node != null) {
      if (l1Node.x == l2Node.x) {
        current.next = l2Node
        l2Node = l2Node.next
        current = current.next
        current.next = l1Node
        l1Node = l1Node.next
      } else if (l1Node.x > l2Node.x) {
        current.next = l2Node
        l2Node = l2Node.next
      } else {
        current.next = l1Node
        l1Node = l1Node.next
      }
      current = current.next
    }
    if (l1Node != null) current.next = l1Node
    else current.next = l2Node

    start.next
  }

}
