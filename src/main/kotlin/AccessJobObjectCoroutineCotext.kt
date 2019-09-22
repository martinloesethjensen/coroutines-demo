import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = launch {
        println("isActive: ${coroutineContext[Job]?.isActive}")
    }

    job.join()
}