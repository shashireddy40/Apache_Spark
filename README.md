	# Apache_Spark
Data Pipeline

Spark with Scala,
Scala Fundamentals,
Transformations,
Actions,
Data frames,
DF Operations,
Registering temp tables,
File formates,
Saving Data into Hive,
Analytics with Spark-SQL.



# Spark First Application 

1)Download SBT 
2)Conf build.sbt
3)SBT Console
4)SBT package  (it will generate JAR file)

spark-submit \
  --class <main-class> \
  --master <master-url> \
  --deploy-mode <deploy-mode> \
  --conf <key>=<value> \
  ... # other options
  <application-jar> \
  [application-arguments]


  spark-submit --class Spark_count /home/shashireddy408417/sample/target/scala-2.11/spark_count_2.11-1.0.jar

