package com.artisan.radiohere.spike.model

import rx.lang.scala.Observable

object SongStream {
  var SONGS:Map[String,List[Song]] = Map().withDefaultValue(List())
  SONGS += "Devil doll" -> List(new Song("Burben in your eyes"), new Song("The things you make me do") )
  SONGS += "Sparklehorse" -> List(new Song("Pig"), new Song("Painbirds") )

  def observable(gig: Gig) = {
    Observable.from(SONGS(gig.band))
  }
}
