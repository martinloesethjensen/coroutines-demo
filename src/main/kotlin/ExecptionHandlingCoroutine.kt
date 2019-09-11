import kotlinx.coroutines.*
import kotlin.time.ExperimentalTime
import kotlin.time.milliseconds
import kotlin.time.seconds

@ExperimentalTime
fun main() = runBlocking {
    val job = launch {
        try {
            repeat(1000) {
                yield() // throws exception that is being handled in catch
                print(".")
                Thread.sleep(10.milliseconds.toLongMilliseconds())
            }
        } catch (ex: CancellationException) {
            println()
            println("Cancelled: ${ex.message}")
        } finally {
            run {
                println()
                println("In finally")
            }
        }
    }

    delay(1.seconds.toLongMilliseconds())
    job.cancel(CancellationException("Too many jobs"))
    job.join()
}