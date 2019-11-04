// started with https://t.me/kotlin_lang/161615

sealed class GeneralError

sealed class BusinessError: GeneralError()

object IncorrectUserInfoError: BusinessError()
object IncorrectDeviceInfoError: BusinessError()

object NetworkFailed: GeneralError()

fun main() {
    val error: BusinessError = IncorrectDeviceInfoError
    val something = when(error) {
        IncorrectDeviceInfoError -> "Incorrect device info"
        IncorrectUserInfoError -> "Incorrect user info"
    }
    println(something)
}

