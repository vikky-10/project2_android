package com.example.senddata

import java.io.Serializable

class DataTransfer:Serializable{
    var username="";
    var Password="";

    constructor(name: String, password:String ){
        username=name;
        Password=password


    }
    constructor()
}