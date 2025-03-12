import scala.io.StdIn

@main
def ex18(): Unit = {
  var condition: Boolean = false;
  val true_answer: String = "ahmet";
  println("Enter name")
  while (!condition) {
    val user_answer: String = StdIn.readLine()
    if (user_answer == true_answer) {
      condition = true;
      println("correct")
    }
    else {
      println("not correct")
    }
  }
}