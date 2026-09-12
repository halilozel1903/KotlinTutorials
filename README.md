# Kotlin Tutorials

![Project image](kotlin2023.jpeg)

A structured Kotlin learning repository that starts with the language fundamentals and progresses to modern Kotlin 2.4 patterns used in production. Every lesson is a small, runnable file.

## Requirements

- JDK 21 or newer (Gradle can provision a matching toolchain if one is missing)
- No separate Gradle install — use the wrapper in this repo

## Stack

| Component | Version |
|---|---|
| Kotlin | `2.4.20` |
| Gradle Wrapper | `9.7.1` |
| JVM toolchain | `21` |
| Coroutines | `kotlinx-coroutines-core:1.11.0` |
| Serialization | `kotlinx-serialization-json:1.11.0` |
| Tests | `kotlin("test")` + JUnit 6.1.3 |

Versions are centralized in `gradle/libs.versions.toml`.

## Run

```bash
./gradlew clean build
./gradlew test
./gradlew run --args='list'
./gradlew run --args='run variables'
./gradlew runAllLessons
./gradlew runModern
```

| Task | What it does |
|---|---|
| `run` | Lesson index / single-lesson runner (`LessonsRunner.kt`) |
| `runAllLessons` | Every non-interactive foundation lesson in one pass |
| `runModern` | Modern track entrypoint (`modern2026/Modern2026Runner.kt`) |

You can also open any lesson file and run its `main()` from the IDE.

## Curriculum

| Track | Focus | Key files | Level | Time |
|---|---|---|---|---|
| Foundations | Variables, types, conversions, operators | `Variables.kt`, `BasicTypes.kt`, `TypeConversion.kt`, `ArithmeticOperators.kt`, `AssignmentOperators.kt` | Beginner | 4-6 hours |
| Input & flow | Console I/O and branching | `InputOutput.kt`, `IfExpression.kt`, `IfElseIfExpression.kt`, `When.kt` | Beginner | 3-4 hours |
| Loops & ranges | Iteration and loop control | `ForLoop.kt`, `WhileLoop.kt`, `DoWhileLoop.kt`, `Range.kt`, `Break.kt`, `Continue.kt`, `InOperator.kt` | Beginner | 4-5 hours |
| Collections | Arrays and maps | `Arrays.kt`, `MapExample.kt` | Beginner | 2-3 hours |
| Functions | Declarations, overloading, recursion, infix, extensions | `Functions.kt`, `MethodOverloading.kt`, `RecursiveFunction.kt`, `InfixFunction.kt`, `ExtensionFunction.kt` | Beginner → Intermediate | 5-7 hours |
| Object-oriented Kotlin | Classes, constructors, inheritance, interfaces | `ClassObjects.kt`, `Constructor.kt`, `Inheritance.kt`, `InterfaceSample.kt`, `VisibilityModifiers.kt`, `AbstractClass.kt` | Intermediate | 6-8 hours |
| Data modeling | Data classes, sealed types, companion objects | `DataClass.kt`, `SealedClass.kt`, `CompanionObject.kt`, `OperatorOverloading.kt` | Intermediate | 4-5 hours |
| Modern Kotlin | Value classes, `Result`, scope functions, state modeling | `modern2026/ValueClassAndTypeSafety2026.kt`, `modern2026/ResultAndScopeFunctions2026.kt`, `modern2026/SealedAndDataObject2026.kt` | Intermediate → Advanced | 4-6 hours |
| Concurrency | Coroutines, structured concurrency, Flow | `modern2026/CoroutinesFlow2026.kt` | Advanced | 3-4 hours |
| Serialization | Type-safe JSON encode / decode | `modern2026/Serialization2026.kt` | Advanced | 2-3 hours |
| Testing | Smoke checks for the modern lessons | `src/test/kotlin/modern2026/Modern2026SmokeTest.kt` | Intermediate | 2-3 hours |

Total guided time: about **39-54 hours**.

## Learning outcomes

After finishing the full path, you should be able to:

- Write clear, idiomatic Kotlin for everyday development
- Model domain states safely with sealed types and value classes
- Build asynchronous pipelines with coroutines and Flow
- Encode and decode typed JSON payloads
- Run and verify a Kotlin project with Gradle and tests

## Kotlin 2.4 notes

This repository is aligned with Kotlin 2.4.20 and the official coding style:

- `readlnOrNull()` instead of the deprecated `readLine()`
- `data object` for singleton sealed states
- `@JvmInline value class` for type-safe wrappers
- `Result` plus scope functions for fallible work
- `tailrec` for stack-safe recursion
- Version catalog (`gradle/libs.versions.toml`) for a single source of truth

## References

- [Kotlin documentation](https://kotlinlang.org/docs/home.html)
- [Coroutines overview](https://kotlinlang.org/docs/coroutines-overview.html)
- [Serialization](https://kotlinlang.org/docs/serialization.html)
- [kotlinx.coroutines](https://github.com/Kotlin/kotlinx.coroutines)
- [kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization)

## License

This project is released under the [MIT License](LICENSE).

```
MIT License

Copyright (c) 2026 Halil Ozel

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
