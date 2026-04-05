# Kotlin Tutorials - 2026 Professional Edition

![Project image](kotlin2023.jpeg)

This repository is a structured Kotlin learning project that starts with fundamentals and moves toward modern Kotlin 2.x practices used in production.

## What is included
- A large set of topic-focused Kotlin source files under `src/main/kotlin/`.
- A dedicated modern module under `src/main/kotlin/modern2026/`.
- Gradle Kotlin DSL setup (`build.gradle.kts`) with Kotlin 2.x.
- Coroutines, Flow, and Serialization examples.
- Test infrastructure with `kotlin("test")` + JUnit 5.

## Tech stack
- Kotlin: `2.0.21`
- Gradle Wrapper: `9.0.0`
- JVM Toolchain: `17`
- Coroutines: `kotlinx-coroutines-core:1.10.2`
- Serialization: `kotlinx-serialization-json:1.8.1`

## Quick start
Run from the project root:

```bash
./gradlew clean build
./gradlew test
./gradlew run
```

## 2026 curriculum roadmap

| Track | Topics | Key Files | Level | Estimated Time |
|---|---|---|---|---|
| Foundations | Variables, types, operators, input/output | `Variables.kt`, `BasicTypes.kt`, `TypeConversion.kt`, `Input-Output.kt` | Beginner | 4-6 hours |
| Control Flow | `if`, `when`, loops, ranges, branch control | `ifExpression.kt`, `When.kt`, `ForLoop.kt`, `WhileLoop.kt`, `Range.kt`, `Break.kt`, `Continue.kt` | Beginner | 4-5 hours |
| Functions | Function declarations, overloading, recursion, infix, extensions | `Functions.kt`, `MethodOverloading.kt`, `RecursiveFunction.kt`, `InfixFunction.kt`, `ExtensionFunction.kt` | Beginner -> Intermediate | 5-7 hours |
| OOP Core | Classes, constructors, inheritance, interfaces, visibility | `Class-Objects.kt`, `Constructor.kt`, `Inheritance.kt`, `InterfaceSample.kt`, `VisibilityModifiers.kt` | Intermediate | 6-8 hours |
| Modeling | Data classes, sealed hierarchies, companion/object usage | `DataClass.kt`, `SealedClass.kt`, `CompanionObject.kt` | Intermediate | 3-4 hours |
| Modern 2026 | Sealed interfaces, data object, value class, Result API | `modern2026/SealedAndDataObject2026.kt`, `modern2026/ValueClassAndTypeSafety2026.kt`, `modern2026/ResultAndScopeFunctions2026.kt` | Intermediate -> Advanced | 4-6 hours |
| Async & Streams | Structured concurrency, `suspend`, Flow operators | `modern2026/CoroutinesFlow2026.kt` | Advanced | 3-4 hours |
| Data Interchange | JSON encode/decode with kotlinx.serialization | `modern2026/Serialization2026.kt` | Advanced | 2-3 hours |
| Validation & Testing | Unit test basics and smoke tests | `src/test/kotlin/modern2026/Modern2026SmokeTest.kt` | Intermediate | 2-3 hours |

Total guided time: approximately 33-46 hours.

## Modern 2026 lesson runner
- Main runner: `src/main/kotlin/modern2026/Modern2026Runner.kt`
- It runs the complete modern sequence:
  - Sealed interface + data object
  - Value class + type-safe validation
  - Result + scope functions
  - Coroutines + Flow
  - Serialization

## Testing
The repository includes smoke tests for the modern lessons.

```bash
./gradlew test --info
```

## Suggested study strategy
1. Finish one curriculum track at a time.
2. Run each lesson file and predict output before execution.
3. Rewrite examples in your own words and add one custom variation.
4. Keep notes on modeling decisions (sealed vs enum vs interface).
5. Revisit modern2026 track after fundamentals for deeper understanding.

## Learning outcomes
After completing this repository, a learner should be able to:
- Write clean Kotlin syntax for day-to-day application code.
- Model states and domain rules safely with modern language features.
- Build asynchronous pipelines with coroutines and Flow.
- Serialize and deserialize typed JSON payloads.
- Set up and verify Kotlin code with Gradle + tests.

## References
- https://kotlinlang.org/docs/home.html
- https://kotlinlang.org/docs/coroutines-overview.html
- https://kotlinlang.org/docs/serialization.html
- https://github.com/Kotlin/kotlinx.coroutines
- https://github.com/Kotlin/kotlinx.serialization

## License
MIT License



