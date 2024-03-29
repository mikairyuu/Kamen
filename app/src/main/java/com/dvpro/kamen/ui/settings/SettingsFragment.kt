package com.dvpro.kamen.ui.settings

import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import androidx.preference.EditTextPreference
import androidx.preference.PreferenceFragmentCompat
import com.dvpro.kamen.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
        findPreference<EditTextPreference>("limit")?.setOnBindEditTextListener { editText: EditText ->
            editText.inputType = InputType.TYPE_CLASS_NUMBER
        }
        findPreference<EditTextPreference>("mask_amount")?.setOnBindEditTextListener { editText: EditText ->
            editText.inputType = InputType.TYPE_CLASS_NUMBER
        }
    }
}