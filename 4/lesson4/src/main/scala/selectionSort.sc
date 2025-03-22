def selectionSort(arr: Array[Int]): Unit = {
  val n = arr.length

  for (i <- 0 until n) {
    // افترض أن العنصر الأول في الجزء غير المرتب هو الأصغر
    var minIdx = i

    for (j <- i + 1 until n) {
      if (arr(j) < arr(minIdx)) {
        minIdx = j
      }
    }

    // قم بتبديل العنصر الأصغر مع العنصر الحالي
    val temp = arr(i)
    arr(i) = arr(minIdx)
    arr(minIdx) = temp
  }
}

val numbers = Array(64, 25, 12, 22, 11)
println("Before " + numbers.mkString(", "))
selectionSort(numbers)
println("After " + numbers.mkString(", "))