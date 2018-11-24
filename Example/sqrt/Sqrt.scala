object Sqrt extends App{
  val x: Double = args(0).toDouble
  def sqrt(x: Double):Option[Double] = {
	def abs(x: Double):Double = if(x<0) -x else x
	def square(x: Double):Double = x * x
  	def sqrtIter(guess: Double): Option[Double] =
    		if (isGoodEnough(guess)) guess
    		else sqrtIter(improve(guess))

  	def improve(guess: Double) =
    		(guess + x / guess) / 2

  	def isGoodEnough(guess: Double) =
    		abs(square(guess) - x) < 0.001

  	sqrtIter(1.0)
	}
   val result = sqrt(x)
   println(result)
}
