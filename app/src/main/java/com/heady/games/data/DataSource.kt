package com.heady.games.data

import com.heady.games.R
import com.heady.games.model.Affirmations

class DataSource {

    fun loadAffirmations(): List<Affirmations> {
        return listOf<Affirmations>(

            Affirmations(R.string.affirmation1),
            Affirmations(R.string.affirmation2),
            Affirmations(R.string.affirmation3),
            Affirmations(R.string.affirmation4),
            Affirmations(R.string.affirmation5),
            Affirmations(R.string.affirmation6),
            Affirmations(R.string.affirmation7),
            Affirmations(R.string.affirmation8),
            Affirmations(R.string.affirmation9),
            Affirmations(R.string.affirmation10)
                )

    }

}