# Kotlin Tutorials - 2026 Professional Edition

![Project image](kotlin2023.jpeg)

A structured Kotlin learning repository that starts with fundamentals and progresses to modern Kotlin 2.x patterns used in production.

## Stack
- Kotlin: `2.0.21`
- Gradle Wrapper: `9.0.0`
- JVM Toolchain: `17`
- Coroutines: `kotlinx-coroutines-core:1.10.2`
- Serialization: `kotlinx-serialization-json:1.8.1`
- Tests: `kotlin("test")` + JUnit 5

## Run
```bash
./gradlew clean build
./gradlew test
./gradlew run
./gradlew runLessons
```

- `run` executes the modern track entrypoint: `modern2026/Modern2026Runner.kt`
- `runLessons` executes the root lesson index runner: `src/main/kotlin/LessonsRunner.kt`

## Curriculum (2026)

| Track | Focus | Key Files | Level | Estimated Time |
|---|---|---|---|---|
| Foundations | Variables, types, conversions, operators | `Variables.kt`, `BasicTypes.kt`, `TypeConversion.kt`, `ArithmeticOperators.kt`, `AssignmentOperators.kt` | Beginner | 4-6 hours |
| Input & Flow | Console I/O and branching | `InputOutput.kt`, `IfElseIfExpression.kt`, `ifExpression.kt`, `When.kt` | Beginner | 3-4 hours |
| Loops & Ranges | Iteration and loop control | `ForLoop.kt`, `WhileLoop.kt`, `DoWhileLoop.kt`, `Range.kt`, `Break.kt`, `Continue.kt`, `InOperator.kt` | Beginner | 4-5 hours |
| Functions | Declarations, overloading, recursion, infix, extension | `Functions.kt`, `MethodOverloading.kt`, `RecursiveFunction.kt`, `InfixFunction.kt`, `ExtensionFunction.kt` | Beginner -> Intermediate | 5-7 hours |
| Object-Oriented Kotlin | Classes, constructors, inheritance, interfaces | `ClassObjects.kt`, `Constructor.kt`, `Inheritance.kt`, `InterfaceSample.kt`, `VisibilityModifiers.kt`, `AbstractClass.kt` | Intermediate | 6-8 hours |
| Data Modeling | Data classes, sealed classes, companion object | `DataClass.kt`, `SealedClass.kt`, `CompanionObject.kt`, `OperatorOverloading.kt` | Intermediate | 4-5 hours |
| Modern Kotlin 2026 | Value classes, Result, scope functions, state modeling | `modern2026/ValueClassAndTypeSafety2026.kt`, `modern2026/ResultAndScopeFunctions2026.kt`, `modern2026/SealedAndDataObject2026.kt` | Intermediate -> Advanced | 4-6 hours |
| Concurrency & Streams | Coroutines, structured concurrency, Flow pipelines | `modern2026/CoroutinesFlow2026.kt` | Advanced | 3-4 hours |
| Serialization | Type-safe JSON encode/decode | `modern2026/Serialization2026.kt` | Advanced | 2-3 hours |
| Testing | Smoke checks for modern lessons | `src/test/kotlin/modern2026/Modern2026SmokeTest.kt` | Intermediate | 2-3 hours |

Total guided time: approximately **37-51 hours**.

## Learning Outcomes
After finishing the full path, you should be able to:
- Write clear, idiomatic Kotlin for everyday development.
- Model domain states safely with modern Kotlin features.
- Build asynchronous data pipelines with coroutines and Flow.
- Serialize and validate typed JSON payloads.
- Run and verify Kotlin projects with Gradle and tests.

## References
- https://kotlinlang.org/docs/home.html
- https://kotlinlang.org/docs/coroutines-overview.html
- https://kotlinlang.org/docs/serialization.html
- https://github.com/Kotlin/kotlinx.coroutines
- https://github.com/Kotlin/kotlinx.serialization

## License
MIT License
