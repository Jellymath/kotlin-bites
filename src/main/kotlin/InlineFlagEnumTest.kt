import kotlin.reflect.KProperty

interface WithFlag {
    val flag: UInt
}

inline class Flag(private val value: UInt) {
    operator fun getValue(enumValue: Enum<*>, property: KProperty<*>): UInt = value
}

fun <T> T.flag() where T : Enum<*>, T : WithFlag = Flag(1u shl ordinal)

enum class EnumSensor : WithFlag {
    THREE_DIMENSIONAL_GYRO,
    THREE_DIMENSIONAL_ACCEL,
    THREE_DIMENSIONAL_MAG,
    ABSOLUTE_PRESSURE,
    DIFFERENTIAL_PRESSURE,
    GPS,
    OPTICAL_FLOW;

    override val flag by flag()
}

inline class InlineSensor(override val flag: UInt) : WithFlag {
    companion object {
        val THREE_DIMENSIONAL_GYRO = InlineSensor(0x1u)
        val THREE_DIMENSIONAL_ACCEL = InlineSensor(0x2u)
        val THREE_DIMENSIONAL_MAG = InlineSensor(0x4u)
        val ABSOLUTE_PRESSURE = InlineSensor(0x8u)
        val DIFFERENTIAL_PRESSURE = InlineSensor(0x10u)
        val GPS = InlineSensor(0x20u)
        val OPTICAL_FLOW = InlineSensor(0x40u)
    }
}


inline class FlagSet<T>(val set: UInt) where T : WithFlag {
    companion object
}

inline fun <T : WithFlag> T.toSet() = FlagSet<T>(flag)

inline operator fun <T : WithFlag> FlagSet<T>.contains(value: T): Boolean = (set and value.flag) != 0u

inline infix fun <T : WithFlag> T.or(other: T): FlagSet<T> = FlagSet(flag or other.flag)

inline infix fun <T : WithFlag> FlagSet<T>.or(other: T): FlagSet<T> = this + other

inline infix fun <T : WithFlag> FlagSet<T>.or(other: FlagSet<T>): FlagSet<T> = this + other

inline operator fun <T : WithFlag> FlagSet<T>.plus(other: T): FlagSet<T> = FlagSet(set or other.flag)

inline operator fun <T : WithFlag> FlagSet<T>.plus(other: FlagSet<T>): FlagSet<T> = FlagSet(set or other.set)

inline infix fun <T : WithFlag> FlagSet<T>.intersect(other: FlagSet<T>): FlagSet<T> = FlagSet(set and other.set)

inline fun <T : WithFlag> FlagSet.Companion.from(vararg values: T): FlagSet<T> =
    FlagSet(values.fold(0u) { acc, curr -> acc or curr.flag })

fun main() {
    println(EnumSensor.GPS.flag.toString())
    val orChainEnum = EnumSensor.GPS or EnumSensor.OPTICAL_FLOW or EnumSensor.THREE_DIMENSIONAL_GYRO
    println(orChainEnum.toString())
    val fromInline = InlineSensor.GPS or InlineSensor.OPTICAL_FLOW or InlineSensor.THREE_DIMENSIONAL_GYRO
    println(fromInline.toString())

    val toSetEnum = EnumSensor.GPS.toSet()
    println(toSetEnum.toString())

    val toSetInline = InlineSensor.GPS.toSet()
    println(toSetInline.toString())

}