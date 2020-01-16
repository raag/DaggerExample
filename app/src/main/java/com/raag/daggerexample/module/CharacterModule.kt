package com.raag.daggerexample.module

import com.raag.daggerexample.models.Arm
import com.raag.daggerexample.models.Body
import com.raag.daggerexample.models.Head
import com.raag.daggerexample.models.Leg
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class CharacterModule {

    @Provides
    @Singleton
    fun provideHead() = Head("Head")

    @Provides
    @Singleton
    @Named("leftArm")
    fun provideLeftArm() = Arm("left arm")

    @Provides
    @Singleton
    @Named("rightArm")
    fun provideRightArm() = Arm("right arm")

    @Provides
    @Singleton
    @Named("leftLeg")
    fun provideLeftLeg() = Leg("left leg")

    @Provides
    @Singleton
    @Named("rightLeg")
    fun provideRightLeg() = Leg("right leg")

    @Provides
    @Singleton
    fun provideBody(
        head: Head,
        @Named("rightArm") rightArm: Arm,
        @Named("leftArm") leftArm: Arm,
        @Named("rightLeg") rightLeg: Leg,
        @Named("leftLeg") leftLeg: Leg

    ) = Body(head, rightArm, leftArm, rightLeg, leftLeg)

}