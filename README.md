# Example of Gradle Multiproject Configuration

An example project for testing IDE integration such as IDEA and Eclipse.

- foo
  - depends on util
- bar
  - depends on util
- util
- server
  - depends on foo and bar

