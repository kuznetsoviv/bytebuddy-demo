@echo off
java -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC -Xms64m -Xmx64m -Xlog:gc*::time -jar ..\epsilon-gc\target\epsilon.jar