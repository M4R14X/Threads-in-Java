# Threads-in-Java
This small project demonstrates how Java threads work, how they are created, and how they can be synchronized to ensure safe and efficient execution in concurrent environments.
## Thread Creation
The **Producer** and **Consumer** classes both extend **Thread**.
Each thread is associated with a shared resource: the **Stock** class.
Extending **Thread** is one way to create threads; another common way is implementing the **Runnable** interface.

## Thread Life Cycle
The **run** method contains the logic executed by the thread.
The Producer continuously generates products and adds them to the stock, while the Consumer continuously removes products from the stock.
Both threads are started using the **start()** method. This method transitions the thread from the **new** state to the **runnable** state, and the **run()** method defines the task.

## Synchronization
### In the Stock class:
**addProduct** and **removeProduct** are **synchronized** to prevent concurrent access by multiple threads. This ensures thread safety, avoids race conditions and prevent deadlocks.
## Inter-Thread Communication
**wait()** and **notifyAll()** methods are used for communication between threads.
 Producer waits if the stock is full and notifies all threads after producing a product.
 Consumer waits if the stock is empty and notifies all threads after consuming a product.
**wait()** makes a thread release the lock and enter the **waiting** state until notified.
 **notifyAll()** wakes up all waiting threads, enabling coordination between threads.

These threads **sleep** for **1000 milliseconds** to simulate production and consumption time.
