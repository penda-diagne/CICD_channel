package sn.test.test
import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import sn.test.Person

case class PersonTest() extends FunSuite with BeforeAndAfter {
  var p:Person=_
  before{
    println("pending test")
    p=Person("Diagne",23)
  }
  test("TestGetAgeDans"){
     assert(p.getAgeDans(10)==55)
  }
  test("getNom"){
     assert(p.getNom()=="Diagne")
  }
  after{
    println("Test End")
  }

}
