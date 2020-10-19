package com.FirstProgramme
import scala.io.Source
object read_from_file {
  def main(args: Array[String]) {

    var file = "C:\\Users\\ag16000\\Desktop\\GIT\\PRACTISE\\SCALA_PRACTISE\\" +
      "FirstScalaProgramme\\src\\main\\scala\\com\\FirstProgramme\\test2.txt"
    var text = Source.fromFile(file)
      for (i <- text.getLines()){
        println(i)
    }
    text.close()
  }
}