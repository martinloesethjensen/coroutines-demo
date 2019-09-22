import kotlinx.coroutines.*

fun main() = runBlocking {
    val jobs = arrayListOf<Job>()

    // https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-dispatchers/-unconfined.html
    jobs += launch(Dispatchers.Unconfined) {
        // content of the parent, runblocking coroutine
        println("'coroutineContext': I'm working in the thread ${Thread.currentThread().name}")
        delay(100)
        println("'coroutineContext': I'm working in the thread ${Thread.currentThread().name}")
    }

    jobs.forEach { it.join() }

}