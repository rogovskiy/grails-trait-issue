package test

import grails.validation.Validateable

class DomainObject implements Validateable {
  
  String name
  
  static constraints = {
    name(blank: false)
  }
}
