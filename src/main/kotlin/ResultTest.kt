class ResultWithFlags(val isSuccess: Boolean, val errorMessage: String = "", val someData: String = "") {
    val isError get() = !isSuccess
}

fun ResultWithFlags.onSuccess(action: ResultWithFlags.() -> Unit) = apply { if (isSuccess) action() }

fun ResultWithFlags.onError(action: ResultWithFlags.() -> Unit) = apply { if (isError) action() }


sealed class SealedResult
data class Success(val someData: String): SealedResult()
data class Error(val errorMessage: String): SealedResult()

fun main() {
    val resultWithFlags = ResultWithFlags(isSuccess = true, someData = "Hello, World!")
    resultWithFlags.onSuccess { println("Success, yay! $someData") }.onError { println("Error, nay! $errorMessage") }

    val sealedResult: SealedResult = Error("Bye, World!")
    when(sealedResult) {
        is Success -> println("Success, yay! ${sealedResult.someData}")
        is Error -> println("Error, nay! ${sealedResult.errorMessage}")
    }
}