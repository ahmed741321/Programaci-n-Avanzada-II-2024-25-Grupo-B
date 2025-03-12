import scala.collection.mutable

object checksumAccumulator {
  private var sum = 0
  private val cache = mutable.Map.empty[String, Int]

  def add(b: Byte): Unit = {
    sum += b
  }

  def checksum(): Int = {
    return ~(sum & 0xFF) + 1
  }

  def calculate(s: String): Int = {
    if (cache.contains(s))
      return cache(s)
    else {
      sum = 0
      for (c <- s) {
        add((c >> 8).toByte)
        add(c.toByte)
      }
      val cs = checksum()
      cache += (s -> cs)
      return cs
    }
  }
}
