package spock

import spock.lang.Specification

/**
 * Created by Le on 11/14/2016 0014.
 */
class AdderSpec extends Specification{
    def "adder-test"() {
        given: "a new Adder class is created"
        def adder = new Adder();

        expect: "Adding two numbers to return the sum"
        adder.add(3, 4) == 8
    }
}
