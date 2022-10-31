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
package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.const.Layout
import com.example.dogglers.model.Dog


/**
 * Initialize view elements
 */
class DogCardViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
    // Declare and initialize all of the list item UI components
    val dogImage = view?.findViewById<ImageView>(R.id.list_item_image)
    val dogName = view?.findViewById<TextView>(R.id.list_item_name)
    val dogAge = view?.findViewById<TextView>(R.id.list_item_age)
    val dogHobby = view?.findViewById<TextView>(R.id.list_item_hobby)
}

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int,
    // Initialize the data using the List found in data/DataSource
    private val dataset: List<Dog>
) : RecyclerView.Adapter<DogCardViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        //  Use a conditional to determine the layout type and set it accordingly.
        //  if the layout variable is Layout.GRID the grid list item should be used. Otherwise the
        //  the vertical/horizontal list item should be used.
        val layoutXml =
            if (layout == Layout.GRID)
                R.layout.grid_list_item
            else
                R.layout.vertical_horizontal_list_item

        // Inflate the layout
        val listItemView = LayoutInflater.from(context)
            .inflate(layoutXml, parent, false)

        //  Null should not be passed into the view holder. This should be updated to reflect
        //  the inflated layout.
        return DogCardViewHolder(listItemView)
    }

    // return the size of the data set instead of 0
    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        // Get the data at the current position
        val currentListItem = dataset[position]

        // Set the image resource for the current dog
        holder.dogImage?.setImageResource(currentListItem.imageResourceId)

        // Set the text for the current dog's name
        holder.dogName?.text = currentListItem.name

        val resources = context?.resources

        //  Set the text for the current dog's age by passing the age to the
        //  R.string.dog_age string constant.
        //  Passing an argument to the string resource looks like:
        //  resources?.getString(R.string.dog_age, dog.age)
        holder.dogAge?.text = resources?.getString(R.string.dog_age, currentListItem.age)

        //  Set the text for the current dog's hobbies by passing the hobbies to the
        //  R.string.dog_hobbies string constant.
        //  Passing an argument to the string resource looks like:
        //  resources?.getString(R.string.dog_hobbies, dog.hobbies)
        holder.dogHobby?.text =
            resources?.getString(R.string.dog_hobbies, currentListItem.hobbies)
    }
}
