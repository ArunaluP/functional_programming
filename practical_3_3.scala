












import scala.math.BigDecimal.RoundingMode

object HelloWorld{
    def main(args:Array[String]):Unit={
        println(mean(sum(4,5)))

    }
    def sum(num1: Int,num2: Int):Int = {
               num1 + num2
    }
    def mean(k:Int):Double={
    val roundedNumber = BigDecimal(k.toDouble/2).setScale(2, RoundingMode.HALF_UP).toDouble
        roundedNumber

    } 
}