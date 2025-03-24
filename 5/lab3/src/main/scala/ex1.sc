val words = List("Scala", "is", "awesome")
val resultLeft = words.foldLeft("")((acc, word) => acc + "-" + word)
val resultRight = words.foldRight("")((word, acc) => word + "-" + acc)

println(resultLeft) // "-Scala-is-awesome"
println(resultRight) // "Scala-is-awesome-"


//ex1
def sum(l: List[Int]): Int = {
  l.foldRight(0)((acc, x) => acc + x)
}

def product(l: List[Int]): Int = {
  l.foldRight(1)((acc, x) => acc * x)
}

def length[A](l: List[A]): Int = {
  l.foldRight(0)((x,y) => y + 1)
}


sum(List(1,2,3))
product(List(1,3,5))
length(List("Hola", "" , "Mundo"))