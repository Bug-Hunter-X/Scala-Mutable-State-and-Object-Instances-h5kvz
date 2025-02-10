```scala
class MyClass {
  private var internalValue: Int = 0

  def updateValue(newValue: Int): Unit = {
    internalValue = newValue
  }

  def getValue(): Int = {
    internalValue
  }
}

object Main extends App {
  val myObject = new MyClass()
  myObject.updateValue(5)
  println(myObject.getValue()) //This will print 5

  val myObject2 = new MyClass() //this is a different instance of the class
  myObject2.updateValue(10)
  println(myObject.getValue()) //This will also print 5, not 10 because they are different instances
}
```