def finds_the_second_largest(list: List[Int]): Int = {
  var max: Int = 0;
  for (element <- list) {
    if (element > max) {
      max = element;
    }
  }
  var the_second_largest: Int = 0;
  for (element <- list) {

    if (element > the_second_largest && element < max) {
      the_second_largest = element
    }
  }
  the_second_largest;
}

@main
def ex6() = {
  val list: List[Int] = List(1,2,3,4,5,6,8,9,10)
  print(finds_the_second_largest(list));
}