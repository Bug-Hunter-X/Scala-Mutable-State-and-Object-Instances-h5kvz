# Scala Mutable State and Object Instances

This example demonstrates a potential source of confusion for developers new to Scala (and object-oriented programming in general):  the distinction between mutable state within a class and instances of that class.  Modifications to one instance do not affect other instances, even if they share the same class definition. This is expected behavior, but can lead to unexpected results if not carefully considered.

The `bug.scala` file contains code that creates two instances of `MyClass`, modifies the internal state of one, and then shows that the other instance remains unchanged. The solution demonstrates best practices to manage the states properly.
