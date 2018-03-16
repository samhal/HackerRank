object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var a0 = 0;
    while(a0 < n){
        var x = sc.nextDouble();
        println(f(x))
        a0+=1;
    }
  }
  
  def f(x: Double): Double = List.range(0, 10).map(v => Math.pow(x, v)/factorial(v)).sum
  def factorial(x: Int): Int = x match{
    case 0 => 1
    case _ => x * factorial(x - 1)
  }
}