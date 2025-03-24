val sentences = Set(
  "Scala is a functional language",
  "The power of functional programming is great",
  "Functional programming is elegant"
)
val stopWords = Set("a", "the", "is", "of")

// Step 1: Split each sentence into words and flatten the list
val words = sentences.flatMap(_.split("\\W+"))

// Step 2: Filter out the stop words and convert to lowercase
val filteredWords = words.diff(stopWords).map(_.toLowerCase)

// Step 3: Collect the unique words into a HashSet
val uniqueWords = filteredWords.toSet

// Output the result
println(uniqueWords)  // HashSet(programming, language, scala, power, elegant, functional, great)