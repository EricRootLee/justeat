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
package com.justeat.domain.usecases

import com.justeat.domain.model.RestaurantDomainModel
import com.justeat.domain.repository.RestaurantRepository
import kotlinx.coroutines.flow.Flow

typealias RestaurantBaseUseCase = BaseUseCase<Unit, Flow<List<RestaurantDomainModel>>>

class RestaurantsUseCase(
    private val restaurantRepository: RestaurantRepository
) : RestaurantBaseUseCase {

    override suspend fun invoke(params: Unit): Flow<List<RestaurantDomainModel>> =
        restaurantRepository.fetchRestaurants()
}