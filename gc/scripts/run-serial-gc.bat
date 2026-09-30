@echo off
java -XX:+UseSerialGC -Xms526m -Xmx526m -XX:SurvivorRatio=1 -Xlog:gc*::time -jar ..\serial-gc\target\serial-gc.jar
