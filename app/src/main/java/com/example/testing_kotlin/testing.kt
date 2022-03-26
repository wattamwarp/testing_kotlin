package com.example.testing_kotlin


fun main() {
    println(testing().sum());
    println(testing().innerClass().mul());

    println(testing.object2.objectfunction());

}

class testing {

    val a: Int = 10;
    val b: Int = 10;


    fun sum(): Int {
        val list = listOf(1, 2, 3);
        //list[1]=10;

        for (i in list) {
            println(i);
        }

        val map = mapOf<Int, String>(1 to " man", 2 to "jan");


        return a + b;
    }


    inner class innerClass {

        fun mul(): Int {
            return a * b;
        }
    }


    companion object testObj {
        fun objectmethod() {
            println("running in companion object");
        }
    }

    object object2 {
        fun objectfunction() {
            println("running object 2");
        }
    }

}