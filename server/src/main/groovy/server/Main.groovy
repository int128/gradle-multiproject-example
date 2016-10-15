package server

import bar.Bar
import foo.Foo
import util.Language

class Main {
    static void main(String[] args) {
        println(new Foo('foo', Language.GROOVY))
        println(new Bar('bar'))
    }
}
