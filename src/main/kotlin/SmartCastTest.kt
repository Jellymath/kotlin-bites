// https://t.me/kotlin_lang/168906
sealed class Demo
object None: Demo()
class Some(
    val thing: Any
) : Demo()

fun interopTest() {
    val result = when (val demo = SmartCastInteropTest.demo()) {
        None -> "None"
        is Some -> "Some(${demo.thing})"
    }
}

fun smartCastFail(d: Demo) {
    when(d/*!!*/) {
        is Some -> d.thing // из-за "!!" не видит "thing"
    }
}
