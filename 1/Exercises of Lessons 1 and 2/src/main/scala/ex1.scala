def leapYear(year: Int): Boolean =
  (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)


@main
def main: Unit =
  val year: Int = 2020
  println(f"is leap year  ${leapYear(year)}")