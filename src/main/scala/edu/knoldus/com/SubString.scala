package edu.knoldus.com

class SubString {
  def vovel(s: String): Int ={
    val x: Array[Int] = new Array[Int](s.length)

    for(i<-0 until s.length){
      if(i ==0)

        x(i) = s.length
      else
        x(i) = (s.length -i) + x(i-1) -i
    }
    val y: Array[Int] = new Array[Int](1)
    y(0) = 0
    for(i<- 0 until s.length){
      val ch: Char = s.charAt(i)

      if(ch == 'a' || ch == 'e' || ch== 'i' || ch == 'o' || ch =='u')
        y(0) = y(0) + x(i)
    }
    y(0)

  }
}
object SubString{
  def main(args: Array[String]): Unit = {
    val obj= new SubString()
    print(obj.vovel("sparsh"))
  }
}
