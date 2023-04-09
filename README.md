# Belajar Java

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
