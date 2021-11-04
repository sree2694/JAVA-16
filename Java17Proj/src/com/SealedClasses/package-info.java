package com.SealedClasses;

//Sealed Classes and Interfaces restrict which other classes or interfaces may extend or implement them

//1.The Sealed class and its permitted subclasses must belong to the same module, and, if declared in an unnamed module, the same package

//2. Every permitted subclass must directly extend the sealed class

//3. Every permitted subclass must choose a modifier (Final, Non-sealed, sealed) to describe how it continues the sealing initiated by its superclass.
