import org.apache.spark.sql.SparkSession

object SparkClusterTest {

    def main(args: Array[String]): Unit = {

        /* APPLICATION-STARTED */

        val spark = SparkSession.builder()
            .getOrCreate()

        /* SPARKSESSION-CREATED */

        // get spark version
        println("Spark version: " + spark.version)
        println("Runtime configuration:")
        for (x <- spark.conf.getAll) {
            println("- " + x._1 + " = " + x._2)
        }

        /* APPLICATION-FINISHED */

    }
}
