import java.awt.Robot
import java.awt.event.KeyEvent
import java.util.concurrent.TimeUnit

val r = Robot()
fun main(args : Array<String>){
    end()

    altTab()

    levelStart()

    sleep(300)

    segmentOne()

    sleep(13300)

    segmentTwo()

    sleep(9900)

    segmentThree()

    sleep(13500)

    segmentFour()

    sleep(14000)

    segmentFive()

    sleep(10000)

    segmentSix()
}

fun segmentSix(){
    //levelStart()

    boxStart()
    sleep(100)
    rightStart()
    sleep(300)
    boxEnd()

    sleep(1100)

    jumpStart()
    sleep(100)
    jumpEnd()
    sleep(600)
    boxStart()
    sleep(100)
    boxEnd()

    sleep(300)

    twoRight()

    sleep(100)

    boxEnd()

    sleep(1300)

    jumpStart()
    sleep(100)
    jumpEnd()
    sleep(600)
    boxStart()
    sleep(100)
    boxEnd()

    sleep(100)

    rightEnd()
    boxStart()
    sleep(100)
    upStart()
    sleep(100)
    upEnd()
    sleep(100)
    rightStart()
    sleep(100)
    boxEnd()

    sleep(1500)

    hook()

    sleep(100)

    twoRight()
    sleep(100)
    boxEnd()

    sleep(1500)

    hook()

    sleep(1000)

    upStart()

    sleep(500)

    end()
}

fun segmentFive(){
    //levelStart()

    boxStart()
    sleep(100)
    rightStart()
    sleep(300)
    boxEnd()

    sleep(1100)

    jumpStart()
    sleep(100)
    jumpEnd()
    sleep(600)
    boxStart()
    sleep(100)
    boxEnd()

    sleep(300)

    rightEnd()
    boxStart()
    sleep(100)
    rightStart()
    sleep(300)
    boxEnd()

    sleep(1300)

    boxStart()
    sleep(300)
    jumpStart()
    boxEnd()

    sleep(2500)

    jumpEnd()

    twoUpRight()
    sleep(100)
    boxEnd()
    sleep(300)
    hook()

    sleep(2000)

    jumpStart()

    sleep(2000)

    upStart()

    sleep(500)

    end()
}

fun segmentFour(){
    //levelStart()

    twoUpRight()

    sleep(100)
    boxEnd()

    sleep(1700)

    jumpStart()
    sleep(100)
    jumpEnd()
    sleep(500)
    boxStart()
    sleep(100)
    boxEnd()

    sleep(300)

    twoUpRight()

    sleep(100)
    boxEnd()

    sleep(2500)

    hook()

    sleep(300)

    twoRight()
    sleep(100)
    boxEnd()

    sleep(2450)

    hook()

    sleep(900)

    upStart()

    sleep(500)

    end()
}

fun hook(){
    jumpStart()
    sleep(100)
    jumpEnd()
    sleep(500)
    boxStart()
    sleep(100)
    boxEnd()
}

fun twoUpRight(){
    rightEnd()
    boxStart()
    sleep(100)
    upStart()
    sleep(100)
    upEnd()
    sleep(100)
    upStart()
    sleep(100)
    upEnd()
    sleep(100)
    rightStart()
}

fun segmentThree(){
    //levelStart()

    twoRight()
    sleep(100)
    boxEnd()

    sleep(1500)

    jumpStart()

    sleep(100)

    jumpEnd()

    sleep(500)

    boxStart()

    sleep(100)

    boxEnd()

    sleep(500)

    twoRight()
    sleep(100)
    boxEnd()

    sleep(700)

    jumpStart()

    sleep(100)

    jumpEnd()

    sleep(500)

    boxStart()

    sleep(100)

    boxEnd()

    sleep(1400)

    twoRight()
    sleep(100)
    boxEnd()

    sleep(700)

    jumpStart()

    sleep(100)

    jumpEnd()

    sleep(500)

    boxStart()

    sleep(100)

    boxEnd()

    sleep(1700)

    upStart()

    sleep(500)

    end()
}

fun twoRight(){
    rightEnd()
    boxStart()
    sleep(100)
    rightStart()
    sleep(100)
    rightEnd()
    sleep(100)
    rightStart()
}

fun segmentTwo(){
    //levelStart()

    rightStart()
    sleep(1000)

    forwardOver()

    sleep(1300)

    jumpStart()
    sleep(100)
    jumpEnd()

    sleep(500)

    forwardOver()

    sleep(3600)

    forwardOver()

    sleep(500)

    forwardOver()

    sleep(1700)

    upStart()

    sleep(500)

    end()
}

fun forwardOver(){
    rightEnd()
    boxStart()
    sleep(100)
    rightStart()
    sleep(100)
    boxEnd()
    sleep(100)
    downStart()
    sleep(100)
    downEnd()

    sleep(300)

    jumpStart()
    sleep(100)
    jumpEnd()
    sleep(350)
    jumpStart()
    sleep(100)
    jumpEnd()
}

fun segmentOne(){
    //levelStart()

    rightStart()
    sleep(1700)
    jumpStart()
    sleep(100)
    jumpEnd()

    sleep(1765)

    jumpStart()
    sleep(100)
    jumpEnd()
    sleep(350)
    jumpStart()
    sleep(100)
    jumpEnd()

    sleep(2100)

    jumpStart()
    sleep(100)
    jumpEnd()

    sleep(2700)

    rightEnd()
    boxStart()
    sleep(100)
    rightStart()
    sleep(100)
    boxEnd()
    sleep(100)
    downStart()
    sleep(100)
    downEnd()

    sleep(300)

    jumpStart()
    sleep(100)
    jumpEnd()
    sleep(350)
    jumpStart()
    sleep(100)
    jumpEnd()

    sleep(2300)

    upStart()

    sleep(500)

    end()
}

fun end(){
    rightEnd()
    jumpEnd()
    r.keyRelease(KeyEvent.VK_A)
    boxEnd()
    upEnd()
    downEnd()
}

fun sleep(length:Long){
    TimeUnit.MILLISECONDS.sleep(length)
}

fun levelStart(){
    r.keyPress(KeyEvent.VK_A)
    sleep(5000)
}

fun moveLeft(length: Long){
    r.keyPress(KeyEvent.VK_LEFT)
    sleep(length)
    r.keyRelease(KeyEvent.VK_LEFT)
}

fun rightStart(){
    r.keyPress(KeyEvent.VK_RIGHT)
}

fun boxStart(){
    r.keyPress(KeyEvent.VK_X)
}

fun boxEnd(){
    r.keyRelease(KeyEvent.VK_X)
}

fun upStart(){
    r.keyPress(KeyEvent.VK_UP)
}

fun upEnd(){
    r.keyRelease(KeyEvent.VK_UP)
}

fun downStart(){
    r.keyPress(KeyEvent.VK_DOWN)
}

fun downEnd(){
    r.keyRelease(KeyEvent.VK_DOWN)
}

fun rightEnd(){
    r.keyRelease(KeyEvent.VK_RIGHT)
}

fun jumpStart(){
    r.keyPress(KeyEvent.VK_S)
}

fun jumpEnd(){
    r.keyRelease(KeyEvent.VK_S)
}

fun altTab(){
    r.keyPress(KeyEvent.VK_ALT)
    r.keyPress(KeyEvent.VK_TAB)
    r.keyRelease(KeyEvent.VK_ALT)
    r.keyRelease(KeyEvent.VK_TAB)
    sleep((500).toLong())
}