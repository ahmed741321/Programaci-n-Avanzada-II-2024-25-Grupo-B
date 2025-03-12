
// Function to flatten nested lists
def flatten[A](list: List[Any]): List[A] = {
  list.flatMap {
    case sublist: List[_] => flatten(sublist) // Recursive call if the element is a list
    case element => List(element.asInstanceOf[A]) // Convert element to type A
  }
}



// Function to compress a list by removing consecutive duplicates
def compress[A](list: List[A]): List[A] = {
  list.foldRight(List.empty[A]) {
    case (current, Nil) => List(current)
    case (current, acc) if current != acc.head => current :: acc
    case (_, acc) => acc
  }
}


// Function to pack consecutive duplicates into sublists
def pack[A](list: List[A]): List[List[A]] = {
  list.foldRight(List.empty[List[A]]) {
    case (current, Nil) => List(List(current))
    case (current, acc@head :: _) if current == head.head => (current :: head) :: acc
    case (current, acc) => List(current) :: acc
  }
}


// Function to replicate each element in a list a given number of times
def replicate[A](list: List[A], n: Int): List[A] = {
  list.flatMap(item => List.fill(n)(item))
}


// Function to generate a range of integers
def range(start: Int, end: Int): List[Int] = {
  if (start < end) (start to end).toList
  else if (start > end) (start to end by -1).toList
  else List() // حالة القيم المتساوية
}


@main
def ex38(): Unit = {
  // Example usage
  println(flatten(List("a", List("b", "c"), List("d", "e")))) // List("a", "b", "c", "d", "e")
  println(flatten(List("a", List("b", "c", List("d", "e"))))) // List("a", "b", "c", "d", "e")
  // Example usage
  println(compress(List("a", "a", "a", "b", "c", "c", "d", "a", "e", "e", "e"))) // List("a", "b", "c", "d", "a", "e")
  // Example usage
  println(pack(List("a", "a", "a", "b", "c", "c", "d", "e", "e", "e"))) // List(List("a", "a", "a"), List("b"), List("c", "c"), List("d"), List("e", "e", "e"))
  // Example usage
  println(replicate(List("a", "b", "c", "d"), 3)) // List("a", "a", "a", "b", "b", "b", "c", "c", "c", "d", "d", "d")
  // Example usage
  println(range(4, 9)) // List(4, 5, 6, 7, 8, 9)
  println(range(9, 4)) // List(9, 8, 7, 6, 5, 4)
  println(range(5, 5)) // List()
}