@echo off
java -XX:+UseParallelGC -Xms526m -Xmx526m -Xlog:gc*::time -jar ..\parallel-gc\target\parallel-gc.jar
