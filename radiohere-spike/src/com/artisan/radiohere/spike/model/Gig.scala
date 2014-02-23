package com.artisan.radiohere.spike.model

class Gig (band: String, location: String, date: String) {
  override def toString = {
    s"$band playing at $location on $date"
  }
}
