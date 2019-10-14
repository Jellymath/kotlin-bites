import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main()  {
    coroutineScope {
        launch {
            delay(3000)
            println('A')
        }
        launch {
            delay(2000)
            println('B')
        }
        launch {
            delay(1000)
            println('C')
        }
    }
}