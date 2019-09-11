import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull
import kotlinx.coroutines.yield

fun main() = runBlocking {
    val job = withTimeoutOrNull(100) {
        repeat(1000) {
            yield()
            print(".")
            Thread.sleep(1)
        }
    }

    if (job == null) {
        print("timed out")
    }

    delay(100)
}