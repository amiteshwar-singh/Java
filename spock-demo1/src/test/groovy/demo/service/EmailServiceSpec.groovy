package demo.service

import demo.domain.Order
import spock.lang.Specification

class EmailServiceSpec extends Specification {

    def "test SendEmail(Order)"() {
        setup:
        EmailService emailService=EmailService.getInstance()

        when:
        emailService.sendEmail(Mock(Order))

        then:
        thrown(RuntimeException)
    }

    def "test SendEmail(order,cc)"() {
        setup:
        EmailService emailService=EmailService.getInstance()

        when:
        def status=emailService.sendEmail(Mock(Order), "adsfrgg")

        def expectedStatus=true
        then:
        status==expectedStatus
    }


}
