import scala.util.Random

// تعريف الخيط لمعالجة جزء من المصفوفة
class MyThread(arr: Array[Int]) extends Thread {
  override def run(): Unit = {
    scala.util.Sorting.quickSort(arr) // فرز الجزء المعطى
  }
}

// دمج مصفوفتين مرتبتين في مصفوفة واحدة
def mergeIt(left: Array[Int], right: Array[Int], result: Array[Int]): Unit = {
  var i = 0
  var j = 0
  var k = 0

  while (i < left.length && j < right.length) {
    if (left(i) <= right(j)) {
      result(k) = left(i)
      i += 1
    } else {
      result(k) = right(j)
      j += 1
    }
    k += 1
  }

  while (i < left.length) {
    result(k) = left(i)
    i += 1
    k += 1
  }

  while (j < right.length) {
    result(k) = right(j)
    j += 1
    k += 1
  }
}

object Main extends App {
  val a = Array.fill(20)(Random.nextInt(100)) // إنشاء مصفوفة عشوائية
  println("Before : " + a.mkString(" "))

  // تقسيم المصفوفة إلى نصفين
  val (a1, a2) = a.splitAt(a.length / 2)

  // تشغيل خيطين لفرز كل جزء
  val h1 = new MyThread(a1)
  val h2 = new MyThread(a2)
  h1.start()
  h2.start()
  h1.join()
  h2.join()

  // دمج النتيجتين
  mergeIt(a1, a2, a)

  println("After: " + a.mkString(" "))
}
