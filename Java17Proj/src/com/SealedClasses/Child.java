package com.SealedClasses;

@SuppressWarnings("preview")
public sealed class Child extends Parent permits OtherChild,AnotherChild{

}
