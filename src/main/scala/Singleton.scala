object Singleton {

def main(args:Array[String]){ 

val n:Int=scala.io.StdIn.readInt()
val result:Int=searchPrime(2,n,0)
if(result!=0)
println("The "+n+"th Prime No is: "+result) 
} 


def isPrime(n: Int): Boolean= (2 to (n - 1)).forall(n % _ != 0)

def searchPrime(n:Int, until: Int, found: Int): Int = 
{
if(until>0)
{
//println(found)
if (found == until) return (n - 1)
if (isPrime(n)) { searchPrime(n + 1, until, found + 1) }
else { searchPrime(n + 1, until, found) }
}
else
{
println("INVALID INPUT: Input Should be greater than 1")
return 0
}

}
}
