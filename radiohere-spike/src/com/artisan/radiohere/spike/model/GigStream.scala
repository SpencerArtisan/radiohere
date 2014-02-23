package com.artisan.radiohere.spike.model

import rx.lang.scala.Observable

object GigStream {
  def observable() = {
    var gig1 = new Gig("Radiohead", "La Scala", "April 11th")
    var gig2 = new Gig("Sparklehorse", "O2", "July 6th")
    Observable.items(gig1, gig2)
  }
}
