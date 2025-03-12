import scala.annotation.tailrec

def binarySearch(arr: Array[Int], elt: Int): Option[Int] = {
  @tailrec
  def binarySearchPrime(array: Array[Int], low: Int, high: Int, elt: Int): Option[Int] = {
    if (low > high) return None

    val mid = (high + low) / 2

    if (array(mid) == elt) Some(mid)
    else if (array(mid) > elt) binarySearchPrime(array, low, mid - 1, elt)
    else binarySearchPrime(array, mid + 1, high, elt) // ✅ FIXED: Now correctly searching the right half
  }

  binarySearchPrime(arr, 0, arr.length - 1, elt)
}

// Example usage:
val arr = Array(1, 2, 3, 4, 5, 6, 7)
println(binarySearch(arr, 6))  // Output: Some(5)
println(binarySearch(arr, 10)) // Output: None
