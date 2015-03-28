object Chapter2 {
  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc else go(n - 1, n * acc)
    go(n, 1)
  }

  def fib(n: Int): Int = {
    def go(n: Int, v1: Int, v2: Int): Int =
      if (n == 2) v2
      else go(n - 1, v2, v1 + v2)
    if (n < 1) -1
    else if (n == 1) 0
    else go(n, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    println("factorial:", factorial(5))
    println(fib(0)) // should result in error (-1)
    println(fib(1))
    println(fib(2))
    println(fib(3))
    println(fib(4))
    println(fib(5))
    println(fib(6))
  }
}
