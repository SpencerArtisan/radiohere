package com.artisan.radiohere.spike.model

import org.junit.Test
import rx.lang.scala.Observable

class GigStreamTest {
  @Test
  def isShould_beobservable() {
    GigStream.observable().subscribe(
      (println(_))
    )
  }
}
