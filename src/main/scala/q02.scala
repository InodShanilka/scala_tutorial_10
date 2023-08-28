object q02 {
  def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(word => word.length)
    val totalOccurrences = wordLengths.reduce((length1, length2) => length1 + length2)
    totalOccurrences
  }

  def main(args: Array[String]): Unit = {
    val inputWords = List("apple", "banana", "cherry", "date")
    val totalOccurrences = countLetterOccurrences(inputWords)
    println(s"Total count of letter occurrences: $totalOccurrences")
  }
}

