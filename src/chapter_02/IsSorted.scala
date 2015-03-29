package chapter_02

object IsSorted {
  // This works, but the authors' solution reversed the semantics of `ordered`.
  // They used `gt` which means a > b. That's not how I interpreted `ordered` to be.
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    def loop(n: Int): Boolean = {
      if (n >= as.length) true
      else if (ordered(as(n - 1), as(n))) loop(n + 1)
      else false
    }
    loop(1)
  }

  def inOrder(a: Int, b: Int) = b > a

  def main(args: Array[String]) {
    println("ordered", isSorted(Array(0, 1, 2), inOrder))
    println("not ordered", isSorted(Array(0, 2, 1), inOrder))
    // With an anonymous function
    println("ordered", isSorted(Array(0, 1, 2), (a: Int, b: Int) => b > a))
  }
}
