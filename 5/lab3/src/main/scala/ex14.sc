val words = List("scala", "is", "awesome", "scala", "functional", "scala", "is", "great")

var groupedWords = words.groupBy(identity)

val wordCounts = groupedWords.map { case (word, occurrences) => (word, occurrences.length) }
