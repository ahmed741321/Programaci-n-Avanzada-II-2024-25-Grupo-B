def checkPalindrome(string: String): Boolean = {
  val reversedString = string.reverse // عكس السلسلة النصية
  string == reversedString // التحقق من المساواة بين السلسلتين
}

@main
def ex3(): Unit = {
  val str = "radar"
  if (checkPalindrome(str)) {
    println(s"$str is a palindrome.")
  } else {
    println(s"$str is not a palindrome.")
  }
}
