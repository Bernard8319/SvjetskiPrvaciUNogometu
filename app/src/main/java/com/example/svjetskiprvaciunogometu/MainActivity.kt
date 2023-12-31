package com.example.svjetskiprvaciunogometu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adapter View
        var listView = findViewById<ListView>(R.id.listview)

        // Adapter
        var adapter = MyAdapter(this,generateData())

        listView?.adapter = adapter
        adapter?. notifyDataSetChanged()

    }

    // Data Source
    fun generateData(): ArrayList<CountryModel>{
        var countriesList = ArrayList<CountryModel>()

        var country1 : CountryModel = CountryModel(
            "Brazil",
            "Broj pobjeda:5",
            R.drawable.brazil

        )
        var country2 : CountryModel = CountryModel(
            "Germany",
            "Broj pobjeda:4",
            R.drawable.germany

        )
        var country3 : CountryModel = CountryModel(
            "France",
            "Broj pobjeda:2",
            R.drawable.france
        )
        var country4 : CountryModel = CountryModel(
            "Spain",
            " Broj pobjeda:1",
            R.drawable.spain

        )
        var country5 : CountryModel = CountryModel(
            "England",
            "Broj pobjeda: 1",
            R.drawable.england

        )
        var country6: CountryModel = CountryModel(
            "United States",
            "Broj pobjeda: 0",
            R.drawable.unitedstates

        )
        var country7 : CountryModel = CountryModel(
            "Italy",
            " Broj pobjeda: 4",
            R.drawable.italy

        )
        var country8 : CountryModel = CountryModel(
            "Argentina",
            "Broj pobjeda: 3",
            R.drawable.argentina

        )
        countriesList.add(country1)
        countriesList.add(country2)
        countriesList.add(country3)
        countriesList.add(country4)
        countriesList.add(country5)
        countriesList.add(country6)
        countriesList.add(country7)
        countriesList.add(country8)

        return countriesList
    }
}