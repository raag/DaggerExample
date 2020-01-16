package com.raag.daggerexample

import android.app.Application
import com.raag.daggerexample.component.CharacterComponent
import com.raag.daggerexample.component.DaggerCharacterComponent
import com.raag.daggerexample.module.CharacterModule

class App: Application() {
    private lateinit var characterComponent: CharacterComponent

    override fun onCreate() {
        super.onCreate()
        characterComponent = DaggerCharacterComponent.builder().characterModule(CharacterModule()).build()
    }

    fun getComponent() = characterComponent
}