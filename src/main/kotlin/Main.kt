fun main() {
  println(checkNum(4))
    words()
    version()
    dateTime()
    println(details("Kesa"))
}

//Question1
//Write a Kotlin program to check if a given number is even or odd.
fun checkNum(num:Int){
    if(num%2==0){
        println("$num is even")
    }
    else{
        println("$num is odd")
    }
}

//Question 2
//Write a Kotlin program to print 'Hello' on screen and your name on a separate line
fun words(){
    val greeting = "Hello"
    val myName = "Edna Kesa"
    println(greeting)
    println(myName)
}

//Question3
//Write a Kotlin program to find out what version of Kotlin you are using.
fun version() {
    val kotlinVersion = "KotlinVersion.CURRENT"
    println("kotlinVersion: ${KotlinVersion}")
}

//Question4
//Write a Kotlin program to display the current date and time.
fun dateTime(){
    var dateToday = "date"
    var time = "currentTime"
    var dateFormat = "mm/dd/yyy"

    println(dateFormat)
    println(time)
}

//Question5
//Write a Kotlin program to take user input and display it
fun details(args: String){
    if (args.isNotEmpty()) {
        val myName = "Kesa"
        println("Entered name: $myName")
    } else {
        println("No name provided")
    }
}
