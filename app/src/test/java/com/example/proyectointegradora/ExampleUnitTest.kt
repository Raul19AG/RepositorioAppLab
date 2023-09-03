package com.example.proyectointegradora


import com.example.proyectointegradora.viewmodel.CompararViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import java.lang.reflect.Array.set

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private lateinit var viewModel: CompararViewModel

   // @get:Rule
   // val instantTaskRule = InstantTaskExecutorRule()
    //private val dispatcher = standardTestDispatcher()
  //  @Before
    //fun setup(){
      //  viewModel= CompararViewModel()
    //}
    @Test
    fun compararviewModel_CheckTextInput() {

        val value = viewModel.comparador(
            patron = set(),
            acomparar = set()
        )
         assertEquals("Son Iguales", value)

    }
}