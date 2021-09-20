package com.ibareq.rxjavatasks

import io.reactivex.rxjava3.core.Observable
import java.sql.Time
import java.util.concurrent.TimeUnit

/**
 * Don't update function name or return type
 * Don't Edit any delete anything from code
 * Only add required things
 */

object RXJavaTasks {


    /**
     * Complete below function
     * let it emit characters form A to Z each 1 second
     */
    fun task1(): Observable<String> {
        return Observable.zip(Observable.interval(1,TimeUnit.SECONDS),Observable.create<String>{emitter->
            for(i in 'A'..'Z'){
                emitter.onNext(i.toString())
            }
        },{along,string->string})
    }

    /**
     * Complete below function
     * add only one operator only to allow emit items without duplication
     */
    fun task2(): Observable<String> {
        val mList = listOf("A", "B", "C", "C", "D", "B", "E")
        return Observable.fromIterable(mList)
            .distinct()
            .zipWith(Observable.interval(300, TimeUnit.MILLISECONDS), {item, _ -> item})
    }

    /**
     * fix the error in mergeWith without replace the operator
     * don't alter or edit the first two lines inside the function
     */
    fun task3(): Observable<String> {
        val firstObservable = Observable.just("A", "B", "C", "D", "E")
        val secondObservable = Observable.range(1,5)
        return firstObservable.mergeWith(secondObservable)
            .zipWith(Observable.interval(300, TimeUnit.MILLISECONDS), {item, _ -> item})
    }

    /**
     * add the required operators to emit data from 21 to 80 only
     */
    fun task4(): Observable<Int> {
        return Observable.range(1,100)
            .zipWith(Observable.interval(300, TimeUnit.MILLISECONDS), {item, _ -> item})
    }

    /**
     * let your observable emit these items: A1, B2, C3, D4, E5
     */
    fun task5(): Observable<String> {
        val firstObservable = Observable.just("A", "B", "C", "D", "E").zipWith(Observable.interval(300, TimeUnit.MILLISECONDS), {item, _ -> item})
        val secondObservable = Observable.range(1,5).zipWith(Observable.interval(300, TimeUnit.MILLISECONDS), {item, _ -> item})

        return Observable.
    }

}