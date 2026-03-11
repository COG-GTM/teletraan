deploy-service is Dropwizard/jersey based java web service provide the core deploy support.
See https://github.com/pinterest/teletraan/wiki for more details!!

## Java Version

This project requires **Java 8** or later. The codebase uses Java 8 features including:
- Lambda expressions and method references
- `java.time` API (replacing Joda-Time)
- `java.time.Clock` for testable time-dependent code
- `DateTimeFormatter` (replacing `SimpleDateFormat`)
- `List.sort()` (replacing `Collections.sort()`)
