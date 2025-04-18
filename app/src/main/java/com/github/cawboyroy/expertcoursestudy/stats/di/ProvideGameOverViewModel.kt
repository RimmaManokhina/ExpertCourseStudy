package com.github.cawboyroy.expertcoursestudy.stats.di

import com.github.cawboyroy.expertcoursestudy.di.AbstractProvideViewModel
import com.github.cawboyroy.expertcoursestudy.di.Core
import com.github.cawboyroy.expertcoursestudy.di.Module
import com.github.cawboyroy.expertcoursestudy.di.ProvideViewModel
import com.github.cawboyroy.expertcoursestudy.stats.data.StatsRepository
import com.github.cawboyroy.expertcoursestudy.stats.StatsViewModel

class ProvideGameOverViewModel(
    core: Core,
    next: ProvideViewModel
) : AbstractProvideViewModel(core, next, StatsViewModel::class.java) {

    override fun module(): Module<*> = GameOverModule(core)
}

    class GameOverModule(
        private val core: Core
    ) : Module<StatsViewModel> {

        override fun viewModel(): StatsViewModel = StatsViewModel(StatsRepository.Base(core.statsCache), core.clearViewModel)
        }