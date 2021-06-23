# TodoApp
An interactive TODO app using unidirectional data flow in compose which has a stateful UI that displays an interactive, editable, TODO list.

# We are using
**Jetpack Compose**

**Unidirectional data flow**

**State and events in a UI**

**Architecture Component's ViewModel and LiveData in Compose to manage state**

**Room Database**


# Jetpack Compose Key Notes
**What is state in Jetpack Compose?**

**Answer:** **State** in an application is **any value that can change** over time.

For example it may be a value stored in a Room database, a variable on a class, or even the current value read from an accelerometer.


**What is an Observable?**

**Answer:** An **observable** is any state object that provides a way for anyone to listen for changes to that state.

For example, *LiveData*, *StateFlow*, *Flow*, and *Observable* are all observable.


**What is Unidirectional data flow?**

**Answer:** **Unidirectional data flow** is a design where events flow *up* and state flows *down*.

For example, in a **ViewModel** events are passed up with method calls from the UI while state flows *down* using **LiveData**.

It's not just a term to describe **ViewModel** – any design where events flow up and state goes down is unidirectional.
