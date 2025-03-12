object CombinedExample extends App {
  // إنشاء خريطة (Map) لتخزين أسماء المستخدمين وأعمارهم
  var users: Map[String, Int] = Map("Alice" -> 25, "Bob" -> 30)

  // طباعة الخريطة الأصلية
  println("Original Users: " + users)

  // تحديث عمر المستخدم "Alice" من 25 إلى 26
  users = users.updated("Alice", 26)

  // طباعة الخريطة بعد التحديث
  println("Updated Users: " + users)

  // تعريف كائن يقوم بجمع عددين
  object Adder {
    def apply(x: Int, y: Int): Int = x + y
  }

  // استخدام apply لجمع عددين
  val result = Adder(5, 7) // استدعاء الكائن كدالة
  println(s"Sum: $result") // النتيجة: Sum: 12
}
