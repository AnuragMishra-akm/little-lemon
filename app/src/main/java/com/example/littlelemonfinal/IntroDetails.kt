package com.example.littlelemonfinal

interface IntroDetails {
    var firstName:String;
    var lastName:String;
    var email:String;

}
object Intro:IntroDetails {
    override var firstName:String = "";
    override var lastName:String = "";
    override var email:String = "";

}