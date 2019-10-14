import java.util.*

data class Test1Entity(
    val field1: String,
    val field2: Long,
    val field3: Double,
    val date1: Date,
    val date2: Date
) : Comparable<Test1Entity> {
    override fun compareTo(other: Test1Entity): Int =
        compareValuesBy(this, other,
            { it.field1 },
            { it.field2 },
            { it.field3 },
            { it.date1 },
            { it.date2 }
        )
}