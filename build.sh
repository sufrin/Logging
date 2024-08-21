# neither SBT nor an IDE is needed

scalac -d lib/SourceLocation.jar sourcelocation/main/scala/SourceLocation.scala
scalac -d lib/Logging.jar sourcelocation/main/scala/SourceLocation.scala ./src/main/scala/Logging.scala
