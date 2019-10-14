import kotlin.random.Random

class GetAndSetTest {
    val casualProperty: Boolean = false

    var casualVariableProperty: Boolean = false

    val computed: Boolean
        get() = Random.nextBoolean()

    var someOtherField: Int = 3
    var computedVar: Boolean
        get() = someOtherField > 5
        set(value) {
            if (value && someOtherField <= 5) {
                someOtherField = 6
            }
        }

    var validatedVariable: Int = 4
        get() {
            println("value of variable is: $field")
            return field
        }
        set(value) {
            if (value < 0) throw Exception("only non-negative allowed")
            field = value
        }

}