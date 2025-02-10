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

  val myObject2 = new MyClass()
  myObject2.updateValue(10)
  println(myObject.getValue()) //This will print 5, which is expected
  println(myObject2.getValue()) //This will print 10

  //If you want to share state between objects, consider using a singleton or companion object
  object SharedState {
    var sharedValue: Int = 0
  }

  SharedState.sharedValue = 15
  println(SharedState.sharedValue) //Will print 15
}
```