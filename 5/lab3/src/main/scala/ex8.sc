//ther are an error here
def fibonnaci(n: Int): Int = {
  val list: List[Int] = List.range(1, n + 1)
  list.foldRight(0)((elem, acc) => acc + elem)
}
fibonnaci(10)