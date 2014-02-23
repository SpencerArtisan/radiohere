package com.artisan.radiohere.spike.model

import org.junit.Test
import org.hamcrest.MatcherAssert._
import org.hamcrest.core.Is._
import rx.lang.scala.Observable
import java.util

class GigTest {
  @Test
  def isShould_beobservable() {
    Observable.items(1, 2, 3).subscribe(
      (println(_))
    )
  }

  @Test
  def isShould_AllowMeToCreateAGig() {
    val gig = new Gig("fish", "water", "tomorrow")
    assertThat(gig.band, is("fish"))
  }
}
