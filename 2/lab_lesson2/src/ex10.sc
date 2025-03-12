
def generateParentheses(n: Int): List[String] = {
  var result: List[String] = List()

  def backtrack(current: String, open: Int, close: Int): Unit = {
    if (open == n && close == n) {
      result = result :+ current
      return
    }

    if (open < n) {
      backtrack(current + "(", open + 1, close)
    }

    if (close < open) {
      backtrack(current + ")", open, close + 1)
    }
  }

  backtrack("", 0, 0)
  return result

}
val n = 3
val parentheses = generateParentheses(n)
println(parentheses) // List("((()))", "(()())", "(())()", "()(())", "()()()")