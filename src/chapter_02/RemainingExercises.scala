package chapter_02

object RemainingExercises {

  // Partials
  def partial1[A,B,C](a: A, f: (A,B) => C): B => C =
    (b: B) => f(a, b)

  // Exercise 3: curry
  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    // my solution:
    // (a: A) => (b: B) => f(a, b)
    // but Scala infers the types of a and b, so this is more concise:
    a => b => f(a, b)

  // Exercise 4: uncurry
  def uncurry[A,B,C](f: A => B => C): (A, B) => C =
    (a, b) => f(a)(b)

  // Exercise 5: composition
  def compose[A,B,C](f: A => B, g: B => C): A => C =
    a => g(f(a))

}
