import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.ExperimentalTime
import kotlin.time.milliseconds
import kotlin.time.seconds

@ExperimentalTime
fun main() = runBlocking {
    val job = launch {
        repeat(1000) {
            delay(100.milliseconds.toLongMilliseconds())
            print(".")
        }
    }

    delay(2.5.seconds.toLongMilliseconds())

//    job.cancel()
//    job.join()
    job.cancelAndJoin()

    println("done")

}