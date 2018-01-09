package test

import spock.lang.Specification

class DomainValidationSpec extends Specification {
  
  def "simple validation test"() {
    setup:
    boolean workaround = false
    if (workaround) {
      Object.metaClass.dummy = {}
    }

    when:
    Child obj = new Child(name: "Child")

    then:
    obj.validate()
  }
}
