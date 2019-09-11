import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SparkSession

object Spark_count {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().
      setMaster("local").
      setAppName("Wordcont")
    val sc = new SparkContext(conf)
    sc.setLogLevel("ERROR")

val sqlContext= new org.apache.spark.sql.SQLContext(sc)

import sqlContext.implicits._

val data = sc.textFile("file:///home/shashireddy408417/stock.txt").map(x => x.split(",")).map(x => (x(0).toString,x(1).toString,x(2).toDouble,x(3).toDouble,x(4).toDouble,x(5).toDouble,x(6).toInt))

val stockdf = data.toDF("date","Ticker","open","high","low","close","volume_for_the_day")

stockdf.show()
}
}