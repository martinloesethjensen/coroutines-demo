import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.Thread.sleep
import kotlin.concurrent.thread
import kotlin.time.ExperimentalTime
import kotlin.time.seconds

@ExperimentalTime
fun main() {

    GlobalScope.launch {
        delay(1.seconds.toLongMilliseconds()) // does not block the thread
        print("world")
    }

    print("Hello, ")
    sleep(1500)

//    Not coroutines
//    thread {
//        sleep(1000)
//        print("world")
//    }
//
//    print("Hello, ")
//    sleep(1500)

}