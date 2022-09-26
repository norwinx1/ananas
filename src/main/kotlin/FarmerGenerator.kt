import java.io.File
import java.util.*

class FarmerGenerator {
    companion object {
        var farmersCount = 0
        private val random = Random()

        fun getRandomFarmerId(): Int {
            return (random.nextInt(farmersCount) + 1)
        }

        fun generateFarmers() {
            val farmers = listOf(
                "Hanspeter Peter Hans:Deutschland:Berlin",
                "Ronnie Hartme:Schweiz:Lufingen",
                "Samuel Eggerma:Schweiz:Embrach",
                "George Rodrigez:Griechenland:Mykonos",
                "Ichigo Kurosaki:Japan:Karakura",
                "Sophia Lopez:Spanien:Comillas",
                "Santiago Silva:Portugal:Carvalhal",
                "Amir Tan:Malaysia:Malakka",
                "Siti Lee:Malaysia:Miri",
                "James Jones:England:Westminster",
                "Ram Pattel:Indien:Kalkutta",
                "Sunita Reddy:Indien:Jaipur",
                "Kenji Sato:Japan:Kobe",
                "Shigeru Takahashi:Japan:Osaka",
                "Oliver Smith:Neuseeland:Wellington",
                "Charlotte Kaur:Neuseeland:Queenstown"
            )
            farmersCount = farmers.size
            File("src/main/resources/csv/farmer.csv").printWriter().use { out ->
                out.println("id,name,country,city,field_size")
                farmers.forEachIndexed { index, farmer ->
                    val farmerAttrs = farmer.split(":")
                    out.println(
                        "${index + 1}," +
                                "${farmerAttrs[0]}," +
                                "${farmerAttrs[1]}," +
                                "${farmerAttrs[2]}," +
                                "${generateFieldSize()}"
                    )
                }
            }
        }

        private fun generateFieldSize(): Int {
            //in ha
            return random.nextInt(50) + 1
        }
    }
}
