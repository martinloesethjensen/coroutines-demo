import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.Thread.sleep
import kotlin.concurrent.thread
import kotlin.time.ExperimentalTime
import kotlin.time.seconds

@ExperimentalTime
fun main() = runBlocking {

    GlobalScope.launch {
        delay(1.seconds.toLongMilliseconds()) // does not block the thread
        print("world")
    }

    print("Hello, ")

    doWork()


//    Not coroutines
//    thread {
//        sleep(1000)
//        print("world")
//    }
//
//    print("Hello, ")
//    sleep(1500)

}

@ExperimentalTime
suspend fun doWork() {
    delay(1.5.seconds.toLongMilliseconds())
}
