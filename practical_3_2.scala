object HelloWorld {
  def main(args: Array[String]): Unit = {
    val stringList: List[String] = List("FirstString","nine", "SecondString","two", "ThirdString","one","four")
    val filteredList = chooseStr(stringList)
    println(filteredList)
  }

  def chooseStr(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }
}