var myArr = Array(10,20,30,50,600)
println(myArr.length)
myArr.getClass
myArr(0)
myArr(1)
myArr(4)
myArr(myArr.length-1)
myArr.drop(1)
myArr.take(1)
myArr.last
myArr(3) = 9000
//i am overwriting old array with new array
myArr = myArr :+ 555
myArr
//so I can not overwrite with different type
// myArr = "Different type"
//so Array of strings will not work either
//myArr = Array("Valdis", "Peteris", "Līga")
myArr = Array(3,32,52,2,6,1,-66262,0,55)
myArr
myArr :++  Array(5,7,10)
myArr
res12
myArr.min
myArr.max
myArr.reverse
val newArr = myArr :+ 652525
newArr.slice(2,6)
val insertedArr = newArr.slice(0,6) :++ Array(10,20,30) :++ newArr.slice(6,9)
insertedArr
insertedArr.contains(10)
insertedArr.contains(11)
insertedArr.indexOf(10)
insertedArr(6)
insertedArr.dropRight(2)
insertedArr.take(2)
insertedArr.sum
insertedArr.product
insertedArr(10)
insertedArr.length
val noZero = insertedArr.slice(0,10) :++ insertedArr.slice(11,insertedArr.length)
noZero
noZero.product
noZero.sum
noZero.foreach(println)