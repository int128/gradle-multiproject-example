package foo

import groovy.transform.Immutable
import util.Language

@Immutable
class Foo {
    final String id
    final Language language
}
