package com.example.RepositorioAppLab.viewmodel
import android.widget.EditText
import androidx.lifecycle.ViewModel



class CompararViewModel: ViewModel() {
    //val comparar = LiveData<Comparar> get() = _comparar
     //private var _comparar = MutableLiveData<Comparar>(Comparar(patron:EditText, acomparar:EditText, salida:TextWide ))
   //Esta funcion debe tomar el campo text de los dos EditText y compararlos
    fun comparador(patron: EditText, acomparar:EditText): String {
        return if(patron.text == acomparar.text) "Son Iguales" else "No Son Iguales"

    }

    }