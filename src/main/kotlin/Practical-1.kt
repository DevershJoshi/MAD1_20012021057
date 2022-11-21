fun main(){
    print("Enter an integer :
        ") val myNumber =
                readLine()!!
                println("Integer Value : $myNumber")
                print("Enter a Float Value : ")
        val myFloat = readLine()
    println("Float Value : $myFloat")
    print("Enter Character :
        ") val myLetter =
                readLine()
                println("Character value : $myLetter")
                print("Enter String value : ")
        val myText = readLine()
    println("String value : $myFloat")
    print("Enter Boolean value :
        ") val myBoolean = readLine()
                println("Boolean value : $myBoolean")
                print("Enter Double value :
        ") val myDouble = readLine()
                println("double value : $myDouble")
                print("Enter Long value :
        ") val myLong = readLine()
                println("Long value : $myLong")
                print("Enter Short value :
        ") val myShort = readLine()
                println("Short value : $myShort")
                print("Enter Byte value : ")
        val myByte = readLine()
    println("Byte value : $myByte")
}


fun main(){ var int = 10
    val double: Double = int.toDouble()
    print(double)
    var string = "123" val int1 : Int =
        string.toInt() println(int1)
    var db: Double = string.toDouble()
    println(db)
}


fun main(){
    print("Enter enrollment number :
        ") val Enrollment_input =
                readLine()
                print("Enter Name : ")
        var Name_input = readLine()
    print("Enter Branch : ")
    var Branch_input = readLine()
    print("Enter Class : ")
    var Class_input = readLine()
    print("Enter batch : ")
    var Batch_input = readLine()
    print("Enter College name :
        ") var College_input =
                readLine()
                print("Enter University name :
        ") var University_input =
                readLine()
                print("Enter age : ")
        var age_input = readLine()
    println("***********************************************")
    println("Student Enrollment number : $Enrollment_input")
    println("Student Name : $Name_input") println("Student
            branch : $Branch_input") println("Student Class :
    $Class_input") println("Student batch : ")
    println("Student college name : $College_input")
    println("Student university name : $University_input")
    println("Student age : $age_input")
}



import java.util.*
fun main(){
    val reader = Scanner(System.`in`)
    print("Enter Number : ")
    var num = reader.nextInt()
    if(num % 2 == 0)
        println("$num is EVEN")
    else
        println("$num is ODD")
}


fun main(){
    print("Enter Month number : ")
    val number = readLine()
    val Number_input = when (number)
    {
        "1" -> "January"
        "2" -> "February"
        "3" -> "March"
        "4" -> "April"
        "5" -> "May"
        "6" -> "June"
        "7" -> "July"
        "8" -> "August"
        "9" -> "September"
        "10" -> "Octomber"
        "11" -> "November"
        "12" -> "December"
        else -> "Invalid Month"
    }
    println(Number_input)
}



import java.util.*
fun main(){
    val reader = Scanner(System.`in`)
    print("Enter your choice : \n 1. Addition \n 2. Multiplication \n 3. Division \n
        4. Substraction ")
        var ch = reader.nextInt()
    print("Num 1 : ") var
            num1 = reader.nextInt()
    print("Num2 : ")
    var num2 = reader.nextInt()
    print("Num3 : ")
    var num3 = reader.nextInt()
    if(ch==1)
    {
        var result = num1+num2+num3
        print("Addition of $num1, $num2, $num3 is $result")
    }
    else if(ch==2)
    {
        var result = num1*num2*num3
        print("Multiplication of $num1, $num2, $num3 is $result")
    }
    if(ch==3)
    {
        var result = num1/num2
        print("Division of $num1, $num2 is $result")
    }
    if(ch==4)
    {
        var result = num1-num2-num3
        print("Substraction of $num1, $num2, $num3 is $result")
    }
}



fun main() { val number = 4 val result:
        Long result = factorial(number)
    println("Factorial without using tailrec!")
    println("Factorial of $number = $result")
    val number2 = 5
    println("Factorial using tailrec!")
    println("Factorial of $number = ${factorial(number)}")
}
fun factorial(n: Int): Long {
    if (n == 1) {
        return n.toLong()
    } else { return
        n*factorial(n - 1)
    } } tailrec fun factorial(n: Int, run: Int =
    1): Long {
    return if (n == 1) run.toLong() else factorial(n-1, run*n)
}



import java.lang.System.console
import java.util.*

fun main() {
    val arr = arrayOf(10, 90, 60, 80, 100)
    println("Create Array-1 by using array0f() method:")
    println(Arrays.toString(arr))
    val arr1 = arrayOf<Int>(0, 0, 0, 0)
    println("Create Array-2 by using array<>() method:")
    println(Arrays.toString(arr1))
    val arr2= Array(8){i->i}
    println("Create Array-3 by using array<>() and lamda function:")
    println(Arrays.toString(arr2))
    val arr3 = intArrayOf(0, 0, 0, 0)
    println("Create Array-4 by using intarray(): ")
    println(Arrays.toString(arr3))
    val arr4 = arrayOf<Int>(12, 10, 1, 5, 18, 19)
    println("Create Array-5 by using intarrayOf():")
    println(arr4.contentToString())
    val ar1 = arrayOf(1,3) val
            ar2= intArrayOf(4,5) val ar3 =
        intArrayOf(6,7) val lala =
        arrayOf(ar1,ar2,ar3)
    println("Create 2D array by using array0f() and IntarrayOf(): ")
    println(Arrays.deepToString(lala))
    var arrayint =
        Array<Int>(5){0} var x:Int = 0
    val abc:Int = arrayint.size
    while( x < abc)
    {
        print("a[$x]=")
        arrayint[x] = readLine()!!.toInt()
        x++

    }

    println("Entered Array: ") for (y in arrayint)
        print("$y ") println("")
    println("Sorted by using inbuilt Function: ") arrayint.sort() for (z
    in arrayint) print("$z ") println("")
    println("Sorted by NOT using inbuilt Function: ") var temp:Int
    for (i in arrayint.indices) {
        for (j in i + 1 until arrayint.size) { if (arrayint[i] >
            arrayint[j]) { temp = arrayint[i]
            arrayint[i] = arrayint[j] arrayint[j] = temp
        }
        } }
    println(Arrays.toString(arrayint))
}


fun main() {
    val numArray = arrayOf(23, 34, 50, 33, 55, 43, 5, 6)
    var largest = numArray[0]
    for (num in numArray)
    { if (largest <
        num) largest =
        num
    }
    println("Largest element = $largest")
}

class Car(type:String, model:String, owner:String, miles:Int, price:Int,
          cprice:Int){
    var Type:String = type
    var Model =model var
    Owner = owner var
            Miles:Int = miles var
    Price:Int = price var
            CPrice:Int = cprice
    fun getCarPrice(){ println("Car Information: $Type , $Model\nCar
            Owner: $Owner\nMiles Driven:
        $Miles\nOriginal Car Price: $Price, Current Car Price: $CPrice ")
    }
}
fun main() {
    var cars = arrayOf(Car("BMW","2018","Aman",105,100000, 98950),
        Car("BMW","2019","Karan",20,400000, 399800),
        Car("Toyota","2017","KJS",100,1080000, 1079000),
        Car("Maruti", "2020", "NPP", 200, 4000000, 3998000))
    println("Creating Car Class Object car1 in next line")
    println("Object of class is created and Init is called.\n-----")
    for (i in cars){
        i.getCarPrice()
    }
}



fun displayProduct(product: Array <IntArray>)
{ println("Product of two matrices is: ")
    for (row in product) { for (column in
    row) { print("$column ")
    }
        println()
    }
} fun multiplyMatrices(firstMatrix: Array
<IntArray>, secondMatrix:
                       Array <IntArray>, r1: Int,
                       c1: Int,
                       c2: Int): Array <IntArray> {
    val product = Array(r1) { IntArray(c2) } for
                                                     (i in 0..r1 - 1) { for (j in 0..c2 - 1) {
        for (k in 0..c1 - 1) {
            product[i][j] += firstMatrix[i][k] * secondMatrix[k][j]
        }
    }
    }
    return product


} fun main(){
    val rows = 3
    val columns = 2
    val firstMatrix = arrayOf(intArrayOf(6, 3), intArrayOf(9,0), intArrayOf(5, 4))
    val secondMatrix = arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4))
    println("Matrix1: (3 * 2 Matrix): ") for (row in firstMatrix) { for
                                                                            (column in row) { print("$column ")
    }
        println()
    }
    println("Matrix2: (3 * 2 Matrix): ")
    for (row in secondMatrix) { for
                                        (column in row) {
        print("$column ")
    }
        println()
    }
    val sum = Array(rows) { IntArray(columns) }
    Practical: 1
    20012011063 | Mihir Patel Page 21
    for (i in 0..rows - 1) {
        for (j in 0..columns - 1) {
            sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j]
        }
    }
    // Displaying the result
    println("Addition: (3 * 2 Matrix): ")
    for (row in sum) { for (column in
    row) { print("$column ")
    }
        println()
    }
    val sab = Array(rows) { IntArray(columns) }
    for (i in 0..rows - 1) { for (j in
    0..columns - 1) {
        sab[i][j] = firstMatrix[i][j] - secondMatrix[i][j]
    }
    }
    // Displaying the result
    println("Subtraction: (3 * 2 Matrix): ")
    for (row in sab) { for (column in
    row) { print("$column ")
    }
        println()
    } val
            r1 = 2 val
            c1 = 3 val
            r2 = 3 val
            c2 = 2
    val firstMatrixx = arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4))
    val secondMatrixx = arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0,
        4))
    val product = multiplyMatrices(firstMatrixx,
        secondMatrixx, r1, c1,
        c2)
    // Displaying the result
    displayProduct(product)
}



