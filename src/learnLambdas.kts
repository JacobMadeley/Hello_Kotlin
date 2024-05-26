C:\Users\jacob\.jdks\openjdk-21.0.2\bin\java.exe -Dkotlin.repl.ideMode=true -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 @C:\Users\jacob\AppData\Local\Temp\idea_arg_file211001858
        Kotlin IDE REPL support is experimental. It may be slow or unstable. Please, report problems to https://youtrack.jetbrains.com/issues/KTIJ.
Welcome to Kotlin version 1.9.23-release-779 (JRE 21.0.2+13-58)
Type :help for help, :quit for quit

var dirtyLevel = 20
val waterFilter = { dirty : Int -> dirty / 2}
println(waterFilter(dirtyLevel))
10

val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
println(updateDirty(30, waterFilter))
15

fun increaseDirty( start: Int ) = start + 1
println(updateDirty(15,::increaseDirty))
16

var dirtyLevel = 19
dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
println(dirtyLevel)
42