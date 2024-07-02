object HelloWorld{
    def main(args:Array[String]):Unit={
        val numbers = scala.io.StdIn.readLine()
        val list = numbers.split("\\s+").map(_.toInt).toList
        println("Sum of the Integer list : " + sum(list))
        
    }
    def sum(num: List[Int]):Int={
        if(num.isEmpty){
            0
        }else{
            num.head +sum(num.tail)
        }
    }
}
