MCVE for https://stackoverflow.com/questions/64542929/error-compiling-extension-methods-with-kotlin-1-4-10

Code compiles with Kotlin 1.3.72 without errors.

Code breaks with Kotlin 1.4.10

```
e: /tmp/kotlin-mcve/src/main/java/com/acme/ReducingBindingsExtension.kt: (9, 81): Type mismatch: inferred type is T? but CapturedType(in T)! was expected
```
