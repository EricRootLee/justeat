/*
 * Copyright 2021 JustEat
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.justeat.domain.di

import com.justeat.domain.usecases.FavouriteUseCase
import com.justeat.domain.usecases.FilterRestaurantsUseCase
import com.justeat.domain.usecases.RestaurantsUseCase
import com.justeat.domain.usecases.SearchRestaurantUseCase
import org.koin.core.module.Module
import org.koin.dsl.module

private val useCaseModule: Module = module {
    single { RestaurantsUseCase(get()) }
    single { FavouriteUseCase(get()) }
    single { SearchRestaurantUseCase(get()) }
    single { FilterRestaurantsUseCase(get()) }
}

val domainModules: List<Module> = listOf(
    useCaseModule
)