package com.SealedClasses;

@SuppressWarnings("preview")
public sealed class Shape permits Circle, Rectangle,Square{

}

final class Circle extends Shape{
	
}

@SuppressWarnings("preview")
sealed class Rectangle extends Shape permits FilledRectangle{
	
}

final class FilledRectangle extends Rectangle{
	
}

@SuppressWarnings("preview")
non-sealed class Square extends Shape{
	
}