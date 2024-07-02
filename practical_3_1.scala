object  HelloWorld{
    def main(args:Array[String]):Unit = {
        val string_1 = scala.io.StdIn.readLine()
        val string_2 = reVerse(string_1)
        println(string_2)
    }
    def reVerse(str:String):String = {
        if (str.isEmpty()){
            ""
        }else{
             s"${str.last}${reVerse(str.init)}"
        }
}
}