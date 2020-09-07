package rand.leetcode.easy

object LargestTime extends App {

  def largestTimeFromDigits(A: Array[Int]): String = {
    var h1: Int = -1
    var h2: Int = -1
    var m1: Int = -1
    var m2: Int = -1

    var sortA = A.sorted

    var i: Int = A.length
    var current: Int = 0

    if (sortA.head > 2 || sortA.head < 0) return ""
    while (h1 == -1) {
      current = sortA(i - 1)
      if (current <= 2) {
        h1 = current
        var sortB = sortA.toBuffer
        sortB.remove(i-1)
        sortA = sortB.toArray[Int]
      }
      i = i - 1
    }

    if (h1 == 2 && sortA(0) >= 4) return ""
    i = sortA.length
    if (h1 < 2) {
      h2 = sortA.last
      var sortB = sortA.toBuffer
      sortB.remove(i - 1)
      sortA = sortB.toArray[Int]
    }
    while (h2 == -1) {
      current = sortA(i - 1)
      if (h1 == 2 && current <= 3) {
        h2 = current
        var sortB = sortA.toBuffer
        sortB.remove(i - 1)
        sortA = sortB.toArray[Int]
      }
      i = i - 1
    }

    if (sortA.head > 5) return largestTimeFromDigits2(A)
    if (sortA.last <= 5) {
      m1 = sortA.last
      m2 = sortA.head
    } else {
      m1 = sortA.head
      m2 = sortA.last
    }

    s"$h1$h2:$m1$m2"
  }


  def largestTimeFromDigits2(A: Array[Int]): String = {
    var h1: Int = -1
    var h2: Int = -1
    var m1: Int = -1
    var m2: Int = -1

    var sortA = A.sorted

    var i: Int = A.length
    var current: Int = 0

    while (m1 == -1) {
      current = sortA(i - 1)
      if (current <= 5) {
        m1 = current
        var sortB = sortA.toBuffer
        sortB.remove(i-1)
        sortA = sortB.toArray[Int]
      }
      i = i - 1
    }

    i = sortA.length
    m2 = sortA.last
    var sortB = sortA.toBuffer
    sortB.remove(i - 1)
    sortA = sortB.toArray[Int]


    if (sortA.head > 2) return ""
    if (sortA.last <= 2) {
      h1 = sortA.last
      h2 = sortA.head
    } else {
      h1 = sortA.head
      h2 = sortA.last
    }
    if(h1 ==2 && h2 >3 ) return ""
    if(h1 !=2 && h2<m2)   {
      var temp = h2
      h2 = m2
      m2 = temp
    }

    s"$h1$h2:$m1$m2"
  }

  println(largestTimeFromDigits(Array(2, 0, 7, 6)))
}
