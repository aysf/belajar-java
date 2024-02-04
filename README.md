# Belajar Java

## Installation

ref:
- https://www.happycoders.eu/java/how-to-switch-multiple-java-versions-windows/
- https://gist.github.com/EugenMayer/10b79dccf2a48c01c7b0e6cd11e0ce2c
- https://sdkman.io/
- https://www.jenv.be/


## Numeric Primitive Data Type

| Data Type | Bits | Minimum                                                                         | Maximum       |
| --------- | ---- | ------------------------------------------------------------------------------- | ------------- |
| `byte`    | 8    | -128                                                                            | 127           |
| `short`   | 16   | -32,768                                                                         | 32,768        |
| `int`     | 32   | -2,147,483,648                                                                  | 2,147,483,648 |
| `long`    | 64   | -9.22337E+18                                                                    | 9.22337E+18   |
| `float`   | 32   | [See the docs](https://docs.oracle.com/javase/8/docs/api/java/lang/Float.html)  |
| `double`  | 64   | [See the docs](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |

- Java class library includes helper classes for each primitive.
- Helper classes support conversion and formatting tools.

| Data Type | Helper Class |
| --------- | ------------ |
| `byte`    | `Byte`       |
| `short`   | `Short`      |
| `int`     | `Integer`    |
| `long`    | `Long`       |
| `float`   | `Float`      |

### Helper Class Example

- java.lang.Double support `double` valuse

```java
double doubleValue = 156.3d;
Double doubleObj = new Double(doubleValue);
byte byteValue = doubleObj.byteValue();
int intValue = doubleObj.intValue();
float floatValue = doubleObj.floatValue();
String strValue = doubleObj.toString();
```

### Primitive Numeric Default

- Primitive numeric variables default to 0

```java
int myInt;
System.out.println("the value of myInt is " + myInt);
```

## Using Java Operators

- Assignment
- Incrementing/Decrementing
- Postfix vs Previx Incrementing
- Comparing Values

| Operator     | Purpose               |
| ------------ | --------------------- |
| `==`         | equal                 |
| `!=`         | not equal             |
| `>`          | greater than          |
| `<`          | less than             |
| `>=`         | greater than or equal |
| `<=`         | less than or equal    |
| `instanceof` | class membership      |

example `instanceof`:

```java
String s = "Hello";
if (s instanceof java.lang.String) {
    System.out.println("s is a string");
}
```

- Comparing strings

```java
String s1 = "Hello";
String s2 = "Hello";
if (s1.equal(s2)) {
    System.out.println("they are match");
} else {
    System.out.println("no match!");
}
```

- Logical Operators

| Operator | Purpose                          |
| -------- | -------------------------------- |
| `&&`     | And                              |
| `\|\|`   | Or                               |
| `?:`     | Ternary (short hand for if-then) |

example ternary:

```java
String s = condition ? trueValue : falseValue;
```

## Java Classes Define Objects

- An object is an instance of a class
- Nonprimitive variables are references to objects
- Objects can have multiple references

Example:

```java
public class ClothingItem {

    // an instance variable a.k.a. a field
    // since this doesn't have static keyword
    // is NOT a member of the class itself
    // it's a member of the instance of the class
    public String type;

    public static void main(String[] args) {
        // this line has datatype 'ClothingItem' -> the name of the class
        // the identifier -> the name of the variable
        // the keyword 'new'
        // and the constructor method
        // this is called Instantiation
        ClothingItem item = new ClothingItem();
        item.type = "Hat";
        item.displayItem();
    }

    // this is a method without static keyword
    // called instance method
    private void displayItem() {
        System.out.println("this is a " + this.type);
    }

    private void displayItem() {
        System.out.println("this is a " + this.type);
    }
}

```

### String is an object

- String values are instances of `java.lang.String`

Example:

```java
String str = new String("Hello!");
// shortcut
String str = "Hello!";
```

- String objects are immutable

```java
String str = "Halo";
// re-assign like this is not changing object
// but in fact, in the background, java direfrencing
// the original object. the object can now be cleared
// from memory in the process know as garbage collection
String str = "Hai";
```

### Char Array to String

```java
public class Main {
    public static void main(String[] args) {
        char[] chars = {'H', 'a', 'l', 'o'};
        String s = new String(chars);
        System.out.println(s);
    }
}
```
