import kotlinx.coroutines.*
import kotlin.time.ExperimentalTime
import kotlin.time.seconds

@ExperimentalTime
fun main() = runBlocking {
    val job = launch {
        repeat(1000) {
            if (!isActive) return@launch
            print(".")
        }
    }

    delay(2.5.seconds.toLongMilliseconds())

    job.cancelAndJoin()

    println("done")
}