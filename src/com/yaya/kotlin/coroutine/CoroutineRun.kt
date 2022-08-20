package coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    CoroutineRun().firstCoroutine()
}

class CoroutineRun {

    fun firstCoroutine() {
        runBlocking {
            val job = launch {
                doWorld()
            }
            println("Hello, thread: ${Thread.currentThread()}")
            job.join()
            println("Done")
        }
        println("Finally Done")
    }

    fun loadedTest() {
        runBlocking {
            repeat(100000) {
                launch {
                    delay(5000L)
                    println("$it . ${Thread.currentThread()}")
                }
            }
        }
    }

    private suspend fun doWorld() {
        coroutineScope {
            launch {
                delay(2000L)
                println("World2! thread: ${Thread.currentThread()}")
            }
            launch {
                delay(1000L)
                println("World1! thread: ${Thread.currentThread()}")

            }
        }
    }

}