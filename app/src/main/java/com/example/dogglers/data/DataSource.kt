/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.data

import android.content.res.Resources
import com.example.dogglers.R
import com.example.dogglers.model.Dog

/**
 * An object to generate a static list of dogs
 */
object DataSource {

    val resources: Resources = Resources.getSystem()

    val dogs: List<Dog> = listOf(
        Dog(
            R.drawable.tzeitel,
            resources.getString(R.string.dog_name_1),
            resources.getString(R.string.dog_age_1),
            resources.getString(R.string.dog_hobby_1)
        ),
        Dog(
            R.drawable.leroy,
            resources.getString(R.string.dog_name_2),
            resources.getString(R.string.dog_age_2),
            resources.getString(R.string.dog_hobby_2)
        ),
        Dog(
            R.drawable.frankie,
            resources.getString(R.string.dog_name_3),
            resources.getString(R.string.dog_age_3),
            resources.getString(R.string.dog_hobby_3)
        ),
        Dog(
            R.drawable.nox,
            resources.getString(R.string.dog_name_4),
            resources.getString(R.string.dog_age_4),
            resources.getString(R.string.dog_hobby_4)
        ),
        Dog(
            R.drawable.faye,
            resources.getString(R.string.dog_name_5),
            resources.getString(R.string.dog_age_5),
            resources.getString(R.string.dog_hobby_5)
        ),
        Dog(
            R.drawable.bella,
            resources.getString(R.string.dog_name_6),
            resources.getString(R.string.dog_age_6),
            resources.getString(R.string.dog_hobby_6)
        )
    )
}
