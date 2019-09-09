import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.ExperimentalTime
import kotlin.time.seconds

@ExperimentalTime
fun main() = runBlocking {

    val job = GlobalScope.launch {
        delay(1.seconds.toLongMilliseconds()) // does not block the thread
        print("world")
    }

    print("Hello, ")

    job.join()

}