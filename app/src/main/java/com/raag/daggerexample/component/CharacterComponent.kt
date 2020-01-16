package com.raag.daggerexample.component

import com.raag.daggerexample.MainActivity
import com.raag.daggerexample.module.CharacterModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CharacterModule::class])
interface CharacterComponent {
    fun inject(mainActivity: MainActivity)
}