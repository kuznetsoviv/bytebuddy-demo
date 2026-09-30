@echo off
java -XX:+UseParallelGC -Xms526m -Xmx526m -XX:+UseAdaptiveSizePolicy -Xlog:gc*::time -jar ..\adaptive-parallel-gc\target\adaptive-parallel-gc.jar