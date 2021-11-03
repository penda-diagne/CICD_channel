package sn.test.test
import org.scalatest.{FlatSpec,Inspectors,Matchers,BeforeAndAfter}
import sn.test.Person
case class PersontTest2() extends FlatSpec with Inspectors
  with Matchers with BeforeAndAfter{
  var p:Person=_
  before{
    println("pending test")
    p=Person("Diagne",23)
  }
  "test getAgeDans" should "test getAgeDans" in{
    p.getAgeDans(10) should equal(33)
  }
  "test getNom" should "test getNom" in{
    p.getNom() should equal("Diagne")
  }

}
