def map[A, B](l: List[A], f: A => B): List[B] = {
  l match {
    case Nil => Nil
    case head :: tail => f(head) :: map(tail, f)
  }
}

// تجربة الكود
println(map(List(1, 2, 3, 4, 5), (x: Int) => x * 2)) // Output: List(2, 4, 6, 8, 10)
