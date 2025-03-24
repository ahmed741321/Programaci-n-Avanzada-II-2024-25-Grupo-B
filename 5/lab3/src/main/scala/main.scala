object Main extends App :
//ex1
  def sum(l: List[Int]): Int = {
    l.foldRight(0)(_+_)
  }

  println("Hello world!")
  println(sum(List(1,2,3,4,5)))


