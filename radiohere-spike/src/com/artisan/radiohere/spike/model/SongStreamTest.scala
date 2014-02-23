package com.artisan.radiohere.spike.model

import org.junit.Test

class SongStreamTest {
  @Test
  def isShould_beobservable() {
    val gig = new Gig("Devil doll", "Camberley", "30th May")
    SongStream.observable(gig).subscribe(
      onNext = (println(_))
    )
  }

  @Test
  def isShould_beobservable2() {
    val gig = new Gig("Sparklehorse", "O2", "11th May")
    SongStream.observable(gig).subscribe(
      onNext = ((song: Song) => println(song))
    )
  }

  @Test
  def isShould_beobservable3() {
    val gig = new Gig("Sparklehorse", "O2", "11th May")
    SongStream.observable(gig).subscribe(
      onNext = ((song: Song) => println(song)),
      onError = ((t: Throwable) => println(t))
    )
  }

  @Test
  def isShould_beobservable4() {
    val gig = new Gig("Sparklehorse", "O2", "11th May")
    SongStream.observable(gig).subscribe(
      onNext = ((song: Song) => println(song)),
      onError = ((t: Throwable) => println(t)),
      onCompleted = (() => println(s"COMPLETED ${gig.band}"))
    )
  }
}
