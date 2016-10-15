package bar

import spock.lang.Specification

class BarSpec extends Specification {
    def 'class Bar should have name'() {
        given:
        def bar = new Bar('bar')

        expect:
        bar.name == 'bar'
    }
}
