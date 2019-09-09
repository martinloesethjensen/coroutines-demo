import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test
import kotlin.time.ExperimentalTime

@ExperimentalTime
class SimpleTest {

    @Test
    fun firstTest() {
//        doWork()
        Assert.assertEquals(2, 1 + 1)
    }

    @Test
    fun secondTest() = runBlocking {
        doWork()
        Assert.assertEquals(2, 1 + 1)
    }

}