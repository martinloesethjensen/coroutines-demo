import kotlinx.coroutines.*
import kotlin.time.ExperimentalTime
import kotlin.time.milliseconds
import kotlin.time.seconds

@ExperimentalTime
fun main() = runBlocking {
    val job = launch {
        try {
            repeat(1000) {
                yield()
                print(".")
                Thread.sleep(10.milliseconds.toLongMilliseconds())
            }
        } catch (ex: CancellationException) {
            println()
            println("Cancelled")
        }
    }

    delay(2.5.seconds.toLongMilliseconds())
    job.cancelAndJoin()
}