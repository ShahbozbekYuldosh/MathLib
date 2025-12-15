# MyMathLibrary

## UML Diagram (Text-based)

```
                +----------------------+
                |   MathOperation      |  <<interface>>
                +----------------------+
                | + calculate(args)    |
                | + getName()          |
                +----------+-----------+
                           |
        -----------------------------------------------
        |        |        |        |        |        |
+--------------+  +--------------+  +--------------+  ...
| AbsoluteValue|  |   ArcSine    |  |   ArcCosine  |
+--------------+  +--------------+  +--------------+
| calculate()  |  | calculate()  |  | calculate()  |
| getName()    |  | getName()    |  | getName()    |
+--------------+  +--------------+  +--------------+

(All mathematical classes implement MathOperation)

+----------------------+
|     MathLibrary      |
+----------------------+
| - operations[]      |
+----------------------+
| + getOperation()    |
| + displayAllOps()   |
+----------------------+
```

---

## README.md (English)

### 📘 MyMathLibrary

MyMathLibrary is a **custom mathematical library written from scratch in Java**, without using `java.lang.Math`. The library is built using **Object-Oriented Programming (OOP)** principles and implements core mathematical functions using numerical methods such as **Taylor series** and **Newton–Raphson method**.

### ✨ Features

* Absolute value (int & double)
* Trigonometric functions: sin, cos, tan
* Inverse trigonometric functions: asin, acos, atan
* Exponential and logarithmic functions
* Power, square root, modulo, floor, ceil
* Fully extensible OOP design

### 🧱 Architecture

* `MathOperation` interface defines a common contract
* Each mathematical operation is implemented in its own class
* `MathLibrary` acts as a facade for accessing all operations

### 🛠 Example Usage

```java
MathLibrary lib = new MathLibrary();
double result = lib.getOperation(11).calculate(2, 3); // pow(2,3)
```

### 🎯 Purpose

This project is ideal for:

* Learning numerical methods
* Understanding OOP principles
* Portfolio
---

## README.md (O'zbekcha)

### 📘 MyMathLibrary

MyMathLibrary — bu **Java tilida 0 dan yozilgan matematik kutubxona** bo‘lib, `Math` klassidan foydalanilmagan. Kutubxona **OOP tamoyillari** asosida qurilgan va **Taylor seriyasi**, **Newton usuli** kabi matematik algoritmlarga tayangan.

### ✨ Imkoniyatlar

* Absolyut qiymat (butun va haqiqiy sonlar)
* Trigonometrik funksiyalar: sin, cos, tan
* Teskari trigonometrik funksiyalar: asin, acos, atan
* Eksponenta va logarifm
* Daraja, kvadrat ildiz, qoldiq, floor va ceil

### 🧱 Arxitektura

* `MathOperation` — umumiy interfeys
* Har bir funksiya alohida klassda
* `MathLibrary` — barcha funksiyalarni boshqaruvchi markaziy klass

### 🛠 Foydalanish namunasi

```java
MathLibrary kutubxona = new MathLibrary();
double natija = kutubxona.getOperation(13).calculate(16); // sqrt(16)
```

### 🎯 Maqsad

Ushbu loyiha:

* OOP tushunchalarini mustahkamlash
* Matematik algoritmlarni tushunish

---

👨‍💻 Muallif: Shokhbosbek Yuldosh
