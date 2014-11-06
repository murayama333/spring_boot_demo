package hello

import spock.lang.*

class SampleControllerSpec extends Specification {

    def "show greet"() {
        expect:
            new SampleController().home() == "Hello World!"
    }
}
