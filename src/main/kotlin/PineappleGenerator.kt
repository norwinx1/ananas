import java.io.File
import java.io.FileWriter
import java.time.LocalDate
import java.util.*

class PineappleGenerator {
    companion object {
        private val pineappleTypes = listOf("Cayenne-Ananas", "Queens-Ananas", "Spanish-Ananas", "Perolera-Ananas", "Pernambuco-Ananas")
        private var id = 1
        private val random = Random()

        private fun generateQuality(): Int {
            return random.nextInt(10) + 1
        }

        private fun generateWeight(): Int {
            return random.nextInt(301) + 700
        }

        fun generatePineapple() {
            File("src/main/resources/csv/pineapple.csv").printWriter().use { out ->
                out.println("id,type,farmer_id,quality,weight")
                for (i in 1..1000)
                    out.println("${id++}," +
                            "${pineappleTypes.random()}," +
                            "${FarmerGenerator.getRandomFarmerId()}," +
                            "${generateQuality()}," +
                            "${generateWeight()}")
            }
        }
    }
}
