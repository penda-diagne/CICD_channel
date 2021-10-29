package sn.test

case class Person(nom:String, age:Int) {
  def getAgeDans(dans: Int) = age + dans
  def getNom()=this.nom
}